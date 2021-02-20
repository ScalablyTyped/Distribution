package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Overview of the modifications that occurred.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TransformationOverview extends StObject {
  
  /**
    * Transformations applied to the dataset.
    */
  var transformationSummaries: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2TransformationSummary]] = js.native
  
  /**
    * Total size in bytes that were transformed in some way.
    */
  var transformedBytes: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2TransformationOverview {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TransformationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransformationOverview]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TransformationOverviewMutableBuilder[Self <: SchemaGooglePrivacyDlpV2TransformationOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformationSummaries(value: js.Array[SchemaGooglePrivacyDlpV2TransformationSummary]): Self = StObject.set(x, "transformationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationSummariesUndefined: Self = StObject.set(x, "transformationSummaries", js.undefined)
    
    @scala.inline
    def setTransformationSummariesVarargs(value: SchemaGooglePrivacyDlpV2TransformationSummary*): Self = StObject.set(x, "transformationSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTransformedBytes(value: String): Self = StObject.set(x, "transformedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformedBytesUndefined: Self = StObject.set(x, "transformedBytes", js.undefined)
  }
}
