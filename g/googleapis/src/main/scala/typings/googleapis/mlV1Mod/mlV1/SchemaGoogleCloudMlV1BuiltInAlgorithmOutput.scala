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
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1BuiltInAlgorithmOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1BuiltInAlgorithmOutputMutableBuilder[Self <: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    @scala.inline
    def setModelPath(value: String): Self = StObject.set(x, "modelPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPathUndefined: Self = StObject.set(x, "modelPath", js.undefined)
    
    @scala.inline
    def setPythonVersion(value: String): Self = StObject.set(x, "pythonVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPythonVersionUndefined: Self = StObject.set(x, "pythonVersion", js.undefined)
    
    @scala.inline
    def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
  }
}
