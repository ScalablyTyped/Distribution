package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupMembershipNameResponse extends StObject {
  
  /** The [resource name](https://cloud.google.com/apis/design/resource_names) of the looked-up `Membership`. Must be of the form `groups/{group}/memberships/{membership}`. */
  var name: js.UndefOr[String] = js.undefined
}
object LookupMembershipNameResponse {
  
  inline def apply(): LookupMembershipNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupMembershipNameResponse]
  }
  
  extension [Self <: LookupMembershipNameResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
