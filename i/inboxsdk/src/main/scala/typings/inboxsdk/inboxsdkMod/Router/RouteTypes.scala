package typings.inboxsdk.inboxsdkMod.Router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.inboxsdkStrings.LIST
  - typings.inboxsdk.inboxsdkStrings.THREAD
  - typings.inboxsdk.inboxsdkStrings.SETTINGS
  - typings.inboxsdk.inboxsdkStrings.CHAT
  - typings.inboxsdk.inboxsdkStrings.CUSTOM
  - typings.inboxsdk.inboxsdkStrings.UNKNOWN
*/
trait RouteTypes extends js.Object

object RouteTypes {
  @scala.inline
  def CHAT: typings.inboxsdk.inboxsdkStrings.CHAT = this.cast("CHAT")
  @scala.inline
  def CUSTOM: typings.inboxsdk.inboxsdkStrings.CUSTOM = this.cast("CUSTOM")
  @scala.inline
  def LIST: typings.inboxsdk.inboxsdkStrings.LIST = this.cast("LIST")
  @scala.inline
  def SETTINGS: typings.inboxsdk.inboxsdkStrings.SETTINGS = this.cast("SETTINGS")
  @scala.inline
  def THREAD: typings.inboxsdk.inboxsdkStrings.THREAD = this.cast("THREAD")
  @scala.inline
  def UNKNOWN: typings.inboxsdk.inboxsdkStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

