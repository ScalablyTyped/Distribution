package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleBatchcreatecontacts
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchCreateContactsRequest] = js.undefined
}
object ParamsResourcePeopleBatchcreatecontacts {
  
  inline def apply(): ParamsResourcePeopleBatchcreatecontacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleBatchcreatecontacts]
  }
  
  extension [Self <: ParamsResourcePeopleBatchcreatecontacts](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchCreateContactsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
