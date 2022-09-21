package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatusDetails extends StObject {
  
  /**
    * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes. +optional
    */
  var causes: js.UndefOr[js.Array[SchemaStatusCause]] = js.undefined
  
  /**
    * The group attribute of the resource associated with the status StatusReason. +optional
    */
  var group: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds +optional
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described). +optional
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action. +optional
    */
  var retryAfterSeconds: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * UID of the resource. (when there is a single resource which can be described). More info: https://kubernetes.io/docs/user-guide/identifiers#uids +optional
    */
  var uid: js.UndefOr[String | Null] = js.undefined
}
object SchemaStatusDetails {
  
  inline def apply(): SchemaStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusDetails]
  }
  
  extension [Self <: SchemaStatusDetails](x: Self) {
    
    inline def setCauses(value: js.Array[SchemaStatusCause]): Self = StObject.set(x, "causes", value.asInstanceOf[js.Any])
    
    inline def setCausesUndefined: Self = StObject.set(x, "causes", js.undefined)
    
    inline def setCausesVarargs(value: SchemaStatusCause*): Self = StObject.set(x, "causes", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRetryAfterSeconds(value: Double): Self = StObject.set(x, "retryAfterSeconds", value.asInstanceOf[js.Any])
    
    inline def setRetryAfterSecondsNull: Self = StObject.set(x, "retryAfterSeconds", null)
    
    inline def setRetryAfterSecondsUndefined: Self = StObject.set(x, "retryAfterSeconds", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
