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
    addToolbarButtonForApp: AppToolbarButtonDescriptor => AppToolbarButtonView,
    registerThreadButton: ToolbarButtonDescriptor => js.Function0[scala.Unit],
    registerToolbarButtonForList: ToolbarButtonDescriptor => js.Function0[scala.Unit],
    registerToolbarButtonForThreadView: ToolbarButtonDescriptor => js.Function0[scala.Unit]
  ): ToolbarsInstance = {
    val __obj = js.Dynamic.literal(addToolbarButtonForApp = js.Any.fromFunction1(addToolbarButtonForApp), registerThreadButton = js.Any.fromFunction1(registerThreadButton), registerToolbarButtonForList = js.Any.fromFunction1(registerToolbarButtonForList), registerToolbarButtonForThreadView = js.Any.fromFunction1(registerToolbarButtonForThreadView))
  
    __obj.asInstanceOf[ToolbarsInstance]
  }
}

