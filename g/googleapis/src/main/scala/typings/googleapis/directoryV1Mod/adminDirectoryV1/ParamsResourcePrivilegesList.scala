package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePrivilegesList
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable ID of the Google Workspace account.
    */
  var customer: js.UndefOr[String] = js.undefined
}
object ParamsResourcePrivilegesList {
  
  inline def apply(): ParamsResourcePrivilegesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePrivilegesList]
  }
  
  extension [Self <: ParamsResourcePrivilegesList](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}
