package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsResource extends StObject {
  
  var datasources: DatasourcesResource
  
  var searchapplications: SearchapplicationsResource
}
object SettingsResource {
  
  inline def apply(datasources: DatasourcesResource, searchapplications: SearchapplicationsResource): SettingsResource = {
    val __obj = js.Dynamic.literal(datasources = datasources.asInstanceOf[js.Any], searchapplications = searchapplications.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsResource]
  }
  
  extension [Self <: SettingsResource](x: Self) {
    
    inline def setDatasources(value: DatasourcesResource): Self = StObject.set(x, "datasources", value.asInstanceOf[js.Any])
    
    inline def setSearchapplications(value: SearchapplicationsResource): Self = StObject.set(x, "searchapplications", value.asInstanceOf[js.Any])
  }
}
