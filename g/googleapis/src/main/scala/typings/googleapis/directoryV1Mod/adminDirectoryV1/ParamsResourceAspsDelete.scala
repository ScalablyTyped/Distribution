package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAspsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The unique ID of the ASP to be deleted.
    */
  var codeId: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceAspsDelete {
  
  inline def apply(): ParamsResourceAspsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAspsDelete]
  }
  
  extension [Self <: ParamsResourceAspsDelete](x: Self) {
    
    inline def setCodeId(value: Double): Self = StObject.set(x, "codeId", value.asInstanceOf[js.Any])
    
    inline def setCodeIdUndefined: Self = StObject.set(x, "codeId", js.undefined)
    
    inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
