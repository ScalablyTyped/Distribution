package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventorySourceVideoCreativeConfig extends StObject {
  
  /**
    * The duration requirements for the video creatives that can be assigned to the inventory source.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventorySourceVideoCreativeConfig {
  
  inline def apply(): SchemaInventorySourceVideoCreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySourceVideoCreativeConfig]
  }
  
  extension [Self <: SchemaInventorySourceVideoCreativeConfig](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
