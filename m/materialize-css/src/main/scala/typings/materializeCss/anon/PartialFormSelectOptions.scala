package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.FormSelectOptions> */
trait PartialFormSelectOptions extends StObject {
  
  var classes: js.UndefOr[String] = js.undefined
  
  var dropdownOptions: js.UndefOr[PartialDropdownOptions] = js.undefined
}
object PartialFormSelectOptions {
  
  inline def apply(): PartialFormSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormSelectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFormSelectOptions] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDropdownOptions(value: PartialDropdownOptions): Self = StObject.set(x, "dropdownOptions", value.asInstanceOf[js.Any])
    
    inline def setDropdownOptionsUndefined: Self = StObject.set(x, "dropdownOptions", js.undefined)
  }
}
