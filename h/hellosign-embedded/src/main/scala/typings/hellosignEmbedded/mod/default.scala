package typings.hellosignEmbedded.mod

import typings.hellosignEmbedded.mod.HelloSign.ClassNames
import typings.hellosignEmbedded.mod.HelloSign.Events
import typings.hellosignEmbedded.mod.HelloSign.Locales
import typings.hellosignEmbedded.mod.HelloSign.Messages
import typings.hellosignEmbedded.mod.HelloSign.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hellosign-embedded", JSImport.Default)
@js.native
class default ()
  extends typings.hellosignEmbedded.mod.HelloSign.HelloSign {
  def this(opts: Options) = this()
}
object default {
  
  @JSImport("hellosign-embedded", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("hellosign-embedded", "default.classNames")
  @js.native
  def classNames: ClassNames = js.native
  @scala.inline
  def classNames_=(x: ClassNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "default.events")
  @js.native
  def events: Events = js.native
  @scala.inline
  def events_=(x: Events): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "default.locales")
  @js.native
  def locales: Locales = js.native
  @scala.inline
  def locales_=(x: Locales): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locales")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "default.messages")
  @js.native
  def messages: Messages = js.native
  @scala.inline
  def messages_=(x: Messages): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "default.version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
