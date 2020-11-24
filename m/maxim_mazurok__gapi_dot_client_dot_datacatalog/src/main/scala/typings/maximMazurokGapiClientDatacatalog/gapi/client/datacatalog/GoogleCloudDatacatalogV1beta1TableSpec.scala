package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1TableSpec extends js.Object {
  
  /**
    * Output only. If the table is a dated shard, i.e., with name pattern `[prefix]YYYYMMDD`, `grouped_entry` is the Data Catalog resource name of the date sharded grouped entry, for
    * example, `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`. Otherwise, `grouped_entry` is empty.
    */
  var groupedEntry: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1TableSpec {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1TableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1TableSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1TableSpecOps[Self <: GoogleCloudDatacatalogV1beta1TableSpec] (val x: Self) extends AnyVal {
    
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
    def setGroupedEntry(value: String): Self = this.set("groupedEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupedEntry: Self = this.set("groupedEntry", js.undefined)
  }
}
