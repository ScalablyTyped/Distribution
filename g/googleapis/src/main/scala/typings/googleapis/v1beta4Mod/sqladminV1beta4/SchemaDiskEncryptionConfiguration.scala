package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Disk encryption configuration.
  */
trait SchemaDiskEncryptionConfiguration extends StObject {
  
  /**
    * This is always sql#diskEncryptionConfiguration.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * KMS key resource name
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
}
object SchemaDiskEncryptionConfiguration {
  
  @scala.inline
  def apply(): SchemaDiskEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class SchemaDiskEncryptionConfigurationMutableBuilder[Self <: SchemaDiskEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
