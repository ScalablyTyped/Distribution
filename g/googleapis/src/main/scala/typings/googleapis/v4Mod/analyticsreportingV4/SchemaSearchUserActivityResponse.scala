package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchUserActivityResponse extends StObject {
  
  /**
    * This token should be passed to [SearchUserActivityRequest](#SearchUserActivityRequest) to retrieve the next page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field represents the [sampling rate](https://support.google.com/analytics/answer/2637192) for the given request and is a number between 0.0 to 1.0. See [developer guide](/analytics/devguides/reporting/core/v4/basics#sampling) for details.
    */
  var sampleRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Each record represents a session (device details, duration, etc).
    */
  var sessions: js.UndefOr[js.Array[SchemaUserActivitySession]] = js.undefined
  
  /**
    * Total rows returned by this query (across different pages).
    */
  var totalRows: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSearchUserActivityResponse {
  
  inline def apply(): SchemaSearchUserActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchUserActivityResponse]
  }
  
  extension [Self <: SchemaSearchUserActivityResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateNull: Self = StObject.set(x, "sampleRate", null)
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setSessions(value: js.Array[SchemaUserActivitySession]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    inline def setSessionsVarargs(value: SchemaUserActivitySession*): Self = StObject.set(x, "sessions", js.Array(value*))
    
    inline def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    inline def setTotalRowsNull: Self = StObject.set(x, "totalRows", null)
    
    inline def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
  }
}
