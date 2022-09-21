package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementAccountsummariesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of account summaries to include in this response, where the largest acceptable value is 1000.
    */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /**
    * An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.undefined
}
object ParamsResourceManagementAccountsummariesList {
  
  inline def apply(): ParamsResourceManagementAccountsummariesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementAccountsummariesList]
  }
  
  extension [Self <: ParamsResourceManagementAccountsummariesList](x: Self) {
    
    inline def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    inline def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    inline def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    inline def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
  }
}
