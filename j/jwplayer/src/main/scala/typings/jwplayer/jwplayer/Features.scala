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
  
  @scala.inline
  def apply(flash: Boolean, flashVersion: Double, iframe: Boolean): Features = {
    val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any], flashVersion = flashVersion.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  @scala.inline
  implicit class FeaturesMutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlash(value: Boolean): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashVersion(value: Double): Self = StObject.set(x, "flashVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
  }
}
