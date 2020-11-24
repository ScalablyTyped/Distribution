package typings.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lint error.
  */
@js.native
trait LintError extends js.Object {
  
  /**
    * Context for the error.
    */
  var errorContext: String = js.native
  
  /**
    * Detail about the error.
    */
  var errorDetail: String = js.native
  
  /**
    * Column number (1-based) and length.
    */
  var errorRange: js.Array[Double] = js.native
  
  /**
    * Fix information.
    */
  var fixInfo: FixInfo = js.native
  
  /**
    * Line number (1-based).
    */
  var lineNumber: Double = js.native
  
  /**
    * Rule description.
    */
  var ruleDescription: String = js.native
  
  /**
    * Link to more information.
    */
  var ruleInformation: String = js.native
  
  /**
    * Rule name(s).
    */
  var ruleNames: js.Array[String] = js.native
}
object LintError {
  
  @scala.inline
  def apply(
    errorContext: String,
    errorDetail: String,
    errorRange: js.Array[Double],
    fixInfo: FixInfo,
    lineNumber: Double,
    ruleDescription: String,
    ruleInformation: String,
    ruleNames: js.Array[String]
  ): LintError = {
    val __obj = js.Dynamic.literal(errorContext = errorContext.asInstanceOf[js.Any], errorDetail = errorDetail.asInstanceOf[js.Any], errorRange = errorRange.asInstanceOf[js.Any], fixInfo = fixInfo.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], ruleDescription = ruleDescription.asInstanceOf[js.Any], ruleInformation = ruleInformation.asInstanceOf[js.Any], ruleNames = ruleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintError]
  }
  
  @scala.inline
  implicit class LintErrorOps[Self <: LintError] (val x: Self) extends AnyVal {
    
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
    def setErrorContext(value: String): Self = this.set("errorContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetail(value: String): Self = this.set("errorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorRangeVarargs(value: Double*): Self = this.set("errorRange", js.Array(value :_*))
    
    @scala.inline
    def setErrorRange(value: js.Array[Double]): Self = this.set("errorRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixInfo(value: FixInfo): Self = this.set("fixInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleDescription(value: String): Self = this.set("ruleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleInformation(value: String): Self = this.set("ruleInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNamesVarargs(value: String*): Self = this.set("ruleNames", js.Array(value :_*))
    
    @scala.inline
    def setRuleNames(value: js.Array[String]): Self = this.set("ruleNames", value.asInstanceOf[js.Any])
  }
}
