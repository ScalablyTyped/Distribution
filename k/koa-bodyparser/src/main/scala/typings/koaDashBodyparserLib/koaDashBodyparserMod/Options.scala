package typings
package koaDashBodyparserLib.koaDashBodyparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * custom json request detect function. Default is null
    */
  var detectJSON: js.UndefOr[js.Function1[/* ctx */ koaLib.koaMod.Context, scala.Boolean]] = js.undefined
  /**
    *  parser will only parse when request type hits enableTypes, default is ['json', 'form'].
    */
  var enableTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * requested encoding. Default is utf-8 by co-body
    */
  var encode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * support extend types
    */
  var extendTypes: js.UndefOr[koaDashBodyparserLib.Anon_Form] = js.undefined
  /**
    * limit of the urlencoded body. If the body ends up being larger than this limit
    * a 413 error code is returned. Default is 56kb
    */
  var formLimit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * limit of the json body. Default is 1mb
    */
  var jsonLimit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * support custom error handle
    */
  var onerror: js.UndefOr[
    js.Function2[/* err */ stdLib.Error, /* ctx */ koaLib.koaMod.Context, scala.Unit]
  ] = js.undefined
  /**
    * when set to true, JSON parser will only accept arrays and objects. Default is true
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * limit of the text body. Default is 1mb.
    */
  var textLimit: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    detectJSON: /* ctx */ koaLib.koaMod.Context => scala.Boolean = null,
    enableTypes: js.Array[java.lang.String] = null,
    encode: java.lang.String = null,
    extendTypes: koaDashBodyparserLib.Anon_Form = null,
    formLimit: java.lang.String = null,
    jsonLimit: java.lang.String = null,
    onerror: (/* err */ stdLib.Error, /* ctx */ koaLib.koaMod.Context) => scala.Unit = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    textLimit: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (detectJSON != null) __obj.updateDynamic("detectJSON")(js.Any.fromFunction1(detectJSON))
    if (enableTypes != null) __obj.updateDynamic("enableTypes")(enableTypes)
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (extendTypes != null) __obj.updateDynamic("extendTypes")(extendTypes)
    if (formLimit != null) __obj.updateDynamic("formLimit")(formLimit)
    if (jsonLimit != null) __obj.updateDynamic("jsonLimit")(jsonLimit)
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction2(onerror))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (textLimit != null) __obj.updateDynamic("textLimit")(textLimit)
    __obj.asInstanceOf[Options]
  }
}

