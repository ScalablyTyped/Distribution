package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppBarProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var iconClassNameLeft: js.UndefOr[String] = js.undefined
  
  var iconClassNameRight: js.UndefOr[String] = js.undefined
  
  var iconElementLeft: js.UndefOr[ReactElement] = js.undefined
  
  var iconElementRight: js.UndefOr[ReactElement] = js.undefined
  
  var iconStyleLeft: js.UndefOr[CSSProperties] = js.undefined
  
  var iconStyleRight: js.UndefOr[CSSProperties] = js.undefined
  
  var onLeftIconButtonClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var onRightIconButtonClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var onTitleClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var showMenuIconButton: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
  
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var zDepth: js.UndefOr[Double] = js.undefined
}
object AppBarProps {
  
  inline def apply(): AppBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppBarProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setIconClassNameLeft(value: String): Self = StObject.set(x, "iconClassNameLeft", value.asInstanceOf[js.Any])
    
    inline def setIconClassNameLeftUndefined: Self = StObject.set(x, "iconClassNameLeft", js.undefined)
    
    inline def setIconClassNameRight(value: String): Self = StObject.set(x, "iconClassNameRight", value.asInstanceOf[js.Any])
    
    inline def setIconClassNameRightUndefined: Self = StObject.set(x, "iconClassNameRight", js.undefined)
    
    inline def setIconElementLeft(value: ReactElement): Self = StObject.set(x, "iconElementLeft", value.asInstanceOf[js.Any])
    
    inline def setIconElementLeftUndefined: Self = StObject.set(x, "iconElementLeft", js.undefined)
    
    inline def setIconElementRight(value: ReactElement): Self = StObject.set(x, "iconElementRight", value.asInstanceOf[js.Any])
    
    inline def setIconElementRightUndefined: Self = StObject.set(x, "iconElementRight", js.undefined)
    
    inline def setIconStyleLeft(value: CSSProperties): Self = StObject.set(x, "iconStyleLeft", value.asInstanceOf[js.Any])
    
    inline def setIconStyleLeftUndefined: Self = StObject.set(x, "iconStyleLeft", js.undefined)
    
    inline def setIconStyleRight(value: CSSProperties): Self = StObject.set(x, "iconStyleRight", value.asInstanceOf[js.Any])
    
    inline def setIconStyleRightUndefined: Self = StObject.set(x, "iconStyleRight", js.undefined)
    
    inline def setOnLeftIconButtonClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onLeftIconButtonClick", js.Any.fromFunction1(value))
    
    inline def setOnLeftIconButtonClickUndefined: Self = StObject.set(x, "onLeftIconButtonClick", js.undefined)
    
    inline def setOnRightIconButtonClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onRightIconButtonClick", js.Any.fromFunction1(value))
    
    inline def setOnRightIconButtonClickUndefined: Self = StObject.set(x, "onRightIconButtonClick", js.undefined)
    
    inline def setOnTitleClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1(value))
    
    inline def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
    
    inline def setShowMenuIconButton(value: Boolean): Self = StObject.set(x, "showMenuIconButton", value.asInstanceOf[js.Any])
    
    inline def setShowMenuIconButtonUndefined: Self = StObject.set(x, "showMenuIconButton", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
    
    inline def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
  }
}
