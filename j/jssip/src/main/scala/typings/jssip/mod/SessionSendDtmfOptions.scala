package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionSendDtmfOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var interToneGap: Double
}
object SessionSendDtmfOptions {
  
  @scala.inline
  def apply(interToneGap: Double): SessionSendDtmfOptions = {
    val __obj = js.Dynamic.literal(interToneGap = interToneGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionSendDtmfOptions]
  }
  
  @scala.inline
  implicit class SessionSendDtmfOptionsMutableBuilder[Self <: SessionSendDtmfOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    @scala.inline
    def setInterToneGap(value: Double): Self = StObject.set(x, "interToneGap", value.asInstanceOf[js.Any])
  }
}
