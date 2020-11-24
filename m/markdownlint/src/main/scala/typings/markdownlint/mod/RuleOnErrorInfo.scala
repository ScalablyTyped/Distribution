package typings.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fix information for RuleOnError callback.
  */
@js.native
trait RuleOnErrorInfo extends js.Object {
  
  /**
    * Context for the error.
    */
  var context: js.UndefOr[String] = js.native
  
  /**
    * Details about the error.
    */
  var details: js.UndefOr[String] = js.native
  
  /**
    * Fix information.
    */
  var fixInfo: js.UndefOr[RuleOnErrorFixInfo] = js.native
  
  /**
    * Line number (1-based).
    */
  var lineNumber: Double = js.native
  
  /**
    * Column number (1-based) and length.
    */
  var range: js.UndefOr[js.Array[Double]] = js.native
}
object RuleOnErrorInfo {
  
  @scala.inline
  def apply(lineNumber: Double): RuleOnErrorInfo = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOnErrorInfo]
  }
  
  @scala.inline
  implicit class RuleOnErrorInfoOps[Self <: RuleOnErrorInfo] (val x: Self) extends AnyVal {
    
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
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setFixInfo(value: RuleOnErrorFixInfo): Self = this.set("fixInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixInfo: Self = this.set("fixInfo", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[Double]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
