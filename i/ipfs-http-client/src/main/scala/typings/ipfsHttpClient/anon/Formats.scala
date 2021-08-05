package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formats extends StObject {
  
  /**
    * - An array of additional [IPLD formats](https://github.com/ipld/interface-ipld-format) to support
    */
  var formats: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * - an async function that takes the name of an [IPLD format](https://github.com/ipld/interface-ipld-format) as a string and should return the implementation of that codec
    */
  var loadFormat: js.UndefOr[js.Function1[/* format */ String, js.Promise[js.Any]]] = js.undefined
}
object Formats {
  
  inline def apply(): Formats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formats]
  }
  
  extension [Self <: Formats](x: Self) {
    
    inline def setFormats(value: js.Array[js.Any]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: js.Any*): Self = StObject.set(x, "formats", js.Array(value :_*))
    
    inline def setLoadFormat(value: /* format */ String => js.Promise[js.Any]): Self = StObject.set(x, "loadFormat", js.Any.fromFunction1(value))
    
    inline def setLoadFormatUndefined: Self = StObject.set(x, "loadFormat", js.undefined)
  }
}
