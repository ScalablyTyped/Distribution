package typings
package koaDashBodyparserLib.koaDashBodyparserMod.bodyParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * custom json request detect function. Default is null
           */
  var detectJSON: js.UndefOr[js.Function1[/* ctx */ koaLib.koaMod.ApplicationNs.Context, scala.Boolean]] = js.undefined
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
  var extendTypes: js.UndefOr[koaDashBodyparserLib.Anon_Text] = js.undefined
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
    js.Function2[/* err */ nodeLib.Error, /* ctx */ koaLib.koaMod.ApplicationNs.Context, scala.Unit]
  ] = js.undefined
  /**
           * when set to true, JSON parser will only accept arrays and objects. Default is true
           */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

