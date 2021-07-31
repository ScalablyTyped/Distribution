package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gap extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var border: js.UndefOr[BorderType] = js.undefined
  
  var font: js.UndefOr[SizeWeight] = js.undefined
  
  var gap: js.UndefOr[GapType] = js.undefined
  
  var hover: js.UndefOr[`5`] = js.undefined
  
  var pad: js.UndefOr[PadType] = js.undefined
}
object Gap {
  
  @scala.inline
  def apply(): Gap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gap]
  }
  
  @scala.inline
  implicit class GapMutableBuilder[Self <: Gap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setBorderVarargs(value: Error*): Self = StObject.set(x, "border", js.Array(value :_*))
    
    @scala.inline
    def setFont(value: SizeWeight): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setHover(value: `5`): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
