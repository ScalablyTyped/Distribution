package typings.hapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptionsAccessEntityObject
  extends StObject
     with _RouteOptionsAccessObject {
  
  var entity: RouteOptionsAccessEntity
}
object RouteOptionsAccessEntityObject {
  
  inline def apply(entity: RouteOptionsAccessEntity): RouteOptionsAccessEntityObject = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsAccessEntityObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteOptionsAccessEntityObject] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: RouteOptionsAccessEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
  }
}
