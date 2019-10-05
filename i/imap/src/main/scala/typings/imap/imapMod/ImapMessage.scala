package typings.imap.imapMod

import typings.imap.imapStrings.attributes
import typings.imap.imapStrings.body
import typings.imap.imapStrings.end
import typings.node.NodeJS.EventEmitter
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImapMessage extends EventEmitter {
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_attributes(event: attributes, listener: js.Function1[/* attrs */ ImapMessageAttributes, Unit]): this.type = js.native
  @JSName("on")
  def on_body(
    event: body,
    listener: js.Function2[/* stream */ ReadableStream, /* info */ ImapMessageBodyInfo, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
}

