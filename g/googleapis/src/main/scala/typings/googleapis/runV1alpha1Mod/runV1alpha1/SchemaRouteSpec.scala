package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RouteSpec holds the desired state of the Route (from the client).
  */
trait SchemaRouteSpec extends StObject {
  
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.undefined
  
  /**
    * Traffic specifies how to distribute traffic over a collection of Knative
    * Revisions and Configurations. Cloud Run currently supports a single
    * configurationName.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.undefined
}
object SchemaRouteSpec {
  
  inline def apply(): SchemaRouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteSpec]
  }
  
  extension [Self <: SchemaRouteSpec](x: Self) {
    
    inline def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setTraffic(value: js.Array[SchemaTrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    inline def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    inline def setTrafficVarargs(value: SchemaTrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value :_*))
  }
}
