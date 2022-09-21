package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListShaCertificatesResponse extends StObject {
  
  /**
    * The list of each `ShaCertificate` associated with the `AndroidApp`.
    */
  var certificates: js.UndefOr[js.Array[SchemaShaCertificate]] = js.undefined
}
object SchemaListShaCertificatesResponse {
  
  inline def apply(): SchemaListShaCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListShaCertificatesResponse]
  }
  
  extension [Self <: SchemaListShaCertificatesResponse](x: Self) {
    
    inline def setCertificates(value: js.Array[SchemaShaCertificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: SchemaShaCertificate*): Self = StObject.set(x, "certificates", js.Array(value*))
  }
}
