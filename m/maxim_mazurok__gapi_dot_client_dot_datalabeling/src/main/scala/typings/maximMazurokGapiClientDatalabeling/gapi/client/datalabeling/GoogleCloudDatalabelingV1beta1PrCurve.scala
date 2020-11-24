package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1PrCurve extends js.Object {
  
  /** The annotation spec of the label for which the precision-recall curve calculated. If this field is empty, that means the precision-recall curve is an aggregate curve for all labels. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
  
  /** Area under the precision-recall curve. Not to be confused with area under a receiver operating characteristic (ROC) curve. */
  var areaUnderCurve: js.UndefOr[Double] = js.native
  
  /** Entries that make up the precision-recall graph. Each entry is a "point" on the graph drawn for a different `confidence_threshold`. */
  var confidenceMetricsEntries: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry]] = js.native
  
  /** Mean average prcision of this curve. */
  var meanAveragePrecision: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1PrCurve {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1PrCurve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1PrCurve]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1PrCurveOps[Self <: GoogleCloudDatalabelingV1beta1PrCurve] (val x: Self) extends AnyVal {
    
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
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = this.set("annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSpec: Self = this.set("annotationSpec", js.undefined)
    
    @scala.inline
    def setAreaUnderCurve(value: Double): Self = this.set("areaUnderCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaUnderCurve: Self = this.set("areaUnderCurve", js.undefined)
    
    @scala.inline
    def setConfidenceMetricsEntriesVarargs(value: GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry*): Self = this.set("confidenceMetricsEntries", js.Array(value :_*))
    
    @scala.inline
    def setConfidenceMetricsEntries(value: js.Array[GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry]): Self = this.set("confidenceMetricsEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidenceMetricsEntries: Self = this.set("confidenceMetricsEntries", js.undefined)
    
    @scala.inline
    def setMeanAveragePrecision(value: Double): Self = this.set("meanAveragePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanAveragePrecision: Self = this.set("meanAveragePrecision", js.undefined)
  }
}
