package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskEncryptionConfiguration extends StObject {
  
  /**
    * This is always `sql#diskEncryptionConfiguration`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of KMS key for disk encryption
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object SchemaDiskEncryptionConfiguration {
  
  inline def apply(): SchemaDiskEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskEncryptionConfiguration]
  }
  
  extension [Self <: SchemaDiskEncryptionConfiguration](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
