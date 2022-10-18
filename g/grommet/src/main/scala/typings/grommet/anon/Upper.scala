package typings.grommet.anon

import typings.grommet.themesBaseMod.ExtendProps
import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.themesBaseMod.ExtendValue
import typings.grommet.utilsMod.OpacityType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Upper extends StObject {
  
  var color: js.UndefOr[Any] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, Any]]] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  var lower: js.UndefOr[`5`] = js.undefined
  
  var opacity: js.UndefOr[OpacityType] = js.undefined
  
  var upper: js.UndefOr[`5`] = js.undefined
}
object Upper {
  
  inline def apply(): Upper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Upper]
  }
  
  extension [Self <: Upper](x: Self) {
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setExtend(value: ExtendType[Record[String, Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, Any]] => ExtendValue[Record[String, Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLower(value: `5`): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    inline def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
    
    inline def setOpacity(value: OpacityType): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setUpper(value: `5`): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    inline def setUpperUndefined: Self = StObject.set(x, "upper", js.undefined)
  }
}
