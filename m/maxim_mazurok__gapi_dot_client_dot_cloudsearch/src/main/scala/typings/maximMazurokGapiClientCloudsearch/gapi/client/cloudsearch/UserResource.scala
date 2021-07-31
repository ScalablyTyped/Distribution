package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserResource extends StObject {
  
  var searchapplications: SearchapplicationsResource
}
object UserResource {
  
  @scala.inline
  def apply(searchapplications: SearchapplicationsResource): UserResource = {
    val __obj = js.Dynamic.literal(searchapplications = searchapplications.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserResource]
  }
  
  @scala.inline
  implicit class UserResourceMutableBuilder[Self <: UserResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchapplications(value: SearchapplicationsResource): Self = StObject.set(x, "searchapplications", value.asInstanceOf[js.Any])
  }
}
