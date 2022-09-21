package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePresentationsBatchupdate
  extends StObject
     with StandardParameters {
  
  /**
    * The presentation to apply the updates to.
    */
  var presentationId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchUpdatePresentationRequest] = js.undefined
}
object ParamsResourcePresentationsBatchupdate {
  
  inline def apply(): ParamsResourcePresentationsBatchupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePresentationsBatchupdate]
  }
  
  extension [Self <: ParamsResourcePresentationsBatchupdate](x: Self) {
    
    inline def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
    
    inline def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchUpdatePresentationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
