package typings.koaDashBetterDashBody.koaDashBetterDashBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var buffer: js.UndefOr[Boolean] = js.undefined
  var bufferLimit: js.UndefOr[String] = js.undefined
  var decodeURIComponent: js.UndefOr[js.Any] = js.undefined
  var delimiter: js.UndefOr[js.Symbol] = js.undefined
  var detectJSON: js.UndefOr[js.Function0[_]] = js.undefined
  var fields: js.UndefOr[Boolean | String] = js.undefined
  var files: js.UndefOr[Boolean | String] = js.undefined
  var formLimit: js.UndefOr[String] = js.undefined
  var jsonLimit: js.UndefOr[String] = js.undefined
  var jsonStrict: js.UndefOr[Boolean] = js.undefined
  var maxKeys: js.UndefOr[Double] = js.undefined
  var multipart: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var textLimit: js.UndefOr[String] = js.undefined
  var urlencodedLimit: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    buffer: js.UndefOr[Boolean] = js.undefined,
    bufferLimit: String = null,
    decodeURIComponent: js.Any = null,
    delimiter: js.Symbol = null,
    detectJSON: () => _ = null,
    fields: Boolean | String = null,
    files: Boolean | String = null,
    formLimit: String = null,
    jsonLimit: String = null,
    jsonStrict: js.UndefOr[Boolean] = js.undefined,
    maxKeys: Int | Double = null,
    multipart: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    textLimit: String = null,
    urlencodedLimit: String = null
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

