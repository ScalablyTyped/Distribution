package typings.heyDashListen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hey-listen", JSImport.Namespace)
@js.native
object heyDashListenMod extends js.Object {
  var invariant: DevMessage = js.native
  var warning: DevMessage = js.native
  type DevMessage = js.Function2[/* check */ Boolean, /* message */ String, Unit]
}

