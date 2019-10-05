package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSkeletonText extends js.Object {
  /**
    * If `true`, the skeleton text will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated Use CSS instead. The width of the skeleton text. If supplied, it will override the CSS style.
    */
  var width: js.UndefOr[String] = js.undefined
}

object IonSkeletonText {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, width: String = null): IonSkeletonText = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IonSkeletonText]
  }
}

