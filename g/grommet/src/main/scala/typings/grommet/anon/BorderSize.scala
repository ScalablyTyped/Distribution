package typings.grommet.anon

import typings.grommet.utilsMod.BreakpointBorderSize
import typings.grommet.utilsMod.BreakpointEdgeSize
import typings.grommet.utilsMod.BreakpointSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderSize extends StObject {
  
  var borderSize: js.UndefOr[BreakpointBorderSize] = js.undefined
  
  var edgeSize: js.UndefOr[BreakpointEdgeSize] = js.undefined
  
  var size: js.UndefOr[BreakpointSize] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object BorderSize {
  
  @scala.inline
  def apply(): BorderSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderSize]
  }
  
  @scala.inline
  implicit class BorderSizeMutableBuilder[Self <: BorderSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderSize(value: BreakpointBorderSize): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderSizeUndefined: Self = StObject.set(x, "borderSize", js.undefined)
    
    @scala.inline
    def setEdgeSize(value: BreakpointEdgeSize): Self = StObject.set(x, "edgeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeSizeUndefined: Self = StObject.set(x, "edgeSize", js.undefined)
    
    @scala.inline
    def setSize(value: BreakpointSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
