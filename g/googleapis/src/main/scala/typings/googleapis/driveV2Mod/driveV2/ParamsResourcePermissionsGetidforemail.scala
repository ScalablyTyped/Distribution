package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePermissionsGetidforemail
  extends StObject
     with StandardParameters {
  
  /**
    * The email address for which to return a permission ID
    */
  var email: js.UndefOr[String] = js.undefined
}
object ParamsResourcePermissionsGetidforemail {
  
  inline def apply(): ParamsResourcePermissionsGetidforemail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePermissionsGetidforemail]
  }
  
  extension [Self <: ParamsResourcePermissionsGetidforemail](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
