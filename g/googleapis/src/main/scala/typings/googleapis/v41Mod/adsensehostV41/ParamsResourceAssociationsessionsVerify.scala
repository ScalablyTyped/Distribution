package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAssociationsessionsVerify
  extends StObject
     with StandardParameters {
  
  /**
    * The token returned to the association callback URL.
    */
  var token: js.UndefOr[String] = js.undefined
}
object ParamsResourceAssociationsessionsVerify {
  
  inline def apply(): ParamsResourceAssociationsessionsVerify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssociationsessionsVerify]
  }
  
  extension [Self <: ParamsResourceAssociationsessionsVerify](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
