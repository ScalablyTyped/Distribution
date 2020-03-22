package typings.luminoWidgets.boxlayoutMod.BoxLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a box layout.
  */
trait IOptions extends js.Object {
  /**
    * The content alignment of the layout.
    *
    * The default is `'start'`.
    */
  var alignment: js.UndefOr[Alignment] = js.undefined
  /**
    * The direction of the layout.
    *
    * The default is `'top-to-bottom'`.
    */
  var direction: js.UndefOr[Direction] = js.undefined
  /**
    * The spacing between items in the layout.
    *
    * The default is `4`.
    */
  var spacing: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(alignment: Alignment = null, direction: Direction = null, spacing: Int | Double = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

