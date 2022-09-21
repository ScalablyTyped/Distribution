package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartyDownloadaccount
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest] = js.undefined
}
object ParamsResourceRelyingpartyDownloadaccount {
  
  inline def apply(): ParamsResourceRelyingpartyDownloadaccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyDownloadaccount]
  }
  
  extension [Self <: ParamsResourceRelyingpartyDownloadaccount](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
