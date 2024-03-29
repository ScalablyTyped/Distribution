package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementSegmentsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of segments to include in this response.
    */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /**
    * An index of the first segment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.undefined
}
object ParamsResourceManagementSegmentsList {
  
  inline def apply(): ParamsResourceManagementSegmentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementSegmentsList]
  }
  
  extension [Self <: ParamsResourceManagementSegmentsList](x: Self) {
    
    inline def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    inline def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    inline def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    inline def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
  }
}
