package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskEncryptionStatus extends StObject {
  
  /**
    * This is always `sql#diskEncryptionStatus`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * KMS key version used to encrypt the Cloud SQL instance resource
    */
  var kmsKeyVersionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaDiskEncryptionStatus {
  
  inline def apply(): SchemaDiskEncryptionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskEncryptionStatus]
  }
  
  extension [Self <: SchemaDiskEncryptionStatus](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setKmsKeyVersionName(value: String): Self = StObject.set(x, "kmsKeyVersionName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyVersionNameNull: Self = StObject.set(x, "kmsKeyVersionName", null)
    
    inline def setKmsKeyVersionNameUndefined: Self = StObject.set(x, "kmsKeyVersionName", js.undefined)
  }
}
