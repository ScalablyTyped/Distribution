package typings.jsforce.apiMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMetadataInfo extends StObject {
  
  var currentName: String
  
  var metadata: MetadataInfo
}
object UpdateMetadataInfo {
  
  inline def apply(currentName: String, metadata: MetadataInfo): UpdateMetadataInfo = {
    val __obj = js.Dynamic.literal(currentName = currentName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMetadataInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMetadataInfo] (val x: Self) extends AnyVal {
    
    inline def setCurrentName(value: String): Self = StObject.set(x, "currentName", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: MetadataInfo): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
