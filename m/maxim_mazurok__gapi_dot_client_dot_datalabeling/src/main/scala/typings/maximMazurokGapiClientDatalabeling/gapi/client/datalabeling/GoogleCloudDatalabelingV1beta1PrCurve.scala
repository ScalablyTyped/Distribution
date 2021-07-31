package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1PrCurve extends StObject {
  
  /** The annotation spec of the label for which the precision-recall curve calculated. If this field is empty, that means the precision-recall curve is an aggregate curve for all labels. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.undefined
  
  /** Area under the precision-recall curve. Not to be confused with area under a receiver operating characteristic (ROC) curve. */
  var areaUnderCurve: js.UndefOr[Double] = js.undefined
  
  /** Entries that make up the precision-recall graph. Each entry is a "point" on the graph drawn for a different `confidence_threshold`. */
  var confidenceMetricsEntries: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry]] = js.undefined
  
  /** Mean average prcision of this curve. */
  var meanAveragePrecision: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1beta1PrCurve {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1PrCurve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1PrCurve]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1PrCurveMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1PrCurve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    @scala.inline
    def setAreaUnderCurve(value: Double): Self = StObject.set(x, "areaUnderCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUnderCurveUndefined: Self = StObject.set(x, "areaUnderCurve", js.undefined)
    
    @scala.inline
    def setConfidenceMetricsEntries(value: js.Array[GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry]): Self = StObject.set(x, "confidenceMetricsEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceMetricsEntriesUndefined: Self = StObject.set(x, "confidenceMetricsEntries", js.undefined)
    
    @scala.inline
    def setConfidenceMetricsEntriesVarargs(value: GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry*): Self = StObject.set(x, "confidenceMetricsEntries", js.Array(value :_*))
    
    @scala.inline
    def setMeanAveragePrecision(value: Double): Self = StObject.set(x, "meanAveragePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanAveragePrecisionUndefined: Self = StObject.set(x, "meanAveragePrecision", js.undefined)
  }
}
