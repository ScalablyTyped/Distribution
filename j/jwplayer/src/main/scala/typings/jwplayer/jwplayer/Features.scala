package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  var flash: Boolean
  
  var flashVersion: Double
  
  var iframe: Boolean
}
object Features {
  
  inline def apply(flash: Boolean, flashVersion: Double, iframe: Boolean): Features = {
    val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any], flashVersion = flashVersion.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setFlash(value: Boolean): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    inline def setFlashVersion(value: Double): Self = StObject.set(x, "flashVersion", value.asInstanceOf[js.Any])
    
    inline def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
  }
}
