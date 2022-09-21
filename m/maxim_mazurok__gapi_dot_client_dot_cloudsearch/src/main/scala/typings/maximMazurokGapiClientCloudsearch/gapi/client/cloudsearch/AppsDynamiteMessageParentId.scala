package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteMessageParentId extends StObject {
  
  /** ID of the Topic this Message is posted to. NEXT TAG : 5 */
  var topicId: js.UndefOr[AppsDynamiteTopicId] = js.undefined
}
object AppsDynamiteMessageParentId {
  
  inline def apply(): AppsDynamiteMessageParentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteMessageParentId]
  }
  
  extension [Self <: AppsDynamiteMessageParentId](x: Self) {
    
    inline def setTopicId(value: AppsDynamiteTopicId): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
  }
}
