package typings.luminoDatagrid.textrendererMod.TextRenderer.formatGeneric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for creating a generic format function.
  */
trait IOptions extends js.Object {
  /**
    * The text to use for a `null` or `undefined` data value.
    *
    * The default is `''`.
    */
  var missing: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(missing: String = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

