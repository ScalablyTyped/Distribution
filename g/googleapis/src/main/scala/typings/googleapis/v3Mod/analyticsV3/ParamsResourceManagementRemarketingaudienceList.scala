package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementRemarketingaudienceList
  extends StObject
     with StandardParameters {
  
  /**
    * The account ID of the remarketing audiences to retrieve.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of remarketing audiences to include in this response.
    */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /**
    * An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.undefined
  
  /**
    *
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The web property ID of the remarketing audiences to retrieve.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementRemarketingaudienceList {
  
  inline def apply(): ParamsResourceManagementRemarketingaudienceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementRemarketingaudienceList]
  }
  
  extension [Self <: ParamsResourceManagementRemarketingaudienceList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    inline def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    inline def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    inline def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
