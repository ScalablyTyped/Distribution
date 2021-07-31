package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualQualityParam extends StObject {
  
  var label: String
  
  var mode: String
  
  var reason: String
}
object VisualQualityParam {
  
  @scala.inline
  def apply(label: String, mode: String, reason: String): VisualQualityParam = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualQualityParam]
  }
  
  @scala.inline
  implicit class VisualQualityParamMutableBuilder[Self <: VisualQualityParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
