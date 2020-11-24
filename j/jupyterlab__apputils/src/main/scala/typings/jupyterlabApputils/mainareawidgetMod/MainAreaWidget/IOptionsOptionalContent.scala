package typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget

import typings.jupyterlabApputils.toolbarMod.Toolbar
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for main area widget subclasses providing their own
  * default content.
  *
  * #### Notes
  * This makes it easier to have a subclass that provides its own default
  * content. This can go away once we upgrade to TypeScript 2.8 and have an
  * easy way to make a single property optional, ala
  * https://stackoverflow.com/a/46941824
  */
@js.native
trait IOptionsOptionalContent[T /* <: Widget */]
  extends typings.luminoWidgets.widgetMod.Widget.IOptions {
  
  /**
    * The child widget to wrap.
    */
  var content: js.UndefOr[T] = js.native
  
  /**
    * An optional promise for when the content is ready to be revealed.
    */
  var reveal: js.UndefOr[js.Promise[_]] = js.native
  
  /**
    * The toolbar to use for the widget.  Defaults to an empty toolbar.
    */
  var toolbar: js.UndefOr[Toolbar[Widget]] = js.native
}
object IOptionsOptionalContent {
  
  @scala.inline
  def apply[T /* <: Widget */](): IOptionsOptionalContent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptionsOptionalContent[T]]
  }
  
  @scala.inline
  implicit class IOptionsOptionalContentOps[Self <: IOptionsOptionalContent[_], T /* <: Widget */] (val x: Self with IOptionsOptionalContent[T]) extends AnyVal {
    
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
    def deleteContent: Self = this.set("content", js.undefined)
    
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
