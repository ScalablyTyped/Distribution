package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Folders Response.
  */
@js.native
trait SchemaListFoldersResponse extends StObject {
  
  /**
    * All GTM Folders of a GTM Container.
    */
  var folder: js.UndefOr[js.Array[SchemaFolder]] = js.native
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListFoldersResponse {
  
  @scala.inline
  def apply(): SchemaListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFoldersResponse]
  }
  
  @scala.inline
  implicit class SchemaListFoldersResponseMutableBuilder[Self <: SchemaListFoldersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolder(value: js.Array[SchemaFolder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setFolderVarargs(value: SchemaFolder*): Self = StObject.set(x, "folder", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
