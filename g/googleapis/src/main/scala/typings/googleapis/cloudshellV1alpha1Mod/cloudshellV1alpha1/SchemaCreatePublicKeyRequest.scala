package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for CreatePublicKey.
  */
trait SchemaCreatePublicKeyRequest extends StObject {
  
  /**
    * Key that should be added to the environment.
    */
  var key: js.UndefOr[SchemaPublicKey] = js.undefined
}
object SchemaCreatePublicKeyRequest {
  
  inline def apply(): SchemaCreatePublicKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreatePublicKeyRequest]
  }
  
  extension [Self <: SchemaCreatePublicKeyRequest](x: Self) {
    
    inline def setKey(value: SchemaPublicKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
