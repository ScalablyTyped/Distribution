package typings.googleapis.v2alphaMod.cloudfunctionsV2alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFunction extends StObject {
  
  /**
    * Describes the Build step of the function that builds a container from the given source.
    */
  var buildConfig: js.UndefOr[SchemaBuildConfig] = js.undefined
  
  /**
    * User-provided description of a function.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describe whether the function is gen1 or gen2.
    */
  var environment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An Eventarc trigger managed by Google Cloud Functions that fires events in response to a condition in another service.
    */
  var eventTrigger: js.UndefOr[SchemaEventTrigger] = js.undefined
  
  /**
    * Labels associated with this Cloud Function.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * A user-defined name of the function. Function names must be unique globally and match pattern `projects/x/locations/x/functions/x`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes the Service being deployed. Currently deploys services to Cloud Run (fully managed).
    */
  var serviceConfig: js.UndefOr[SchemaServiceConfig] = js.undefined
  
  /**
    * Output only. State of the function.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State Messages for this Cloud Function.
    */
  var stateMessages: js.UndefOr[js.Array[SchemaGoogleCloudFunctionsV2alphaStateMessage]] = js.undefined
  
  /**
    * Output only. The last update timestamp of a Cloud Function.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaFunction {
  
  inline def apply(): SchemaFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFunction]
  }
  
  extension [Self <: SchemaFunction](x: Self) {
    
    inline def setBuildConfig(value: SchemaBuildConfig): Self = StObject.set(x, "buildConfig", value.asInstanceOf[js.Any])
    
    inline def setBuildConfigUndefined: Self = StObject.set(x, "buildConfig", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEventTrigger(value: SchemaEventTrigger): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
    
    inline def setEventTriggerUndefined: Self = StObject.set(x, "eventTrigger", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceConfig(value: SchemaServiceConfig): Self = StObject.set(x, "serviceConfig", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigUndefined: Self = StObject.set(x, "serviceConfig", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessages(value: js.Array[SchemaGoogleCloudFunctionsV2alphaStateMessage]): Self = StObject.set(x, "stateMessages", value.asInstanceOf[js.Any])
    
    inline def setStateMessagesUndefined: Self = StObject.set(x, "stateMessages", js.undefined)
    
    inline def setStateMessagesVarargs(value: SchemaGoogleCloudFunctionsV2alphaStateMessage*): Self = StObject.set(x, "stateMessages", js.Array(value*))
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
