package typings.imageDashSize.distTypesInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISize extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ISize {
  @scala.inline
  def apply(
    height: Int | Double = null,
    orientation: Int | Double = null,
    `type`: String = null,
    width: Int | Double = null
  ): ISize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISize]
  }
}

