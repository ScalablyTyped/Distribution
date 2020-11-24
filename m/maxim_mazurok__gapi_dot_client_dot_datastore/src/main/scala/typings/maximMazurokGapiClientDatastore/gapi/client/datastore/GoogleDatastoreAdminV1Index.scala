package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1Index extends js.Object {
  
  /** Required. The index's ancestor mode. Must not be ANCESTOR_MODE_UNSPECIFIED. */
  var ancestor: js.UndefOr[String] = js.native
  
  /** Output only. The resource ID of the index. */
  var indexId: js.UndefOr[String] = js.native
  
  /** Required. The entity kind to which this index applies. */
  var kind: js.UndefOr[String] = js.native
  
  /** Output only. Project ID. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Required. An ordered sequence of property names and their index attributes. */
  var properties: js.UndefOr[js.Array[GoogleDatastoreAdminV1IndexedProperty]] = js.native
  
  /** Output only. The state of the index. */
  var state: js.UndefOr[String] = js.native
}
object GoogleDatastoreAdminV1Index {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1Index]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1IndexOps[Self <: GoogleDatastoreAdminV1Index] (val x: Self) extends AnyVal {
    
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
    def setAncestor(value: String): Self = this.set("ancestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAncestor: Self = this.set("ancestor", js.undefined)
    
    @scala.inline
    def setIndexId(value: String): Self = this.set("indexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexId: Self = this.set("indexId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: GoogleDatastoreAdminV1IndexedProperty*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[GoogleDatastoreAdminV1IndexedProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
