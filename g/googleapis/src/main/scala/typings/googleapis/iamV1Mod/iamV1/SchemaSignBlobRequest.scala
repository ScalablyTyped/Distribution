package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSignBlobRequest extends StObject {
  
  /**
    * Required. Deprecated. [Migrate to Service Account Credentials API](https://cloud.google.com/iam/help/credentials/migrate-api). The bytes to sign.
    */
  var bytesToSign: js.UndefOr[String | Null] = js.undefined
}
object SchemaSignBlobRequest {
  
  inline def apply(): SchemaSignBlobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignBlobRequest]
  }
  
  extension [Self <: SchemaSignBlobRequest](x: Self) {
    
    inline def setBytesToSign(value: String): Self = StObject.set(x, "bytesToSign", value.asInstanceOf[js.Any])
    
    inline def setBytesToSignNull: Self = StObject.set(x, "bytesToSign", null)
    
    inline def setBytesToSignUndefined: Self = StObject.set(x, "bytesToSign", js.undefined)
  }
}
