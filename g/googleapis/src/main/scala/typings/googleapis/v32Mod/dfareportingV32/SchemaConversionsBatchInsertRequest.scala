package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Insert Conversions Request.
  */
trait SchemaConversionsBatchInsertRequest extends StObject {
  
  /**
    * The set of conversions to insert.
    */
  var conversions: js.UndefOr[js.Array[SchemaConversion]] = js.undefined
  
  /**
    * Describes how encryptedUserId or encryptedUserIdCandidates[] is
    * encrypted. This is a required field if encryptedUserId or
    * encryptedUserIdCandidates[] is used.
    */
  var encryptionInfo: js.UndefOr[SchemaEncryptionInfo] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchInsertRequest&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaConversionsBatchInsertRequest {
  
  @scala.inline
  def apply(): SchemaConversionsBatchInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionsBatchInsertRequest]
  }
  
  @scala.inline
  implicit class SchemaConversionsBatchInsertRequestMutableBuilder[Self <: SchemaConversionsBatchInsertRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversions(value: js.Array[SchemaConversion]): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    @scala.inline
    def setConversionsVarargs(value: SchemaConversion*): Self = StObject.set(x, "conversions", js.Array(value :_*))
    
    @scala.inline
    def setEncryptionInfo(value: SchemaEncryptionInfo): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
