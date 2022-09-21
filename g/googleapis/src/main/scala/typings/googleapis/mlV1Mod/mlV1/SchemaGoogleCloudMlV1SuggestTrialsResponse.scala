package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1SuggestTrialsResponse extends StObject {
  
  /**
    * The time at which operation processing completed.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the operation was started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the study.
    */
  var studyState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of trials.
    */
  var trials: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Trial]] = js.undefined
}
object SchemaGoogleCloudMlV1SuggestTrialsResponse {
  
  inline def apply(): SchemaGoogleCloudMlV1SuggestTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1SuggestTrialsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1SuggestTrialsResponse](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStudyState(value: String): Self = StObject.set(x, "studyState", value.asInstanceOf[js.Any])
    
    inline def setStudyStateNull: Self = StObject.set(x, "studyState", null)
    
    inline def setStudyStateUndefined: Self = StObject.set(x, "studyState", js.undefined)
    
    inline def setTrials(value: js.Array[SchemaGoogleCloudMlV1Trial]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    inline def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    inline def setTrialsVarargs(value: SchemaGoogleCloudMlV1Trial*): Self = StObject.set(x, "trials", js.Array(value*))
  }
}
