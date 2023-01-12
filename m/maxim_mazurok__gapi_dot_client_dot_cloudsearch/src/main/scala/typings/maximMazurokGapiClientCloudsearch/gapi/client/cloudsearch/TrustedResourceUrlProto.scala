package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedResourceUrlProto extends StObject {
  
  /**
    * IMPORTANT: Never set or read this field, even from tests, it is private. See documentation at the top of .proto file for programming language packages with which to create or read
    * this message.
    */
  var privateDoNotAccessOrElseTrustedResourceUrlWrappedValue: js.UndefOr[String] = js.undefined
}
object TrustedResourceUrlProto {
  
  inline def apply(): TrustedResourceUrlProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustedResourceUrlProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrustedResourceUrlProto] (val x: Self) extends AnyVal {
    
    inline def setPrivateDoNotAccessOrElseTrustedResourceUrlWrappedValue(value: String): Self = StObject.set(x, "privateDoNotAccessOrElseTrustedResourceUrlWrappedValue", value.asInstanceOf[js.Any])
    
    inline def setPrivateDoNotAccessOrElseTrustedResourceUrlWrappedValueUndefined: Self = StObject.set(x, "privateDoNotAccessOrElseTrustedResourceUrlWrappedValue", js.undefined)
  }
}
