package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of turn-based matches.
  */
@js.native
trait SchemaTurnBasedMatchList extends StObject {
  
  /**
    * The matches.
    */
  var items: js.UndefOr[js.Array[SchemaTurnBasedMatch]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchList.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaTurnBasedMatchList {
  
  @scala.inline
  def apply(): SchemaTurnBasedMatchList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchList]
  }
  
  @scala.inline
  implicit class SchemaTurnBasedMatchListMutableBuilder[Self <: SchemaTurnBasedMatchList] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
