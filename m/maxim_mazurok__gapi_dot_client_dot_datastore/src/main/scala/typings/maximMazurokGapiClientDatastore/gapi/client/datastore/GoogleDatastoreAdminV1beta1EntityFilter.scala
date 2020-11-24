package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1beta1EntityFilter extends js.Object {
  
  /** If empty, then this represents all kinds. */
  var kinds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An empty list represents all namespaces. This is the preferred usage for projects that don't use namespaces. An empty string element represents the default namespace. This should be
    * used if the project has data in non-default namespaces, but doesn't want to include them. Each namespace in this list must be unique.
    */
  var namespaceIds: js.UndefOr[js.Array[String]] = js.native
}
object GoogleDatastoreAdminV1beta1EntityFilter {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1beta1EntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1EntityFilter]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1beta1EntityFilterOps[Self <: GoogleDatastoreAdminV1beta1EntityFilter] (val x: Self) extends AnyVal {
    
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
    def setKindsVarargs(value: String*): Self = this.set("kinds", js.Array(value :_*))
    
    @scala.inline
    def setKinds(value: js.Array[String]): Self = this.set("kinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinds: Self = this.set("kinds", js.undefined)
    
    @scala.inline
    def setNamespaceIdsVarargs(value: String*): Self = this.set("namespaceIds", js.Array(value :_*))
    
    @scala.inline
    def setNamespaceIds(value: js.Array[String]): Self = this.set("namespaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceIds: Self = this.set("namespaceIds", js.undefined)
  }
}
