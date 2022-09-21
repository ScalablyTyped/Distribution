package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEncryptionConfig extends StObject {
  
  /**
    * Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
    */
  var gcePdKmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object SchemaEncryptionConfig {
  
  inline def apply(): SchemaEncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionConfig]
  }
  
  extension [Self <: SchemaEncryptionConfig](x: Self) {
    
    inline def setGcePdKmsKeyName(value: String): Self = StObject.set(x, "gcePdKmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setGcePdKmsKeyNameNull: Self = StObject.set(x, "gcePdKmsKeyName", null)
    
    inline def setGcePdKmsKeyNameUndefined: Self = StObject.set(x, "gcePdKmsKeyName", js.undefined)
  }
}
