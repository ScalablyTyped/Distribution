package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAsset extends StObject {
  
  /**
    * Set if this is an Android App asset.
    */
  var androidApp: js.UndefOr[SchemaAndroidAppAsset] = js.undefined
  
  /**
    * Set if this is a web asset.
    */
  var web: js.UndefOr[SchemaWebAsset] = js.undefined
}
object SchemaAsset {
  
  inline def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  
  extension [Self <: SchemaAsset](x: Self) {
    
    inline def setAndroidApp(value: SchemaAndroidAppAsset): Self = StObject.set(x, "androidApp", value.asInstanceOf[js.Any])
    
    inline def setAndroidAppUndefined: Self = StObject.set(x, "androidApp", js.undefined)
    
    inline def setWeb(value: SchemaWebAsset): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
  }
}
