package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleBatchdeletecontacts
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchDeleteContactsRequest] = js.undefined
}
object ParamsResourcePeopleBatchdeletecontacts {
  
  inline def apply(): ParamsResourcePeopleBatchdeletecontacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleBatchdeletecontacts]
  }
  
  extension [Self <: ParamsResourcePeopleBatchdeletecontacts](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchDeleteContactsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
