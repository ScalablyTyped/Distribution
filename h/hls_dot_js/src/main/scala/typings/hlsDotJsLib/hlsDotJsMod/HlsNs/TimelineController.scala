package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Customized text track syncronization controller.
  */
trait TimelineController extends js.Object {
  /**
    * clean-up all used resources
    */
  def destroy(): scala.Unit
}

object TimelineController {
  @scala.inline
  def apply(destroy: () => scala.Unit): TimelineController = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[TimelineController]
  }
}

