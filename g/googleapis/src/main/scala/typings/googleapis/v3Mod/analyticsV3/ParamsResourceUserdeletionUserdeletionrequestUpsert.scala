package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUserdeletionUserdeletionrequestUpsert
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUserDeletionRequest] = js.undefined
}
object ParamsResourceUserdeletionUserdeletionrequestUpsert {
  
  inline def apply(): ParamsResourceUserdeletionUserdeletionrequestUpsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserdeletionUserdeletionrequestUpsert]
  }
  
  extension [Self <: ParamsResourceUserdeletionUserdeletionrequestUpsert](x: Self) {
    
    inline def setRequestBody(value: SchemaUserDeletionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
