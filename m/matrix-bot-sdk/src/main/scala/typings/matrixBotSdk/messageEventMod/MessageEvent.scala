package typings.matrixBotSdk.messageEventMod

import typings.matrixBotSdk.roomEventMod.RoomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk/lib/models/events/MessageEvent", "MessageEvent")
@js.native
open class MessageEvent[T /* <: MessageEventContent */] protected () extends RoomEvent[T] {
  def this(event: Any) = this()
  
  /**
    * The `external_url` of the message, if it exists
    */
  def externalUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the event is redacted (or looked redacted).
    */
  def isRedacted: Boolean = js.native
  
  /**
    * The message's type.
    */
  def messageType: MessageType = js.native
  
  /**
    * The `body` of the message.
    */
  def textBody: String = js.native
}
