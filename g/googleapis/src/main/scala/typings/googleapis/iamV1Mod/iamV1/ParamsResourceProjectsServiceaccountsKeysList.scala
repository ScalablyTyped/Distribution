package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsServiceaccountsKeysList
  extends StObject
     with StandardParameters {
  
  /**
    * Filters the types of keys the user wants to include in the list response. Duplicate key types are not allowed. If no key type is provided, all keys are returned.
    */
  var keyTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The resource name of the service account in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}`. Using `-` as a wildcard for the `PROJECT_ID`, will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsServiceaccountsKeysList {
  
  inline def apply(): ParamsResourceProjectsServiceaccountsKeysList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServiceaccountsKeysList]
  }
  
  extension [Self <: ParamsResourceProjectsServiceaccountsKeysList](x: Self) {
    
    inline def setKeyTypes(value: js.Array[String]): Self = StObject.set(x, "keyTypes", value.asInstanceOf[js.Any])
    
    inline def setKeyTypesUndefined: Self = StObject.set(x, "keyTypes", js.undefined)
    
    inline def setKeyTypesVarargs(value: String*): Self = StObject.set(x, "keyTypes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
