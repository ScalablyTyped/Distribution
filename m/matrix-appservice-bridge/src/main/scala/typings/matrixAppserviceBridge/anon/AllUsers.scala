package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllUsers extends StObject {
  
  var allUsers: Double
  
  var privateUsers: Double
}
object AllUsers {
  
  inline def apply(allUsers: Double, privateUsers: Double): AllUsers = {
    val __obj = js.Dynamic.literal(allUsers = allUsers.asInstanceOf[js.Any], privateUsers = privateUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllUsers]
  }
  
  extension [Self <: AllUsers](x: Self) {
    
    inline def setAllUsers(value: Double): Self = StObject.set(x, "allUsers", value.asInstanceOf[js.Any])
    
    inline def setPrivateUsers(value: Double): Self = StObject.set(x, "privateUsers", value.asInstanceOf[js.Any])
  }
}
