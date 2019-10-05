package typings.inboxsdk.inboxsdkMod.Router

import typings.inboxsdk.inboxsdkStrings.collapsed
import typings.inboxsdk.inboxsdkStrings.expanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsibleSectionView extends SectionView {
  @JSName("on")
  def on_collapsed(name: collapsed, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_expanded(name: expanded, cb: js.Function0[Unit]): Unit = js.native
  def setCollapsed(value: Boolean): Unit = js.native
}

