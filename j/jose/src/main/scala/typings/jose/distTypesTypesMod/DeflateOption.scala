package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeflateOption extends StObject {
  
  /**
    * In a browser runtime you have to provide an implementation for Deflate Raw when you will be
    * producing JWEs with compressed plaintext.
    */
  var deflateRaw: js.UndefOr[DeflateFunction] = js.undefined
}
object DeflateOption {
  
  inline def apply(): DeflateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeflateOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeflateOption] (val x: Self) extends AnyVal {
    
    inline def setDeflateRaw(value: /* input */ js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "deflateRaw", js.Any.fromFunction1(value))
    
    inline def setDeflateRawUndefined: Self = StObject.set(x, "deflateRaw", js.undefined)
  }
}
