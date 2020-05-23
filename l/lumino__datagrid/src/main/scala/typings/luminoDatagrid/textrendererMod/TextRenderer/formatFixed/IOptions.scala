package typings.luminoDatagrid.textrendererMod.TextRenderer.formatFixed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for creating a fixed format function.
  */
trait IOptions extends js.Object {
  /**
    * The number of digits to include after the decimal point.
    *
    * The default is determined by the user agent.
    */
  var digits: js.UndefOr[Double] = js.undefined
  /**
    * The text to use for a `null` or `undefined` data value.
    *
    * The default is `''`.
    */
  var missing: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(digits: js.UndefOr[Double] = js.undefined, missing: String = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(digits)) __obj.updateDynamic("digits")(digits.get.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

