package typings.inboxsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  /* Rewritten from type alias, can be one of: 
    - typings.inboxsdk.mod.Search.AutocompleteSearchResultText
    - typings.inboxsdk.mod.Search.AutocompleteSearchResultHtml
  */
  trait AutocompleteSearchResult extends StObject
  object AutocompleteSearchResult {
    
    @scala.inline
    def AutocompleteSearchResultHtml(descriptionHTML: String, nameHTML: String): typings.inboxsdk.mod.Search.AutocompleteSearchResultHtml = {
      val __obj = js.Dynamic.literal(descriptionHTML = descriptionHTML.asInstanceOf[js.Any], nameHTML = nameHTML.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.inboxsdk.mod.Search.AutocompleteSearchResultHtml]
    }
    
    @scala.inline
    def AutocompleteSearchResultText(description: String, name: String): typings.inboxsdk.mod.Search.AutocompleteSearchResultText = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.inboxsdk.mod.Search.AutocompleteSearchResultText]
    }
  }
  
  trait AutocompleteSearchResultBase extends StObject {
    
    var externalURL: js.UndefOr[String] = js.undefined
    
    var iconHTML: js.UndefOr[String] = js.undefined
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var routeName: js.UndefOr[String] = js.undefined
    
    var routeParams: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AutocompleteSearchResultBase {
    
    @scala.inline
    def apply(): AutocompleteSearchResultBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutocompleteSearchResultBase]
    }
    
    @scala.inline
    implicit class AutocompleteSearchResultBaseMutableBuilder[Self <: AutocompleteSearchResultBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternalURL(value: String): Self = StObject.set(x, "externalURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalURLUndefined: Self = StObject.set(x, "externalURL", js.undefined)
      
      @scala.inline
      def setIconHTML(value: String): Self = StObject.set(x, "iconHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconHTMLUndefined: Self = StObject.set(x, "iconHTML", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteNameUndefined: Self = StObject.set(x, "routeName", js.undefined)
      
      @scala.inline
      def setRouteParams(value: js.Array[String]): Self = StObject.set(x, "routeParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteParamsUndefined: Self = StObject.set(x, "routeParams", js.undefined)
      
      @scala.inline
      def setRouteParamsVarargs(value: String*): Self = StObject.set(x, "routeParams", js.Array(value :_*))
    }
  }
  
  trait AutocompleteSearchResultHtml
    extends StObject
       with AutocompleteSearchResultBase
       with AutocompleteSearchResult {
    
    var descriptionHTML: String
    
    var nameHTML: String
  }
  object AutocompleteSearchResultHtml {
    
    @scala.inline
    def apply(descriptionHTML: String, nameHTML: String): AutocompleteSearchResultHtml = {
      val __obj = js.Dynamic.literal(descriptionHTML = descriptionHTML.asInstanceOf[js.Any], nameHTML = nameHTML.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteSearchResultHtml]
    }
    
    @scala.inline
    implicit class AutocompleteSearchResultHtmlMutableBuilder[Self <: AutocompleteSearchResultHtml] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescriptionHTML(value: String): Self = StObject.set(x, "descriptionHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameHTML(value: String): Self = StObject.set(x, "nameHTML", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutocompleteSearchResultText
    extends StObject
       with AutocompleteSearchResultBase
       with AutocompleteSearchResult {
    
    var description: String
    
    var name: String
  }
  object AutocompleteSearchResultText {
    
    @scala.inline
    def apply(description: String, name: String): AutocompleteSearchResultText = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteSearchResultText]
    }
    
    @scala.inline
    implicit class AutocompleteSearchResultTextMutableBuilder[Self <: AutocompleteSearchResultText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchInstance extends StObject {
    
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
    
    @scala.inline
    implicit class SearchInstanceMutableBuilder[Self <: SearchInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegisterSearchQueryRewriter(value: SearchQueryRewriter => Unit): Self = StObject.set(x, "registerSearchQueryRewriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterSearchSuggestionsProvider(
        value: js.Function1[
              /* query */ String, 
              js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
            ] => Unit
      ): Self = StObject.set(x, "registerSearchSuggestionsProvider", js.Any.fromFunction1(value))
    }
  }
  
  trait SearchQueryRewriter extends StObject {
    
    var term: String
    
    def termReplacer(): String | js.Promise[String]
  }
  object SearchQueryRewriter {
    
    @scala.inline
    def apply(term: String, termReplacer: () => String | js.Promise[String]): SearchQueryRewriter = {
      val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any], termReplacer = js.Any.fromFunction0(termReplacer))
      __obj.asInstanceOf[SearchQueryRewriter]
    }
    
    @scala.inline
    implicit class SearchQueryRewriterMutableBuilder[Self <: SearchQueryRewriter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermReplacer(value: () => String | js.Promise[String]): Self = StObject.set(x, "termReplacer", js.Any.fromFunction0(value))
    }
  }
}
