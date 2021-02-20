package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/character-counter/adapter.MDCTextFieldCharacterCounterAdapter> */
@js.native
trait PartialMDCTextFieldCharac extends StObject {
  
  var setContent: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
}
object PartialMDCTextFieldCharac {
  
  @scala.inline
  def apply(): PartialMDCTextFieldCharac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldCharac]
  }
  
  @scala.inline
  implicit class PartialMDCTextFieldCharacMutableBuilder[Self <: PartialMDCTextFieldCharac] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetContent(value: /* content */ String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContentUndefined: Self = StObject.set(x, "setContent", js.undefined)
  }
}
