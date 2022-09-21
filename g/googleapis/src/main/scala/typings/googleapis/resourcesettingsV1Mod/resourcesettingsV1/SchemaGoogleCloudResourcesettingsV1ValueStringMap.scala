package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudResourcesettingsV1ValueStringMap extends StObject {
  
  /**
    * The key-value pairs in the map
    */
  var mappings: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudResourcesettingsV1ValueStringMap {
  
  inline def apply(): SchemaGoogleCloudResourcesettingsV1ValueStringMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudResourcesettingsV1ValueStringMap]
  }
  
  extension [Self <: SchemaGoogleCloudResourcesettingsV1ValueStringMap](x: Self) {
    
    inline def setMappings(value: StringDictionary[String]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsNull: Self = StObject.set(x, "mappings", null)
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
  }
}
