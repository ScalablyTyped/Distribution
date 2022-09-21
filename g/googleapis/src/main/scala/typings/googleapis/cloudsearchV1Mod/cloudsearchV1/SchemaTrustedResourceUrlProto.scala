package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrustedResourceUrlProto extends StObject {
  
  /**
    * IMPORTANT: Never set or read this field, even from tests, it is private. See documentation at the top of .proto file for programming language packages with which to create or read this message.
    */
  var privateDoNotAccessOrElseTrustedResourceUrlWrappedValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaTrustedResourceUrlProto {
  
  inline def apply(): SchemaTrustedResourceUrlProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrustedResourceUrlProto]
  }
  
  extension [Self <: SchemaTrustedResourceUrlProto](x: Self) {
    
    inline def setPrivateDoNotAccessOrElseTrustedResourceUrlWrappedValue(value: String): Self = StObject.set(x, "privateDoNotAccessOrElseTrustedResourceUrlWrappedValue", value.asInstanceOf[js.Any])
    
    inline def setPrivateDoNotAccessOrElseTrustedResourceUrlWrappedValueNull: Self = StObject.set(x, "privateDoNotAccessOrElseTrustedResourceUrlWrappedValue", null)
    
    inline def setPrivateDoNotAccessOrElseTrustedResourceUrlWrappedValueUndefined: Self = StObject.set(x, "privateDoNotAccessOrElseTrustedResourceUrlWrappedValue", js.undefined)
  }
}
