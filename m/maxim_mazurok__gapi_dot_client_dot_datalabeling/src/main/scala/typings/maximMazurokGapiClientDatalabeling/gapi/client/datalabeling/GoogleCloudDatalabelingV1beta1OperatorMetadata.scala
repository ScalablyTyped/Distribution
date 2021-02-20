package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1OperatorMetadata extends StObject {
  
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
  implicit class GoogleCloudDatalabelingV1beta1OperatorMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1OperatorMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[String]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: String*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLabelVotes(value: Double): Self = StObject.set(x, "labelVotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelVotesUndefined: Self = StObject.set(x, "labelVotes", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setTotalVotes(value: Double): Self = StObject.set(x, "totalVotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalVotesUndefined: Self = StObject.set(x, "totalVotes", js.undefined)
  }
}
