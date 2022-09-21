package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateFailureState extends StObject {
  
  /**
    * Details about the last failed update attempt.
    */
  var details: js.UndefOr[String | Null] = js.undefined
  
  /**
    * What the component configuration would have been if the update had succeeded.
    */
  var failedConfiguration: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Time of the latest failed update attempt.
    */
  var lastUpdateAttempt: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateFailureState {
  
  inline def apply(): SchemaUpdateFailureState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateFailureState]
  }
  
  extension [Self <: SchemaUpdateFailureState](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setFailedConfiguration(value: StringDictionary[Any]): Self = StObject.set(x, "failedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFailedConfigurationNull: Self = StObject.set(x, "failedConfiguration", null)
    
    inline def setFailedConfigurationUndefined: Self = StObject.set(x, "failedConfiguration", js.undefined)
    
    inline def setLastUpdateAttempt(value: String): Self = StObject.set(x, "lastUpdateAttempt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateAttemptNull: Self = StObject.set(x, "lastUpdateAttempt", null)
    
    inline def setLastUpdateAttemptUndefined: Self = StObject.set(x, "lastUpdateAttempt", js.undefined)
  }
}
