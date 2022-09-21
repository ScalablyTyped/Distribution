package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1EntryGroup extends StObject {
  
  /**
    * Output only. Timestamps of the entry group. Default value is empty.
    */
  var dataCatalogTimestamps: js.UndefOr[SchemaGoogleCloudDatacatalogV1SystemTimestamps] = js.undefined
  
  /**
    * Entry group description. Can consist of several sentences or paragraphs that describe the entry group contents. Default value is an empty string.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A short name to identify the entry group, for example, "analytics data - jan 2011". Default value is an empty string.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the entry group in URL format. Note: The entry group itself and its child resources might not be stored in the location specified in its name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1EntryGroup {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1EntryGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1EntryGroup]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1EntryGroup](x: Self) {
    
    inline def setDataCatalogTimestamps(value: SchemaGoogleCloudDatacatalogV1SystemTimestamps): Self = StObject.set(x, "dataCatalogTimestamps", value.asInstanceOf[js.Any])
    
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
