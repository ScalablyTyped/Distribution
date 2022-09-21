package typings.knuddelsUserappBackendApi.anon

import typings.knuddelsUserappBackendApi.mod.global.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetUsers extends StObject {
  
  var maximumValue: js.UndefOr[Double] = js.undefined
  
  var minimumValue: js.UndefOr[Double] = js.undefined
  
  var targetUsers: js.UndefOr[js.Array[User]] = js.undefined
}
object TargetUsers {
  
  inline def apply(): TargetUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetUsers]
  }
  
  extension [Self <: TargetUsers](x: Self) {
    
    inline def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    inline def setTargetUsers(value: js.Array[User]): Self = StObject.set(x, "targetUsers", value.asInstanceOf[js.Any])
    
    inline def setTargetUsersUndefined: Self = StObject.set(x, "targetUsers", js.undefined)
    
    inline def setTargetUsersVarargs(value: User*): Self = StObject.set(x, "targetUsers", js.Array(value*))
  }
}
