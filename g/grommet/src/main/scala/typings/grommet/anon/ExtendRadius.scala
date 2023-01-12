package typings.grommet.anon

import typings.grommet.themesBaseMod.ExtendProps
import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.themesBaseMod.ExtendValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendRadius extends StObject {
  
  var extend: js.UndefOr[ExtendType[Record[String, Any]]] = js.undefined
  
  var radius: js.UndefOr[String] = js.undefined
  
  var thickness: js.UndefOr[String] = js.undefined
}
object ExtendRadius {
  
  inline def apply(): ExtendRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendRadius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendRadius] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: ExtendType[Record[String, Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, Any]] => ExtendValue[Record[String, Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setThickness(value: String): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
