package typings.joiPasswordComplexity.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplexityOptions extends js.Object {
  
  var lowerCase: Double = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var numeric: Double = js.native
  
  var requirementCount: Double = js.native
  
  var symbol: Double = js.native
  
  var upperCase: Double = js.native
}
object ComplexityOptions {
  
  @scala.inline
  def apply(
    lowerCase: Double,
    max: Double,
    min: Double,
    numeric: Double,
    requirementCount: Double,
    symbol: Double,
    upperCase: Double
  ): ComplexityOptions = {
    val __obj = js.Dynamic.literal(lowerCase = lowerCase.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], requirementCount = requirementCount.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], upperCase = upperCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexityOptions]
  }
  
  @scala.inline
  implicit class ComplexityOptionsOps[Self <: ComplexityOptions] (val x: Self) extends AnyVal {
    
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
    def setLowerCase(value: Double): Self = this.set("lowerCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeric(value: Double): Self = this.set("numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementCount(value: Double): Self = this.set("requirementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Double): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperCase(value: Double): Self = this.set("upperCase", value.asInstanceOf[js.Any])
  }
}
