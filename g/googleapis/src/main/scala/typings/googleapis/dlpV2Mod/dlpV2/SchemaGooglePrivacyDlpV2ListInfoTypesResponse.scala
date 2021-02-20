package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to the ListInfoTypes request.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListInfoTypesResponse extends StObject {
  
  /**
    * Set of sensitive infoTypes.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeDescription]] = js.native
}
object SchemaGooglePrivacyDlpV2ListInfoTypesResponse {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListInfoTypesResponseMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ListInfoTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeDescription]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    @scala.inline
    def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoTypeDescription*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
  }
}
