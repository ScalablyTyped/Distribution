package typings.lockfileLintApi.mod

import typings.lockfileLintApi.lockfileLintApiStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationSuccess extends ValidationResult {
  
  var `object`: Packages = js.native
  
  var `type`: success = js.native
}
object ValidationSuccess {
  
  @scala.inline
  def apply(`object`: Packages, `type`: success): ValidationSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationSuccess]
  }
  
  @scala.inline
  implicit class ValidationSuccessOps[Self <: ValidationSuccess] (val x: Self) extends AnyVal {
    
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
    def setObject(value: Packages): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: success): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
