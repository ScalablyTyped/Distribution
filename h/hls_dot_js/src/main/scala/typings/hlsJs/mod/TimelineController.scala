package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  Customized text track syncronization controller.
  */
@js.native
trait TimelineController extends StObject {
  
  /**
    * clean-up all used resources
    */
  def destroy(): Unit = js.native
}
object TimelineController {
  
  @scala.inline
  def apply(destroy: () => Unit): TimelineController = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[TimelineController]
  }
  
  @scala.inline
  implicit class TimelineControllerMutableBuilder[Self <: TimelineController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
