package typings.googleapis.osloginV1betaMod.osloginV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response message for importing an SSH public key.
  */
trait SchemaImportSshPublicKeyResponse extends StObject {
  
  /**
    * The login profile information for the user.
    */
  var loginProfile: js.UndefOr[SchemaLoginProfile] = js.undefined
}
object SchemaImportSshPublicKeyResponse {
  
  inline def apply(): SchemaImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportSshPublicKeyResponse]
  }
  
  extension [Self <: SchemaImportSshPublicKeyResponse](x: Self) {
    
    inline def setLoginProfile(value: SchemaLoginProfile): Self = StObject.set(x, "loginProfile", value.asInstanceOf[js.Any])
    
    inline def setLoginProfileUndefined: Self = StObject.set(x, "loginProfile", js.undefined)
  }
}
