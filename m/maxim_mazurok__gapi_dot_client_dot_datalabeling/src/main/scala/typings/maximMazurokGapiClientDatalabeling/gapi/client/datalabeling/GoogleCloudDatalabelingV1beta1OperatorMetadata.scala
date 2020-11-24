package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1OperatorMetadata extends js.Object {
  
  /** Comments from contributors. */
  var comments: js.UndefOr[js.Array[String]] = js.native
  
  /** The total number of contributors that choose this label. */
  var labelVotes: js.UndefOr[Double] = js.native
  
  /** Confidence score corresponding to a label. For examle, if 3 contributors have answered the question and 2 of them agree on the final label, the confidence score will be 0.67 (2/3). */
  var score: js.UndefOr[Double] = js.native
  
  /** The total number of contributors that answer this question. */
  var totalVotes: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1OperatorMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1OperatorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1OperatorMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1OperatorMetadataOps[Self <: GoogleCloudDatalabelingV1beta1OperatorMetadata] (val x: Self) extends AnyVal {
    
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
    def setCommentsVarargs(value: String*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[String]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setLabelVotes(value: Double): Self = this.set("labelVotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelVotes: Self = this.set("labelVotes", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setTotalVotes(value: Double): Self = this.set("totalVotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalVotes: Self = this.set("totalVotes", js.undefined)
  }
}
