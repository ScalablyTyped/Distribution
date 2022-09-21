package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConversionsBatchUpdateRequest extends StObject {
  
  /**
    * The set of conversions to update.
    */
  var conversions: js.UndefOr[js.Array[SchemaConversion]] = js.undefined
  
  /**
    * Describes how encryptedUserId is encrypted. This is a required field if encryptedUserId is used.
    */
  var encryptionInfo: js.UndefOr[SchemaEncryptionInfo] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchUpdateRequest".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaConversionsBatchUpdateRequest {
  
  inline def apply(): SchemaConversionsBatchUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionsBatchUpdateRequest]
  }
  
  extension [Self <: SchemaConversionsBatchUpdateRequest](x: Self) {
    
    inline def setConversions(value: js.Array[SchemaConversion]): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    inline def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    inline def setConversionsVarargs(value: SchemaConversion*): Self = StObject.set(x, "conversions", js.Array(value*))
    
    inline def setEncryptionInfo(value: SchemaEncryptionInfo): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
