package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppBarProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var iconClassNameLeft: js.UndefOr[String] = js.native
  
  var iconClassNameRight: js.UndefOr[String] = js.native
  
  var iconElementLeft: js.UndefOr[ReactElement] = js.native
  
  var iconElementRight: js.UndefOr[ReactElement] = js.native
  
  var iconStyleLeft: js.UndefOr[CSSProperties] = js.native
  
  var iconStyleRight: js.UndefOr[CSSProperties] = js.native
  
  var onLeftIconButtonClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  var onRightIconButtonClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  var onTitleClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  var showMenuIconButton: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[ReactNode] = js.native
  
  var titleStyle: js.UndefOr[CSSProperties] = js.native
  
  var zDepth: js.UndefOr[Double] = js.native
}
object AppBarProps {
  
  @scala.inline
  def apply(): AppBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarProps]
  }
  
  @scala.inline
  implicit class AppBarPropsOps[Self <: AppBarProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setIconClassNameLeft(value: String): Self = this.set("iconClassNameLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClassNameLeft: Self = this.set("iconClassNameLeft", js.undefined)
    
    @scala.inline
    def setIconClassNameRight(value: String): Self = this.set("iconClassNameRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClassNameRight: Self = this.set("iconClassNameRight", js.undefined)
    
    @scala.inline
    def setIconElementLeft(value: ReactElement): Self = this.set("iconElementLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconElementLeft: Self = this.set("iconElementLeft", js.undefined)
    
    @scala.inline
    def setIconElementRight(value: ReactElement): Self = this.set("iconElementRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconElementRight: Self = this.set("iconElementRight", js.undefined)
    
    @scala.inline
    def setIconStyleLeft(value: CSSProperties): Self = this.set("iconStyleLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconStyleLeft: Self = this.set("iconStyleLeft", js.undefined)
    
    @scala.inline
    def setIconStyleRight(value: CSSProperties): Self = this.set("iconStyleRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconStyleRight: Self = this.set("iconStyleRight", js.undefined)
    
    @scala.inline
    def setOnLeftIconButtonClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onLeftIconButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLeftIconButtonClick: Self = this.set("onLeftIconButtonClick", js.undefined)
    
    @scala.inline
    def setOnRightIconButtonClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onRightIconButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRightIconButtonClick: Self = this.set("onRightIconButtonClick", js.undefined)
    
    @scala.inline
    def setOnTitleClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onTitleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTitleClick: Self = this.set("onTitleClick", js.undefined)
    
    @scala.inline
    def setShowMenuIconButton(value: Boolean): Self = this.set("showMenuIconButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMenuIconButton: Self = this.set("showMenuIconButton", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: CSSProperties): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setZDepth(value: Double): Self = this.set("zDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZDepth: Self = this.set("zDepth", js.undefined)
  }
}
