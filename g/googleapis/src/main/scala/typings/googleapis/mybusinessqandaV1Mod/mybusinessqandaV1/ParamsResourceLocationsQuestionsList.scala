package typings.googleapis.mybusinessqandaV1Mod.mybusinessqandaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsQuestionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. How many answers to fetch per question. The default and maximum `answers_per_question` values are 10.
    */
  var answersPerQuestion: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A filter constraining the questions to return. The only filter currently supported is "ignore_answered=true"
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The order to return the questions. Valid options include 'update_time desc' and 'upvote_count desc', which will return the questions sorted descendingly by the requested field. The default sort order is 'update_time desc'.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. How many questions to fetch per page. The default and maximum `page_size` values are 10.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. If specified, the next page of questions is retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the location to fetch questions for.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsQuestionsList {
  
  inline def apply(): ParamsResourceLocationsQuestionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsQuestionsList]
  }
  
  extension [Self <: ParamsResourceLocationsQuestionsList](x: Self) {
    
    inline def setAnswersPerQuestion(value: Double): Self = StObject.set(x, "answersPerQuestion", value.asInstanceOf[js.Any])
    
    inline def setAnswersPerQuestionUndefined: Self = StObject.set(x, "answersPerQuestion", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
