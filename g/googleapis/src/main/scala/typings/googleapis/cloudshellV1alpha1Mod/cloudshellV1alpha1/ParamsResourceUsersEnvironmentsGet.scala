package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersEnvironmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the requested resource, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersEnvironmentsGet {
  
  inline def apply(): ParamsResourceUsersEnvironmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersEnvironmentsGet]
  }
  
  extension [Self <: ParamsResourceUsersEnvironmentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
