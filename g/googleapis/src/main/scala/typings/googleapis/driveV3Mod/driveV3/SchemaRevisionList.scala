package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of revisions of a file.
  */
trait SchemaRevisionList extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#revisionList&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The page token for the next page of revisions. This will be absent if the
    * end of the revisions list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of revisions. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var revisions: js.UndefOr[js.Array[SchemaRevision]] = js.undefined
}
object SchemaRevisionList {
  
  inline def apply(): SchemaRevisionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionList]
  }
  
  extension [Self <: SchemaRevisionList](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRevisions(value: js.Array[SchemaRevision]): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsUndefined: Self = StObject.set(x, "revisions", js.undefined)
    
    inline def setRevisionsVarargs(value: SchemaRevision*): Self = StObject.set(x, "revisions", js.Array(value :_*))
  }
}
