package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsServiceaccountsKeysGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the service account key in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}/keys/{key\}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The output format of the public key. The default is `TYPE_NONE`, which means that the public key is not returned.
    */
  var publicKeyType: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsServiceaccountsKeysGet {
  
  inline def apply(): ParamsResourceProjectsServiceaccountsKeysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServiceaccountsKeysGet]
  }
  
  extension [Self <: ParamsResourceProjectsServiceaccountsKeysGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublicKeyType(value: String): Self = StObject.set(x, "publicKeyType", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyTypeUndefined: Self = StObject.set(x, "publicKeyType", js.undefined)
  }
}
