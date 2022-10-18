package typings.grommet.anon

import typings.grommet.themesBaseMod.ExtendProps
import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.themesBaseMod.ExtendValue
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.PadType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderExtend extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var border: js.UndefOr[BorderType] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, Any]]] = js.undefined
  
  var pad: js.UndefOr[PadType] = js.undefined
}
object BorderExtend {
  
  inline def apply(): BorderExtend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderExtend]
  }
  
  extension [Self <: BorderExtend](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBorderVarargs(value: ColorError*): Self = StObject.set(x, "border", js.Array(value*))
    
    inline def setExtend(value: ExtendType[Record[String, Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, Any]] => ExtendValue[Record[String, Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
