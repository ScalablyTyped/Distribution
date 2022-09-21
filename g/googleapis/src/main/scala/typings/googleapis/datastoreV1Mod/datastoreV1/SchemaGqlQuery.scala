package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGqlQuery extends StObject {
  
  /**
    * When false, the query string must not contain any literals and instead must bind all values. For example, `SELECT * FROM Kind WHERE a = 'string literal'` is not allowed, while `SELECT * FROM Kind WHERE a = @value` is.
    */
  var allowLiterals: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * For each non-reserved named binding site in the query string, there must be a named parameter with that name, but not necessarily the inverse. Key must match regex `A-Za-z_$*`, must not match regex `__.*__`, and must not be `""`.
    */
  var namedBindings: js.UndefOr[StringDictionary[SchemaGqlQueryParameter] | Null] = js.undefined
  
  /**
    * Numbered binding site @1 references the first numbered parameter, effectively using 1-based indexing, rather than the usual 0. For each binding site numbered i in `query_string`, there must be an i-th numbered parameter. The inverse must also be true.
    */
  var positionalBindings: js.UndefOr[js.Array[SchemaGqlQueryParameter]] = js.undefined
  
  /**
    * A string of the format described [here](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
    */
  var queryString: js.UndefOr[String | Null] = js.undefined
}
object SchemaGqlQuery {
  
  inline def apply(): SchemaGqlQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGqlQuery]
  }
  
  extension [Self <: SchemaGqlQuery](x: Self) {
    
    inline def setAllowLiterals(value: Boolean): Self = StObject.set(x, "allowLiterals", value.asInstanceOf[js.Any])
    
    inline def setAllowLiteralsNull: Self = StObject.set(x, "allowLiterals", null)
    
    inline def setAllowLiteralsUndefined: Self = StObject.set(x, "allowLiterals", js.undefined)
    
    inline def setNamedBindings(value: StringDictionary[SchemaGqlQueryParameter]): Self = StObject.set(x, "namedBindings", value.asInstanceOf[js.Any])
    
    inline def setNamedBindingsNull: Self = StObject.set(x, "namedBindings", null)
    
    inline def setNamedBindingsUndefined: Self = StObject.set(x, "namedBindings", js.undefined)
    
    inline def setPositionalBindings(value: js.Array[SchemaGqlQueryParameter]): Self = StObject.set(x, "positionalBindings", value.asInstanceOf[js.Any])
    
    inline def setPositionalBindingsUndefined: Self = StObject.set(x, "positionalBindings", js.undefined)
    
    inline def setPositionalBindingsVarargs(value: SchemaGqlQueryParameter*): Self = StObject.set(x, "positionalBindings", js.Array(value*))
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringNull: Self = StObject.set(x, "queryString", null)
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
  }
}
