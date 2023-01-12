package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersResource extends StObject {
  
  var environments: EnvironmentsResource
}
object UsersResource {
  
  inline def apply(environments: EnvironmentsResource): UsersResource = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsersResource] (val x: Self) extends AnyVal {
    
    inline def setEnvironments(value: EnvironmentsResource): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
  }
}
