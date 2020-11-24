package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1EventConfig extends js.Object {
  
  /** Required. The list of annotation spec set resource name. Similar to video classification, we support selecting event from multiple AnnotationSpecSet at the same time. */
  var annotationSpecSets: js.UndefOr[js.Array[String]] = js.native
  
  /** Videos will be cut to smaller clips to make it easier for labelers to work on. Users can configure is field in seconds, if not set, default value is 60s. */
  var clipLength: js.UndefOr[Double] = js.native
  
  /** The overlap length between different video clips. Users can configure is field in seconds, if not set, default value is 1s. */
  var overlapLength: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1EventConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1EventConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EventConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1EventConfigOps[Self <: GoogleCloudDatalabelingV1beta1EventConfig] (val x: Self) extends AnyVal {
    
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
    def setAnnotationSpecSetsVarargs(value: String*): Self = this.set("annotationSpecSets", js.Array(value :_*))
    
    @scala.inline
    def setAnnotationSpecSets(value: js.Array[String]): Self = this.set("annotationSpecSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationSpecSets: Self = this.set("annotationSpecSets", js.undefined)
    
    @scala.inline
    def setClipLength(value: Double): Self = this.set("clipLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipLength: Self = this.set("clipLength", js.undefined)
    
    @scala.inline
    def setOverlapLength(value: Double): Self = this.set("overlapLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlapLength: Self = this.set("overlapLength", js.undefined)
  }
}
