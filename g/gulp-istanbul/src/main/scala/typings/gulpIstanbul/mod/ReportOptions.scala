package typings.gulpIstanbul.mod

import typings.gulpIstanbul.anon.Dir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportOptions extends js.Object {
  
  var coverageVariable: js.UndefOr[String] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var reportOpts: js.UndefOr[Dir] = js.native
  
  var reporters: js.UndefOr[js.Array[String]] = js.native
}
object ReportOptions {
  
  @scala.inline
  def apply(): ReportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportOptions]
  }
  
  @scala.inline
  implicit class ReportOptionsOps[Self <: ReportOptions] (val x: Self) extends AnyVal {
    
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setReportOpts(value: Dir): Self = this.set("reportOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportOpts: Self = this.set("reportOpts", js.undefined)
    
    @scala.inline
    def setReportersVarargs(value: String*): Self = this.set("reporters", js.Array(value :_*))
    
    @scala.inline
    def setReporters(value: js.Array[String]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporters: Self = this.set("reporters", js.undefined)
  }
}
