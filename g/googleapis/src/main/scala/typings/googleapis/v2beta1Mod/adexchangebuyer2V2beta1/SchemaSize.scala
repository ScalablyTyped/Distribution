package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message depicting the size of the creative. The units of width and height
  * depend on the type of the targeting.
  */
@js.native
trait SchemaSize extends js.Object {
  /**
    * The height of the creative.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The width of the creative
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaSize {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): SchemaSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSize]
  }
}

