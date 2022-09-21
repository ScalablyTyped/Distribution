package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1BuiltInAlgorithmOutput extends StObject {
  
  /**
    * Framework on which the built-in algorithm was trained.
    */
  var framework: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Cloud Storage path to the `model/` directory where the training job saves the trained model. Only set for successful jobs that don't use hyperparameter tuning.
    */
  var modelPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Python version on which the built-in algorithm was trained.
    */
  var pythonVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * AI Platform runtime version on which the built-in algorithm was trained.
    */
  var runtimeVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1BuiltInAlgorithmOutput {
  
  inline def apply(): SchemaGoogleCloudMlV1BuiltInAlgorithmOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput](x: Self) {
    
    inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkNull: Self = StObject.set(x, "framework", null)
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    inline def setModelPath(value: String): Self = StObject.set(x, "modelPath", value.asInstanceOf[js.Any])
    
    inline def setModelPathNull: Self = StObject.set(x, "modelPath", null)
    
    inline def setModelPathUndefined: Self = StObject.set(x, "modelPath", js.undefined)
    
    inline def setPythonVersion(value: String): Self = StObject.set(x, "pythonVersion", value.asInstanceOf[js.Any])
    
    inline def setPythonVersionNull: Self = StObject.set(x, "pythonVersion", null)
    
    inline def setPythonVersionUndefined: Self = StObject.set(x, "pythonVersion", js.undefined)
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionNull: Self = StObject.set(x, "runtimeVersion", null)
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
  }
}
