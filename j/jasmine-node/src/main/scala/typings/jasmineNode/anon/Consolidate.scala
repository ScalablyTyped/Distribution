package typings.jasmineNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consolidate extends js.Object {
  
  var consolidate: Boolean = js.native
  
  var report: Boolean = js.native
  
  var savePath: String = js.native
  
  var useDotNotation: Boolean = js.native
}
object Consolidate {
  
  @scala.inline
  def apply(consolidate: Boolean, report: Boolean, savePath: String, useDotNotation: Boolean): Consolidate = {
    val __obj = js.Dynamic.literal(consolidate = consolidate.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], savePath = savePath.asInstanceOf[js.Any], useDotNotation = useDotNotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consolidate]
  }
  
  @scala.inline
  implicit class ConsolidateOps[Self <: Consolidate] (val x: Self) extends AnyVal {
    
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
    def setConsolidate(value: Boolean): Self = this.set("consolidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReport(value: Boolean): Self = this.set("report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavePath(value: String): Self = this.set("savePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDotNotation(value: Boolean): Self = this.set("useDotNotation", value.asInstanceOf[js.Any])
  }
}
