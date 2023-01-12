package typings.materializeCss.M

import typings.materializeCss.anon.PartialDropdownOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormSelectOptions extends StObject {
  
  /**
    * Classes to be added to the select wrapper element
    * @default ''
    */
  var classes: String
  
  /**
    * Pass options object to select dropdown initialization
    * @default {}
    */
  var dropdownOptions: PartialDropdownOptions
}
object FormSelectOptions {
  
  inline def apply(classes: String, dropdownOptions: PartialDropdownOptions): FormSelectOptions = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormSelectOptions] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setDropdownOptions(value: PartialDropdownOptions): Self = StObject.set(x, "dropdownOptions", value.asInstanceOf[js.Any])
  }
}
