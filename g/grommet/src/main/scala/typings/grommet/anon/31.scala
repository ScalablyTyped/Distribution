package typings.grommet.anon

import typings.grommet.componentsBoxMod.BoxExtendedProps
import typings.grommet.componentsTextMod.TextExtendedProps
import typings.grommet.utilsMod.PropsOf
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  var container: js.UndefOr[PropsOf[FC[BoxExtendedProps]]] = js.undefined
  
  var text: js.UndefOr[PropsOf[FC[TextExtendedProps]]] = js.undefined
}
object `31` {
  
  inline def apply(): `31` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`31`]
  }
  
  extension [Self <: `31`](x: Self) {
    
    inline def setContainer(value: PropsOf[FC[BoxExtendedProps]]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setText(value: PropsOf[FC[TextExtendedProps]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
