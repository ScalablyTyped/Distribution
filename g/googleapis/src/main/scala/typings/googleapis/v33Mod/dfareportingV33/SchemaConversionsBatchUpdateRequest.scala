package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update Conversions Request.
  */
@js.native
trait SchemaConversionsBatchUpdateRequest extends StObject {
  
  /**
    * The set of conversions to update.
    */
  var conversions: js.UndefOr[js.Array[SchemaConversion]] = js.native
  
  /**
    * Describes how encryptedUserId is encrypted. This is a required field if
    * encryptedUserId is used.
    */
  var encryptionInfo: js.UndefOr[SchemaEncryptionInfo] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchUpdateRequest&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaConversionsBatchUpdateRequest {
  
  @scala.inline
  def apply(): SchemaConversionsBatchUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionsBatchUpdateRequest]
  }
  
  @scala.inline
  implicit class SchemaConversionsBatchUpdateRequestMutableBuilder[Self <: SchemaConversionsBatchUpdateRequest] (val x: Self) extends AnyVal {
    
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
