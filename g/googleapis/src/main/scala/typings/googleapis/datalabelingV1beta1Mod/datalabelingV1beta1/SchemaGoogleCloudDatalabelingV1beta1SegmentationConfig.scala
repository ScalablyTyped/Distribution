package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1SegmentationConfig extends StObject {
  
  /**
    * Required. Annotation spec set resource name. format: projects/{project_id\}/annotationSpecSets/{annotation_spec_set_id\}
    */
  var annotationSpecSet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instruction message showed on labelers UI.
    */
  var instructionMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1SegmentationConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1SegmentationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1SegmentationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1SegmentationConfig](x: Self) {
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetNull: Self = StObject.set(x, "annotationSpecSet", null)
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    inline def setInstructionMessage(value: String): Self = StObject.set(x, "instructionMessage", value.asInstanceOf[js.Any])
    
    inline def setInstructionMessageNull: Self = StObject.set(x, "instructionMessage", null)
    
    inline def setInstructionMessageUndefined: Self = StObject.set(x, "instructionMessage", js.undefined)
  }
}
