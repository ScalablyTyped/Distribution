package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of files.
  */
trait SchemaFileList extends StObject {
  
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the search process was incomplete. If true, then some search
    * results may be missing, since all documents were not searched. This may
    * occur when searching multiple Team Drives with the
    * &quot;default,allTeamDrives&quot; corpora, but all corpora could not be
    * searched. When this happens, it is suggested that clients narrow their
    * query by choosing a different corpus such as &quot;default&quot; or
    * &quot;teamDrive&quot;.
    */
  var incompleteSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of files. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var items: js.UndefOr[js.Array[SchemaFile]] = js.undefined
  
  /**
    * This is always drive#fileList.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the next page of files.
    */
  var nextLink: js.UndefOr[String] = js.undefined
  
  /**
    * The page token for the next page of files. This will be absent if the end
    * of the files list has been reached. If the token is rejected for any
    * reason, it should be discarded, and pagination should be restarted from
    * the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaFileList {
  
  @scala.inline
  def apply(): SchemaFileList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileList]
  }
  
  @scala.inline
  implicit class SchemaFileListMutableBuilder[Self <: SchemaFileList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setIncompleteSearch(value: Boolean): Self = StObject.set(x, "incompleteSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompleteSearchUndefined: Self = StObject.set(x, "incompleteSearch", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaFile]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaFile*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
