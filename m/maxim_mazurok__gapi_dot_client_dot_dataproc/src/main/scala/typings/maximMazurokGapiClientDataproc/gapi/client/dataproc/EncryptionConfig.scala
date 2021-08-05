package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfig extends StObject {
  
  /** Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster. */
  var gcePdKmsKeyName: js.UndefOr[String] = js.undefined
}
object EncryptionConfig {
  
  inline def apply(): EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  extension [Self <: EncryptionConfig](x: Self) {
    
    inline def setGcePdKmsKeyName(value: String): Self = StObject.set(x, "gcePdKmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setGcePdKmsKeyNameUndefined: Self = StObject.set(x, "gcePdKmsKeyName", js.undefined)
  }
}
