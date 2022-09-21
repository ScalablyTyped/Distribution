package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeConfig extends StObject {
  
  /**
    * The type of creative that can be assigned to the inventory source. Only the following types are supported: * `CREATIVE_TYPE_STANDARD` * `CREATIVE_TYPE_VIDEO`
    */
  var creativeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The configuration for display creatives. Applicable when creative_type is `CREATIVE_TYPE_STANDARD`.
    */
  var displayCreativeConfig: js.UndefOr[SchemaInventorySourceDisplayCreativeConfig] = js.undefined
  
  /**
    * The configuration for video creatives. Applicable when creative_type is `CREATIVE_TYPE_VIDEO`.
    */
  var videoCreativeConfig: js.UndefOr[SchemaInventorySourceVideoCreativeConfig] = js.undefined
}
object SchemaCreativeConfig {
  
  inline def apply(): SchemaCreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeConfig]
  }
  
  extension [Self <: SchemaCreativeConfig](x: Self) {
    
    inline def setCreativeType(value: String): Self = StObject.set(x, "creativeType", value.asInstanceOf[js.Any])
    
    inline def setCreativeTypeNull: Self = StObject.set(x, "creativeType", null)
    
    inline def setCreativeTypeUndefined: Self = StObject.set(x, "creativeType", js.undefined)
    
    inline def setDisplayCreativeConfig(value: SchemaInventorySourceDisplayCreativeConfig): Self = StObject.set(x, "displayCreativeConfig", value.asInstanceOf[js.Any])
    
    inline def setDisplayCreativeConfigUndefined: Self = StObject.set(x, "displayCreativeConfig", js.undefined)
    
    inline def setVideoCreativeConfig(value: SchemaInventorySourceVideoCreativeConfig): Self = StObject.set(x, "videoCreativeConfig", value.asInstanceOf[js.Any])
    
    inline def setVideoCreativeConfigUndefined: Self = StObject.set(x, "videoCreativeConfig", js.undefined)
  }
}
