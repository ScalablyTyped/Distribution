package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ProfileStatus extends StObject {
  
  /**
    * Profiling status code and optional message
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * Time when the profile generation status was updated
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2ProfileStatus {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ProfileStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ProfileStatus]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ProfileStatus](x: Self) {
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
