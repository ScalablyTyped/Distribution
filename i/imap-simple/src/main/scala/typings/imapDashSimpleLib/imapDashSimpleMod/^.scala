package typings
package imapDashSimpleLib.imapDashSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imap-simple", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(options: imapDashSimpleLib.imapDashSimpleMod.ImapSimpleOptions): js.Promise[imapDashSimpleLib.imapDashSimpleMod.ImapSimple] = js.native
  def connect(
    options: imapDashSimpleLib.imapDashSimpleMod.ImapSimpleOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* connection */ imapDashSimpleLib.imapDashSimpleMod.ImapSimple, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getParts(struct: js.Array[_]): js.Array[_] = js.native
}

