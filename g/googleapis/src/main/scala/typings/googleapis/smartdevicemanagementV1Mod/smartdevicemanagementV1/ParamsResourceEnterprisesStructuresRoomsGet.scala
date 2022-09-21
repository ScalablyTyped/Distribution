package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesStructuresRoomsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the room requested. For example: "enterprises/XYZ/structures/ABC/rooms/123".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesStructuresRoomsGet {
  
  inline def apply(): ParamsResourceEnterprisesStructuresRoomsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesStructuresRoomsGet]
  }
  
  extension [Self <: ParamsResourceEnterprisesStructuresRoomsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
