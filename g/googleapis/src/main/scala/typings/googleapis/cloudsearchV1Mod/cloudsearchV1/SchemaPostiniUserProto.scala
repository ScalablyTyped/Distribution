package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPostiniUserProto extends StObject {
  
  var postiniUserId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPostiniUserProto {
  
  inline def apply(): SchemaPostiniUserProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostiniUserProto]
  }
  
  extension [Self <: SchemaPostiniUserProto](x: Self) {
    
    inline def setPostiniUserId(value: String): Self = StObject.set(x, "postiniUserId", value.asInstanceOf[js.Any])
    
    inline def setPostiniUserIdNull: Self = StObject.set(x, "postiniUserId", null)
    
    inline def setPostiniUserIdUndefined: Self = StObject.set(x, "postiniUserId", js.undefined)
  }
}
