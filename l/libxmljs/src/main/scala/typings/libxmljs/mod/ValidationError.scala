package typings.libxmljs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationError extends Error {
  
  var code: Double | Null = js.native
  
  /**
    * 1-based column number, 0 if not applicable/available.
    */
  var column: Double = js.native
  
  var domain: Double | Null = js.native
  
  var level: Double | Null = js.native
  
  var line: Double | Null = js.native
}
object ValidationError {
  
  @scala.inline
  def apply(column: Double, message: String, name: String): ValidationError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = this.set("code", null)
    
    @scala.inline
    def setDomain(value: Double): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNull: Self = this.set("domain", null)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelNull: Self = this.set("level", null)
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNull: Self = this.set("line", null)
  }
}
