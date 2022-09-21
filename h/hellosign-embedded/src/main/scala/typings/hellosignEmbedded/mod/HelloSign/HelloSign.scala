package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.cancel
import typings.hellosignEmbedded.hellosignEmbeddedStrings.close
import typings.hellosignEmbedded.hellosignEmbeddedStrings.createTemplate
import typings.hellosignEmbedded.hellosignEmbeddedStrings.decline
import typings.hellosignEmbedded.hellosignEmbeddedStrings.error
import typings.hellosignEmbedded.hellosignEmbeddedStrings.finish
import typings.hellosignEmbedded.hellosignEmbeddedStrings.message
import typings.hellosignEmbedded.hellosignEmbeddedStrings.open
import typings.hellosignEmbedded.hellosignEmbeddedStrings.ready
import typings.hellosignEmbedded.hellosignEmbeddedStrings.reassign
import typings.hellosignEmbedded.hellosignEmbeddedStrings.send
import typings.hellosignEmbedded.hellosignEmbeddedStrings.sign
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hellosign-embedded", "HelloSign.HelloSign")
@js.native
open class HelloSign () extends StObject {
  def this(opts: Options) = this()
  
  def close(): Unit = js.native
  
  val element: HTMLElement = js.native
  
  val isOpen: Boolean = js.native
  
  val isReady: Boolean = js.native
  
  def off(
    name: close | cancel | createTemplate | decline | error | finish | message | open | ready | reassign | send | sign
  ): Unit = js.native
  def off(
    name: close | cancel | createTemplate | decline | error | finish | message | open | ready | reassign | send | sign,
    cb: CB
  ): Unit = js.native
  
  def on(name: close | cancel | finish, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_createTemplate(name: createTemplate, cb: js.Function1[/* data */ CreateTemplateEventPyload, Unit]): Unit = js.native
  @JSName("on")
  def on_decline(name: decline, cb: js.Function1[/* data */ DeclineEventPyload, Unit]): Unit = js.native
  @JSName("on")
  def on_error(name: error, cb: js.Function1[/* data */ ErrorEventPyload, Unit]): Unit = js.native
  @JSName("on")
  def on_message(name: message, cb: js.Function1[/* data */ MessageEventPayload, Unit]): Unit = js.native
  @JSName("on")
  def on_open(name: open, cb: js.Function1[/* data */ OpenEventPayload, Unit]): Unit = js.native
  @JSName("on")
  def on_ready(name: ready, cb: js.Function1[/* data */ ReadyEventPayload, Unit]): Unit = js.native
  @JSName("on")
  def on_reassign(name: reassign, cb: js.Function1[/* data */ ReassignEventPayload, Unit]): Unit = js.native
  @JSName("on")
  def on_send(name: send, cb: js.Function1[/* data */ SendEventPayload, Unit]): Unit = js.native
  @JSName("on")
  def on_sign(name: sign, cb: js.Function1[/* data */ SignEventPayload, Unit]): Unit = js.native
  
  def once(name: close | cancel | finish, cb: js.Function0[Unit]): Unit = js.native
  @JSName("once")
  def once_createTemplate(name: createTemplate, cb: js.Function1[/* data */ CreateTemplateEventPyload, Unit]): Unit = js.native
  @JSName("once")
  def once_decline(name: decline, cb: js.Function1[/* data */ DeclineEventPyload, Unit]): Unit = js.native
  @JSName("once")
  def once_error(name: error, cb: js.Function1[/* data */ ErrorEventPyload, Unit]): Unit = js.native
  @JSName("once")
  def once_message(name: message, cb: js.Function1[/* data */ MessageEventPayload, Unit]): Unit = js.native
  @JSName("once")
  def once_open(name: open, cb: js.Function1[/* data */ OpenEventPayload, Unit]): Unit = js.native
  @JSName("once")
  def once_ready(name: ready, cb: js.Function1[/* data */ ReadyEventPayload, Unit]): Unit = js.native
  @JSName("once")
  def once_reassign(name: reassign, cb: js.Function1[/* data */ ReassignEventPayload, Unit]): Unit = js.native
  @JSName("once")
  def once_send(name: send, cb: js.Function1[/* data */ SendEventPayload, Unit]): Unit = js.native
  @JSName("once")
  def once_sign(name: sign, cb: js.Function1[/* data */ SignEventPayload, Unit]): Unit = js.native
  
  def open(url: String): Unit = js.native
  def open(url: String, opts: Options): Unit = js.native
}
object HelloSign {
  
  @JSImport("hellosign-embedded", "HelloSign.HelloSign")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("hellosign-embedded", "HelloSign.HelloSign.classNames")
  @js.native
  def classNames: ClassNames = js.native
  inline def classNames_=(x: ClassNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "HelloSign.HelloSign.events")
  @js.native
  def events: Events = js.native
  inline def events_=(x: Events): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "HelloSign.HelloSign.locales")
  @js.native
  def locales: Locales = js.native
  inline def locales_=(x: Locales): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locales")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "HelloSign.HelloSign.messages")
  @js.native
  def messages: Messages = js.native
  inline def messages_=(x: Messages): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "HelloSign.HelloSign.version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
