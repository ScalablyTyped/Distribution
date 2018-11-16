package typings
package imapLib.imapMod.ConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImapMessage
  extends nodeLib.NodeJSNs.EventEmitter {
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_attributes(
    event: imapLib.imapLibStrings.attributes,
    listener: js.Function1[/* attrs */ ImapMessageAttributes, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_body(
    event: imapLib.imapLibStrings.body,
    listener: js.Function2[
      /* stream */ nodeLib.NodeJSNs.ReadableStream, 
      /* info */ ImapMessageBodyInfo, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: imapLib.imapLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
}

