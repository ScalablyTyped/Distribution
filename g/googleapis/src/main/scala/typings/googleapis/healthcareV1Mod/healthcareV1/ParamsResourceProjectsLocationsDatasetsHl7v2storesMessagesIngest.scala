package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the HL7v2 store this message belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIngestMessageRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaIngestMessageRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
