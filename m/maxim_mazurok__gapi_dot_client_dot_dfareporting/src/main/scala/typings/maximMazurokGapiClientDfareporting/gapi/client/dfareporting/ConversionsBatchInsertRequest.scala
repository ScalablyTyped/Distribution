package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionsBatchInsertRequest extends StObject {
  
  /** The set of conversions to insert. */
  var conversions: js.UndefOr[js.Array[Conversion]] = js.undefined
  
  /** Describes how encryptedUserId or encryptedUserIdCandidates[] is encrypted. This is a required field if encryptedUserId or encryptedUserIdCandidates[] is used. */
  var encryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchInsertRequest". */
  var kind: js.UndefOr[String] = js.undefined
}
object ConversionsBatchInsertRequest {
  
  inline def apply(): ConversionsBatchInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionsBatchInsertRequest]
  }
  
  extension [Self <: ConversionsBatchInsertRequest](x: Self) {
    
    inline def setConversions(value: js.Array[Conversion]): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    inline def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    inline def setConversionsVarargs(value: Conversion*): Self = StObject.set(x, "conversions", js.Array(value :_*))
    
    inline def setEncryptionInfo(value: EncryptionInfo): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
