package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersThreadsUntrash
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the thread to remove from Trash.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The user's email address. The special value `me` can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersThreadsUntrash {
  
  inline def apply(): ParamsResourceUsersThreadsUntrash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersThreadsUntrash]
  }
  
  extension [Self <: ParamsResourceUsersThreadsUntrash](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
