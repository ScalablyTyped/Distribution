package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsResource extends js.Object {
  
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
  implicit class SettingsResourceOps[Self <: SettingsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatasources(value: DatasourcesResource): Self = this.set("datasources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchapplications(value: SearchapplicationsResource): Self = this.set("searchapplications", value.asInstanceOf[js.Any])
  }
}
