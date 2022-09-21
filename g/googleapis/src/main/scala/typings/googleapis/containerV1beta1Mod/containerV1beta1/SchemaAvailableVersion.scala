package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAvailableVersion extends StObject {
  
  /**
    * Reason for availability.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kubernetes version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaAvailableVersion {
  
  inline def apply(): SchemaAvailableVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAvailableVersion]
  }
  
  extension [Self <: SchemaAvailableVersion](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
