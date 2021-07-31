package typings.grommet.anon

import typings.grommet.listMod.PadSizeType
import typings.grommet.listMod._PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left
  extends StObject
     with _PadType {
  
  var bottom: js.UndefOr[PadSizeType] = js.undefined
  
  var horizontal: js.UndefOr[PadSizeType] = js.undefined
  
  var left: js.UndefOr[PadSizeType] = js.undefined
  
  var right: js.UndefOr[PadSizeType] = js.undefined
  
  var top: js.UndefOr[PadSizeType] = js.undefined
  
  var vertical: js.UndefOr[PadSizeType] = js.undefined
}
object Left {
  
  @scala.inline
  def apply(): Left = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Left]
  }
  
  @scala.inline
  implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: PadSizeType): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setHorizontal(value: PadSizeType): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setLeft(value: PadSizeType): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: PadSizeType): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: PadSizeType): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setVertical(value: PadSizeType): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
