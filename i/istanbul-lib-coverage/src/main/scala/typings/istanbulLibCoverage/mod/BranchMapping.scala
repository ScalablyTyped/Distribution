package typings.istanbulLibCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BranchMapping extends js.Object {
  
  var line: Double = js.native
  
  var loc: Range = js.native
  
  var locations: js.Array[Range] = js.native
  
  var `type`: String = js.native
}
object BranchMapping {
  
  @scala.inline
  def apply(line: Double, loc: Range, locations: js.Array[Range], `type`: String): BranchMapping = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchMapping]
  }
  
  @scala.inline
  implicit class BranchMappingOps[Self <: BranchMapping] (val x: Self) extends AnyVal {
    
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
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Range): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: Range*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[Range]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
