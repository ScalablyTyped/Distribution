package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteMessageId extends StObject {
  
  /** Opaque, server-assigned ID of the Message. While this ID is guaranteed to be unique within the Space, it's not guaranteed to be globally unique. */
  var messageId: js.UndefOr[String] = js.undefined
  
  /** ID of the Message's immediate parent. */
  var parentId: js.UndefOr[AppsDynamiteMessageParentId] = js.undefined
}
object AppsDynamiteMessageId {
  
  inline def apply(): AppsDynamiteMessageId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteMessageId]
  }
  
  extension [Self <: AppsDynamiteMessageId](x: Self) {
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setParentId(value: AppsDynamiteMessageParentId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
  }
}
