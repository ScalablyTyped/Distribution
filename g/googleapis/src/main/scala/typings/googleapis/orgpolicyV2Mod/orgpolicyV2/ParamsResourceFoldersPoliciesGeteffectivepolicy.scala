package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersPoliciesGeteffectivepolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The effective policy to compute. See `Policy` for naming rules.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersPoliciesGeteffectivepolicy {
  
  inline def apply(): ParamsResourceFoldersPoliciesGeteffectivepolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersPoliciesGeteffectivepolicy]
  }
  
  extension [Self <: ParamsResourceFoldersPoliciesGeteffectivepolicy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
