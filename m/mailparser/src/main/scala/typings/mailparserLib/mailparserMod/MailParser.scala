package typings
package mailparserLib.mailparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mailparser", "MailParser")
@js.native
class MailParser ()
  extends nodeLib.streamMod.Transform {
  def this(options: nodeLib.streamMod.internalNs.TransformOptions) = this()
  @JSName("on")
  def on_data(
    event: mailparserLib.mailparserLibStrings.data,
    callback: js.Function1[/* data */ AttachmentStream | MessageText, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_headers(
    event: mailparserLib.mailparserLibStrings.headers,
    callback: js.Function1[/* headers */ Headers, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_readable(
    event: mailparserLib.mailparserLibStrings.readable,
    callback: js.Function1[/* data */ AttachmentStream | MessageText, scala.Unit]
  ): this.type = js.native
}

