package typings.gulpIstanbul.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coverage extends js.Object {
  
  var branches: CoverageStats = js.native
  
  var functions: CoverageStats = js.native
  
  var lines: CoverageStats = js.native
  
  var statements: CoverageStats = js.native
}
object Coverage {
  
  @scala.inline
  def apply(branches: CoverageStats, functions: CoverageStats, lines: CoverageStats, statements: CoverageStats): Coverage = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coverage]
  }
  
  @scala.inline
  implicit class CoverageOps[Self <: Coverage] (val x: Self) extends AnyVal {
    
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
    def setBranches(value: CoverageStats): Self = this.set("branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctions(value: CoverageStats): Self = this.set("functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: CoverageStats): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatements(value: CoverageStats): Self = this.set("statements", value.asInstanceOf[js.Any])
  }
}
