package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsResource extends StObject {
  
  var datasources: DatasourcesResource = js.native
  
  var searchapplications: SearchapplicationsResource = js.native
}
object SettingsResource {
  
  @scala.inline
  def apply(datasources: DatasourcesResource, searchapplications: SearchapplicationsResource): SettingsResource = {
    val __obj = js.Dynamic.literal(datasources = datasources.asInstanceOf[js.Any], searchapplications = searchapplications.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsResource]
  }
  
  @scala.inline
  implicit class SettingsResourceMutableBuilder[Self <: SettingsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasources(value: DatasourcesResource): Self = StObject.set(x, "datasources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchapplications(value: SearchapplicationsResource): Self = StObject.set(x, "searchapplications", value.asInstanceOf[js.Any])
  }
}
