package typings.googleapis.datafusionV1Mod.datafusionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesDnspeeringsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the DNS peering zone to delete. Format: projects/{project\}/locations/{location\}/instances/{instance\}/dnsPeerings/{dns_peering\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesDnspeeringsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesDnspeeringsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesDnspeeringsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesDnspeeringsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
