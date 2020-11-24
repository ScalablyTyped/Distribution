package typings.imap.mod

import typings.imap.imapStrings.error
import typings.imap.imapStrings.message
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImapFetch extends EventEmitter {
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* message */ ImapMessage, /* seqno */ Double, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
}
