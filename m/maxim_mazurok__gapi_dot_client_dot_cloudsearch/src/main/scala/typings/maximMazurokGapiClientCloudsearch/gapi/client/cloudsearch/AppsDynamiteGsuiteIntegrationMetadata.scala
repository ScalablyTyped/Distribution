package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteGsuiteIntegrationMetadata extends StObject {
  
  var activityFeedData: js.UndefOr[AppsDynamiteSharedActivityFeedAnnotationData] = js.undefined
  
  var assistantData: js.UndefOr[AppsDynamiteSharedAssistantAnnotationData] = js.undefined
  
  var calendarEventData: js.UndefOr[AppsDynamiteSharedCalendarEventAnnotationData] = js.undefined
  
  /** Data used to render call artifacts. */
  var callData: js.UndefOr[AppsDynamiteSharedCallAnnotationData] = js.undefined
  
  var clientType: js.UndefOr[String] = js.undefined
  
  /**
    * A list of all strings that are to be indexed for this 1P chip. Each string in this list would be the contents of a single string field in the 1P chip. Eg. For Tasks[title = “hello
    * world”, description = “good bye”]. If we want to index only the title, this would be set to [“hello world”]. If both title and description, then this would be [“hello world”, “good
    * bye”]. Please make sure that the contents of this field is a subset of strings that are rendered as part of the 1P Chip.
    */
  var indexableTexts: js.UndefOr[js.Array[String]] = js.undefined
  
  var tasksData: js.UndefOr[AppsDynamiteSharedTasksAnnotationData] = js.undefined
}
object AppsDynamiteGsuiteIntegrationMetadata {
  
  inline def apply(): AppsDynamiteGsuiteIntegrationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteGsuiteIntegrationMetadata]
  }
  
  extension [Self <: AppsDynamiteGsuiteIntegrationMetadata](x: Self) {
    
    inline def setActivityFeedData(value: AppsDynamiteSharedActivityFeedAnnotationData): Self = StObject.set(x, "activityFeedData", value.asInstanceOf[js.Any])
    
    inline def setActivityFeedDataUndefined: Self = StObject.set(x, "activityFeedData", js.undefined)
    
    inline def setAssistantData(value: AppsDynamiteSharedAssistantAnnotationData): Self = StObject.set(x, "assistantData", value.asInstanceOf[js.Any])
    
    inline def setAssistantDataUndefined: Self = StObject.set(x, "assistantData", js.undefined)
    
    inline def setCalendarEventData(value: AppsDynamiteSharedCalendarEventAnnotationData): Self = StObject.set(x, "calendarEventData", value.asInstanceOf[js.Any])
    
    inline def setCalendarEventDataUndefined: Self = StObject.set(x, "calendarEventData", js.undefined)
    
    inline def setCallData(value: AppsDynamiteSharedCallAnnotationData): Self = StObject.set(x, "callData", value.asInstanceOf[js.Any])
    
    inline def setCallDataUndefined: Self = StObject.set(x, "callData", js.undefined)
    
    inline def setClientType(value: String): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
    
    inline def setClientTypeUndefined: Self = StObject.set(x, "clientType", js.undefined)
    
    inline def setIndexableTexts(value: js.Array[String]): Self = StObject.set(x, "indexableTexts", value.asInstanceOf[js.Any])
    
    inline def setIndexableTextsUndefined: Self = StObject.set(x, "indexableTexts", js.undefined)
    
    inline def setIndexableTextsVarargs(value: String*): Self = StObject.set(x, "indexableTexts", js.Array(value*))
    
    inline def setTasksData(value: AppsDynamiteSharedTasksAnnotationData): Self = StObject.set(x, "tasksData", value.asInstanceOf[js.Any])
    
    inline def setTasksDataUndefined: Self = StObject.set(x, "tasksData", js.undefined)
  }
}
