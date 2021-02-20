package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of snapshot objects.
  */
@js.native
trait SchemaSnapshotListResponse extends StObject {
  
  /**
    * The snapshots.
    */
  var items: js.UndefOr[js.Array[SchemaSnapshot]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#snapshotListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Token corresponding to the next page of results. If there are no more
    * results, the token is omitted.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaSnapshotListResponse {
  
  @scala.inline
  def apply(): SchemaSnapshotListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshotListResponse]
  }
  
  @scala.inline
  implicit class SchemaSnapshotListResponseMutableBuilder[Self <: SchemaSnapshotListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaSnapshot]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaSnapshot*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
