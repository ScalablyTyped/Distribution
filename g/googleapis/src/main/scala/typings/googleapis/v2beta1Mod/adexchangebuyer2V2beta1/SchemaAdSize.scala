package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents size of a single ad slot, or a creative.
  */
@js.native
trait SchemaAdSize extends js.Object {
  /**
    * The height of the ad slot in pixels. This field will be present only when
    * size type is `PIXEL`.
    */
  var height: js.UndefOr[String] = js.native
  /**
    * The size type of the ad slot.
    */
  var sizeType: js.UndefOr[String] = js.native
  /**
    * The width of the ad slot in pixels. This field will be present only when
    * size type is `PIXEL`.
    */
  var width: js.UndefOr[String] = js.native
}

object SchemaAdSize {
  @scala.inline
  def apply(height: String = null, sizeType: String = null, width: String = null): SchemaAdSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdSize]
  }
}

