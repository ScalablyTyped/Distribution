package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAspsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The unique ID of the ASP.
    */
  var codeId: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceAspsGet {
  
  inline def apply(): ParamsResourceAspsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAspsGet]
  }
  
  extension [Self <: ParamsResourceAspsGet](x: Self) {
    
    inline def setCodeId(value: Double): Self = StObject.set(x, "codeId", value.asInstanceOf[js.Any])
    
    inline def setCodeIdUndefined: Self = StObject.set(x, "codeId", js.undefined)
    
    inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
