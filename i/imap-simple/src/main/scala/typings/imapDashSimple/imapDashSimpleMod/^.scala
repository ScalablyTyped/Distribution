package typings.imapDashSimple.imapDashSimpleMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imap-simple", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(options: ImapSimpleOptions): js.Promise[ImapSimple] = js.native
  def connect(
    options: ImapSimpleOptions,
    callback: js.Function2[/* err */ Error, /* connection */ ImapSimple, Unit]
  ): Unit = js.native
  def getParts(struct: js.Array[_]): js.Array[_] = js.native
}

