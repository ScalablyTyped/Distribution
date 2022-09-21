package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAssetsResult extends StObject {
  
  /**
    * Asset matching the search request.
    */
  var asset: js.UndefOr[SchemaAsset] = js.undefined
  
  /**
    * State change of the asset between the points in time.
    */
  var stateChange: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAssetsResult {
  
  inline def apply(): SchemaListAssetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAssetsResult]
  }
  
  extension [Self <: SchemaListAssetsResult](x: Self) {
    
    inline def setAsset(value: SchemaAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setStateChange(value: String): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    inline def setStateChangeNull: Self = StObject.set(x, "stateChange", null)
    
    inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
  }
}
