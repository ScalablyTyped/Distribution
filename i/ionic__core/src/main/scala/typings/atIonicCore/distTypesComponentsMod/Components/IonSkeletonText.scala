package typings.atIonicCore.distTypesComponentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSkeletonText extends js.Object {
  /**
    * If `true`, the skeleton text will animate.
    */
  var animated: Boolean
  /**
    * @deprecated Use CSS instead. The width of the skeleton text. If supplied, it will override the CSS style.
    */
  var width: js.UndefOr[String] = js.undefined
}

object IonSkeletonText {
  @scala.inline
  def apply(animated: Boolean, width: String = null): IonSkeletonText = {
    val __obj = js.Dynamic.literal(animated = animated)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IonSkeletonText]
  }
}

