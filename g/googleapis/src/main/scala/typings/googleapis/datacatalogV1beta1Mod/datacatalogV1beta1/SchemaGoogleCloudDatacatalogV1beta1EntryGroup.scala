package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1EntryGroup extends StObject {
  
  /**
    * Output only. Timestamps about this EntryGroup. Default value is empty timestamps.
    */
  var dataCatalogTimestamps: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1SystemTimestamps] = js.undefined
  
  /**
    * Entry group description, which can consist of several sentences or paragraphs that describe entry group contents. Default value is an empty string.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A short name to identify the entry group, for example, "analytics data - jan 2011". Default value is an empty string.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the entry group in URL format. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\} Note that this EntryGroup and its child resources may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1EntryGroup {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1EntryGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1EntryGroup]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1EntryGroup](x: Self) {
    
    inline def setDataCatalogTimestamps(value: SchemaGoogleCloudDatacatalogV1beta1SystemTimestamps): Self = StObject.set(x, "dataCatalogTimestamps", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogTimestampsUndefined: Self = StObject.set(x, "dataCatalogTimestamps", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
