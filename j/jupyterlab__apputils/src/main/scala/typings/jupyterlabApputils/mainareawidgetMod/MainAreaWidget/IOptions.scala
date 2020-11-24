package typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget

import typings.jupyterlabApputils.toolbarMod.Toolbar
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for creating a main area widget.
  */
@js.native
trait IOptions[T /* <: Widget */]
  extends typings.luminoWidgets.widgetMod.Widget.IOptions {
  
  /**
    * The child widget to wrap.
    */
  var content: T = js.native
  
  /**
    * An optional promise for when the content is ready to be revealed.
    */
  var reveal: js.UndefOr[js.Promise[_]] = js.native
  
  /**
    * The toolbar to use for the widget.  Defaults to an empty toolbar.
    */
  var toolbar: js.UndefOr[Toolbar[Widget]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T /* <: Widget */](content: T): IOptions[T] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
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
    def setContent(value: T): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReveal(value: js.Promise[_]): Self = this.set("reveal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReveal: Self = this.set("reveal", js.undefined)
    
    @scala.inline
    def setToolbar(value: Toolbar[Widget]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
}
