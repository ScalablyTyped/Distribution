package typings.googleapis.policysimulatorV1beta1Mod.policysimulatorV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1Replay extends StObject {
  
  /**
    * Required. The configuration used for the `Replay`.
    */
  var config: js.UndefOr[SchemaGoogleCloudPolicysimulatorV1ReplayConfig] = js.undefined
  
  /**
    * Output only. The resource name of the `Replay`, which has the following format: `{projects|folders|organizations\}/{resource-id\}/locations/global/replays/{replay-id\}`, where `{resource-id\}` is the ID of the project, folder, or organization that owns the Replay. Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Summary statistics about the replayed log entries.
    */
  var resultsSummary: js.UndefOr[SchemaGoogleCloudPolicysimulatorV1ReplayResultsSummary] = js.undefined
  
  /**
    * Output only. The current state of the `Replay`.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1Replay {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1Replay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1Replay]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1Replay](x: Self) {
    
    inline def setConfig(value: SchemaGoogleCloudPolicysimulatorV1ReplayConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResultsSummary(value: SchemaGoogleCloudPolicysimulatorV1ReplayResultsSummary): Self = StObject.set(x, "resultsSummary", value.asInstanceOf[js.Any])
    
    inline def setResultsSummaryUndefined: Self = StObject.set(x, "resultsSummary", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
