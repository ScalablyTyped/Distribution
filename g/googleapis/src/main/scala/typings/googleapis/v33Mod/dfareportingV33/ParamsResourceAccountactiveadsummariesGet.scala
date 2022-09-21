package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountactiveadsummariesGet
  extends StObject
     with StandardParameters {
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Account ID.
    */
  var summaryAccountId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountactiveadsummariesGet {
  
  inline def apply(): ParamsResourceAccountactiveadsummariesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountactiveadsummariesGet]
  }
  
  extension [Self <: ParamsResourceAccountactiveadsummariesGet](x: Self) {
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setSummaryAccountId(value: String): Self = StObject.set(x, "summaryAccountId", value.asInstanceOf[js.Any])
    
    inline def setSummaryAccountIdUndefined: Self = StObject.set(x, "summaryAccountId", js.undefined)
  }
}
