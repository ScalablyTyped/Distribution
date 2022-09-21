package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRelyingpartyGetprojectconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Delegated GCP project number of the request.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  
  /**
    * GCP project number of the request.
    */
  var projectNumber: js.UndefOr[String] = js.undefined
}
object ParamsResourceRelyingpartyGetprojectconfig {
  
  inline def apply(): ParamsResourceRelyingpartyGetprojectconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyGetprojectconfig]
  }
  
  extension [Self <: ParamsResourceRelyingpartyGetprojectconfig](x: Self) {
    
    inline def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    inline def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    inline def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
  }
}
