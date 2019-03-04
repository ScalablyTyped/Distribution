package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInstance extends js.Object {
  def registerSearchQueryRewriter(rewriter: SearchQueryRewriter): scala.Unit
  def registerSearchSuggestionsProvider(
    handler: js.Function1[
      /* query */ java.lang.String, 
      js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
    ]
  ): scala.Unit
}

object SearchInstance {
  @scala.inline
  def apply(
    registerSearchQueryRewriter: js.Function1[SearchQueryRewriter, scala.Unit],
    registerSearchSuggestionsProvider: js.Function1[
      js.Function1[
        /* query */ java.lang.String, 
        js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
      ], 
      scala.Unit
    ]
  ): SearchInstance = {
    val __obj = js.Dynamic.literal(registerSearchQueryRewriter = registerSearchQueryRewriter, registerSearchSuggestionsProvider = registerSearchSuggestionsProvider)
  
    __obj.asInstanceOf[SearchInstance]
  }
}

