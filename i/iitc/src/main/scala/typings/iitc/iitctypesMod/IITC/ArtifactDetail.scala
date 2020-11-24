package typings.iitc.iitctypesMod.IITC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactDetail extends js.Object {
  
  var displayName: String = js.native
  
  var fragments: js.Array[_] = js.native
  
  var `type`: String = js.native
}
object ArtifactDetail {
  
  @scala.inline
  def apply(displayName: String, fragments: js.Array[_], `type`: String): ArtifactDetail = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDetail]
  }
  
  @scala.inline
  implicit class ArtifactDetailOps[Self <: ArtifactDetail] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentsVarargs(value: js.Any*): Self = this.set("fragments", js.Array(value :_*))
    
    @scala.inline
    def setFragments(value: js.Array[_]): Self = this.set("fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
