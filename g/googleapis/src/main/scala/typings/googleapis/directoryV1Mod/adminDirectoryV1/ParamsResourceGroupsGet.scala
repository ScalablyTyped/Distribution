package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    */
  var groupKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsGet {
  
  inline def apply(): ParamsResourceGroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsGet]
  }
  
  extension [Self <: ParamsResourceGroupsGet](x: Self) {
    
    inline def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
  }
}
