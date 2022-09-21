package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementExperimentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to which the experiment belongs
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the experiment to delete
    */
  var experimentId: js.UndefOr[String] = js.undefined
  
  /**
    * View (Profile) ID to which the experiment belongs
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID to which the experiment belongs
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementExperimentsDelete {
  
  inline def apply(): ParamsResourceManagementExperimentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementExperimentsDelete]
  }
  
  extension [Self <: ParamsResourceManagementExperimentsDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setExperimentId(value: String): Self = StObject.set(x, "experimentId", value.asInstanceOf[js.Any])
    
    inline def setExperimentIdUndefined: Self = StObject.set(x, "experimentId", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
