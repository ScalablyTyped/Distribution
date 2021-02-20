package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of turn-based matches returned from a
  * sync.
  */
@js.native
trait SchemaTurnBasedMatchSync extends StObject {
  
  /**
    * The matches.
    */
  var items: js.UndefOr[js.Array[SchemaTurnBasedMatch]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchSync.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * True if there were more matches available to fetch at the time the
    * response was generated (which were not returned due to page size limits.)
    */
  var moreAvailable: js.UndefOr[Boolean] = js.native
  
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaTurnBasedMatchSync {
  
  @scala.inline
  def apply(): SchemaTurnBasedMatchSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchSync]
  }
  
  @scala.inline
  implicit class SchemaTurnBasedMatchSyncMutableBuilder[Self <: SchemaTurnBasedMatchSync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaTurnBasedMatch]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaTurnBasedMatch*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMoreAvailable(value: Boolean): Self = StObject.set(x, "moreAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreAvailableUndefined: Self = StObject.set(x, "moreAvailable", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
