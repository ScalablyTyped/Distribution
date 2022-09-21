package typings.googleapis.lifesciencesV2betaMod.lifesciencesV2beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPipeline extends StObject {
  
  /**
    * The list of actions to execute, in the order they are specified.
    */
  var actions: js.UndefOr[js.Array[SchemaAction]] = js.undefined
  
  /**
    * The encrypted environment to pass into every action. Each action can also specify its own encrypted environment. The secret must decrypt to a JSON-encoded dictionary where key-value pairs serve as environment variable names and their values. The decoded environment variables can overwrite the values specified by the `environment` field.
    */
  var encryptedEnvironment: js.UndefOr[SchemaSecret] = js.undefined
  
  /**
    * The environment to pass into every action. Each action can also specify additional environment variables but cannot delete an entry from this map (though they can overwrite it with a different value).
    */
  var environment: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The resources required for execution.
    */
  var resources: js.UndefOr[SchemaResources] = js.undefined
  
  /**
    * The maximum amount of time to give the pipeline to complete. This includes the time spent waiting for a worker to be allocated. If the pipeline fails to complete before the timeout, it will be cancelled and the error code will be set to DEADLINE_EXCEEDED. If unspecified, it will default to 7 days.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
}
object SchemaPipeline {
  
  inline def apply(): SchemaPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipeline]
  }
  
  extension [Self <: SchemaPipeline](x: Self) {
    
    inline def setActions(value: js.Array[SchemaAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: SchemaAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setEncryptedEnvironment(value: SchemaSecret): Self = StObject.set(x, "encryptedEnvironment", value.asInstanceOf[js.Any])
    
    inline def setEncryptedEnvironmentUndefined: Self = StObject.set(x, "encryptedEnvironment", js.undefined)
    
    inline def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setResources(value: SchemaResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
