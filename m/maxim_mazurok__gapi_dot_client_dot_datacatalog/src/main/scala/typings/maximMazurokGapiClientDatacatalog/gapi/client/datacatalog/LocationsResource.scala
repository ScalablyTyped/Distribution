package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
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
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryGroups(value: EntryGroupsResource): Self = StObject.set(x, "entryGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagTemplates(value: TagTemplatesResource): Self = StObject.set(x, "tagTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomies(value: TaxonomiesResource): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
  }
}
