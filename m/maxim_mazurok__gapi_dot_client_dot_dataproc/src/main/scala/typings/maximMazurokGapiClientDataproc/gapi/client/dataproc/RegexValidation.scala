package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexValidation extends js.Object {
  
  /** Required. RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient). */
  var regexes: js.UndefOr[js.Array[String]] = js.native
}
object RegexValidation {
  
  @scala.inline
  def apply(): RegexValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexValidation]
  }
  
  @scala.inline
  implicit class RegexValidationOps[Self <: RegexValidation] (val x: Self) extends AnyVal {
    
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
    def setRegexesVarargs(value: String*): Self = this.set("regexes", js.Array(value :_*))
    
    @scala.inline
    def setRegexes(value: js.Array[String]): Self = this.set("regexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexes: Self = this.set("regexes", js.undefined)
  }
}
