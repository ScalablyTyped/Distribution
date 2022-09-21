package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget
  extends StObject
     with StandardParameters {
  
  /**
    * The resource id of the HL7v2 messages to retrieve in the format: `{message_id\}`, where the full resource name is `{parent\}/messages/{message_id\}` A maximum of 100 messages can be retrieved in a batch. All 'ids' have to be under parent.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Name of the HL7v2 store to retrieve messages from, in the format: `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/hl7v2Stores/{hl7v2_store_id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the parts of the Messages resource to return in the response. When unspecified, equivalent to BASIC.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget](x: Self) {
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
