package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgValidatorField
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets the target element (input or control target) to be validated. This field setting is required.
    *
    *
    * Valid values:
    * "string" A valid jQuery selector for the element
    * "object" A reference to a jQuery object
    */
  var selector: js.UndefOr[String | js.Object] = js.undefined
}
object IgValidatorField {
  
  inline def apply(): IgValidatorField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgValidatorField]
  }
  
  extension [Self <: IgValidatorField](x: Self) {
    
    inline def setSelector(value: String | js.Object): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
