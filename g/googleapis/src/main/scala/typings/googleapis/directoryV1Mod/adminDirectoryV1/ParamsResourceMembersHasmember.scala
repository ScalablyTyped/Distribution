package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMembersHasmember
  extends StObject
     with StandardParameters {
  
  /**
    * Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    */
  var groupKey: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the user member in the API request. The value can be the user's primary email address, alias, or unique ID.
    */
  var memberKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceMembersHasmember {
  
  inline def apply(): ParamsResourceMembersHasmember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMembersHasmember]
  }
  
  extension [Self <: ParamsResourceMembersHasmember](x: Self) {
    
    inline def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    inline def setMemberKey(value: String): Self = StObject.set(x, "memberKey", value.asInstanceOf[js.Any])
    
    inline def setMemberKeyUndefined: Self = StObject.set(x, "memberKey", js.undefined)
  }
}
