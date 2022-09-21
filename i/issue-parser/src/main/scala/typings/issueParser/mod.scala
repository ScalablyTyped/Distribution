package typings.issueParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Parser = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Parser]
  inline def apply(authOptions: Unit, `extension`: Overrides): Parser = (^.asInstanceOf[js.Dynamic].apply(authOptions.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def apply(authOptions: Options): Parser = ^.asInstanceOf[js.Dynamic].apply(authOptions.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def apply(authOptions: Options, `extension`: Overrides): Parser = (^.asInstanceOf[js.Dynamic].apply(authOptions.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  @JSImport("issue-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Action extends StObject {
    
    var action: String
    
    var issue: String
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var raw: String
    
    var slug: js.UndefOr[String] = js.undefined
  }
  object Action {
    
    inline def apply(action: String, issue: String, raw: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    }
  }
  
  type Actions = StringDictionary[js.Array[Action]]
  
  trait Mention extends StObject {
    
    var prefix: String
    
    var raw: String
    
    var user: String
  }
  object Mention {
    
    inline def apply(prefix: String, raw: String, user: String): Mention = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mention]
    }
    
    extension [Self <: Mention](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
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
  
  trait Overrides
    extends StObject
       with Options {
    
    var actions: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    var delimiters: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var hosts: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var issuePrefixes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var issueURLSegments: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var mentionsPrefixes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var overrides: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Overrides {
    
    inline def apply(): Overrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overrides]
    }
    
    extension [Self <: Overrides](x: Self) {
      
      inline def setActions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setDelimiters(value: String | js.Array[String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setDelimitersVarargs(value: String*): Self = StObject.set(x, "delimiters", js.Array(value*))
      
      inline def setHosts(value: String | js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value*))
      
      inline def setIssuePrefixes(value: String | js.Array[String]): Self = StObject.set(x, "issuePrefixes", value.asInstanceOf[js.Any])
      
      inline def setIssuePrefixesUndefined: Self = StObject.set(x, "issuePrefixes", js.undefined)
      
      inline def setIssuePrefixesVarargs(value: String*): Self = StObject.set(x, "issuePrefixes", js.Array(value*))
      
      inline def setIssueURLSegments(value: String | js.Array[String]): Self = StObject.set(x, "issueURLSegments", value.asInstanceOf[js.Any])
      
      inline def setIssueURLSegmentsUndefined: Self = StObject.set(x, "issueURLSegments", js.undefined)
      
      inline def setIssueURLSegmentsVarargs(value: String*): Self = StObject.set(x, "issueURLSegments", js.Array(value*))
      
      inline def setMentionsPrefixes(value: String | js.Array[String]): Self = StObject.set(x, "mentionsPrefixes", value.asInstanceOf[js.Any])
      
      inline def setMentionsPrefixesUndefined: Self = StObject.set(x, "mentionsPrefixes", js.undefined)
      
      inline def setMentionsPrefixesVarargs(value: String*): Self = StObject.set(x, "mentionsPrefixes", js.Array(value*))
      
      inline def setOverrides(value: String | js.Array[String]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setOverridesVarargs(value: String*): Self = StObject.set(x, "overrides", js.Array(value*))
    }
  }
  
  type Parser = js.Function1[/* text */ String, Result]
  
  trait Reference extends StObject {
    
    var issue: String
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var raw: String
    
    var slug: js.UndefOr[String] = js.undefined
  }
  object Reference {
    
    inline def apply(issue: String, raw: String): Reference = {
      val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    extension [Self <: Reference](x: Self) {
      
      inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var actions: Actions
    
    var allRefs: js.Array[Reference | Action]
    
    var mentions: js.Array[Mention]
    
    var refs: js.Array[Reference]
  }
  object Result {
    
    inline def apply(
      actions: Actions,
      allRefs: js.Array[Reference | Action],
      mentions: js.Array[Mention],
      refs: js.Array[Reference]
    ): Result = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], allRefs = allRefs.asInstanceOf[js.Any], mentions = mentions.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setActions(value: Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setAllRefs(value: js.Array[Reference | Action]): Self = StObject.set(x, "allRefs", value.asInstanceOf[js.Any])
      
      inline def setAllRefsVarargs(value: (Reference | Action)*): Self = StObject.set(x, "allRefs", js.Array(value*))
      
      inline def setMentions(value: js.Array[Mention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
      
      inline def setMentionsVarargs(value: Mention*): Self = StObject.set(x, "mentions", js.Array(value*))
      
      inline def setRefs(value: js.Array[Reference]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setRefsVarargs(value: Reference*): Self = StObject.set(x, "refs", js.Array(value*))
    }
  }
}
