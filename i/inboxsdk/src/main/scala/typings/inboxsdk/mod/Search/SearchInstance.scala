package typings.inboxsdk.mod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInstance extends js.Object {
  def registerSearchQueryRewriter(rewriter: SearchQueryRewriter): Unit
  def registerSearchSuggestionsProvider(
    handler: js.Function1[
      /* query */ String, 
      js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
    ]
  ): Unit
}

object SearchInstance {
  @scala.inline
  def apply(
    registerSearchQueryRewriter: SearchQueryRewriter => Unit,
    registerSearchSuggestionsProvider: js.Function1[
      /* query */ String, 
      js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
    ] => Unit
  ): SearchInstance = {
    val __obj = js.Dynamic.literal(registerSearchQueryRewriter = js.Any.fromFunction1(registerSearchQueryRewriter), registerSearchSuggestionsProvider = js.Any.fromFunction1(registerSearchSuggestionsProvider))
  
    __obj.asInstanceOf[SearchInstance]
  }
}

