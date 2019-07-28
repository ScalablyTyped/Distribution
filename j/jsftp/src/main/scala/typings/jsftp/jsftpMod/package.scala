package typings.jsftp

import typings.jsftp.Anon_Code
import typings.jsftp.Anon_Name
import typings.node.netMod.Socket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsftpMod {
  type ErrorCallback = js.Function1[/* err */ Error, Unit]
  type GetCallback = js.Function2[/* err */ Error, /* socket */ Socket, Unit]
  type ListCallback = js.Function2[/* err */ Error, /* dirContents */ String, Unit]
  type LsCallback = js.Function2[/* err */ Error, /* res */ js.Array[Anon_Name], Unit]
  type RawCallback = js.Function2[/* err */ Error, /* data */ Anon_Code, Unit]
}
