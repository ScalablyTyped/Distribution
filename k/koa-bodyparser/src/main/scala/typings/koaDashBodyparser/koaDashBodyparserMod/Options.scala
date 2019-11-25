package typings.koaDashBodyparser.koaDashBodyparserMod

import typings.koa.koaMod.Context
import typings.koaDashBodyparser.Anon_Form
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * custom json request detect function. Default is null
    */
  var detectJSON: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.undefined
  /**
    *  parser will only parse when request type hits enableTypes, default is ['json', 'form'].
    */
  var enableTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * requested encoding. Default is utf-8 by co-body
    */
  var encode: js.UndefOr[String] = js.undefined
  /**
    * support extend types
    */
  var extendTypes: js.UndefOr[Anon_Form] = js.undefined
  /**
    * limit of the urlencoded body. If the body ends up being larger than this limit
    * a 413 error code is returned. Default is 56kb
    */
  var formLimit: js.UndefOr[String] = js.undefined
  /**
    * limit of the json body. Default is 1mb
    */
  var jsonLimit: js.UndefOr[String] = js.undefined
  /**
    * support custom error handle
    */
  var onerror: js.UndefOr[js.Function2[/* err */ Error, /* ctx */ Context, Unit]] = js.undefined
  /**
    * when set to true, JSON parser will only accept arrays and objects. Default is true
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * limit of the text body. Default is 1mb.
    */
  var textLimit: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    detectJSON: /* ctx */ Context => Boolean = null,
    enableTypes: js.Array[String] = null,
    encode: String = null,
    extendTypes: Anon_Form = null,
    formLimit: String = null,
    jsonLimit: String = null,
    onerror: (/* err */ Error, /* ctx */ Context) => Unit = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    textLimit: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (detectJSON != null) __obj.updateDynamic("detectJSON")(js.Any.fromFunction1(detectJSON))
    if (enableTypes != null) __obj.updateDynamic("enableTypes")(enableTypes.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (extendTypes != null) __obj.updateDynamic("extendTypes")(extendTypes.asInstanceOf[js.Any])
    if (formLimit != null) __obj.updateDynamic("formLimit")(formLimit.asInstanceOf[js.Any])
    if (jsonLimit != null) __obj.updateDynamic("jsonLimit")(jsonLimit.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction2(onerror))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (textLimit != null) __obj.updateDynamic("textLimit")(textLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

