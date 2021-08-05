package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for manually scaling a model.
  */
trait SchemaGoogleCloudMlV1ManualScaling extends StObject {
  
  /**
    * The number of nodes to allocate for this model. These nodes are always
    * up, starting from the time the model is deployed, so the cost of
    * operating this model will be proportional to `nodes` * number of hours
    * since last billing cycle plus the cost for each prediction performed.
    */
  var nodes: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudMlV1ManualScaling {
  
  inline def apply(): SchemaGoogleCloudMlV1ManualScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ManualScaling]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ManualScaling](x: Self) {
    
    inline def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
  }
}
