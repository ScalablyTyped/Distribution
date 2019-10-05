package typings.atHapiNes.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Client {
  type Handler = js.Function2[/* message */ js.Any, /* flags */ ClientSubscribeFlags, Unit]
}
