package typings.grommet.anon

import typings.grommet.componentsTextMod.TextProps
import typings.grommet.themesBaseMod.ButtonType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.PadType
import typings.grommet.utilsMod.RoundType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderName extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var border: js.UndefOr[BorderType] = js.undefined
  
  var name: js.UndefOr[TextProps] = js.undefined
  
  var pad: js.UndefOr[PadType] = js.undefined
  
  var remove: js.UndefOr[ButtonType] = js.undefined
  
  var round: js.UndefOr[RoundType] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Xsmall] = js.undefined
  
  var value: js.UndefOr[TextProps] = js.undefined
}
object BorderName {
  
  inline def apply(): BorderName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderName]
  }
  
  extension [Self <: BorderName](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBorderVarargs(value: ColorError*): Self = StObject.set(x, "border", js.Array(value*))
    
    inline def setName(value: TextProps): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setRemove(value: ButtonType): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRound(value: RoundType): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setSize(value: Xsmall): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: TextProps): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
