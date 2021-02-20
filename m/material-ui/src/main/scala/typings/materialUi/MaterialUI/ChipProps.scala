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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChipProps extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var containerElement: js.UndefOr[ReactNode | String] = js.native
  
  var deleteIconStyle: js.UndefOr[CSSProperties] = js.native
  
  var labelColor: js.UndefOr[String] = js.native
  
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[Chip]] = js.native
  
  var onRequestDelete: js.UndefOr[TouchEventHandler[Chip]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object ChipProps {
  
  @scala.inline
  def apply(): ChipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipProps]
  }
  
  @scala.inline
  implicit class ChipPropsMutableBuilder[Self <: ChipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContainerElement(value: ReactNode | String): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
    
    @scala.inline
    def setDeleteIconStyle(value: CSSProperties): Self = StObject.set(x, "deleteIconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteIconStyleUndefined: Self = StObject.set(x, "deleteIconStyle", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[Chip, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnRequestDelete(value: TouchEvent[Chip] => Unit): Self = StObject.set(x, "onRequestDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRequestDeleteUndefined: Self = StObject.set(x, "onRequestDelete", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
