package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterFullScreenEventUIParam extends StObject {
  
  /**
    * Get the url of the playing video.
    */
  var source: js.UndefOr[String] = js.undefined
}
object EnterFullScreenEventUIParam {
  
  @scala.inline
  def apply(): EnterFullScreenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterFullScreenEventUIParam]
  }
  
  @scala.inline
  implicit class EnterFullScreenEventUIParamMutableBuilder[Self <: EnterFullScreenEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
