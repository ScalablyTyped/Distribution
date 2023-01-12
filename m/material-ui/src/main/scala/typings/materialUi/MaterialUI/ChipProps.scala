package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChipProps extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var containerElement: js.UndefOr[ReactNode | String] = js.undefined
  
  var deleteIconStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var labelColor: js.UndefOr[String] = js.undefined
  
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[Chip]] = js.undefined
  
  var onRequestDelete: js.UndefOr[TouchEventHandler[Chip]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object ChipProps {
  
  inline def apply(): ChipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChipProps] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContainerElement(value: ReactNode | String): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
    
    inline def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
    
    inline def setDeleteIconStyle(value: CSSProperties): Self = StObject.set(x, "deleteIconStyle", value.asInstanceOf[js.Any])
    
    inline def setDeleteIconStyleUndefined: Self = StObject.set(x, "deleteIconStyle", js.undefined)
    
    inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setOnClick(value: MouseEvent[Chip, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnRequestDelete(value: TouchEvent[Chip] => Unit): Self = StObject.set(x, "onRequestDelete", js.Any.fromFunction1(value))
    
    inline def setOnRequestDeleteUndefined: Self = StObject.set(x, "onRequestDelete", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
