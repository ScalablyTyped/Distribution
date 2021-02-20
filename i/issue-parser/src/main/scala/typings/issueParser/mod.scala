package typings.issueParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("issue-parser", JSImport.Namespace)
  @js.native
  def apply(): Parser = js.native
  @JSImport("issue-parser", JSImport.Namespace)
  @js.native
  def apply(authOptions: js.UndefOr[scala.Nothing], extension: Overrides): Parser = js.native
  @JSImport("issue-parser", JSImport.Namespace)
  @js.native
  def apply(authOptions: Options): Parser = js.native
  @JSImport("issue-parser", JSImport.Namespace)
  @js.native
  def apply(authOptions: Options, extension: Overrides): Parser = js.native
  
  @js.native
  trait Action extends StObject {
    
    var action: String = js.native
    
    var issue: String = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var raw: String = js.native
    
    var slug: js.UndefOr[String] = js.native
  }
  object Action {
    
    @scala.inline
    def apply(action: String, issue: String, raw: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    }
  }
  
  type Actions = StringDictionary[js.Array[Action]]
  
  @js.native
  trait Mention extends StObject {
    
    var prefix: String = js.native
    
    var raw: String = js.native
    
    var user: String = js.native
  }
  object Mention {
    
    @scala.inline
    def apply(prefix: String, raw: String, user: String): Mention = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mention]
    }
    
    @scala.inline
    implicit class MentionMutableBuilder[Self <: Mention] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.issueParser.issueParserStrings.github
    - typings.issueParser.issueParserStrings.gitlab
    - typings.issueParser.issueParserStrings.bitbucket
    - typings.issueParser.issueParserStrings.waffle
    - typings.issueParser.mod.Overrides
  */
  trait Options extends StObject
  
  @js.native
  trait Overrides extends Options {
    
    var actions: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
    
    var delimiters: js.UndefOr[String | js.Array[String]] = js.native
    
    var hosts: js.UndefOr[String | js.Array[String]] = js.native
    
    var issuePrefixes: js.UndefOr[String | js.Array[String]] = js.native
    
    var issueURLSegments: js.UndefOr[String | js.Array[String]] = js.native
    
    var mentionsPrefixes: js.UndefOr[String | js.Array[String]] = js.native
    
    var overrides: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Overrides {
    
    @scala.inline
    def apply(): Overrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overrides]
    }
    
    @scala.inline
    implicit class OverridesMutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setDelimiters(value: String | js.Array[String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      @scala.inline
      def setDelimitersVarargs(value: String*): Self = StObject.set(x, "delimiters", js.Array(value :_*))
      
      @scala.inline
      def setHosts(value: String | js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      @scala.inline
      def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      @scala.inline
      def setIssuePrefixes(value: String | js.Array[String]): Self = StObject.set(x, "issuePrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuePrefixesUndefined: Self = StObject.set(x, "issuePrefixes", js.undefined)
      
      @scala.inline
      def setIssuePrefixesVarargs(value: String*): Self = StObject.set(x, "issuePrefixes", js.Array(value :_*))
      
      @scala.inline
      def setIssueURLSegments(value: String | js.Array[String]): Self = StObject.set(x, "issueURLSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssueURLSegmentsUndefined: Self = StObject.set(x, "issueURLSegments", js.undefined)
      
      @scala.inline
      def setIssueURLSegmentsVarargs(value: String*): Self = StObject.set(x, "issueURLSegments", js.Array(value :_*))
      
      @scala.inline
      def setMentionsPrefixes(value: String | js.Array[String]): Self = StObject.set(x, "mentionsPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionsPrefixesUndefined: Self = StObject.set(x, "mentionsPrefixes", js.undefined)
      
      @scala.inline
      def setMentionsPrefixesVarargs(value: String*): Self = StObject.set(x, "mentionsPrefixes", js.Array(value :_*))
      
      @scala.inline
      def setOverrides(value: String | js.Array[String]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setOverridesVarargs(value: String*): Self = StObject.set(x, "overrides", js.Array(value :_*))
    }
  }
  
  type Parser = js.Function1[/* text */ String, Result]
  
  @js.native
  trait Reference extends StObject {
    
    var issue: String = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var raw: String = js.native
    
    var slug: js.UndefOr[String] = js.native
  }
  object Reference {
    
    @scala.inline
    def apply(issue: String, raw: String): Reference = {
      val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    @scala.inline
    implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var actions: Actions = js.native
    
    var allRefs: js.Array[Reference | Action] = js.native
    
    var mentions: js.Array[Mention] = js.native
    
    var refs: js.Array[Reference] = js.native
  }
  object Result {
    
    @scala.inline
    def apply(
      actions: Actions,
      allRefs: js.Array[Reference | Action],
      mentions: js.Array[Mention],
      refs: js.Array[Reference]
    ): Result = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], allRefs = allRefs.asInstanceOf[js.Any], mentions = mentions.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllRefs(value: js.Array[Reference | Action]): Self = StObject.set(x, "allRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllRefsVarargs(value: (Reference | Action)*): Self = StObject.set(x, "allRefs", js.Array(value :_*))
      
      @scala.inline
      def setMentions(value: js.Array[Mention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionsVarargs(value: Mention*): Self = StObject.set(x, "mentions", js.Array(value :_*))
      
      @scala.inline
      def setRefs(value: js.Array[Reference]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefsVarargs(value: Reference*): Self = StObject.set(x, "refs", js.Array(value :_*))
    }
  }
}
