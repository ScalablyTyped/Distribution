package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var dataSources: DataSourcesResource = js.native
  
  var locations: LocationsResource = js.native
  
  var transferConfigs: TransferConfigsResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(
    dataSources: DataSourcesResource,
    locations: LocationsResource,
    transferConfigs: TransferConfigsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], transferConfigs = transferConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSources(value: DataSourcesResource): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferConfigs(value: TransferConfigsResource): Self = StObject.set(x, "transferConfigs", value.asInstanceOf[js.Any])
  }
}
