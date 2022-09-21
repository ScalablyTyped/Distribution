package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1LaunchTemplateParameters extends StObject {
  
  /**
    * The runtime environment for the job.
    */
  var environment: js.UndefOr[SchemaGoogleCloudDatapipelinesV1RuntimeEnvironment] = js.undefined
  
  /**
    * Required. The job name to use for the created job.
    */
  var jobName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The runtime parameters to pass to the job.
    */
  var parameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Map of transform name prefixes of the job to be replaced to the corresponding name prefixes of the new job. Only applicable when updating a pipeline.
    */
  var transformNameMapping: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * If set, replace the existing pipeline with the name specified by jobName with this pipeline, preserving state.
    */
  var update: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1LaunchTemplateParameters {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1LaunchTemplateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1LaunchTemplateParameters]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1LaunchTemplateParameters](x: Self) {
    
    inline def setEnvironment(value: SchemaGoogleCloudDatapipelinesV1RuntimeEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameNull: Self = StObject.set(x, "jobName", null)
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setTransformNameMapping(value: StringDictionary[String]): Self = StObject.set(x, "transformNameMapping", value.asInstanceOf[js.Any])
    
    inline def setTransformNameMappingNull: Self = StObject.set(x, "transformNameMapping", null)
    
    inline def setTransformNameMappingUndefined: Self = StObject.set(x, "transformNameMapping", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateNull: Self = StObject.set(x, "update", null)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
