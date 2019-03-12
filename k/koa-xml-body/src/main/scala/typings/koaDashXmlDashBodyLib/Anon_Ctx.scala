package typings
package koaDashXmlDashBodyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ctx extends js.Object {
  // requested encoding. Default is utf8. If not set, the lib will retrive it from content-type(such as content-type:application/xml;charset=gb2312).
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  // length of the body. When content-length is found, it will be overwritten automatically.
  var length: js.UndefOr[scala.Double] = js.undefined
  // limit of the body. If the body ends up being larger than this limit, a 413 error code is returned. Default is 1mb.
  var limit: js.UndefOr[scala.Double] = js.undefined
  // error handler. Default is a noop function. It means it will eat the error silently. You can config it to customize the response.
  var onerror: js.UndefOr[
    js.Function2[/* err */ stdLib.Error, /* ctx */ koaLib.koaMod.ApplicationNs.Context, scala.Unit]
  ] = js.undefined
  // options which will be used to parse xml. Default is {}. See xml2js Options for details.
  var xmlOptions: js.UndefOr[xml2jsLib.xml2jsMod.Options] = js.undefined
}

object Anon_Ctx {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    limit: scala.Int | scala.Double = null,
    onerror: (/* err */ stdLib.Error, /* ctx */ koaLib.koaMod.ApplicationNs.Context) => scala.Unit = null,
    xmlOptions: xml2jsLib.xml2jsMod.Options = null
  ): Anon_Ctx = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction2(onerror))
    if (xmlOptions != null) __obj.updateDynamic("xmlOptions")(xmlOptions)
    __obj.asInstanceOf[Anon_Ctx]
  }
}

