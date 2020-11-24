package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GqlQuery extends js.Object {
  
  /**
    * When false, the query string must not contain any literals and instead must bind all values. For example, `SELECT * FROM Kind WHERE a = 'string literal'` is not allowed, while
    * `SELECT * FROM Kind WHERE a = @value` is.
    */
  var allowLiterals: js.UndefOr[Boolean] = js.native
  
  /**
    * For each non-reserved named binding site in the query string, there must be a named parameter with that name, but not necessarily the inverse. Key must match regex `A-Za-z_$*`, must
    * not match regex `__.*__`, and must not be `""`.
    */
  var namedBindings: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.datastore.gapi.client.datastore.GqlQueryParameter}
    */ typings.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.GqlQuery with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Numbered binding site @1 references the first numbered parameter, effectively using 1-based indexing, rather than the usual 0. For each binding site numbered i in `query_string`,
    * there must be an i-th numbered parameter. The inverse must also be true.
    */
  var positionalBindings: js.UndefOr[js.Array[GqlQueryParameter]] = js.native
  
  /** A string of the format described [here](https://cloud.google.com/datastore/docs/apis/gql/gql_reference). */
  var queryString: js.UndefOr[String] = js.native
}
object GqlQuery {
  
  @scala.inline
  def apply(): GqlQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GqlQuery]
  }
  
  @scala.inline
  implicit class GqlQueryOps[Self <: GqlQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowLiterals(value: Boolean): Self = this.set("allowLiterals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLiterals: Self = this.set("allowLiterals", js.undefined)
    
    @scala.inline
    def setNamedBindings(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.datastore.gapi.client.datastore.GqlQueryParameter}
      */ typings.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.GqlQuery with TopLevel[js.Any]
    ): Self = this.set("namedBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedBindings: Self = this.set("namedBindings", js.undefined)
    
    @scala.inline
    def setPositionalBindingsVarargs(value: GqlQueryParameter*): Self = this.set("positionalBindings", js.Array(value :_*))
    
    @scala.inline
    def setPositionalBindings(value: js.Array[GqlQueryParameter]): Self = this.set("positionalBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionalBindings: Self = this.set("positionalBindings", js.undefined)
    
    @scala.inline
    def setQueryString(value: String): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
  }
}
