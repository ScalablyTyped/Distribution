package typings
package gotLib.gotMod.gotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[B /* <: nodeLib.Buffer | java.lang.String | js.Object */]
  extends nodeLib.httpMod.IncomingMessage {
  var body: B = js.native
  var fromCache: scala.Boolean = js.native
  var redirectUrls: js.UndefOr[js.Array[java.lang.String]] = js.native
  var requestUrl: java.lang.String = js.native
  @JSName("url")
  var url_Response: java.lang.String = js.native
}

