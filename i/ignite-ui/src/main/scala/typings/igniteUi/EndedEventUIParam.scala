package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndedEventUIParam extends StObject {
  
  /**
    * Get the video duration in seconds.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Get the url of the playing video.
    */
  var source: js.UndefOr[String] = js.native
}
object EndedEventUIParam {
  
  @scala.inline
  def apply(): EndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndedEventUIParam]
  }
  
  @scala.inline
  implicit class EndedEventUIParamMutableBuilder[Self <: EndedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
