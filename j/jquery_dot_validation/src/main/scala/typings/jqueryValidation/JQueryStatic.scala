package typings.jqueryValidation

import typings.jqueryValidation.JQueryValidation.ValidatorStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
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
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: (String, /* repeated */ String) => String): Self = this.set("format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidator(value: ValidatorStatic): Self = this.set("validator", value.asInstanceOf[js.Any])
  }
}
