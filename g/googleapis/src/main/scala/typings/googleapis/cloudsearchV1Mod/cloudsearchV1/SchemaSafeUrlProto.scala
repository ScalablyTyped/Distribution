package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSafeUrlProto extends StObject {
  
  /**
    * IMPORTANT: Never set or read this field, even from tests, it is private. See documentation at the top of .proto file for programming language packages with which to create or read this message.
    */
  var privateDoNotAccessOrElseSafeUrlWrappedValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaSafeUrlProto {
  
  inline def apply(): SchemaSafeUrlProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSafeUrlProto]
  }
  
  extension [Self <: SchemaSafeUrlProto](x: Self) {
    
    inline def setPrivateDoNotAccessOrElseSafeUrlWrappedValue(value: String): Self = StObject.set(x, "privateDoNotAccessOrElseSafeUrlWrappedValue", value.asInstanceOf[js.Any])
    
    inline def setPrivateDoNotAccessOrElseSafeUrlWrappedValueNull: Self = StObject.set(x, "privateDoNotAccessOrElseSafeUrlWrappedValue", null)
    
    inline def setPrivateDoNotAccessOrElseSafeUrlWrappedValueUndefined: Self = StObject.set(x, "privateDoNotAccessOrElseSafeUrlWrappedValue", js.undefined)
  }
}
