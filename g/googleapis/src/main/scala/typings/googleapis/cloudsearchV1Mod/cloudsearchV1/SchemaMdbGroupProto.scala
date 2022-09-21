package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMdbGroupProto extends StObject {
  
  var groupName: js.UndefOr[String | Null] = js.undefined
}
object SchemaMdbGroupProto {
  
  inline def apply(): SchemaMdbGroupProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMdbGroupProto]
  }
  
  extension [Self <: SchemaMdbGroupProto](x: Self) {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameNull: Self = StObject.set(x, "groupName", null)
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
