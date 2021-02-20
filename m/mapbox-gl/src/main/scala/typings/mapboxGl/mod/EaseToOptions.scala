package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EaseToOptions
  extends AnimationOptions
     with CameraOptions {
  
  var delayEndEvents: js.UndefOr[Double] = js.native
}
object EaseToOptions {
  
  @scala.inline
  def apply(): EaseToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EaseToOptions]
  }
  
  @scala.inline
  implicit class EaseToOptionsMutableBuilder[Self <: EaseToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelayEndEvents(value: Double): Self = StObject.set(x, "delayEndEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayEndEventsUndefined: Self = StObject.set(x, "delayEndEvents", js.undefined)
  }
}
