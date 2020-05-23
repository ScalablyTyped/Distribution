package typings.mapboxGl.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenControlOptions extends js.Object {
  /**
    * A compatible DOM element which should be made full screen.
    * By default, the map container element will be made full screen.
    */
  var container: js.UndefOr[HTMLElement | Null] = js.undefined
}

object FullscreenControlOptions {
  @scala.inline
  def apply(container: js.UndefOr[Null | HTMLElement] = js.undefined): FullscreenControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullscreenControlOptions]
  }
}

