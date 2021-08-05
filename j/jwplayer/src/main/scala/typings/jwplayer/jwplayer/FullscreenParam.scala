package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullscreenParam extends StObject {
  
  var fullscreen: Boolean
}
object FullscreenParam {
  
  inline def apply(fullscreen: Boolean): FullscreenParam = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullscreenParam]
  }
  
  extension [Self <: FullscreenParam](x: Self) {
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
  }
}
