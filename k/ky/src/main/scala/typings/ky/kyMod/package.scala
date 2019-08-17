package typings.ky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kyMod {
  import typings.std.Response

  type AfterResponseHook = js.Function1[/* response */ Response, Response | Unit | (js.Promise[Response | Unit])]
  type BeforeRequestHook = js.Function1[/* options */ Options, Unit | js.Promise[Unit]]
}
