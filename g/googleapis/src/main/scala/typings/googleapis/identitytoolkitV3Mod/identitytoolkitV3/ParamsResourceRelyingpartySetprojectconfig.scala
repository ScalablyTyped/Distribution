package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartySetprojectconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartySetProjectConfigRequest] = js.undefined
}
object ParamsResourceRelyingpartySetprojectconfig {
  
  inline def apply(): ParamsResourceRelyingpartySetprojectconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartySetprojectconfig]
  }
  
  extension [Self <: ParamsResourceRelyingpartySetprojectconfig](x: Self) {
    
    inline def setRequestBody(value: SchemaIdentitytoolkitRelyingpartySetProjectConfigRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
