package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var dataSources: DataSourcesResource
  
  var locations: LocationsResource
  
  var transferConfigs: TransferConfigsResource
}
object ProjectsResource {
  
  inline def apply(
    dataSources: DataSourcesResource,
    locations: LocationsResource,
    transferConfigs: TransferConfigsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], transferConfigs = transferConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setDataSources(value: DataSourcesResource): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setTransferConfigs(value: TransferConfigsResource): Self = StObject.set(x, "transferConfigs", value.asInstanceOf[js.Any])
  }
}
