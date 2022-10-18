package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: Double
  
  var navigatorBarHeight: Double
  
  var scale: Double
  
  var statusBarHeight: Double
  
  var width: Double
}
object Height {
  
  inline def apply(height: Double, navigatorBarHeight: Double, scale: Double, statusBarHeight: Double, width: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], navigatorBarHeight = navigatorBarHeight.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setNavigatorBarHeight(value: Double): Self = StObject.set(x, "navigatorBarHeight", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
