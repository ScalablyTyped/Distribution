package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Androidversion extends StObject {
  
  var android_release: String
  
  var android_version: Double
  
  var manufacturer: String
  
  var model: String
}
object Androidversion {
  
  inline def apply(android_release: String, android_version: Double, manufacturer: String, model: String): Androidversion = {
    val __obj = js.Dynamic.literal(android_release = android_release.asInstanceOf[js.Any], android_version = android_version.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Androidversion]
  }
  
  extension [Self <: Androidversion](x: Self) {
    
    inline def setAndroid_release(value: String): Self = StObject.set(x, "android_release", value.asInstanceOf[js.Any])
    
    inline def setAndroid_version(value: Double): Self = StObject.set(x, "android_version", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
