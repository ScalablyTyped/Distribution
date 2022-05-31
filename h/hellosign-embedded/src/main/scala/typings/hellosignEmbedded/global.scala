package typings.hellosignEmbedded

import typings.hellosignEmbedded.mod.HelloSign.ClassNames
import typings.hellosignEmbedded.mod.HelloSign.Events
import typings.hellosignEmbedded.mod.HelloSign.Locales
import typings.hellosignEmbedded.mod.HelloSign.Messages
import typings.hellosignEmbedded.mod.HelloSign.Options
import typings.hellosignEmbedded.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("HelloSign")
  @js.native
  class HelloSign () extends default {
    def this(opts: Options) = this()
  }
  object HelloSign {
    
    @JSGlobal("HelloSign")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("HelloSign.classNames")
    @js.native
    def classNames: ClassNames = js.native
    inline def classNames_=(x: ClassNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("HelloSign.events")
    @js.native
    def events: Events = js.native
    inline def events_=(x: Events): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("HelloSign.locales")
    @js.native
    def locales: Locales = js.native
    inline def locales_=(x: Locales): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locales")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("HelloSign.messages")
    @js.native
    def messages: Messages = js.native
    inline def messages_=(x: Messages): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("HelloSign.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
