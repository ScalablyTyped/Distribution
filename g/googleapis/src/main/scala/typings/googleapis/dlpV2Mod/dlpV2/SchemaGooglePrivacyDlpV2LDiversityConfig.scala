package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2LDiversityConfig extends StObject {
  
  /**
    * Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite key.
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.undefined
  
  /**
    * Sensitive field for computing the l-value.
    */
  var sensitiveAttribute: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.undefined
}
object SchemaGooglePrivacyDlpV2LDiversityConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2LDiversityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LDiversityConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2LDiversityConfig](x: Self) {
    
    inline def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    inline def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "quasiIds", js.Array(value*))
    
    inline def setSensitiveAttribute(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "sensitiveAttribute", value.asInstanceOf[js.Any])
    
    inline def setSensitiveAttributeUndefined: Self = StObject.set(x, "sensitiveAttribute", js.undefined)
  }
}
