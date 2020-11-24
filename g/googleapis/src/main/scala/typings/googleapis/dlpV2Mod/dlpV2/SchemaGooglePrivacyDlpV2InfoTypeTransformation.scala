package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transformation to apply to text that is identified as a specific
  * info_type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeTransformation extends js.Object {
  
  /**
    * InfoTypes to apply the transformation to. An empty list will cause this
    * transformation to apply to all findings that correspond to infoTypes that
    * were requested in `InspectConfig`.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.native
  
  /**
    * Primitive transformation to apply to the infoType. [required]
    */
  var primitiveTransformation: js.UndefOr[SchemaGooglePrivacyDlpV2PrimitiveTransformation] = js.native
}
object SchemaGooglePrivacyDlpV2InfoTypeTransformation {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeTransformation]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeTransformationOps[Self <: SchemaGooglePrivacyDlpV2InfoTypeTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoType*): Self = this.set("infoTypes", js.Array(value :_*))
    
    @scala.inline
    def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = this.set("infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoTypes: Self = this.set("infoTypes", js.undefined)
    
    @scala.inline
    def setPrimitiveTransformation(value: SchemaGooglePrivacyDlpV2PrimitiveTransformation): Self = this.set("primitiveTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveTransformation: Self = this.set("primitiveTransformation", js.undefined)
  }
}
