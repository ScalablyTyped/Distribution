package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Async options that determine when a resource should finish.
  */
trait SchemaAsyncOptions extends StObject {
  
  /**
    * Method regex where this policy will apply.
    */
  var methodMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Deployment manager will poll instances for this API resource setting a
    * RUNNING state, and blocking until polling conditions tell whether the
    * resource is completed or failed.
    */
  var pollingOptions: js.UndefOr[SchemaPollingOptions] = js.undefined
}
object SchemaAsyncOptions {
  
  @scala.inline
  def apply(): SchemaAsyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncOptions]
  }
  
  @scala.inline
  implicit class SchemaAsyncOptionsMutableBuilder[Self <: SchemaAsyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethodMatch(value: String): Self = StObject.set(x, "methodMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodMatchUndefined: Self = StObject.set(x, "methodMatch", js.undefined)
    
    @scala.inline
    def setPollingOptions(value: SchemaPollingOptions): Self = StObject.set(x, "pollingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingOptionsUndefined: Self = StObject.set(x, "pollingOptions", js.undefined)
  }
}
