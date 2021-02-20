package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A quasi-identifier column has a custom_tag, used to know which column in
  * the data corresponds to which column in the statistical model.
  */
@js.native
trait SchemaGooglePrivacyDlpV2QuasiIdentifierField extends StObject {
  
  var customTag: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}
object SchemaGooglePrivacyDlpV2QuasiIdentifierField {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2QuasiIdentifierField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuasiIdentifierField]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2QuasiIdentifierFieldMutableBuilder[Self <: SchemaGooglePrivacyDlpV2QuasiIdentifierField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomTag(value: String): Self = StObject.set(x, "customTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTagUndefined: Self = StObject.set(x, "customTag", js.undefined)
    
    @scala.inline
    def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
