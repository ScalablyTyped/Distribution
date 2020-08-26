package typings.imapSimple.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imap-simple", "errors")
@js.native
object errors extends js.Object {
  @js.native
  class ConnectionTimeoutError protected () extends Error {
    def this(timeout: Double) = this()
    var timeout: Double = js.native
  }
  
}

