package typings.jqueryValidation

import typings.jqueryValidation.JQueryValidation.ValidatorStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  /**
    * Replaces {n} placeholders with arguments.
    *
    * @param template The string to format.
    */
  def format(template: String, arguments: String*): String = js.native
  
  var validator: ValidatorStatic = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(format: (String, /* repeated */ String) => String, validator: ValidatorStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: (String, /* repeated */ String) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidator(value: ValidatorStatic): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
  }
}
