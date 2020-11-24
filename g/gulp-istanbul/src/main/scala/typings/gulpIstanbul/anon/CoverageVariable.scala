package typings.gulpIstanbul.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageVariable extends js.Object {
  
  var coverageVariable: js.UndefOr[String] = js.native
}
object CoverageVariable {
  
  @scala.inline
  def apply(): CoverageVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageVariable]
  }
  
  @scala.inline
  implicit class CoverageVariableOps[Self <: CoverageVariable] (val x: Self) extends AnyVal {
    
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
  }
}
