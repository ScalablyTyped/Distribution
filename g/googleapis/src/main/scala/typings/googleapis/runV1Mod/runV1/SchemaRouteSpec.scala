package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouteSpec extends StObject {
  
  /**
    * Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations. Cloud Run currently supports a single configurationName.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.undefined
}
object SchemaRouteSpec {
  
  inline def apply(): SchemaRouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteSpec]
  }
  
  extension [Self <: SchemaRouteSpec](x: Self) {
    
    inline def setTraffic(value: js.Array[SchemaTrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    inline def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    inline def setTrafficVarargs(value: SchemaTrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value*))
  }
}
