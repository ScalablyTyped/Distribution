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

