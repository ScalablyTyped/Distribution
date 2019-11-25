package typings.inboxsdk.inboxsdkMod.Router

import typings.inboxsdk.inboxsdkStrings.collapsed_
import typings.inboxsdk.inboxsdkStrings.expanded_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsibleSectionView extends SectionView {
  @JSName("on")
  def on_collapsed(name: collapsed_, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_expanded(name: expanded_, cb: js.Function0[Unit]): Unit = js.native
  def setCollapsed(value: Boolean): Unit = js.native
}

