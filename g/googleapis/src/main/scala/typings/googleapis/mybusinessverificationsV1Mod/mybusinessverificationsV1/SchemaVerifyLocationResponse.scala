package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerifyLocationResponse extends StObject {
  
  /**
    * The created verification request.
    */
  var verification: js.UndefOr[SchemaVerification] = js.undefined
}
object SchemaVerifyLocationResponse {
  
  inline def apply(): SchemaVerifyLocationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyLocationResponse]
  }
  
  extension [Self <: SchemaVerifyLocationResponse](x: Self) {
    
    inline def setVerification(value: SchemaVerification): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
