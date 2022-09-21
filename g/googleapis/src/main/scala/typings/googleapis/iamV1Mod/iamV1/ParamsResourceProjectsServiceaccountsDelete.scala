package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsServiceaccountsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the service account in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsServiceaccountsDelete {
  
  inline def apply(): ParamsResourceProjectsServiceaccountsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServiceaccountsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsServiceaccountsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
