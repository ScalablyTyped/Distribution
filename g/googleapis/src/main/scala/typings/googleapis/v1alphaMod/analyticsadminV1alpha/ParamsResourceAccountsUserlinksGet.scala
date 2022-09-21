package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsUserlinksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Example format: accounts/1234/userLinks/5678
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsUserlinksGet {
  
  inline def apply(): ParamsResourceAccountsUserlinksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsUserlinksGet]
  }
  
  extension [Self <: ParamsResourceAccountsUserlinksGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
