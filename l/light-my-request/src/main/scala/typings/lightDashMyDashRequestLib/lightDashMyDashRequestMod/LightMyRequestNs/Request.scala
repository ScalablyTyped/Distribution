package typings
package lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends nodeLib.streamMod.Readable {
  var headers: nodeLib.httpMod.IncomingHttpHeaders = js.native
  var httpVersion: java.lang.String = js.native
  var method: lightDashMyDashRequestLib.HTTPMethods = js.native
  var url: java.lang.String = js.native
  def prepare(next: js.Function0[scala.Unit]): scala.Unit = js.native
}

