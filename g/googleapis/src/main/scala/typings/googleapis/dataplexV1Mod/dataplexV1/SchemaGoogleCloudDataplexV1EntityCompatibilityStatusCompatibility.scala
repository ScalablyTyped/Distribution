package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1EntityCompatibilityStatusCompatibility extends StObject {
  
  /**
    * Output only. Whether the entity is compatible and can be represented in the metadata store.
    */
  var compatible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Provides additional detail if the entity is incompatible with the metadata store.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1EntityCompatibilityStatusCompatibility {
  
  inline def apply(): SchemaGoogleCloudDataplexV1EntityCompatibilityStatusCompatibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1EntityCompatibilityStatusCompatibility]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1EntityCompatibilityStatusCompatibility](x: Self) {
    
    inline def setCompatible(value: Boolean): Self = StObject.set(x, "compatible", value.asInstanceOf[js.Any])
    
    inline def setCompatibleNull: Self = StObject.set(x, "compatible", null)
    
    inline def setCompatibleUndefined: Self = StObject.set(x, "compatible", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
