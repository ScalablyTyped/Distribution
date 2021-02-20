package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RouteSpec holds the desired state of the Route (from the client).
  */
@js.native
trait SchemaRouteSpec extends StObject {
  
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  
  /**
    * Traffic specifies how to distribute traffic over a collection of Knative
    * Revisions and Configurations. Cloud Run currently supports a single
    * configurationName.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.native
}
object SchemaRouteSpec {
  
  @scala.inline
  def apply(): SchemaRouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteSpec]
  }
  
  @scala.inline
  implicit class SchemaRouteSpecMutableBuilder[Self <: SchemaRouteSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setTraffic(value: js.Array[SchemaTrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    @scala.inline
    def setTrafficVarargs(value: SchemaTrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value :_*))
  }
}
