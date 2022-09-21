package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyVersionSpec extends StObject {
  
  /**
    * Required. The algorithm to use for creating a managed Cloud KMS key for a for a simplified experience. All managed keys will be have their ProtectionLevel as `HSM`.
    */
  var algorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The resource name for an existing Cloud KMS CryptoKeyVersion in the format `projects/x/locations/x/keyRings/x/cryptoKeys/x/cryptoKeyVersions/x`. This option enables full flexibility in the key's capabilities and properties.
    */
  var cloudKmsKeyVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaKeyVersionSpec {
  
  inline def apply(): SchemaKeyVersionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyVersionSpec]
  }
  
  extension [Self <: SchemaKeyVersionSpec](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNull: Self = StObject.set(x, "algorithm", null)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setCloudKmsKeyVersion(value: String): Self = StObject.set(x, "cloudKmsKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setCloudKmsKeyVersionNull: Self = StObject.set(x, "cloudKmsKeyVersion", null)
    
    inline def setCloudKmsKeyVersionUndefined: Self = StObject.set(x, "cloudKmsKeyVersion", js.undefined)
  }
}
