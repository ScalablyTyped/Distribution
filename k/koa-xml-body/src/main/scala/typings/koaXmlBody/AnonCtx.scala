package typings.koaXmlBody

import typings.koa.mod.Context
import typings.std.Error
import typings.xml2js.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCtx extends js.Object {
  // requested encoding. Default is utf8. If not set, the lib will retrive it from content-type(such as content-type:application/xml;charset=gb2312).
  var encoding: js.UndefOr[String] = js.undefined
  // length of the body. When content-length is found, it will be overwritten automatically.
  var length: js.UndefOr[Double] = js.undefined
  // limit of the body. If the body ends up being larger than this limit, a 413 error code is returned. Default is 1mb.
  var limit: js.UndefOr[Double] = js.undefined
  // error handler. Default is a noop function. It means it will eat the error silently. You can config it to customize the response.
  var onerror: js.UndefOr[js.Function2[/* err */ Error, /* ctx */ Context, Unit]] = js.undefined
  // options which will be used to parse xml. Default is {}. See xml2js Options for details.
  var xmlOptions: js.UndefOr[Options] = js.undefined
}

object AnonCtx {
  @scala.inline
  def apply(
    encoding: String = null,
    length: Int | Double = null,
    limit: Int | Double = null,
    onerror: (/* err */ Error, /* ctx */ Context) => Unit = null,
    xmlOptions: Options = null
  ): AnonCtx = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction2(onerror))
    if (xmlOptions != null) __obj.updateDynamic("xmlOptions")(xmlOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCtx]
  }
}

