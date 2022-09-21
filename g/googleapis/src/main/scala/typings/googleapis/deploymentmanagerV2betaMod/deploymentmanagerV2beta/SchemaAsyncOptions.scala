package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAsyncOptions extends StObject {
  
  /**
    * Method regex where this policy will apply.
    */
  var methodMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deployment manager will poll instances for this API resource setting a RUNNING state, and blocking until polling conditions tell whether the resource is completed or failed.
    */
  var pollingOptions: js.UndefOr[SchemaPollingOptions] = js.undefined
}
object SchemaAsyncOptions {
  
  inline def apply(): SchemaAsyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncOptions]
  }
  
  extension [Self <: SchemaAsyncOptions](x: Self) {
    
    inline def setMethodMatch(value: String): Self = StObject.set(x, "methodMatch", value.asInstanceOf[js.Any])
    
    inline def setMethodMatchNull: Self = StObject.set(x, "methodMatch", null)
    
    inline def setMethodMatchUndefined: Self = StObject.set(x, "methodMatch", js.undefined)
    
    inline def setPollingOptions(value: SchemaPollingOptions): Self = StObject.set(x, "pollingOptions", value.asInstanceOf[js.Any])
    
    inline def setPollingOptionsUndefined: Self = StObject.set(x, "pollingOptions", js.undefined)
  }
}
