package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to return full hashes matched by the provided hash prefixes.
  */
@js.native
trait SchemaFindFullHashesRequest extends js.Object {
  
  /**
    * Client metadata associated with callers of higher-level APIs built on top
    * of the client&#39;s implementation.
    */
  var apiClient: js.UndefOr[SchemaClientInfo] = js.native
  
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaClientInfo] = js.native
  
  /**
    * The current client states for each of the client&#39;s local threat
    * lists.
    */
  var clientStates: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The lists and hashes to be checked.
    */
  var threatInfo: js.UndefOr[SchemaThreatInfo] = js.native
}
object SchemaFindFullHashesRequest {
  
  @scala.inline
  def apply(): SchemaFindFullHashesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindFullHashesRequest]
  }
  
  @scala.inline
  implicit class SchemaFindFullHashesRequestOps[Self <: SchemaFindFullHashesRequest] (val x: Self) extends AnyVal {
    
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
    def setApiClient(value: SchemaClientInfo): Self = this.set("apiClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiClient: Self = this.set("apiClient", js.undefined)
    
    @scala.inline
    def setClient(value: SchemaClientInfo): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setClientStatesVarargs(value: String*): Self = this.set("clientStates", js.Array(value :_*))
    
    @scala.inline
    def setClientStates(value: js.Array[String]): Self = this.set("clientStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientStates: Self = this.set("clientStates", js.undefined)
    
    @scala.inline
    def setThreatInfo(value: SchemaThreatInfo): Self = this.set("threatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatInfo: Self = this.set("threatInfo", js.undefined)
  }
}
