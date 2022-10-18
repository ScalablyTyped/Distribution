package typings.grommet.anon

import typings.grommet.componentsAnchorMod.AnchorExtendedProps
import typings.grommet.themesBaseMod.ExtendProps
import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.themesBaseMod.ExtendValue
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.PropsOf
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeight extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var extend: js.UndefOr[ExtendType[PropsOf[FC[AnchorExtendedProps]]]] = js.undefined
  
  var fontWeight: js.UndefOr[Double] = js.undefined
  
  var gap: js.UndefOr[GapType] = js.undefined
  
  var hover: js.UndefOr[TextDecoration] = js.undefined
  
  var textDecoration: js.UndefOr[String] = js.undefined
}
object FontWeight {
  
  inline def apply(): FontWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeight]
  }
  
  extension [Self <: FontWeight](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setExtend(value: ExtendType[PropsOf[FC[AnchorExtendedProps]]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(
      value: /* props */ ExtendProps[PropsOf[FC[AnchorExtendedProps]]] => ExtendValue[PropsOf[FC[AnchorExtendedProps]]]
    ): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setHover(value: TextDecoration): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
