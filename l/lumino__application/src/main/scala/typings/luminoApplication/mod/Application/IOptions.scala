package typings.luminoApplication.mod.Application

import typings.luminoWidgets.menuMod.Menu.IRenderer
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for creating an application.
  */
@js.native
trait IOptions[T /* <: Widget */] extends js.Object {
  
  /**
    * A custom renderer for the context menu.
    */
  var contextMenuRenderer: js.UndefOr[IRenderer] = js.native
  
  /**
    * The shell widget to use for the application.
    *
    * This should be a newly created and initialized widget.
    *
    * The application will attach the widget to the DOM.
    */
  var shell: T = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T /* <: Widget */](shell: T): IOptions[T] = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], T /* <: Widget */] (val x: Self with IOptions[T]) extends AnyVal {
    
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
    def setShell(value: T): Self = this.set("shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuRenderer(value: IRenderer): Self = this.set("contextMenuRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuRenderer: Self = this.set("contextMenuRenderer", js.undefined)
  }
}
