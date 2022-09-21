package typings.googleapis.policysimulatorV1Mod.policysimulatorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1ListReplayResultsResponse extends StObject {
  
  /**
    * A token that you can use to retrieve the next page of ReplayResult objects. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The results of running a Replay.
    */
  var replayResults: js.UndefOr[js.Array[SchemaGoogleCloudPolicysimulatorV1ReplayResult]] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1ListReplayResultsResponse {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1ListReplayResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1ListReplayResultsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1ListReplayResultsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReplayResults(value: js.Array[SchemaGoogleCloudPolicysimulatorV1ReplayResult]): Self = StObject.set(x, "replayResults", value.asInstanceOf[js.Any])
    
    inline def setReplayResultsUndefined: Self = StObject.set(x, "replayResults", js.undefined)
    
    inline def setReplayResultsVarargs(value: SchemaGoogleCloudPolicysimulatorV1ReplayResult*): Self = StObject.set(x, "replayResults", js.Array(value*))
  }
}
