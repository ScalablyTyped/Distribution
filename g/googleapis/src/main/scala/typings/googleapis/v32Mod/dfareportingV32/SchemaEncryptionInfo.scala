package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of how user IDs are encrypted.
  */
trait SchemaEncryptionInfo extends StObject {
  
  /**
    * The encryption entity ID. This should match the encryption configuration
    * for ad serving or Data Transfer.
    */
  var encryptionEntityId: js.UndefOr[String] = js.undefined
  
  /**
    * The encryption entity type. This should match the encryption
    * configuration for ad serving or Data Transfer.
    */
  var encryptionEntityType: js.UndefOr[String] = js.undefined
  
  /**
    * Describes whether the encrypted cookie was received from ad serving (the
    * %m macro) or from Data Transfer.
    */
  var encryptionSource: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#encryptionInfo&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaEncryptionInfo {
  
  @scala.inline
  def apply(): SchemaEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionInfo]
  }
  
  @scala.inline
  implicit class SchemaEncryptionInfoMutableBuilder[Self <: SchemaEncryptionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionEntityId(value: String): Self = StObject.set(x, "encryptionEntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionEntityIdUndefined: Self = StObject.set(x, "encryptionEntityId", js.undefined)
    
    @scala.inline
    def setEncryptionEntityType(value: String): Self = StObject.set(x, "encryptionEntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionEntityTypeUndefined: Self = StObject.set(x, "encryptionEntityType", js.undefined)
    
    @scala.inline
    def setEncryptionSource(value: String): Self = StObject.set(x, "encryptionSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionSourceUndefined: Self = StObject.set(x, "encryptionSource", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
