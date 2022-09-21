package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsPrivateconnectionsRoutesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Route resource to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsPrivateconnectionsRoutesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsPrivateconnectionsRoutesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsPrivateconnectionsRoutesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsPrivateconnectionsRoutesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
