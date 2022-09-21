package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeidentifyConfig extends StObject {
  
  /**
    * Configures how annotations, meaning that the location and infoType of sensitive information findings, are created during de-identification. If unspecified, no annotations are created.
    */
  var annotation: js.UndefOr[SchemaAnnotationConfig] = js.undefined
  
  /**
    * Configures de-id of application/DICOM content.
    */
  var dicom: js.UndefOr[SchemaDicomConfig] = js.undefined
  
  /**
    * Configures de-id of application/FHIR content.
    */
  var fhir: js.UndefOr[SchemaFhirConfig] = js.undefined
  
  /**
    * Configures de-identification of image pixels wherever they are found in the source_dataset.
    */
  var image: js.UndefOr[SchemaImageConfig] = js.undefined
  
  /**
    * Details about the work the de-identify operation performed.
    */
  var operationMetadata: js.UndefOr[SchemaDeidentifyOperationMetadata] = js.undefined
  
  /**
    * Configures de-identification of text wherever it is found in the source_dataset.
    */
  var text: js.UndefOr[SchemaTextConfig] = js.undefined
}
object SchemaDeidentifyConfig {
  
  inline def apply(): SchemaDeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyConfig]
  }
  
  extension [Self <: SchemaDeidentifyConfig](x: Self) {
    
    inline def setAnnotation(value: SchemaAnnotationConfig): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    inline def setDicom(value: SchemaDicomConfig): Self = StObject.set(x, "dicom", value.asInstanceOf[js.Any])
    
    inline def setDicomUndefined: Self = StObject.set(x, "dicom", js.undefined)
    
    inline def setFhir(value: SchemaFhirConfig): Self = StObject.set(x, "fhir", value.asInstanceOf[js.Any])
    
    inline def setFhirUndefined: Self = StObject.set(x, "fhir", js.undefined)
    
    inline def setImage(value: SchemaImageConfig): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOperationMetadata(value: SchemaDeidentifyOperationMetadata): Self = StObject.set(x, "operationMetadata", value.asInstanceOf[js.Any])
    
    inline def setOperationMetadataUndefined: Self = StObject.set(x, "operationMetadata", js.undefined)
    
    inline def setText(value: SchemaTextConfig): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
