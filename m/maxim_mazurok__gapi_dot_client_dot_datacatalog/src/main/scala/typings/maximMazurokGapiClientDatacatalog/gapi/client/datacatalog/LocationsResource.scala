package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var entryGroups: EntryGroupsResource
  
  var tagTemplates: TagTemplatesResource
  
  var taxonomies: TaxonomiesResource
}
object LocationsResource {
  
  inline def apply(
    entryGroups: EntryGroupsResource,
    tagTemplates: TagTemplatesResource,
    taxonomies: TaxonomiesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(entryGroups = entryGroups.asInstanceOf[js.Any], tagTemplates = tagTemplates.asInstanceOf[js.Any], taxonomies = taxonomies.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setEntryGroups(value: EntryGroupsResource): Self = StObject.set(x, "entryGroups", value.asInstanceOf[js.Any])
    
    inline def setTagTemplates(value: TagTemplatesResource): Self = StObject.set(x, "tagTemplates", value.asInstanceOf[js.Any])
    
    inline def setTaxonomies(value: TaxonomiesResource): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
  }
}
