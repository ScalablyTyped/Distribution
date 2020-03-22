package typings.luminoDatagrid.textrendererMod.TextRenderer.formatIntlDateTime

import typings.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for creating an intl datetime format function.
  */
trait IOptions extends js.Object {
  /**
    * The locales to pass to the `Intl.DateTimeFormat` constructor.
    *
    * The default is determined by the user agent.
    */
  var locales: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The text to use for a `null` or `undefined` data value.
    *
    * The default is `''`.
    */
  var missing: js.UndefOr[String] = js.undefined
  /**
    * The options to pass to the `Intl.DateTimeFormat` constructor.
    *
    * The default is determined by the user agent.
    */
  var options: js.UndefOr[DateTimeFormatOptions] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    locales: String | js.Array[String] = null,
    missing: String = null,
    options: DateTimeFormatOptions = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

