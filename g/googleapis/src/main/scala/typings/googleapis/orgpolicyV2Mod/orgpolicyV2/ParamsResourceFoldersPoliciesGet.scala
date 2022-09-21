package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersPoliciesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the policy. See `Policy` for naming requirements.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersPoliciesGet {
  
  inline def apply(): ParamsResourceFoldersPoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersPoliciesGet]
  }
  
  extension [Self <: ParamsResourceFoldersPoliciesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
