package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1EntryGroup extends StObject {
  
  /** Output only. Timestamps of the entry group. Default value is empty. */
  var dataCatalogTimestamps: js.UndefOr[GoogleCloudDatacatalogV1SystemTimestamps] = js.undefined
  
  /** Entry group description. Can consist of several sentences or paragraphs that describe the entry group contents. Default value is an empty string. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A short name to identify the entry group, for example, "analytics data - jan 2011". Default value is an empty string. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The resource name of the entry group in URL format. Note: The entry group itself and its child resources might not be stored in the location specified in its name. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1EntryGroup {
  
  inline def apply(): GoogleCloudDatacatalogV1EntryGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1EntryGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1EntryGroup] (val x: Self) extends AnyVal {
    
    inline def setDataCatalogTimestamps(value: GoogleCloudDatacatalogV1SystemTimestamps): Self = StObject.set(x, "dataCatalogTimestamps", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogTimestampsUndefined: Self = StObject.set(x, "dataCatalogTimestamps", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
