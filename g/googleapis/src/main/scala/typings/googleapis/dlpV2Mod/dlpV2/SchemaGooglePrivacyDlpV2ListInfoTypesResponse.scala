package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ListInfoTypesResponse extends StObject {
  
  /**
    * Set of sensitive infoTypes.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeDescription]] = js.undefined
}
object SchemaGooglePrivacyDlpV2ListInfoTypesResponse {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ListInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ListInfoTypesResponse](x: Self) {
    
    inline def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeDescription]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    inline def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    inline def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoTypeDescription*): Self = StObject.set(x, "infoTypes", js.Array(value*))
  }
}
