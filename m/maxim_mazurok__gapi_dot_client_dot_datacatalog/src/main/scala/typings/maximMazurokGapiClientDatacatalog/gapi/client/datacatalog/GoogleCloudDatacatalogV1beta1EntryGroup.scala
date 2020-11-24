package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1EntryGroup extends js.Object {
  
  /** Output only. Timestamps about this EntryGroup. Default value is empty timestamps. */
  var dataCatalogTimestamps: js.UndefOr[GoogleCloudDatacatalogV1beta1SystemTimestamps] = js.native
  
  /** Entry group description, which can consist of several sentences or paragraphs that describe entry group contents. Default value is an empty string. */
  var description: js.UndefOr[String] = js.native
  
  /** A short name to identify the entry group, for example, "analytics data - jan 2011". Default value is an empty string. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the entry group in URL format. Example: * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id} Note that this EntryGroup and its child
    * resources may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1EntryGroup {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1EntryGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1EntryGroup]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1EntryGroupOps[Self <: GoogleCloudDatacatalogV1beta1EntryGroup] (val x: Self) extends AnyVal {
    
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
    def setDataCatalogTimestamps(value: GoogleCloudDatacatalogV1beta1SystemTimestamps): Self = this.set("dataCatalogTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCatalogTimestamps: Self = this.set("dataCatalogTimestamps", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
