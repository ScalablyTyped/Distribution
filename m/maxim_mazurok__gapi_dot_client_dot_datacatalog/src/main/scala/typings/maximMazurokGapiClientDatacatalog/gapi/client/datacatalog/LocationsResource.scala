package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var entryGroups: EntryGroupsResource = js.native
  
  var tagTemplates: TagTemplatesResource = js.native
  
  var taxonomies: TaxonomiesResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(
    entryGroups: EntryGroupsResource,
    tagTemplates: TagTemplatesResource,
    taxonomies: TaxonomiesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(entryGroups = entryGroups.asInstanceOf[js.Any], tagTemplates = tagTemplates.asInstanceOf[js.Any], taxonomies = taxonomies.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
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
    def setEntryGroups(value: EntryGroupsResource): Self = this.set("entryGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagTemplates(value: TagTemplatesResource): Self = this.set("tagTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomies(value: TaxonomiesResource): Self = this.set("taxonomies", value.asInstanceOf[js.Any])
  }
}
