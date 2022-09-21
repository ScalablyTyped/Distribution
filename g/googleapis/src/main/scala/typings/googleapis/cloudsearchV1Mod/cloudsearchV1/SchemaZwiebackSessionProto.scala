package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaZwiebackSessionProto extends StObject {
  
  var zwiebackSessionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaZwiebackSessionProto {
  
  inline def apply(): SchemaZwiebackSessionProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZwiebackSessionProto]
  }
  
  extension [Self <: SchemaZwiebackSessionProto](x: Self) {
    
    inline def setZwiebackSessionId(value: String): Self = StObject.set(x, "zwiebackSessionId", value.asInstanceOf[js.Any])
    
    inline def setZwiebackSessionIdNull: Self = StObject.set(x, "zwiebackSessionId", null)
    
    inline def setZwiebackSessionIdUndefined: Self = StObject.set(x, "zwiebackSessionId", js.undefined)
  }
}
