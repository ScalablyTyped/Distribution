package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupGroupNameResponse extends StObject {
  
  /** The [resource name](https://cloud.google.com/apis/design/resource_names) of the looked-up `Group`. */
  var name: js.UndefOr[String] = js.undefined
}
object LookupGroupNameResponse {
  
  inline def apply(): LookupGroupNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupGroupNameResponse]
  }
  
  extension [Self <: LookupGroupNameResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
