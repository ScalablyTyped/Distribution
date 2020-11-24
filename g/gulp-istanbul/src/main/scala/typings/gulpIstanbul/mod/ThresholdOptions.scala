package typings.gulpIstanbul.mod

import typings.gulpIstanbul.anon.Each
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThresholdOptions extends js.Object {
  
  var coverageVariable: js.UndefOr[String] = js.native
  
  var thresholds: js.UndefOr[Each] = js.native
}
object ThresholdOptions {
  
  @scala.inline
  def apply(): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdOptions]
  }
  
  @scala.inline
  implicit class ThresholdOptionsOps[Self <: ThresholdOptions] (val x: Self) extends AnyVal {
    
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
    def setCoverageVariable(value: String): Self = this.set("coverageVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageVariable: Self = this.set("coverageVariable", js.undefined)
    
    @scala.inline
    def setThresholds(value: Each): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
  }
}
