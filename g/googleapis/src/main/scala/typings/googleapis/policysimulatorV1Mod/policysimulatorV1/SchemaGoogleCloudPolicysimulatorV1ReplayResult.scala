package typings.googleapis.policysimulatorV1Mod.policysimulatorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1ReplayResult extends StObject {
  
  /**
    * The access tuple that was replayed. This field includes information about the principal, resource, and permission that were involved in the access attempt.
    */
  var accessTuple: js.UndefOr[SchemaGoogleCloudPolicysimulatorV1AccessTuple] = js.undefined
  
  /**
    * The difference between the principal's access under the current (baseline) policies and the principal's access under the proposed (simulated) policies. This field is only included for access tuples that were successfully replayed and had different results under the current policies and the proposed policies.
    */
  var diff: js.UndefOr[SchemaGoogleCloudPolicysimulatorV1ReplayDiff] = js.undefined
  
  /**
    * The error that caused the access tuple replay to fail. This field is only included for access tuples that were not replayed successfully.
    */
  var error: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * The latest date this access tuple was seen in the logs.
    */
  var lastSeenDate: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * The resource name of the `ReplayResult`, in the following format: `{projects|folders|organizations\}/{resource-id\}/locations/global/replays/{replay-id\}/results/{replay-result-id\}`, where `{resource-id\}` is the ID of the project, folder, or organization that owns the Replay. Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36/results/1234`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Replay that the access tuple was included in.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1ReplayResult {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1ReplayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1ReplayResult]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1ReplayResult](x: Self) {
    
    inline def setAccessTuple(value: SchemaGoogleCloudPolicysimulatorV1AccessTuple): Self = StObject.set(x, "accessTuple", value.asInstanceOf[js.Any])
    
    inline def setAccessTupleUndefined: Self = StObject.set(x, "accessTuple", js.undefined)
    
    inline def setDiff(value: SchemaGoogleCloudPolicysimulatorV1ReplayDiff): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
    
    inline def setError(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLastSeenDate(value: SchemaGoogleTypeDate): Self = StObject.set(x, "lastSeenDate", value.asInstanceOf[js.Any])
    
    inline def setLastSeenDateUndefined: Self = StObject.set(x, "lastSeenDate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
