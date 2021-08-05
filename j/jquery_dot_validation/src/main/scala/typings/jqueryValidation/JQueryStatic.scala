package typings.jqueryValidation

import typings.jqueryValidation.JQueryValidation.ValidatorStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  /**
    * Replaces {n} placeholders with arguments.
    *
    * @param template The string to format.
    */
  def format(template: String, arguments: String*): String
  
  var validator: ValidatorStatic
}
object JQueryStatic {
  
  inline def apply(format: (String, /* repeated */ String) => String, validator: ValidatorStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setFormat(value: (String, /* repeated */ String) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    inline def setValidator(value: ValidatorStatic): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
  }
}
