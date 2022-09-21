package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersEnvironmentsPublickeysDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the resource to be deleted, e.g. `users/me/environments/default/publicKeys/my-key`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersEnvironmentsPublickeysDelete {
  
  inline def apply(): ParamsResourceUsersEnvironmentsPublickeysDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersEnvironmentsPublickeysDelete]
  }
  
  extension [Self <: ParamsResourceUsersEnvironmentsPublickeysDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
