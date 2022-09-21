package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVerificationcodesGenerate
  extends StObject
     with StandardParameters {
  
  /**
    * Email or immutable ID of the user
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceVerificationcodesGenerate {
  
  inline def apply(): ParamsResourceVerificationcodesGenerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVerificationcodesGenerate]
  }
  
  extension [Self <: ParamsResourceVerificationcodesGenerate](x: Self) {
    
    inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
