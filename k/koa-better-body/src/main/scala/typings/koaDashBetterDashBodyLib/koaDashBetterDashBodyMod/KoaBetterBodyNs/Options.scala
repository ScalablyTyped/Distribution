package typings
package koaDashBetterDashBodyLib.koaDashBetterDashBodyMod.KoaBetterBodyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  var bufferLimit: js.UndefOr[java.lang.String] = js.undefined
  var decodeURIComponent: js.UndefOr[js.Any] = js.undefined
  var delimiter: js.UndefOr[js.Symbol] = js.undefined
  var detectJSON: js.UndefOr[js.Function0[_]] = js.undefined
  var fields: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var files: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var formLimit: js.UndefOr[java.lang.String] = js.undefined
  var jsonLimit: js.UndefOr[java.lang.String] = js.undefined
  var jsonStrict: js.UndefOr[scala.Boolean] = js.undefined
  var maxKeys: js.UndefOr[scala.Double] = js.undefined
  var multipart: js.UndefOr[scala.Boolean] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var textLimit: js.UndefOr[java.lang.String] = js.undefined
  var urlencodedLimit: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    bufferLimit: java.lang.String = null,
    decodeURIComponent: js.Any = null,
    delimiter: js.Symbol = null,
    detectJSON: () => _ = null,
    fields: scala.Boolean | java.lang.String = null,
    files: scala.Boolean | java.lang.String = null,
    formLimit: java.lang.String = null,
    jsonLimit: java.lang.String = null,
    jsonStrict: js.UndefOr[scala.Boolean] = js.undefined,
    maxKeys: scala.Int | scala.Double = null,
    multipart: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    textLimit: java.lang.String = null,
    urlencodedLimit: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (bufferLimit != null) __obj.updateDynamic("bufferLimit")(bufferLimit)
    if (decodeURIComponent != null) __obj.updateDynamic("decodeURIComponent")(decodeURIComponent)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (detectJSON != null) __obj.updateDynamic("detectJSON")(js.Any.fromFunction0(detectJSON))
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (formLimit != null) __obj.updateDynamic("formLimit")(formLimit)
    if (jsonLimit != null) __obj.updateDynamic("jsonLimit")(jsonLimit)
    if (!js.isUndefined(jsonStrict)) __obj.updateDynamic("jsonStrict")(jsonStrict)
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (textLimit != null) __obj.updateDynamic("textLimit")(textLimit)
    if (urlencodedLimit != null) __obj.updateDynamic("urlencodedLimit")(urlencodedLimit)
    __obj.asInstanceOf[Options]
  }
}

