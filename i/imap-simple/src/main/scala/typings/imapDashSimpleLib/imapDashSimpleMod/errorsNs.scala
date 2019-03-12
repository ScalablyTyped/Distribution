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
    extends stdLib.Error {
    def this(timeout: scala.Double) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    var timeout: scala.Double = js.native
  }
  
}

