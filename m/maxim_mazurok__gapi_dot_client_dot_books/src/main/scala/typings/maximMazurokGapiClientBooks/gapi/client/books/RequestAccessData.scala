package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestAccessData extends StObject {
  
  /** A concurrent access response. */
  var concurrentAccess: js.UndefOr[ConcurrentAccessRestriction] = js.undefined
  
  /** A download access response. */
  var downloadAccess: js.UndefOr[DownloadAccessRestriction] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}
object RequestAccessData {
  
  inline def apply(): RequestAccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestAccessData]
  }
  
  extension [Self <: RequestAccessData](x: Self) {
    
    inline def setConcurrentAccess(value: ConcurrentAccessRestriction): Self = StObject.set(x, "concurrentAccess", value.asInstanceOf[js.Any])
    
    inline def setConcurrentAccessUndefined: Self = StObject.set(x, "concurrentAccess", js.undefined)
    
    inline def setDownloadAccess(value: DownloadAccessRestriction): Self = StObject.set(x, "downloadAccess", value.asInstanceOf[js.Any])
    
    inline def setDownloadAccessUndefined: Self = StObject.set(x, "downloadAccess", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
