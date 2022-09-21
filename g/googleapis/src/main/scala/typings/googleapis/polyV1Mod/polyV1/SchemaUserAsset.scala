package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserAsset extends StObject {
  
  /**
    * An Asset.
    */
  var asset: js.UndefOr[SchemaAsset] = js.undefined
}
object SchemaUserAsset {
  
  inline def apply(): SchemaUserAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAsset]
  }
  
  extension [Self <: SchemaUserAsset](x: Self) {
    
    inline def setAsset(value: SchemaAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
  }
}
