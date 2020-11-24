package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about vulnerable request parameters.
  */
@js.native
trait SchemaVulnerableParameters extends js.Object {
  
  /**
    * The vulnerable parameter names.
    */
  var parameterNames: js.UndefOr[js.Array[String]] = js.native
}
object SchemaVulnerableParameters {
  
  @scala.inline
  def apply(): SchemaVulnerableParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVulnerableParameters]
  }
  
  @scala.inline
  implicit class SchemaVulnerableParametersOps[Self <: SchemaVulnerableParameters] (val x: Self) extends AnyVal {
    
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
    def setParameterNamesVarargs(value: String*): Self = this.set("parameterNames", js.Array(value :_*))
    
    @scala.inline
    def setParameterNames(value: js.Array[String]): Self = this.set("parameterNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterNames: Self = this.set("parameterNames", js.undefined)
  }
}
