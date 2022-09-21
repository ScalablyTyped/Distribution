package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleBatchupdatecontacts
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchUpdateContactsRequest] = js.undefined
}
object ParamsResourcePeopleBatchupdatecontacts {
  
  inline def apply(): ParamsResourcePeopleBatchupdatecontacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleBatchupdatecontacts]
  }
  
  extension [Self <: ParamsResourcePeopleBatchupdatecontacts](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchUpdateContactsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
