package typings
package i18nextLib.i18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationOptionsBase extends js.Object {
  /**
    * used for contexts (eg. male\female)
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * count value used for plurals
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * defaultValue to return if a translation was not found
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * override language to lookup key if not found see fallbacks for details
    */
  var fallbackLng: js.UndefOr[FallbackLng] = js.undefined
  /**
    * override interpolation options
    */
  var interpolation: js.UndefOr[InterpolationOptions] = js.undefined
  /**
    * char, eg. '\n' that arrays will be joined by (can be set globally too)
    */
  var joinArrays: js.UndefOr[java.lang.String] = js.undefined
  /**
    * override char to separate keys
    */
  var keySeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * override language to use
    */
  var lng: js.UndefOr[java.lang.String] = js.undefined
  /**
    * override languages to use
    */
  var lngs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * override namespaces (string or array)
    */
  var ns: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * override char to split namespace from key
    */
  var nsSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * string or array of postProcessors to apply see interval plurals as a sample
    */
  var postProcess: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * object with vars for interpolation - or put them directly in options
    */
  var replace: js.UndefOr[js.Any] = js.undefined
  /**
    * accessing an object not a translation string (can be set globally too)
    */
  var returnObjects: js.UndefOr[scala.Boolean] = js.undefined
}

object TranslationOptionsBase {
  @scala.inline
  def apply(
    context: js.Any = null,
    count: scala.Int | scala.Double = null,
    defaultValue: js.Any = null,
    fallbackLng: FallbackLng = null,
    interpolation: InterpolationOptions = null,
    joinArrays: java.lang.String = null,
    keySeparator: java.lang.String = null,
    lng: java.lang.String = null,
    lngs: js.Array[java.lang.String] = null,
    ns: java.lang.String | js.Array[java.lang.String] = null,
    nsSeparator: java.lang.String = null,
    postProcess: java.lang.String | js.Array[java.lang.String] = null,
    replace: js.Any = null,
    returnObjects: js.UndefOr[scala.Boolean] = js.undefined
  ): TranslationOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (fallbackLng != null) __obj.updateDynamic("fallbackLng")(fallbackLng.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (joinArrays != null) __obj.updateDynamic("joinArrays")(joinArrays)
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator)
    if (lng != null) __obj.updateDynamic("lng")(lng)
    if (lngs != null) __obj.updateDynamic("lngs")(lngs)
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (nsSeparator != null) __obj.updateDynamic("nsSeparator")(nsSeparator)
    if (postProcess != null) __obj.updateDynamic("postProcess")(postProcess.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(returnObjects)) __obj.updateDynamic("returnObjects")(returnObjects)
    __obj.asInstanceOf[TranslationOptionsBase]
  }
}

