package typings.googleapis.policysimulatorV1Mod.policysimulatorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReplaysGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Replay to retrieve, in the following format: `{projects|folders|organizations\}/{resource-id\}/locations/global/replays/{replay-id\}`, where `{resource-id\}` is the ID of the project, folder, or organization that owns the `Replay`. Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsReplaysGet {
  
  inline def apply(): ParamsResourceProjectsLocationsReplaysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReplaysGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReplaysGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
