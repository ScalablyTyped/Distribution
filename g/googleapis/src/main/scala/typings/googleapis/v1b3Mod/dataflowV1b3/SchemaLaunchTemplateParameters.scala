package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLaunchTemplateParameters extends StObject {
  
  /**
    * The runtime environment for the job.
    */
  var environment: js.UndefOr[SchemaRuntimeEnvironment] = js.undefined
  
  /**
    * Required. The job name to use for the created job. The name must match the regular expression `[a-z]([-a-z0-9]{0,1022\}[a-z0-9])?`
    */
  var jobName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The runtime parameters to pass to the job.
    */
  var parameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced to the corresponding name prefixes of the new job.
    */
  var transformNameMapping: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * If set, replace the existing pipeline with the name specified by jobName with this pipeline, preserving state.
    */
  var update: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaLaunchTemplateParameters {
  
  inline def apply(): SchemaLaunchTemplateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchTemplateParameters]
  }
  
  extension [Self <: SchemaLaunchTemplateParameters](x: Self) {
    
    inline def setEnvironment(value: SchemaRuntimeEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
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
