package typings
package imapLib.imapMod.ConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImapFetch
  extends nodeLib.NodeJSNs.EventEmitter {
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_error(event: imapLib.imapLibStrings.error, listener: js.Function1[/* error */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_message(
    event: imapLib.imapLibStrings.message,
    listener: js.Function2[/* message */ ImapMessage, /* seqno */ scala.Double, scala.Unit]
  ): this.type = js.native
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_error(event: imapLib.imapLibStrings.error, listener: js.Function1[/* error */ stdLib.Error, scala.Unit]): this.type = js.native
}

