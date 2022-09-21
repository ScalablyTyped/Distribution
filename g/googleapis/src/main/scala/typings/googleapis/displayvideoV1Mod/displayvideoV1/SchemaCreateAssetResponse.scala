package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateAssetResponse extends StObject {
  
  /**
    * The uploaded asset, if successful.
    */
  var asset: js.UndefOr[SchemaAsset] = js.undefined
}
object SchemaCreateAssetResponse {
  
  inline def apply(): SchemaCreateAssetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateAssetResponse]
  }
  
  extension [Self <: SchemaCreateAssetResponse](x: Self) {
    
    inline def setAsset(value: SchemaAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
  }
}
