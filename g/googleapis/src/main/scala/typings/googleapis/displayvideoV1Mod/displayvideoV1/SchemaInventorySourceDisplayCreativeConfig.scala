package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventorySourceDisplayCreativeConfig extends StObject {
  
  /**
    * The size requirements for display creatives that can be assigned to the inventory source.
    */
  var creativeSize: js.UndefOr[SchemaDimensions] = js.undefined
}
object SchemaInventorySourceDisplayCreativeConfig {
  
  inline def apply(): SchemaInventorySourceDisplayCreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySourceDisplayCreativeConfig]
  }
  
  extension [Self <: SchemaInventorySourceDisplayCreativeConfig](x: Self) {
    
    inline def setCreativeSize(value: SchemaDimensions): Self = StObject.set(x, "creativeSize", value.asInstanceOf[js.Any])
    
    inline def setCreativeSizeUndefined: Self = StObject.set(x, "creativeSize", js.undefined)
  }
}
