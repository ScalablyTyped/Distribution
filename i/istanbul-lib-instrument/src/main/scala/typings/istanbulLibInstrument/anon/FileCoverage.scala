package typings.istanbulLibInstrument.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileCoverage extends js.Object {
  
  var fileCoverage: typings.istanbulLibCoverage.mod.FileCoverage = js.native
  
  var sourceMappingURL: String = js.native
}
object FileCoverage {
  
  @scala.inline
  def apply(fileCoverage: typings.istanbulLibCoverage.mod.FileCoverage, sourceMappingURL: String): FileCoverage = {
    val __obj = js.Dynamic.literal(fileCoverage = fileCoverage.asInstanceOf[js.Any], sourceMappingURL = sourceMappingURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCoverage]
  }
  
  @scala.inline
  implicit class FileCoverageOps[Self <: FileCoverage] (val x: Self) extends AnyVal {
    
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
    def setFileCoverage(value: typings.istanbulLibCoverage.mod.FileCoverage): Self = this.set("fileCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMappingURL(value: String): Self = this.set("sourceMappingURL", value.asInstanceOf[js.Any])
  }
}
