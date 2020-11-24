package typings.jestReporters.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummaryOptions extends js.Object {
  
  var currentTestCases: js.UndefOr[js.Array[typings.jestReporters.anon.Test]] = js.native
  
  var estimatedTime: js.UndefOr[Double] = js.native
  
  var roundTime: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SummaryOptions {
  
  @scala.inline
  def apply(): SummaryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryOptions]
  }
  
  @scala.inline
  implicit class SummaryOptionsOps[Self <: SummaryOptions] (val x: Self) extends AnyVal {
    
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
    def setCurrentTestCasesVarargs(value: typings.jestReporters.anon.Test*): Self = this.set("currentTestCases", js.Array(value :_*))
    
    @scala.inline
    def setCurrentTestCases(value: js.Array[typings.jestReporters.anon.Test]): Self = this.set("currentTestCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTestCases: Self = this.set("currentTestCases", js.undefined)
    
    @scala.inline
    def setEstimatedTime(value: Double): Self = this.set("estimatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedTime: Self = this.set("estimatedTime", js.undefined)
    
    @scala.inline
    def setRoundTime(value: Boolean): Self = this.set("roundTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundTime: Self = this.set("roundTime", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
