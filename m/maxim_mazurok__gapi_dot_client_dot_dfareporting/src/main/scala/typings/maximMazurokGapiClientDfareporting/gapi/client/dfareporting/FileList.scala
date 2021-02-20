package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileList extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** The files returned in this response. */
  var items: js.UndefOr[js.Array[File]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#fileList". */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Continuation token used to page through files. To retrieve the next page of results, set the next request's "pageToken" to the value of this field. The page token is only valid for
    * a limited amount of time and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object FileList {
  
  @scala.inline
  def apply(): FileList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileList]
  }
  
  @scala.inline
  implicit class FileListMutableBuilder[Self <: FileList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[File]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: File*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
