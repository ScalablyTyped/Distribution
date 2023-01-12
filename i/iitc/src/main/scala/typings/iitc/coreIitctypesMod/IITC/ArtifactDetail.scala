package typings.iitc.coreIitctypesMod.IITC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactDetail extends StObject {
  
  var displayName: String
  
  var fragments: js.Array[Any]
  
  var `type`: String
}
object ArtifactDetail {
  
  inline def apply(displayName: String, fragments: js.Array[Any], `type`: String): ArtifactDetail = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactDetail] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFragments(value: js.Array[Any]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    inline def setFragmentsVarargs(value: Any*): Self = StObject.set(x, "fragments", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
