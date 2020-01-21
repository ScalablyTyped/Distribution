package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Firestore query.
  */
@js.native
trait SchemaStructuredQuery extends js.Object {
  /**
    * A end point for the query results.
    */
  var endAt: js.UndefOr[SchemaCursor] = js.native
  /**
    * The collections to query.
    */
  var from: js.UndefOr[js.Array[SchemaCollectionSelector]] = js.native
  /**
    * The maximum number of results to return.  Applies after all other
    * constraints. Must be &gt;= 0 if specified.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The number of results to skip.  Applies before limit, but after all other
    * constraints. Must be &gt;= 0 if specified.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The order to apply to the query results.  Firestore guarantees a stable
    * ordering through the following rules:   * Any field required to appear in
    * `order_by`, that is not already    specified in `order_by`, is appended
    * to the order in field name order    by default.  * If an order on
    * `__name__` is not specified, it is appended by default.  Fields are
    * appended with the same sort direction as the last order specified, or
    * &#39;ASCENDING&#39; if no order was specified. For example:   * `SELECT *
    * FROM Foo ORDER BY A` becomes    `SELECT * FROM Foo ORDER BY A, __name__`
    * * `SELECT * FROM Foo ORDER BY A DESC` becomes    `SELECT * FROM Foo ORDER
    * BY A DESC, __name__ DESC`  * `SELECT * FROM Foo WHERE A &gt; 1` becomes
    * `SELECT * FROM Foo WHERE A &gt; 1 ORDER BY A, __name__`
    */
  var orderBy: js.UndefOr[js.Array[SchemaOrder]] = js.native
  /**
    * The projection to return.
    */
  var select: js.UndefOr[SchemaProjection] = js.native
  /**
    * A starting point for the query results.
    */
  var startAt: js.UndefOr[SchemaCursor] = js.native
  /**
    * The filter to apply.
    */
  var where: js.UndefOr[SchemaFilter] = js.native
}

object SchemaStructuredQuery {
  @scala.inline
  def apply(
    endAt: SchemaCursor = null,
    from: js.Array[SchemaCollectionSelector] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    orderBy: js.Array[SchemaOrder] = null,
    select: SchemaProjection = null,
    startAt: SchemaCursor = null,
    where: SchemaFilter = null
  ): SchemaStructuredQuery = {
    val __obj = js.Dynamic.literal()
    if (endAt != null) __obj.updateDynamic("endAt")(endAt.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStructuredQuery]
  }
}

