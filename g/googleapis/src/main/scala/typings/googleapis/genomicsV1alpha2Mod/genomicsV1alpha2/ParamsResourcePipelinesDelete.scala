package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePipelinesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Caller must have WRITE access to the project in which this pipeline is defined.
    */
  var pipelineId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePipelinesDelete {
  
  inline def apply(): ParamsResourcePipelinesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePipelinesDelete]
  }
  
  extension [Self <: ParamsResourcePipelinesDelete](x: Self) {
    
    inline def setPipelineId(value: String): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    inline def setPipelineIdUndefined: Self = StObject.set(x, "pipelineId", js.undefined)
  }
}
