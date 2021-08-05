package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Runtime metadata that will be populated in the runtimeMetadata field of the
  * Operation associated with a RunPipeline execution.
  */
trait SchemaRuntimeMetadata extends StObject {
  
  /**
    * Execution information specific to Google Compute Engine.
    */
  var computeEngine: js.UndefOr[SchemaComputeEngine] = js.undefined
}
object SchemaRuntimeMetadata {
  
  inline def apply(): SchemaRuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeMetadata]
  }
  
  extension [Self <: SchemaRuntimeMetadata](x: Self) {
    
    inline def setComputeEngine(value: SchemaComputeEngine): Self = StObject.set(x, "computeEngine", value.asInstanceOf[js.Any])
    
    inline def setComputeEngineUndefined: Self = StObject.set(x, "computeEngine", js.undefined)
  }
}
