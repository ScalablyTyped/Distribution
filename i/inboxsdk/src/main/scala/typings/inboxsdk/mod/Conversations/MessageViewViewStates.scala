package typings.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.inboxsdkStrings.HIDDEN
  - typings.inboxsdk.inboxsdkStrings.COLLAPSED
  - typings.inboxsdk.inboxsdkStrings.EXPANDED
*/
trait MessageViewViewStates extends js.Object

object MessageViewViewStates {
  @scala.inline
  def COLLAPSED: typings.inboxsdk.inboxsdkStrings.COLLAPSED = this.cast("COLLAPSED")
  @scala.inline
  def EXPANDED: typings.inboxsdk.inboxsdkStrings.EXPANDED = this.cast("EXPANDED")
  @scala.inline
  def HIDDEN: typings.inboxsdk.inboxsdkStrings.HIDDEN = this.cast("HIDDEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

