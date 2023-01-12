package typings.grommet.anon

import typings.grommet.componentsAnchorMod.AnchorExtendedProps
import typings.grommet.themesBaseMod.ExtendProps
import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.themesBaseMod.ExtendValue
import typings.grommet.utilsMod.PropsOf
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoration extends StObject {
  
  var extend: js.UndefOr[ExtendType[PropsOf[FC[AnchorExtendedProps]]]] = js.undefined
  
  var textDecoration: js.UndefOr[String] = js.undefined
}
object TextDecoration {
  
  inline def apply(): TextDecoration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecoration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDecoration] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: ExtendType[PropsOf[FC[AnchorExtendedProps]]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(
      value: /* props */ ExtendProps[PropsOf[FC[AnchorExtendedProps]]] => ExtendValue[PropsOf[FC[AnchorExtendedProps]]]
    ): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
