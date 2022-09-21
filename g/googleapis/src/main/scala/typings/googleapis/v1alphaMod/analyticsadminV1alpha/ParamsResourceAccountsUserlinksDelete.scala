package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsUserlinksDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Example format: accounts/1234/userLinks/5678
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsUserlinksDelete {
  
  inline def apply(): ParamsResourceAccountsUserlinksDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsUserlinksDelete]
  }
  
  extension [Self <: ParamsResourceAccountsUserlinksDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
