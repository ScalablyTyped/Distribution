package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
