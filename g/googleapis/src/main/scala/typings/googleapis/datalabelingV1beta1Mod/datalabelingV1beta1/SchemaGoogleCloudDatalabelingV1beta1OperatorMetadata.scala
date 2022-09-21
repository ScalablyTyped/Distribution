package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1OperatorMetadata extends StObject {
  
  /**
    * Comments from contributors.
    */
  var comments: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The total number of contributors that choose this label.
    */
  var labelVotes: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Confidence score corresponding to a label. For examle, if 3 contributors have answered the question and 2 of them agree on the final label, the confidence score will be 0.67 (2/3).
    */
  var score: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of contributors that answer this question.
    */
  var totalVotes: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1OperatorMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1OperatorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1OperatorMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1OperatorMetadata](x: Self) {
    
    inline def setComments(value: js.Array[String]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: String*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setLabelVotes(value: Double): Self = StObject.set(x, "labelVotes", value.asInstanceOf[js.Any])
    
    inline def setLabelVotesNull: Self = StObject.set(x, "labelVotes", null)
    
    inline def setLabelVotesUndefined: Self = StObject.set(x, "labelVotes", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setTotalVotes(value: Double): Self = StObject.set(x, "totalVotes", value.asInstanceOf[js.Any])
    
    inline def setTotalVotesNull: Self = StObject.set(x, "totalVotes", null)
    
    inline def setTotalVotesUndefined: Self = StObject.set(x, "totalVotes", js.undefined)
  }
}
