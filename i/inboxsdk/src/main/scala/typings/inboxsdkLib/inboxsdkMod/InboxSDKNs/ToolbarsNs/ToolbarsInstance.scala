package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ToolbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarsInstance extends js.Object {
  def addToolbarButtonForApp(appToolbarButtonDescriptor: AppToolbarButtonDescriptor): AppToolbarButtonView
  def registerThreadButton(toolbarButtonDescriptor: ToolbarButtonDescriptor): js.Function0[scala.Unit]
  /**
    * @deprecated. use registerThreadButton
    * @param toolbarButtonDescriptor
    */
  def registerToolbarButtonForList(toolbarButtonDescriptor: ToolbarButtonDescriptor): js.Function0[scala.Unit]
  /**
    * @deprecated. use registerThreadButton
    * @param toolbarButtonDescriptor
    */
  def registerToolbarButtonForThreadView(toolbarButtonDescriptor: ToolbarButtonDescriptor): js.Function0[scala.Unit]
}

object ToolbarsInstance {
  @scala.inline
  def apply(
    addToolbarButtonForApp: js.Function1[AppToolbarButtonDescriptor, AppToolbarButtonView],
    registerThreadButton: js.Function1[ToolbarButtonDescriptor, js.Function0[scala.Unit]],
    registerToolbarButtonForList: js.Function1[ToolbarButtonDescriptor, js.Function0[scala.Unit]],
    registerToolbarButtonForThreadView: js.Function1[ToolbarButtonDescriptor, js.Function0[scala.Unit]]
  ): ToolbarsInstance = {
    val __obj = js.Dynamic.literal(addToolbarButtonForApp = addToolbarButtonForApp, registerThreadButton = registerThreadButton, registerToolbarButtonForList = registerToolbarButtonForList, registerToolbarButtonForThreadView = registerToolbarButtonForThreadView)
  
    __obj.asInstanceOf[ToolbarsInstance]
  }
}

