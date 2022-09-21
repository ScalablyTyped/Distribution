package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the DatacenterConnector.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
