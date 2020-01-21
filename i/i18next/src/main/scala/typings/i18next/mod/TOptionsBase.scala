package typings.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TOptionsBase extends js.Object {
  /**
    * Used for contexts (eg. male\female)
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * Count value used for plurals
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Default value to return if a translation was not found
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * Override language to lookup key if not found see fallbacks for details
    */
  var fallbackLng: js.UndefOr[FallbackLng] = js.undefined
  /**
    * Override interpolation options
    */
  var interpolation: js.UndefOr[InterpolationOptions] = js.undefined
  /**
    * Char, eg. '\n' that arrays will be joined by (can be set globally too)
    */
  var joinArrays: js.UndefOr[String] = js.undefined
  /**
    * Override char to separate keys
    */
  var keySeparator: js.UndefOr[String] = js.undefined
  /**
    * Override language to use
    */
  var lng: js.UndefOr[String] = js.undefined
  /**
    * Override languages to use
    */
  var lngs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Override namespaces (string or array)
    */
  var ns: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Override char to split namespace from key
    */
  var nsSeparator: js.UndefOr[String] = js.undefined
  /**
    * String or array of postProcessors to apply see interval plurals as a sample
    */
  var postProcess: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Object with vars for interpolation - or put them directly in options
    */
  var replace: js.UndefOr[js.Any] = js.undefined
  /**
    * Accessing an object not a translation string (can be set globally too)
    */
  var returnObjects: js.UndefOr[Boolean] = js.undefined
}

object TOptionsBase {
  @scala.inline
  def apply(
    context: js.Any = null,
    count: Int | Double = null,
    defaultValue: js.Any = null,
    fallbackLng: FallbackLng = null,
    interpolation: InterpolationOptions = null,
    joinArrays: String = null,
    keySeparator: String = null,
    lng: String = null,
    lngs: js.Array[String] = null,
    ns: String | js.Array[String] = null,
    nsSeparator: String = null,
    postProcess: String | js.Array[String] = null,
    replace: js.Any = null,
    returnObjects: js.UndefOr[Boolean] = js.undefined
  ): TOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (fallbackLng != null) __obj.updateDynamic("fallbackLng")(fallbackLng.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (joinArrays != null) __obj.updateDynamic("joinArrays")(joinArrays.asInstanceOf[js.Any])
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (lngs != null) __obj.updateDynamic("lngs")(lngs.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (nsSeparator != null) __obj.updateDynamic("nsSeparator")(nsSeparator.asInstanceOf[js.Any])
    if (postProcess != null) __obj.updateDynamic("postProcess")(postProcess.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (!js.isUndefined(returnObjects)) __obj.updateDynamic("returnObjects")(returnObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[TOptionsBase]
  }
}

