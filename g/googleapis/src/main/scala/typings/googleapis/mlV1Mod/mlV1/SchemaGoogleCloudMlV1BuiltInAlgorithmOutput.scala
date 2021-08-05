package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents output related to a built-in algorithm Job.
  */
trait SchemaGoogleCloudMlV1BuiltInAlgorithmOutput extends StObject {
  
  /**
    * Framework on which the built-in algorithm was trained on.
    */
  var framework: js.UndefOr[String] = js.undefined
  
  /**
    * Built-in algorithm&#39;s saved model path. Only set for non-hptuning
    * succeeded jobs.
    */
  var modelPath: js.UndefOr[String] = js.undefined
  
  /**
    * Python version on which the built-in algorithm was trained on.
    */
  var pythonVersion: js.UndefOr[String] = js.undefined
  
  /**
    * CMLE runtime version on which the built-in algorithm was trained on.
    */
  var runtimeVersion: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudMlV1BuiltInAlgorithmOutput {
  
  inline def apply(): SchemaGoogleCloudMlV1BuiltInAlgorithmOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput](x: Self) {
    
    inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    inline def setModelPath(value: String): Self = StObject.set(x, "modelPath", value.asInstanceOf[js.Any])
    
    inline def setModelPathUndefined: Self = StObject.set(x, "modelPath", js.undefined)
    
    inline def setPythonVersion(value: String): Self = StObject.set(x, "pythonVersion", value.asInstanceOf[js.Any])
    
    inline def setPythonVersionUndefined: Self = StObject.set(x, "pythonVersion", js.undefined)
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
  }
}
