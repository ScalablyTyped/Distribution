package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Firestore query.
  */
@js.native
trait SchemaStructuredQuery extends StObject {
  
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
  def apply(): SchemaStructuredQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredQuery]
  }
  
  @scala.inline
  implicit class SchemaStructuredQueryMutableBuilder[Self <: SchemaStructuredQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndAt(value: SchemaCursor): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
    
    @scala.inline
    def setFrom(value: js.Array[SchemaCollectionSelector]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFromVarargs(value: SchemaCollectionSelector*): Self = StObject.set(x, "from", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrderBy(value: js.Array[SchemaOrder]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setOrderByVarargs(value: SchemaOrder*): Self = StObject.set(x, "orderBy", js.Array(value :_*))
    
    @scala.inline
    def setSelect(value: SchemaProjection): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setStartAt(value: SchemaCursor): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    @scala.inline
    def setWhere(value: SchemaFilter): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
