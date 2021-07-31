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
  
  @scala.inline
  def apply(): DownloadAccesses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadAccesses]
  }
  
  @scala.inline
  implicit class DownloadAccessesMutableBuilder[Self <: DownloadAccesses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadAccessList(value: js.Array[DownloadAccessRestriction]): Self = StObject.set(x, "downloadAccessList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadAccessListUndefined: Self = StObject.set(x, "downloadAccessList", js.undefined)
    
    @scala.inline
    def setDownloadAccessListVarargs(value: DownloadAccessRestriction*): Self = StObject.set(x, "downloadAccessList", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
