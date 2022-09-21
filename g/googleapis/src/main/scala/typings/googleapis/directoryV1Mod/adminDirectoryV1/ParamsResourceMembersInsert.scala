package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMembersInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    */
  var groupKey: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMember] = js.undefined
}
object ParamsResourceMembersInsert {
  
  inline def apply(): ParamsResourceMembersInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMembersInsert]
  }
  
  extension [Self <: ParamsResourceMembersInsert](x: Self) {
    
    inline def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    inline def setRequestBody(value: SchemaMember): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
