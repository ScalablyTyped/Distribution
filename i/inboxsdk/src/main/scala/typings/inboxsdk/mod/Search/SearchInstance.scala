package typings.inboxsdk.mod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchInstance extends js.Object {
  
  def registerSearchQueryRewriter(rewriter: SearchQueryRewriter): Unit = js.native
  
  def registerSearchSuggestionsProvider(
    handler: js.Function1[
      /* query */ String, 
      js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
    ]
  ): Unit = js.native
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
  
  @scala.inline
  implicit class SearchInstanceOps[Self <: SearchInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegisterSearchQueryRewriter(value: SearchQueryRewriter => Unit): Self = this.set("registerSearchQueryRewriter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterSearchSuggestionsProvider(
      value: js.Function1[
          /* query */ String, 
          js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
        ] => Unit
    ): Self = this.set("registerSearchSuggestionsProvider", js.Any.fromFunction1(value))
  }
}
