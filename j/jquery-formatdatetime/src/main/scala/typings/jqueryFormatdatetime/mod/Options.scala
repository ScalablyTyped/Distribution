package typings.jqueryFormatdatetime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  monthNames  :std.Array<string>,   monthNamesShort  :std.Array<string>,   dayNames  :std.Array<string>,   dayNamesShort  :std.Array<string>,   ampmNames  :std.Array<string>, getSuffix (num : number): string,   attribute  :string,   formatAttribute  :string,   utc  :boolean}> */
trait Options extends js.Object {
  var ampmNames: js.UndefOr[js.Array[String]] = js.undefined
  var attribute: js.UndefOr[String] = js.undefined
  var dayNames: js.UndefOr[js.Array[String]] = js.undefined
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  var formatAttribute: js.UndefOr[String] = js.undefined
  var getSuffix: js.UndefOr[js.Function1[/* num */ Double, String]] = js.undefined
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  var utc: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ampmNames: js.Array[String] = null,
    attribute: String = null,
    dayNames: js.Array[String] = null,
    dayNamesShort: js.Array[String] = null,
    formatAttribute: String = null,
    getSuffix: /* num */ Double => String = null,
    monthNames: js.Array[String] = null,
    monthNamesShort: js.Array[String] = null,
    utc: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ampmNames != null) __obj.updateDynamic("ampmNames")(ampmNames.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (dayNamesShort != null) __obj.updateDynamic("dayNamesShort")(dayNamesShort.asInstanceOf[js.Any])
    if (formatAttribute != null) __obj.updateDynamic("formatAttribute")(formatAttribute.asInstanceOf[js.Any])
    if (getSuffix != null) __obj.updateDynamic("getSuffix")(js.Any.fromFunction1(getSuffix))
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort.asInstanceOf[js.Any])
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

