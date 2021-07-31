package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Custom ranking information for SearchJobsRequest.
  */
trait SchemaCustomRankingInfo extends StObject {
  
  /**
    * Required.  Controls over how important the score of
    * CustomRankingInfo.ranking_expression gets applied to job&#39;s final
    * ranking position.  An error is thrown if not specified.
    */
  var importanceLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Required.  Controls over how job documents get ranked on top of existing
    * relevance score (determined by API algorithm). The product of ranking
    * expression and relevance score is used to determine job&#39;s final
    * ranking position.  The syntax for this expression is a subset of Google
    * SQL syntax.  Supported operators are: +, -, *, /, where the left and
    * right side of the operator is either a numeric Job.custom_attributes key,
    * integer/double value or an expression that can be evaluated to a number.
    * Parenthesis are supported to adjust calculation precedence. The
    * expression must be &lt; 100 characters in length.  Sample ranking
    * expression (year + 25) * 0.25 - (freshness / 0.5)
    */
  var rankingExpression: js.UndefOr[String] = js.undefined
}
object SchemaCustomRankingInfo {
  
  @scala.inline
  def apply(): SchemaCustomRankingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomRankingInfo]
  }
  
  @scala.inline
  implicit class SchemaCustomRankingInfoMutableBuilder[Self <: SchemaCustomRankingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportanceLevel(value: String): Self = StObject.set(x, "importanceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceLevelUndefined: Self = StObject.set(x, "importanceLevel", js.undefined)
    
    @scala.inline
    def setRankingExpression(value: String): Self = StObject.set(x, "rankingExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankingExpressionUndefined: Self = StObject.set(x, "rankingExpression", js.undefined)
  }
}
