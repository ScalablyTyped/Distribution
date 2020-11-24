package typings.iitc.searchMod.global

import typings.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * you can implement your own result provider by listing to the search @see hook:
  * addHook('search', function(query: SearchQuery) {});
  */
@JSGlobal("SearchQuery")
@js.native
class SearchQuery () extends js.Object {
  
  /** called to add a result to the query */
  def addResult(result: SearchResult): Unit = js.native
  
  /**
    * indicating if the user has pressed enter after searching. You should not search online or
    * do heavy processing unless the user has confirmed the search term
    */
  var confirmed: Boolean = js.native
  
  /* private */ def hide(): Unit = js.native
  
  /* private */ def init(): Unit = js.native
  
  /* private */ def onResultHoverEnd(result: SearchResult, event: js.Any): Unit = js.native
  
  /* private */ def onResultHoverStart(result: SearchResult, event: js.Any): Unit = js.native
  
  /* private */ def onResultSelected(result: SearchResult, event: js.Any): Unit = js.native
  
  /* private */ def removeHoverResult(): Unit = js.native
  
  /* private */ def removeSelectedResult(): Unit = js.native
  
  /* private */ def resultLayer(result: SearchResult): LayerGroup_[_] = js.native
  
  /* private */ def show(): Unit = js.native
  
  /** the term for which the user has searched */
  var term: String = js.native
}
