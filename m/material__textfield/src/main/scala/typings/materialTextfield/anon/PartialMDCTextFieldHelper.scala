package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/helper-text/adapter.MDCTextFieldHelperTextAdapter> */
trait PartialMDCTextFieldHelper extends StObject {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  
  var getAttr: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.undefined
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
  
  var removeAttr: js.UndefOr[js.Function1[/* attr */ String, Unit]] = js.undefined
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  
  var setAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.undefined
  
  var setContent: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
}
object PartialMDCTextFieldHelper {
  
  @scala.inline
  def apply(): PartialMDCTextFieldHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldHelper]
  }
  
  @scala.inline
  implicit class PartialMDCTextFieldHelperMutableBuilder[Self <: PartialMDCTextFieldHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
    
    @scala.inline
    def setGetAttr(value: /* attr */ String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttrUndefined: Self = StObject.set(x, "getAttr", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
    
    @scala.inline
    def setRemoveAttr(value: /* attr */ String => Unit): Self = StObject.set(x, "removeAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAttrUndefined: Self = StObject.set(x, "removeAttr", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
    
    @scala.inline
    def setSetAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAttrUndefined: Self = StObject.set(x, "setAttr", js.undefined)
    
    @scala.inline
    def setSetContent(value: /* content */ String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContentUndefined: Self = StObject.set(x, "setContent", js.undefined)
  }
}
