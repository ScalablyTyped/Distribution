package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeUrlProto extends StObject {
  
  /**
    * IMPORTANT: Never set or read this field, even from tests, it is private. See documentation at the top of .proto file for programming language packages with which to create or read
    * this message.
    */
  var privateDoNotAccessOrElseSafeUrlWrappedValue: js.UndefOr[String] = js.undefined
}
object SafeUrlProto {
  
  inline def apply(): SafeUrlProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeUrlProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SafeUrlProto] (val x: Self) extends AnyVal {
    
    inline def setPrivateDoNotAccessOrElseSafeUrlWrappedValue(value: String): Self = StObject.set(x, "privateDoNotAccessOrElseSafeUrlWrappedValue", value.asInstanceOf[js.Any])
    
    inline def setPrivateDoNotAccessOrElseSafeUrlWrappedValueUndefined: Self = StObject.set(x, "privateDoNotAccessOrElseSafeUrlWrappedValue", js.undefined)
  }
}
