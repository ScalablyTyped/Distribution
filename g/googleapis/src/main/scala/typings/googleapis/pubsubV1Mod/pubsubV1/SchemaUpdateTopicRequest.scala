package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateTopicRequest extends StObject {
  
  /**
    * Required. The updated topic object.
    */
  var topic: js.UndefOr[SchemaTopic] = js.undefined
  
  /**
    * Required. Indicates which fields in the provided topic to update. Must be specified and non-empty. Note that if `update_mask` contains "message_storage_policy" but the `message_storage_policy` is not set in the `topic` provided above, then the updated value is determined by the policy configured at the project or organization level.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateTopicRequest {
  
  inline def apply(): SchemaUpdateTopicRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTopicRequest]
  }
  
  extension [Self <: SchemaUpdateTopicRequest](x: Self) {
    
    inline def setTopic(value: SchemaTopic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
