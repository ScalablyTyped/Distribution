package typings.jsftp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorCallback = js.Function1[/* err */ typings.std.Error, scala.Unit]
  type GetCallback = js.Function2[/* err */ typings.std.Error, /* socket */ typings.node.netMod.Socket, scala.Unit]
  type ListCallback = js.Function2[/* err */ typings.std.Error, /* dirContents */ java.lang.String, scala.Unit]
  type LsCallback = js.Function2[/* err */ typings.std.Error, /* res */ js.Array[typings.jsftp.AnonName], scala.Unit]
  type RawCallback = js.Function2[/* err */ typings.std.Error, /* data */ typings.jsftp.AnonCode, scala.Unit]
}
