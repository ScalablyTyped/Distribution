package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputScanRegion extends js.Object {
  var `x-dimension`: js.UndefOr[String] = js.undefined
  var `x-origin`: js.UndefOr[String] = js.undefined
  var `y-dimension`: js.UndefOr[String] = js.undefined
  var `y-origin`: js.UndefOr[String] = js.undefined
}

object InputScanRegion {
  @scala.inline
  def apply(
    `x-dimension`: String = null,
    `x-origin`: String = null,
    `y-dimension`: String = null,
    `y-origin`: String = null
  ): InputScanRegion = {
    val __obj = js.Dynamic.literal()
    if (`x-dimension` != null) __obj.updateDynamic("x-dimension")(`x-dimension`.asInstanceOf[js.Any])
    if (`x-origin` != null) __obj.updateDynamic("x-origin")(`x-origin`.asInstanceOf[js.Any])
    if (`y-dimension` != null) __obj.updateDynamic("y-dimension")(`y-dimension`.asInstanceOf[js.Any])
    if (`y-origin` != null) __obj.updateDynamic("y-origin")(`y-origin`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputScanRegion]
  }
}

