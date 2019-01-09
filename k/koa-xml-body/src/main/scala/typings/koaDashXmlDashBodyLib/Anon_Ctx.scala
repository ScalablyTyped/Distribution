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
    js.Function2[/* err */ nodeLib.Error, /* ctx */ koaLib.koaMod.ApplicationNs.Context, scala.Unit]
  ] = js.undefined
  // options which will be used to parse xml. Default is {}. See xml2js Options for details.
  var xmlOptions: js.UndefOr[xml2jsLib.xml2jsMod.Options] = js.undefined
}

