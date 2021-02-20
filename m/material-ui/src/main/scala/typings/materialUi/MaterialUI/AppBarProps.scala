package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppBarProps extends StObject {
  
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
  implicit class AppBarPropsMutableBuilder[Self <: AppBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setIconClassNameLeft(value: String): Self = StObject.set(x, "iconClassNameLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassNameLeftUndefined: Self = StObject.set(x, "iconClassNameLeft", js.undefined)
    
    @scala.inline
    def setIconClassNameRight(value: String): Self = StObject.set(x, "iconClassNameRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassNameRightUndefined: Self = StObject.set(x, "iconClassNameRight", js.undefined)
    
    @scala.inline
    def setIconElementLeft(value: ReactElement): Self = StObject.set(x, "iconElementLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconElementLeftUndefined: Self = StObject.set(x, "iconElementLeft", js.undefined)
    
    @scala.inline
    def setIconElementRight(value: ReactElement): Self = StObject.set(x, "iconElementRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconElementRightUndefined: Self = StObject.set(x, "iconElementRight", js.undefined)
    
    @scala.inline
    def setIconStyleLeft(value: CSSProperties): Self = StObject.set(x, "iconStyleLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleLeftUndefined: Self = StObject.set(x, "iconStyleLeft", js.undefined)
    
    @scala.inline
    def setIconStyleRight(value: CSSProperties): Self = StObject.set(x, "iconStyleRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleRightUndefined: Self = StObject.set(x, "iconStyleRight", js.undefined)
    
    @scala.inline
    def setOnLeftIconButtonClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onLeftIconButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLeftIconButtonClickUndefined: Self = StObject.set(x, "onLeftIconButtonClick", js.undefined)
    
    @scala.inline
    def setOnRightIconButtonClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onRightIconButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRightIconButtonClickUndefined: Self = StObject.set(x, "onRightIconButtonClick", js.undefined)
    
    @scala.inline
    def setOnTitleClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
    
    @scala.inline
    def setShowMenuIconButton(value: Boolean): Self = StObject.set(x, "showMenuIconButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMenuIconButtonUndefined: Self = StObject.set(x, "showMenuIconButton", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
  }
}
