package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.user
import typings.intercomClient.userMod.UserIdentifier
import typings.intercomClient.visitorMod.VisitorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var identifier: VisitorIdentifier
  
  var `type`: user
  
  var user: UserIdentifier
}
object Type {
  
  @scala.inline
  def apply(identifier: VisitorIdentifier, user: UserIdentifier): Type = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("user")
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: VisitorIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: user): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserIdentifier): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
