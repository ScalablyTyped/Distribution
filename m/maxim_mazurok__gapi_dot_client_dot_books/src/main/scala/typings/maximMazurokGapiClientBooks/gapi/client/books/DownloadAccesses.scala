package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadAccesses extends StObject {
  
  /** A list of download access responses. */
  var downloadAccessList: js.UndefOr[js.Array[DownloadAccessRestriction]] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}
object DownloadAccesses {
  
  inline def apply(): DownloadAccesses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadAccesses]
  }
  
  extension [Self <: DownloadAccesses](x: Self) {
    
    inline def setDownloadAccessList(value: js.Array[DownloadAccessRestriction]): Self = StObject.set(x, "downloadAccessList", value.asInstanceOf[js.Any])
    
    inline def setDownloadAccessListUndefined: Self = StObject.set(x, "downloadAccessList", js.undefined)
    
    inline def setDownloadAccessListVarargs(value: DownloadAccessRestriction*): Self = StObject.set(x, "downloadAccessList", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
