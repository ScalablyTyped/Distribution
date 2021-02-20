package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Disk encryption status.
  */
@js.native
trait SchemaDiskEncryptionStatus extends StObject {
  
  /**
    * This is always sql#diskEncryptionStatus.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * KMS key version used to encrypt the Cloud SQL instance disk
    */
  var kmsKeyVersionName: js.UndefOr[String] = js.native
}
object SchemaDiskEncryptionStatus {
  
  @scala.inline
  def apply(): SchemaDiskEncryptionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskEncryptionStatus]
  }
  
  @scala.inline
  implicit class SchemaDiskEncryptionStatusMutableBuilder[Self <: SchemaDiskEncryptionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setKmsKeyVersionName(value: String): Self = StObject.set(x, "kmsKeyVersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyVersionNameUndefined: Self = StObject.set(x, "kmsKeyVersionName", js.undefined)
  }
}
