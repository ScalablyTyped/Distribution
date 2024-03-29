package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRemarketinglistsharesGet
  extends StObject
     with StandardParameters {
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Remarketing list ID.
    */
  var remarketingListId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRemarketinglistsharesGet {
  
  inline def apply(): ParamsResourceRemarketinglistsharesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRemarketinglistsharesGet]
  }
  
  extension [Self <: ParamsResourceRemarketinglistsharesGet](x: Self) {
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setRemarketingListId(value: String): Self = StObject.set(x, "remarketingListId", value.asInstanceOf[js.Any])
    
    inline def setRemarketingListIdUndefined: Self = StObject.set(x, "remarketingListId", js.undefined)
  }
}
