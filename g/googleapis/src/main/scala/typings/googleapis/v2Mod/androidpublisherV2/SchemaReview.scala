package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReview extends StObject {
  
  /**
    * The name of the user who wrote the review.
    */
  var authorName: js.UndefOr[String] = js.native
  
  /**
    * A repeated field containing comments for the review.
    */
  var comments: js.UndefOr[js.Array[SchemaComment]] = js.native
  
  /**
    * Unique identifier for this review.
    */
  var reviewId: js.UndefOr[String] = js.native
}
object SchemaReview {
  
  @scala.inline
  def apply(): SchemaReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReview]
  }
  
  @scala.inline
  implicit class SchemaReviewMutableBuilder[Self <: SchemaReview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    @scala.inline
    def setComments(value: js.Array[SchemaComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: SchemaComment*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setReviewId(value: String): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewIdUndefined: Self = StObject.set(x, "reviewId", js.undefined)
  }
}
