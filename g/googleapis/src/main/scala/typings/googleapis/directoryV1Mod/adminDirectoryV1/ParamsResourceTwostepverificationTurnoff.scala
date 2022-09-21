package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTwostepverificationTurnoff
  extends StObject
     with StandardParameters {
  
  /**
    * Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceTwostepverificationTurnoff {
  
  inline def apply(): ParamsResourceTwostepverificationTurnoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTwostepverificationTurnoff]
  }
  
  extension [Self <: ParamsResourceTwostepverificationTurnoff](x: Self) {
    
    inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
