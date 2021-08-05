package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service account sign blob request.
  */
trait SchemaSignBlobRequest extends StObject {
  
  /**
    * The bytes to sign.
    */
  var bytesToSign: js.UndefOr[String] = js.undefined
}
object SchemaSignBlobRequest {
  
  inline def apply(): SchemaSignBlobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignBlobRequest]
  }
  
  extension [Self <: SchemaSignBlobRequest](x: Self) {
    
    inline def setBytesToSign(value: String): Self = StObject.set(x, "bytesToSign", value.asInstanceOf[js.Any])
    
    inline def setBytesToSignUndefined: Self = StObject.set(x, "bytesToSign", js.undefined)
  }
}
