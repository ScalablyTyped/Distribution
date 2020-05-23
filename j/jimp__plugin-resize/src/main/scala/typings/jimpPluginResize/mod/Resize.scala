package typings.jimpPluginResize.mod

import typings.jimpPluginResize.anon.RESIZEBEZIER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resize extends js.Object {
  var `class`: ResizeClass
  var constants: RESIZEBEZIER
}

object Resize {
  @scala.inline
  def apply(`class`: ResizeClass, constants: RESIZEBEZIER): Resize = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resize]
  }
}

