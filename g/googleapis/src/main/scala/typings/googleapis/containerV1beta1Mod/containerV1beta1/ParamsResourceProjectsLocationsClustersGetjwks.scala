package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClustersGetjwks
  extends StObject
     with StandardParameters {
  
  /**
    * The cluster (project, location, cluster name) to get keys for. Specified in the format `projects/x/locations/x/clusters/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsClustersGetjwks {
  
  inline def apply(): ParamsResourceProjectsLocationsClustersGetjwks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersGetjwks]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClustersGetjwks](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
