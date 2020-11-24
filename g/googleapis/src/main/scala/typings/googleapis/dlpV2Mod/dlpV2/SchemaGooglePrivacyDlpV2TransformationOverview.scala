package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Overview of the modifications that occurred.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TransformationOverview extends js.Object {
  
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
  implicit class SchemaGooglePrivacyDlpV2TransformationOverviewOps[Self <: SchemaGooglePrivacyDlpV2TransformationOverview] (val x: Self) extends AnyVal {
    
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
    def setTransformationSummariesVarargs(value: SchemaGooglePrivacyDlpV2TransformationSummary*): Self = this.set("transformationSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTransformationSummaries(value: js.Array[SchemaGooglePrivacyDlpV2TransformationSummary]): Self = this.set("transformationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformationSummaries: Self = this.set("transformationSummaries", js.undefined)
    
    @scala.inline
    def setTransformedBytes(value: String): Self = this.set("transformedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformedBytes: Self = this.set("transformedBytes", js.undefined)
  }
}
