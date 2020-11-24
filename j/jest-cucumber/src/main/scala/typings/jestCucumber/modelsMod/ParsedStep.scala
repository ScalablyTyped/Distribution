package typings.jestCucumber.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedStep extends js.Object {
  
  var keyword: String = js.native
  
  var lineNumber: Double = js.native
  
  var stepArgument: String | js.Object = js.native
  
  var stepText: String = js.native
}
object ParsedStep {
  
  @scala.inline
  def apply(keyword: String, lineNumber: Double, stepArgument: String | js.Object, stepText: String): ParsedStep = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], stepArgument = stepArgument.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedStep]
  }
  
  @scala.inline
  implicit class ParsedStepOps[Self <: ParsedStep] (val x: Self) extends AnyVal {
    
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
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepArgument(value: String | js.Object): Self = this.set("stepArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepText(value: String): Self = this.set("stepText", value.asInstanceOf[js.Any])
  }
}
