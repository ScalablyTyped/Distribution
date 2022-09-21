package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementWebpropertyuserlinksList
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID which the given web property belongs to.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of webProperty-user Links to include in this response.
    */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /**
    * An index of the first webProperty-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.undefined
  
  /**
    * Web Property ID for the webProperty-user links to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementWebpropertyuserlinksList {
  
  inline def apply(): ParamsResourceManagementWebpropertyuserlinksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementWebpropertyuserlinksList]
  }
  
  extension [Self <: ParamsResourceManagementWebpropertyuserlinksList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    inline def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    inline def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    inline def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
