package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumValue extends StObject {
  
  var maximumValue: js.UndefOr[Double] = js.undefined
  
  var minimumValue: js.UndefOr[Double] = js.undefined
  
  var targetUsers: js.UndefOr[js.Array[User]] = js.undefined
}
object MinimumValue {
  
  inline def apply(): MinimumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinimumValue] (val x: Self) extends AnyVal {
    
    inline def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    inline def setTargetUsers(value: js.Array[User]): Self = StObject.set(x, "targetUsers", value.asInstanceOf[js.Any])
    
    inline def setTargetUsersUndefined: Self = StObject.set(x, "targetUsers", js.undefined)
    
    inline def setTargetUsersVarargs(value: User*): Self = StObject.set(x, "targetUsers", js.Array(value*))
  }
}
