package typings.inboxsdk.mod.Toolbars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarsInstance extends js.Object {
  def addToolbarButtonForApp(appToolbarButtonDescriptor: AppToolbarButtonDescriptor): AppToolbarButtonView = js.native
  def registerThreadButton(toolbarButtonDescriptor: ToolbarButtonDescriptor): js.Function0[Unit] = js.native
  /**
    * @deprecated. use registerThreadButton
    * @param toolbarButtonDescriptor
    */
  def registerToolbarButtonForList(toolbarButtonDescriptor: LegacyToolbarButtonDescriptor): js.Function0[Unit] = js.native
  /**
    * @deprecated. use registerThreadButton
    * @param toolbarButtonDescriptor
    */
  def registerToolbarButtonForThreadView(toolbarButtonDescriptor: LegacyToolbarButtonDescriptor): js.Function0[Unit] = js.native
}

object ToolbarsInstance {
  @scala.inline
  def apply(
    addToolbarButtonForApp: AppToolbarButtonDescriptor => AppToolbarButtonView,
    registerThreadButton: ToolbarButtonDescriptor => js.Function0[Unit],
    registerToolbarButtonForList: LegacyToolbarButtonDescriptor => js.Function0[Unit],
    registerToolbarButtonForThreadView: LegacyToolbarButtonDescriptor => js.Function0[Unit]
  ): ToolbarsInstance = {
    val __obj = js.Dynamic.literal(addToolbarButtonForApp = js.Any.fromFunction1(addToolbarButtonForApp), registerThreadButton = js.Any.fromFunction1(registerThreadButton), registerToolbarButtonForList = js.Any.fromFunction1(registerToolbarButtonForList), registerToolbarButtonForThreadView = js.Any.fromFunction1(registerToolbarButtonForThreadView))
    __obj.asInstanceOf[ToolbarsInstance]
  }
  @scala.inline
  implicit class ToolbarsInstanceOps[Self <: ToolbarsInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddToolbarButtonForApp(value: AppToolbarButtonDescriptor => AppToolbarButtonView): Self = this.set("addToolbarButtonForApp", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterThreadButton(value: ToolbarButtonDescriptor => js.Function0[Unit]): Self = this.set("registerThreadButton", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterToolbarButtonForList(value: LegacyToolbarButtonDescriptor => js.Function0[Unit]): Self = this.set("registerToolbarButtonForList", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterToolbarButtonForThreadView(value: LegacyToolbarButtonDescriptor => js.Function0[Unit]): Self = this.set("registerToolbarButtonForThreadView", js.Any.fromFunction1(value))
  }
  
}

