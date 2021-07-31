package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A [GQL
  * query](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
  */
trait SchemaGqlQuery extends StObject {
  
  /**
    * When false, the query string must not contain any literals and instead
    * must bind all values. For example, `SELECT * FROM Kind WHERE a =
    * &#39;string literal&#39;` is not allowed, while `SELECT * FROM Kind WHERE
    * a = @value` is.
    */
  var allowLiterals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For each non-reserved named binding site in the query string, there must
    * be a named parameter with that name, but not necessarily the inverse. Key
    * must match regex `A-Za-z_$*`, must not match regex `__.*__`, and must not
    * be `&quot;&quot;`.
    */
  var namedBindings: js.UndefOr[StringDictionary[SchemaGqlQueryParameter]] = js.undefined
  
  /**
    * Numbered binding site @1 references the first numbered parameter,
    * effectively using 1-based indexing, rather than the usual 0.  For each
    * binding site numbered i in `query_string`, there must be an i-th numbered
    * parameter. The inverse must also be true.
    */
  var positionalBindings: js.UndefOr[js.Array[SchemaGqlQueryParameter]] = js.undefined
  
  /**
    * A string of the format described
    * [here](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
    */
  var queryString: js.UndefOr[String] = js.undefined
}
object SchemaGqlQuery {
  
  @scala.inline
  def apply(): SchemaGqlQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGqlQuery]
  }
  
  @scala.inline
  implicit class SchemaGqlQueryMutableBuilder[Self <: SchemaGqlQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowLiterals(value: Boolean): Self = StObject.set(x, "allowLiterals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowLiteralsUndefined: Self = StObject.set(x, "allowLiterals", js.undefined)
    
    @scala.inline
    def setNamedBindings(value: StringDictionary[SchemaGqlQueryParameter]): Self = StObject.set(x, "namedBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedBindingsUndefined: Self = StObject.set(x, "namedBindings", js.undefined)
    
    @scala.inline
    def setPositionalBindings(value: js.Array[SchemaGqlQueryParameter]): Self = StObject.set(x, "positionalBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionalBindingsUndefined: Self = StObject.set(x, "positionalBindings", js.undefined)
    
    @scala.inline
    def setPositionalBindingsVarargs(value: SchemaGqlQueryParameter*): Self = StObject.set(x, "positionalBindings", js.Array(value :_*))
    
    @scala.inline
    def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
  }
}
