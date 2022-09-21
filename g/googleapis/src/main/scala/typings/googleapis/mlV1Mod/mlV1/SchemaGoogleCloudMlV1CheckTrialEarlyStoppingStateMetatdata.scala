package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata extends StObject {
  
  /**
    * The time at which the operation was submitted.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the study that the trial belongs to.
    */
  var study: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The trial name.
    */
  var trial: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata {
  
  inline def apply(): SchemaGoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setStudy(value: String): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def setStudyNull: Self = StObject.set(x, "study", null)
    
    inline def setStudyUndefined: Self = StObject.set(x, "study", js.undefined)
    
    inline def setTrial(value: String): Self = StObject.set(x, "trial", value.asInstanceOf[js.Any])
    
    inline def setTrialNull: Self = StObject.set(x, "trial", null)
    
    inline def setTrialUndefined: Self = StObject.set(x, "trial", js.undefined)
  }
}
