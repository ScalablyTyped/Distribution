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
  def apply(destroy: js.Function0[scala.Unit]): TimelineController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.asInstanceOf[TimelineController]
  }
}

