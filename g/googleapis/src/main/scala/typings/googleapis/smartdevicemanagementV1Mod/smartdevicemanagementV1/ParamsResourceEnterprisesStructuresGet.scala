package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesStructuresGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the structure requested. For example: "enterprises/XYZ/structures/ABC".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesStructuresGet {
  
  inline def apply(): ParamsResourceEnterprisesStructuresGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesStructuresGet]
  }
  
  extension [Self <: ParamsResourceEnterprisesStructuresGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
