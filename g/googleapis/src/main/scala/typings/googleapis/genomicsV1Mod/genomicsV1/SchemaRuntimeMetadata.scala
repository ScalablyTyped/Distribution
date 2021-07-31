package typings.googleapis.genomicsV1Mod.genomicsV1

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
  
  @scala.inline
  def apply(): SchemaRuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeMetadata]
  }
  
  @scala.inline
  implicit class SchemaRuntimeMetadataMutableBuilder[Self <: SchemaRuntimeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeEngine(value: SchemaComputeEngine): Self = StObject.set(x, "computeEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEngineUndefined: Self = StObject.set(x, "computeEngine", js.undefined)
  }
}
