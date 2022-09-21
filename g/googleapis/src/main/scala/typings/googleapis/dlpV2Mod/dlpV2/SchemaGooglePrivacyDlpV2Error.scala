package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Error extends StObject {
  
  /**
    * Detailed error codes and messages.
    */
  var details: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * The times the error occurred.
    */
  var timestamps: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2Error {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Error]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Error](x: Self) {
    
    inline def setDetails(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setTimestamps(value: js.Array[String]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsNull: Self = StObject.set(x, "timestamps", null)
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: String*): Self = StObject.set(x, "timestamps", js.Array(value*))
  }
}
