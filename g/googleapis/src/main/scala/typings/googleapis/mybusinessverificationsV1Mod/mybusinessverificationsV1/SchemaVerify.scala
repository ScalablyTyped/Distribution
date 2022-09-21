package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerify extends StObject {
  
  /**
    * Indicates whether a verification process has already started, and can be completed by the location.
    */
  var hasPendingVerification: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaVerify {
  
  inline def apply(): SchemaVerify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerify]
  }
  
  extension [Self <: SchemaVerify](x: Self) {
    
    inline def setHasPendingVerification(value: Boolean): Self = StObject.set(x, "hasPendingVerification", value.asInstanceOf[js.Any])
    
    inline def setHasPendingVerificationNull: Self = StObject.set(x, "hasPendingVerification", null)
    
    inline def setHasPendingVerificationUndefined: Self = StObject.set(x, "hasPendingVerification", js.undefined)
  }
}
