package typings.jqueryFullscreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extends JqueryStatic ($)
  * i.e: To use $.fullscreen.functionName()
  */
trait JQueryStatic extends StObject {
  
  var fullscreen: JQueryFullscreen
}
object JQueryStatic {
  
  inline def apply(fullscreen: JQueryFullscreen): JQueryStatic = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setFullscreen(value: JQueryFullscreen): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
  }
}
