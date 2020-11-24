package typings.istanbulLibReport.anon

import typings.istanbulLibReport.mod.Watermark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.Watermarks> */
@js.native
trait PartialWatermarks extends js.Object {
  
  var branches: js.UndefOr[Watermark] = js.native
  
  var functions: js.UndefOr[Watermark] = js.native
  
  var lines: js.UndefOr[Watermark] = js.native
  
  var statements: js.UndefOr[Watermark] = js.native
}
object PartialWatermarks {
  
  @scala.inline
  def apply(): PartialWatermarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWatermarks]
  }
  
  @scala.inline
  implicit class PartialWatermarksOps[Self <: PartialWatermarks] (val x: Self) extends AnyVal {
    
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
    def setBranches(value: Watermark): Self = this.set("branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranches: Self = this.set("branches", js.undefined)
    
    @scala.inline
    def setFunctions(value: Watermark): Self = this.set("functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    
    @scala.inline
    def setLines(value: Watermark): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    
    @scala.inline
    def setStatements(value: Watermark): Self = this.set("statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatements: Self = this.set("statements", js.undefined)
  }
}
