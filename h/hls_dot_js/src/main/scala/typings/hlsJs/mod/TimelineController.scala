package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  Customized text track syncronization controller.
  */
trait TimelineController extends StObject {
  
  /**
    * clean-up all used resources
    */
  def destroy(): Unit
}
object TimelineController {
  
  inline def apply(destroy: () => Unit): TimelineController = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[TimelineController]
  }
  
  extension [Self <: TimelineController](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
