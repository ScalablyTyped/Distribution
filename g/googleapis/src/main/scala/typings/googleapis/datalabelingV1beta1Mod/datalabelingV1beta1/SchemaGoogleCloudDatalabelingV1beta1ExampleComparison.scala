package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ExampleComparison extends StObject {
  
  /**
    * The ground truth output for the input.
    */
  var groundTruthExample: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1Example] = js.undefined
  
  /**
    * Predictions by the model for the input.
    */
  var modelCreatedExamples: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1Example]] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ExampleComparison {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ExampleComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ExampleComparison]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ExampleComparison](x: Self) {
    
    inline def setGroundTruthExample(value: SchemaGoogleCloudDatalabelingV1beta1Example): Self = StObject.set(x, "groundTruthExample", value.asInstanceOf[js.Any])
    
    inline def setGroundTruthExampleUndefined: Self = StObject.set(x, "groundTruthExample", js.undefined)
    
    inline def setModelCreatedExamples(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1Example]): Self = StObject.set(x, "modelCreatedExamples", value.asInstanceOf[js.Any])
    
    inline def setModelCreatedExamplesUndefined: Self = StObject.set(x, "modelCreatedExamples", js.undefined)
    
    inline def setModelCreatedExamplesVarargs(value: SchemaGoogleCloudDatalabelingV1beta1Example*): Self = StObject.set(x, "modelCreatedExamples", js.Array(value*))
  }
}
