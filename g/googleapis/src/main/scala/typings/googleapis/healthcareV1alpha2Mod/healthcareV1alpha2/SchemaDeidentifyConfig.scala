package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures de-id options specific to different types of content. Each
  * submessage customizes the handling of an
  * https://tools.ietf.org/html/rfc6838 media type or subtype. Configs are
  * applied in a nested manner at runtime.
  */
trait SchemaDeidentifyConfig extends StObject {
  
  /**
    * Configures de-id of application/DICOM content.
    */
  var dicom: js.UndefOr[SchemaDicomConfig] = js.undefined
  
  /**
    * Configures de-id of application/FHIR content.
    */
  var fhir: js.UndefOr[SchemaFhirConfig] = js.undefined
  
  /**
    * Configures de-identification of image pixels wherever they are found in
    * the source_dataset.
    */
  var image: js.UndefOr[SchemaImageConfig] = js.undefined
  
  /**
    * Configures de-identification of text wherever it is found in the
    * source_dataset.
    */
  var text: js.UndefOr[SchemaTextConfig] = js.undefined
}
object SchemaDeidentifyConfig {
  
  inline def apply(): SchemaDeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyConfig]
  }
  
  extension [Self <: SchemaDeidentifyConfig](x: Self) {
    
    inline def setDicom(value: SchemaDicomConfig): Self = StObject.set(x, "dicom", value.asInstanceOf[js.Any])
    
    inline def setDicomUndefined: Self = StObject.set(x, "dicom", js.undefined)
    
    inline def setFhir(value: SchemaFhirConfig): Self = StObject.set(x, "fhir", value.asInstanceOf[js.Any])
    
    inline def setFhirUndefined: Self = StObject.set(x, "fhir", js.undefined)
    
    inline def setImage(value: SchemaImageConfig): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setText(value: SchemaTextConfig): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
