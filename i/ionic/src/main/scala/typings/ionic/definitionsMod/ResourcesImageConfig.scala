package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.landscape
import typings.ionic.ionicStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcesImageConfig extends StObject {
  
  var density: js.UndefOr[String] = js.undefined
  
  var height: Double
  
  var name: String
  
  var orientation: js.UndefOr[landscape | portrait] = js.undefined
  
  var width: Double
}
object ResourcesImageConfig {
  
  inline def apply(height: Double, name: String, width: Double): ResourcesImageConfig = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcesImageConfig]
  }
  
  extension [Self <: ResourcesImageConfig](x: Self) {
    
    inline def setDensity(value: String): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: landscape | portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
