package typings
package inversifyDashExpressDashUtilsLib.dtsContentHttpContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/content/httpContent", "HttpContent")
@js.native
abstract class HttpContent () extends js.Object {
  var _headers: js.Any = js.native
  val headers: nodeLib.httpMod.OutgoingHttpHeaders = js.native
  def readAsStringAsync(): stdLib.Promise[java.lang.String] = js.native
}

