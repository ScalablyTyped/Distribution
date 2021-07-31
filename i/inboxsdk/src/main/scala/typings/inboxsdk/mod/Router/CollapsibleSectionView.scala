package typings.inboxsdk.mod.Router

import typings.inboxsdk.inboxsdkStrings.collapsed_
import typings.inboxsdk.inboxsdkStrings.expanded_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsibleSectionView
  extends StObject
     with SectionView {
  
  @JSName("on")
  def on_collapsed(name: collapsed_, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_expanded(name: expanded_, cb: js.Function0[Unit]): Unit = js.native
  
  def setCollapsed(value: Boolean): Unit = js.native
}
