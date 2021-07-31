package typings.iitc.iitctypesMod.IITC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactDetail extends StObject {
  
  var displayName: String
  
  var fragments: js.Array[js.Any]
  
  var `type`: String
}
object ArtifactDetail {
  
  @scala.inline
  def apply(displayName: String, fragments: js.Array[js.Any], `type`: String): ArtifactDetail = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDetail]
  }
  
  @scala.inline
  implicit class ArtifactDetailMutableBuilder[Self <: ArtifactDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragments(value: js.Array[js.Any]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentsVarargs(value: js.Any*): Self = StObject.set(x, "fragments", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
