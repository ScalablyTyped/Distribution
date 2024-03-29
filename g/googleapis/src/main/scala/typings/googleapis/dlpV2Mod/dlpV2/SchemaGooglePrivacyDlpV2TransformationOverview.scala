package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TransformationOverview extends StObject {
  
  /**
    * Transformations applied to the dataset.
    */
  var transformationSummaries: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2TransformationSummary]] = js.undefined
  
  /**
    * Total size in bytes that were transformed in some way.
    */
  var transformedBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2TransformationOverview {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TransformationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransformationOverview]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TransformationOverview](x: Self) {
    
    inline def setTransformationSummaries(value: js.Array[SchemaGooglePrivacyDlpV2TransformationSummary]): Self = StObject.set(x, "transformationSummaries", value.asInstanceOf[js.Any])
    
    inline def setTransformationSummariesUndefined: Self = StObject.set(x, "transformationSummaries", js.undefined)
    
    inline def setTransformationSummariesVarargs(value: SchemaGooglePrivacyDlpV2TransformationSummary*): Self = StObject.set(x, "transformationSummaries", js.Array(value*))
    
    inline def setTransformedBytes(value: String): Self = StObject.set(x, "transformedBytes", value.asInstanceOf[js.Any])
    
    inline def setTransformedBytesNull: Self = StObject.set(x, "transformedBytes", null)
    
    inline def setTransformedBytesUndefined: Self = StObject.set(x, "transformedBytes", js.undefined)
  }
}
