package typings.libp2pDelegatedPeerRouting.mod

import typings.std.Record
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPClientExtraOptions extends StObject {
  
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  var searchParams: js.UndefOr[URLSearchParams] = js.undefined
}
object HTTPClientExtraOptions {
  
  inline def apply(): HTTPClientExtraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPClientExtraOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTTPClientExtraOptions] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setSearchParams(value: URLSearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
    
    inline def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
  }
}
