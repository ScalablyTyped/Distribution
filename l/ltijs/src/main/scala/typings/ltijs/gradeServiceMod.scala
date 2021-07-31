package typings.ltijs

import typings.ltijs.idTokenMod.IdToken
import typings.ltijs.ltijsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gradeServiceMod {
  
  trait GradeFilters extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var resourceLinkId: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[Boolean] = js.undefined
    
    var userId: js.UndefOr[Boolean] = js.undefined
  }
  object GradeFilters {
    
    @scala.inline
    def apply(): GradeFilters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GradeFilters]
    }
    
    @scala.inline
    implicit class GradeFiltersMutableBuilder[Self <: GradeFilters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setResourceLinkId(value: Boolean): Self = StObject.set(x, "resourceLinkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLinkIdUndefined: Self = StObject.set(x, "resourceLinkId", js.undefined)
      
      @scala.inline
      def setTag(value: Boolean): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setUserId(value: Boolean): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  @js.native
  trait GradeService extends StObject {
    
    def result(idtoken: IdToken): js.Promise[js.Array[RetrievedGrade] | `false`] = js.native
    def result(idtoken: IdToken, filters: GradeFilters): js.Promise[js.Array[RetrievedGrade] | `false`] = js.native
    
    def scorePublish(idtoken: IdToken, grade: PublishedGrade): js.Promise[Boolean] = js.native
  }
  
  trait PublishedGrade extends StObject {
    
    var activityProgress: String
    
    var comment: js.UndefOr[String] = js.undefined
    
    var gradingProgress: String
    
    var scoreGiven: Double
  }
  object PublishedGrade {
    
    @scala.inline
    def apply(activityProgress: String, gradingProgress: String, scoreGiven: Double): PublishedGrade = {
      val __obj = js.Dynamic.literal(activityProgress = activityProgress.asInstanceOf[js.Any], gradingProgress = gradingProgress.asInstanceOf[js.Any], scoreGiven = scoreGiven.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishedGrade]
    }
    
    @scala.inline
    implicit class PublishedGradeMutableBuilder[Self <: PublishedGrade] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityProgress(value: String): Self = StObject.set(x, "activityProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setGradingProgress(value: String): Self = StObject.set(x, "gradingProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoreGiven(value: Double): Self = StObject.set(x, "scoreGiven", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetrievedGrade extends StObject {
    
    var comment: String
    
    var id: String
    
    var resultMaximum: Double
    
    var resultScore: Double
    
    var scoreOf: String
    
    var userId: String
  }
  object RetrievedGrade {
    
    @scala.inline
    def apply(
      comment: String,
      id: String,
      resultMaximum: Double,
      resultScore: Double,
      scoreOf: String,
      userId: String
    ): RetrievedGrade = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resultMaximum = resultMaximum.asInstanceOf[js.Any], resultScore = resultScore.asInstanceOf[js.Any], scoreOf = scoreOf.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetrievedGrade]
    }
    
    @scala.inline
    implicit class RetrievedGradeMutableBuilder[Self <: RetrievedGrade] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultMaximum(value: Double): Self = StObject.set(x, "resultMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultScore(value: Double): Self = StObject.set(x, "resultScore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoreOf(value: String): Self = StObject.set(x, "scoreOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
