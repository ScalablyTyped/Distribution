package typings
package lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends nodeLib.httpMod.ServerResponse {
  var body: java.lang.String = js.native
  var headers: nodeLib.httpMod.OutgoingHttpHeaders = js.native
  var payload: java.lang.String = js.native
  var raw: lightDashMyDashRequestLib.Anon_Res = js.native
  var rawPayload: nodeLib.Buffer = js.native
  var trailers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def addTrailers(trailers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
}

