package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceSelector extends StObject {
  
  /**
    * Required. The [full resource name] (https://cloud.google.com/asset-inventory/docs/resource-name-format) of a resource of [supported resource
    * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#analyzable_asset_types).
    */
  var fullResourceName: js.UndefOr[String] = js.native
}
object ResourceSelector {
  
  @scala.inline
  def apply(): ResourceSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSelector]
  }
  
  @scala.inline
  implicit class ResourceSelectorMutableBuilder[Self <: ResourceSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
