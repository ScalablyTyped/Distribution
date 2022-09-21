package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateVerificationTokenRequest extends StObject {
  
  /**
    * Required. The target location. Note: The location information should exactly match the target Location, otherwise the generated verification token won't be able to verify the target Location.
    */
  var location: js.UndefOr[SchemaLocation] = js.undefined
}
object SchemaGenerateVerificationTokenRequest {
  
  inline def apply(): SchemaGenerateVerificationTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateVerificationTokenRequest]
  }
  
  extension [Self <: SchemaGenerateVerificationTokenRequest](x: Self) {
    
    inline def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
