package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A [GQL
  * query](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
  */
@js.native
trait SchemaGqlQuery extends js.Object {
  /**
    * When false, the query string must not contain any literals and instead
    * must bind all values. For example, `SELECT * FROM Kind WHERE a =
    * &#39;string literal&#39;` is not allowed, while `SELECT * FROM Kind WHERE
    * a = @value` is.
    */
  var allowLiterals: js.UndefOr[Boolean] = js.native
  /**
    * For each non-reserved named binding site in the query string, there must
    * be a named parameter with that name, but not necessarily the inverse. Key
    * must match regex `A-Za-z_$*`, must not match regex `__.*__`, and must not
    * be `&quot;&quot;`.
    */
  var namedBindings: js.UndefOr[StringDictionary[SchemaGqlQueryParameter]] = js.native
  /**
    * Numbered binding site @1 references the first numbered parameter,
    * effectively using 1-based indexing, rather than the usual 0.  For each
    * binding site numbered i in `query_string`, there must be an i-th numbered
    * parameter. The inverse must also be true.
    */
  var positionalBindings: js.UndefOr[js.Array[SchemaGqlQueryParameter]] = js.native
  /**
    * A string of the format described
    * [here](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
    */
  var queryString: js.UndefOr[String] = js.native
}

object SchemaGqlQuery {
  @scala.inline
  def apply(
    allowLiterals: js.UndefOr[Boolean] = js.undefined,
    namedBindings: StringDictionary[SchemaGqlQueryParameter] = null,
    positionalBindings: js.Array[SchemaGqlQueryParameter] = null,
    queryString: String = null
  ): SchemaGqlQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLiterals)) __obj.updateDynamic("allowLiterals")(allowLiterals.asInstanceOf[js.Any])
    if (namedBindings != null) __obj.updateDynamic("namedBindings")(namedBindings.asInstanceOf[js.Any])
    if (positionalBindings != null) __obj.updateDynamic("positionalBindings")(positionalBindings.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGqlQuery]
  }
}

