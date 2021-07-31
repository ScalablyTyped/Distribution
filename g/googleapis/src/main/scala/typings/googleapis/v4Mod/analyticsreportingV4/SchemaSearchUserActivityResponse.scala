package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from `userActivity:get` call.
  */
trait SchemaSearchUserActivityResponse extends StObject {
  
  /**
    * This token should be passed to
    * [SearchUserActivityRequest](#SearchUserActivityRequest) to retrieve the
    * next page.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * This field represents the [sampling
    * rate](https://support.google.com/analytics/answer/2637192) for the given
    * request and is a number between 0.0 to 1.0. See [developer
    * guide](/analytics/devguides/reporting/core/v4/basics#sampling) for
    * details.
    */
  var sampleRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Each record represents a session (device details, duration, etc).
    */
  var sessions: js.UndefOr[js.Array[SchemaUserActivitySession]] = js.undefined
  
  /**
    * Total rows returned by this query (across different pages).
    */
  var totalRows: js.UndefOr[Double] = js.undefined
}
object SchemaSearchUserActivityResponse {
  
  @scala.inline
  def apply(): SchemaSearchUserActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchUserActivityResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchUserActivityResponseMutableBuilder[Self <: SchemaSearchUserActivityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    @scala.inline
    def setSessions(value: js.Array[SchemaUserActivitySession]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    @scala.inline
    def setSessionsVarargs(value: SchemaUserActivitySession*): Self = StObject.set(x, "sessions", js.Array(value :_*))
    
    @scala.inline
    def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
  }
}
