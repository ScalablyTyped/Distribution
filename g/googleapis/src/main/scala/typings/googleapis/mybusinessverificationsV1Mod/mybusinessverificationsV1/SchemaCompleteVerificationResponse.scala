package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompleteVerificationResponse extends StObject {
  
  /**
    * The completed verification.
    */
  var verification: js.UndefOr[SchemaVerification] = js.undefined
}
object SchemaCompleteVerificationResponse {
  
  inline def apply(): SchemaCompleteVerificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompleteVerificationResponse]
  }
  
  extension [Self <: SchemaCompleteVerificationResponse](x: Self) {
    
    inline def setVerification(value: SchemaVerification): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
