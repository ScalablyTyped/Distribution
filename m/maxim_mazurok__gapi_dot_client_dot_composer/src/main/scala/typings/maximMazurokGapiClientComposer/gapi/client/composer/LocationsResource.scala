package typings.maximMazurokGapiClientComposer.gapi.client.composer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var environments: EnvironmentsResource = js.native
  
  var imageVersions: ImageVersionsResource = js.native
  
  var operations: OperationsResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(
    environments: EnvironmentsResource,
    imageVersions: ImageVersionsResource,
    operations: OperationsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any], imageVersions = imageVersions.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
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
    def setEnvironments(value: EnvironmentsResource): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersions(value: ImageVersionsResource): Self = this.set("imageVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
  }
}
