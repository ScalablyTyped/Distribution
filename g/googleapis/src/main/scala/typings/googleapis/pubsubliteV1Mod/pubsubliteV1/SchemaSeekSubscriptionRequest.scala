package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeekSubscriptionRequest extends StObject {
  
  /**
    * Seek to a named position with respect to the message backlog.
    */
  var namedTarget: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Seek to the first message whose publish or event time is greater than or equal to the specified query time. If no such message can be located, will seek to the end of the message backlog.
    */
  var timeTarget: js.UndefOr[SchemaTimeTarget] = js.undefined
}
object SchemaSeekSubscriptionRequest {
  
  inline def apply(): SchemaSeekSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeekSubscriptionRequest]
  }
  
  extension [Self <: SchemaSeekSubscriptionRequest](x: Self) {
    
    inline def setNamedTarget(value: String): Self = StObject.set(x, "namedTarget", value.asInstanceOf[js.Any])
    
    inline def setNamedTargetNull: Self = StObject.set(x, "namedTarget", null)
    
    inline def setNamedTargetUndefined: Self = StObject.set(x, "namedTarget", js.undefined)
    
    inline def setTimeTarget(value: SchemaTimeTarget): Self = StObject.set(x, "timeTarget", value.asInstanceOf[js.Any])
    
    inline def setTimeTargetUndefined: Self = StObject.set(x, "timeTarget", js.undefined)
  }
}
