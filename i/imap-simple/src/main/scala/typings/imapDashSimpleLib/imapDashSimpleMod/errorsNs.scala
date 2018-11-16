package typings
package imapDashSimpleLib.imapDashSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imap-simple", "errors")
@js.native
object errorsNs extends js.Object {
  @js.native
  class ConnectionTimeoutError protected ()
    extends nodeLib.Error {
    def this(timeout: scala.Double) = this()
    var timeout: scala.Double = js.native
  }
  
}

