package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of revisions of a file.
  */
@js.native
trait SchemaRevisionList extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#revisionList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The page token for the next page of revisions. This will be absent if the
    * end of the revisions list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of revisions. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var revisions: js.UndefOr[js.Array[SchemaRevision]] = js.native
}
object SchemaRevisionList {
  
  @scala.inline
  def apply(): SchemaRevisionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionList]
  }
  
  @scala.inline
  implicit class SchemaRevisionListMutableBuilder[Self <: SchemaRevisionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRevisions(value: js.Array[SchemaRevision]): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionsUndefined: Self = StObject.set(x, "revisions", js.undefined)
    
    @scala.inline
    def setRevisionsVarargs(value: SchemaRevision*): Self = StObject.set(x, "revisions", js.Array(value :_*))
  }
}
