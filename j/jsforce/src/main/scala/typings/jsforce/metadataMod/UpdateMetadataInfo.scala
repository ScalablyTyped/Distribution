package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMetadataInfo extends StObject {
  
  var currentName: String = js.native
  
  var metadata: MetadataInfo = js.native
}
object UpdateMetadataInfo {
  
  @scala.inline
  def apply(currentName: String, metadata: MetadataInfo): UpdateMetadataInfo = {
    val __obj = js.Dynamic.literal(currentName = currentName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMetadataInfo]
  }
  
  @scala.inline
  implicit class UpdateMetadataInfoMutableBuilder[Self <: UpdateMetadataInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentName(value: String): Self = StObject.set(x, "currentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: MetadataInfo): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
