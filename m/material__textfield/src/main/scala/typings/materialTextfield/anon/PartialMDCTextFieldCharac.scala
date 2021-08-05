package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/character-counter/adapter.MDCTextFieldCharacterCounterAdapter> */
trait PartialMDCTextFieldCharac extends StObject {
  
  var setContent: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
}
object PartialMDCTextFieldCharac {
  
  inline def apply(): PartialMDCTextFieldCharac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldCharac]
  }
  
  extension [Self <: PartialMDCTextFieldCharac](x: Self) {
    
    inline def setSetContent(value: /* content */ String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    
    inline def setSetContentUndefined: Self = StObject.set(x, "setContent", js.undefined)
  }
}
