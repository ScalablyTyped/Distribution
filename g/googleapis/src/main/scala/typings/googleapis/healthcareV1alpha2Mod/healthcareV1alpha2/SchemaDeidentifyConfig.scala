package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures de-id options specific to different types of content. Each
  * submessage customizes the handling of an
  * https://tools.ietf.org/html/rfc6838 media type or subtype. Configs are
  * applied in a nested manner at runtime.
  */
@js.native
trait SchemaDeidentifyConfig extends js.Object {
  
  /**
    * Configures de-id of application/DICOM content.
    */
  var dicom: js.UndefOr[SchemaDicomConfig] = js.native
  
  /**
    * Configures de-id of application/FHIR content.
    */
  var fhir: js.UndefOr[SchemaFhirConfig] = js.native
  
  /**
    * Configures de-identification of image pixels wherever they are found in
    * the source_dataset.
    */
  var image: js.UndefOr[SchemaImageConfig] = js.native
  
  /**
    * Configures de-identification of text wherever it is found in the
    * source_dataset.
    */
  var text: js.UndefOr[SchemaTextConfig] = js.native
}
object SchemaDeidentifyConfig {
  
  @scala.inline
  def apply(): SchemaDeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyConfig]
  }
  
  @scala.inline
  implicit class SchemaDeidentifyConfigOps[Self <: SchemaDeidentifyConfig] (val x: Self) extends AnyVal {
    
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
    def setDicom(value: SchemaDicomConfig): Self = this.set("dicom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDicom: Self = this.set("dicom", js.undefined)
    
    @scala.inline
    def setFhir(value: SchemaFhirConfig): Self = this.set("fhir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFhir: Self = this.set("fhir", js.undefined)
    
    @scala.inline
    def setImage(value: SchemaImageConfig): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setText(value: SchemaTextConfig): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
