package typings.istanbulLibInstrument.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialCoverage extends js.Object {
  
  var coverageData: js.Any = js.native
  
  var gcv: js.Any = js.native
  
  var hash: String = js.native
  
  var path: String = js.native
}
object InitialCoverage {
  
  @scala.inline
  def apply(coverageData: js.Any, gcv: js.Any, hash: String, path: String): InitialCoverage = {
    val __obj = js.Dynamic.literal(coverageData = coverageData.asInstanceOf[js.Any], gcv = gcv.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialCoverage]
  }
  
  @scala.inline
  implicit class InitialCoverageOps[Self <: InitialCoverage] (val x: Self) extends AnyVal {
    
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
    def setCoverageData(value: js.Any): Self = this.set("coverageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcv(value: js.Any): Self = this.set("gcv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
