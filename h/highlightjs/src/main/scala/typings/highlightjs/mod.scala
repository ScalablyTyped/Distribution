package typings.highlightjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("highlightjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("highlightjs", "APOS_STRING_MODE")
  @js.native
  val APOS_STRING_MODE: IMode = js.native
  
  @JSImport("highlightjs", "BACKSLASH_ESCAPE")
  @js.native
  val BACKSLASH_ESCAPE: IMode = js.native
  
  @JSImport("highlightjs", "BINARY_NUMBER_MODE")
  @js.native
  val BINARY_NUMBER_MODE: IMode = js.native
  
  @JSImport("highlightjs", "BINARY_NUMBER_RE")
  @js.native
  val BINARY_NUMBER_RE: String = js.native
  
  inline def COMMENT(begin: String, end: String, inherits: IModeBase): IMode = (^.asInstanceOf[js.Dynamic].applyDynamic("COMMENT")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inherits.asInstanceOf[js.Any])).asInstanceOf[IMode]
  inline def COMMENT(begin: String, end: js.RegExp, inherits: IModeBase): IMode = (^.asInstanceOf[js.Dynamic].applyDynamic("COMMENT")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inherits.asInstanceOf[js.Any])).asInstanceOf[IMode]
  inline def COMMENT(begin: js.RegExp, end: String, inherits: IModeBase): IMode = (^.asInstanceOf[js.Dynamic].applyDynamic("COMMENT")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inherits.asInstanceOf[js.Any])).asInstanceOf[IMode]
  inline def COMMENT(begin: js.RegExp, end: js.RegExp, inherits: IModeBase): IMode = (^.asInstanceOf[js.Dynamic].applyDynamic("COMMENT")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inherits.asInstanceOf[js.Any])).asInstanceOf[IMode]
  
  @JSImport("highlightjs", "CSS_NUMBER_MODE")
  @js.native
  val CSS_NUMBER_MODE: IMode = js.native
  
  @JSImport("highlightjs", "C_BLOCK_COMMENT_MODE")
  @js.native
  val C_BLOCK_COMMENT_MODE: IMode = js.native
  
  @JSImport("highlightjs", "C_LINE_COMMENT_MODE")
  @js.native
  val C_LINE_COMMENT_MODE: IMode = js.native
  
  @JSImport("highlightjs", "C_NUMBER_MODE")
  @js.native
  val C_NUMBER_MODE: IMode = js.native
  
  @JSImport("highlightjs", "C_NUMBER_RE")
  @js.native
  val C_NUMBER_RE: String = js.native
  
  @JSImport("highlightjs", "HASH_COMMENT_MODE")
  @js.native
  val HASH_COMMENT_MODE: IMode = js.native
  
  @JSImport("highlightjs", "IDENT_RE")
  @js.native
  val IDENT_RE: String = js.native
  
  @JSImport("highlightjs", "NUMBER_MODE")
  @js.native
  val NUMBER_MODE: IMode = js.native
  
  @JSImport("highlightjs", "NUMBER_RE")
  @js.native
  val NUMBER_RE: String = js.native
  
  @JSImport("highlightjs", "PHRASAL_WORDS_MODE")
  @js.native
  val PHRASAL_WORDS_MODE: IMode = js.native
  
  @JSImport("highlightjs", "QUOTE_STRING_MODE")
  @js.native
  val QUOTE_STRING_MODE: IMode = js.native
  
  @JSImport("highlightjs", "REGEX_MODE")
  @js.native
  val REGEX_MODE: IMode = js.native
  
  @JSImport("highlightjs", "RE_STARTERS_RE")
  @js.native
  val RE_STARTERS_RE: String = js.native
  
  @JSImport("highlightjs", "TITLE_MODE")
  @js.native
  val TITLE_MODE: IMode = js.native
  
  @JSImport("highlightjs", "UNDERSCORE_IDENT_RE")
  @js.native
  val UNDERSCORE_IDENT_RE: String = js.native
  
  @JSImport("highlightjs", "UNDERSCORE_TITLE_MODE")
  @js.native
  val UNDERSCORE_TITLE_MODE: IMode = js.native
  
  inline def configure(options: IOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fixMarkup(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixMarkup")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getLanguage(name: String): IMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")(name.asInstanceOf[js.Any]).asInstanceOf[IMode]
  
  inline def highlight(name: String, value: String): IHighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IHighlightResult]
  inline def highlight(name: String, value: String, ignore_illegals: Boolean): IHighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ignore_illegals.asInstanceOf[js.Any])).asInstanceOf[IHighlightResult]
  inline def highlight(name: String, value: String, ignore_illegals: Boolean, continuation: ICompiledMode): IHighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ignore_illegals.asInstanceOf[js.Any], continuation.asInstanceOf[js.Any])).asInstanceOf[IHighlightResult]
  inline def highlight(name: String, value: String, ignore_illegals: Unit, continuation: ICompiledMode): IHighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ignore_illegals.asInstanceOf[js.Any], continuation.asInstanceOf[js.Any])).asInstanceOf[IHighlightResult]
  
  inline def highlightAuto(value: String): IAutoHighlightResult = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightAuto")(value.asInstanceOf[js.Any]).asInstanceOf[IAutoHighlightResult]
  inline def highlightAuto(value: String, languageSubset: js.Array[String]): IAutoHighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAuto")(value.asInstanceOf[js.Any], languageSubset.asInstanceOf[js.Any])).asInstanceOf[IAutoHighlightResult]
  
  inline def highlightBlock(block: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightBlock")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def inherit(parent: js.Object, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def initHighlighting(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initHighlighting")().asInstanceOf[Unit]
  
  inline def initHighlightingOnLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initHighlightingOnLoad")().asInstanceOf[Unit]
  
  inline def listLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listLanguages")().asInstanceOf[js.Array[String]]
  
  inline def registerLanguage(name: String, language: js.Function1[/* hljs */ js.UndefOr[HLJSStatic], IModeBase]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait HLJSStatic extends StObject {
    
    var APOS_STRING_MODE: IMode
    
    // Common modes
    var BACKSLASH_ESCAPE: IMode
    
    var BINARY_NUMBER_MODE: IMode
    
    var BINARY_NUMBER_RE: String
    
    var CSS_NUMBER_MODE: IMode
    
    var C_BLOCK_COMMENT_MODE: IMode
    
    var C_LINE_COMMENT_MODE: IMode
    
    var C_NUMBER_MODE: IMode
    
    var C_NUMBER_RE: String
    
    var HASH_COMMENT_MODE: IMode
    
    // Common regexps
    var IDENT_RE: String
    
    var NUMBER_MODE: IMode
    
    var NUMBER_RE: String
    
    var PHRASAL_WORDS_MODE: IMode
    
    var QUOTE_STRING_MODE: IMode
    
    var REGEX_MODE: IMode
    
    var RE_STARTERS_RE: String
    
    var TITLE_MODE: IMode
    
    var UNDERSCORE_IDENT_RE: String
    
    var UNDERSCORE_TITLE_MODE: IMode
    
    def inherit(parent: js.Object, obj: js.Object): js.Object
  }
  object HLJSStatic {
    
    inline def apply(
      APOS_STRING_MODE: IMode,
      BACKSLASH_ESCAPE: IMode,
      BINARY_NUMBER_MODE: IMode,
      BINARY_NUMBER_RE: String,
      CSS_NUMBER_MODE: IMode,
      C_BLOCK_COMMENT_MODE: IMode,
      C_LINE_COMMENT_MODE: IMode,
      C_NUMBER_MODE: IMode,
      C_NUMBER_RE: String,
      HASH_COMMENT_MODE: IMode,
      IDENT_RE: String,
      NUMBER_MODE: IMode,
      NUMBER_RE: String,
      PHRASAL_WORDS_MODE: IMode,
      QUOTE_STRING_MODE: IMode,
      REGEX_MODE: IMode,
      RE_STARTERS_RE: String,
      TITLE_MODE: IMode,
      UNDERSCORE_IDENT_RE: String,
      UNDERSCORE_TITLE_MODE: IMode,
      inherit: (js.Object, js.Object) => js.Object
    ): HLJSStatic = {
      val __obj = js.Dynamic.literal(APOS_STRING_MODE = APOS_STRING_MODE.asInstanceOf[js.Any], BACKSLASH_ESCAPE = BACKSLASH_ESCAPE.asInstanceOf[js.Any], BINARY_NUMBER_MODE = BINARY_NUMBER_MODE.asInstanceOf[js.Any], BINARY_NUMBER_RE = BINARY_NUMBER_RE.asInstanceOf[js.Any], CSS_NUMBER_MODE = CSS_NUMBER_MODE.asInstanceOf[js.Any], C_BLOCK_COMMENT_MODE = C_BLOCK_COMMENT_MODE.asInstanceOf[js.Any], C_LINE_COMMENT_MODE = C_LINE_COMMENT_MODE.asInstanceOf[js.Any], C_NUMBER_MODE = C_NUMBER_MODE.asInstanceOf[js.Any], C_NUMBER_RE = C_NUMBER_RE.asInstanceOf[js.Any], HASH_COMMENT_MODE = HASH_COMMENT_MODE.asInstanceOf[js.Any], IDENT_RE = IDENT_RE.asInstanceOf[js.Any], NUMBER_MODE = NUMBER_MODE.asInstanceOf[js.Any], NUMBER_RE = NUMBER_RE.asInstanceOf[js.Any], PHRASAL_WORDS_MODE = PHRASAL_WORDS_MODE.asInstanceOf[js.Any], QUOTE_STRING_MODE = QUOTE_STRING_MODE.asInstanceOf[js.Any], REGEX_MODE = REGEX_MODE.asInstanceOf[js.Any], RE_STARTERS_RE = RE_STARTERS_RE.asInstanceOf[js.Any], TITLE_MODE = TITLE_MODE.asInstanceOf[js.Any], UNDERSCORE_IDENT_RE = UNDERSCORE_IDENT_RE.asInstanceOf[js.Any], UNDERSCORE_TITLE_MODE = UNDERSCORE_TITLE_MODE.asInstanceOf[js.Any], inherit = js.Any.fromFunction2(inherit))
      __obj.asInstanceOf[HLJSStatic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HLJSStatic] (val x: Self) extends AnyVal {
      
      inline def setAPOS_STRING_MODE(value: IMode): Self = StObject.set(x, "APOS_STRING_MODE", value.asInstanceOf[js.Any])
      
      inline def setBACKSLASH_ESCAPE(value: IMode): Self = StObject.set(x, "BACKSLASH_ESCAPE", value.asInstanceOf[js.Any])
      
      inline def setBINARY_NUMBER_MODE(value: IMode): Self = StObject.set(x, "BINARY_NUMBER_MODE", value.asInstanceOf[js.Any])
      
      inline def setBINARY_NUMBER_RE(value: String): Self = StObject.set(x, "BINARY_NUMBER_RE", value.asInstanceOf[js.Any])
      
      inline def setCSS_NUMBER_MODE(value: IMode): Self = StObject.set(x, "CSS_NUMBER_MODE", value.asInstanceOf[js.Any])
      
      inline def setC_BLOCK_COMMENT_MODE(value: IMode): Self = StObject.set(x, "C_BLOCK_COMMENT_MODE", value.asInstanceOf[js.Any])
      
      inline def setC_LINE_COMMENT_MODE(value: IMode): Self = StObject.set(x, "C_LINE_COMMENT_MODE", value.asInstanceOf[js.Any])
      
      inline def setC_NUMBER_MODE(value: IMode): Self = StObject.set(x, "C_NUMBER_MODE", value.asInstanceOf[js.Any])
      
      inline def setC_NUMBER_RE(value: String): Self = StObject.set(x, "C_NUMBER_RE", value.asInstanceOf[js.Any])
      
      inline def setHASH_COMMENT_MODE(value: IMode): Self = StObject.set(x, "HASH_COMMENT_MODE", value.asInstanceOf[js.Any])
      
      inline def setIDENT_RE(value: String): Self = StObject.set(x, "IDENT_RE", value.asInstanceOf[js.Any])
      
      inline def setInherit(value: (js.Object, js.Object) => js.Object): Self = StObject.set(x, "inherit", js.Any.fromFunction2(value))
      
      inline def setNUMBER_MODE(value: IMode): Self = StObject.set(x, "NUMBER_MODE", value.asInstanceOf[js.Any])
      
      inline def setNUMBER_RE(value: String): Self = StObject.set(x, "NUMBER_RE", value.asInstanceOf[js.Any])
      
      inline def setPHRASAL_WORDS_MODE(value: IMode): Self = StObject.set(x, "PHRASAL_WORDS_MODE", value.asInstanceOf[js.Any])
      
      inline def setQUOTE_STRING_MODE(value: IMode): Self = StObject.set(x, "QUOTE_STRING_MODE", value.asInstanceOf[js.Any])
      
      inline def setREGEX_MODE(value: IMode): Self = StObject.set(x, "REGEX_MODE", value.asInstanceOf[js.Any])
      
      inline def setRE_STARTERS_RE(value: String): Self = StObject.set(x, "RE_STARTERS_RE", value.asInstanceOf[js.Any])
      
      inline def setTITLE_MODE(value: IMode): Self = StObject.set(x, "TITLE_MODE", value.asInstanceOf[js.Any])
      
      inline def setUNDERSCORE_IDENT_RE(value: String): Self = StObject.set(x, "UNDERSCORE_IDENT_RE", value.asInstanceOf[js.Any])
      
      inline def setUNDERSCORE_TITLE_MODE(value: IMode): Self = StObject.set(x, "UNDERSCORE_TITLE_MODE", value.asInstanceOf[js.Any])
    }
  }
  
  trait IAutoHighlightResult
    extends StObject
       with IHighlightResultBase {
    
    var second_best: js.UndefOr[IAutoHighlightResult] = js.undefined
  }
  object IAutoHighlightResult {
    
    inline def apply(language: String, relevance: Double, value: String): IAutoHighlightResult = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAutoHighlightResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAutoHighlightResult] (val x: Self) extends AnyVal {
      
      inline def setSecond_best(value: IAutoHighlightResult): Self = StObject.set(x, "second_best", value.asInstanceOf[js.Any])
      
      inline def setSecond_bestUndefined: Self = StObject.set(x, "second_best", js.undefined)
    }
  }
  
  trait ICompiledMode
    extends StObject
       with IModeBase {
    
    var compiled: Boolean
    
    var contains: js.UndefOr[js.Array[ICompiledMode]] = js.undefined
    
    var keywords: js.UndefOr[js.Object] = js.undefined
    
    var terminator_end: js.UndefOr[String] = js.undefined
    
    var terminators: js.RegExp
  }
  object ICompiledMode {
    
    inline def apply(compiled: Boolean, terminators: js.RegExp): ICompiledMode = {
      val __obj = js.Dynamic.literal(compiled = compiled.asInstanceOf[js.Any], terminators = terminators.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICompiledMode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICompiledMode] (val x: Self) extends AnyVal {
      
      inline def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      inline def setContains(value: js.Array[ICompiledMode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setContainsVarargs(value: ICompiledMode*): Self = StObject.set(x, "contains", js.Array(value*))
      
      inline def setKeywords(value: js.Object): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setTerminator_end(value: String): Self = StObject.set(x, "terminator_end", value.asInstanceOf[js.Any])
      
      inline def setTerminator_endUndefined: Self = StObject.set(x, "terminator_end", js.undefined)
      
      inline def setTerminators(value: js.RegExp): Self = StObject.set(x, "terminators", value.asInstanceOf[js.Any])
    }
  }
  
  trait IHighlightResult
    extends StObject
       with IHighlightResultBase {
    
    var top: ICompiledMode
  }
  object IHighlightResult {
    
    inline def apply(language: String, relevance: Double, top: ICompiledMode, value: String): IHighlightResult = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHighlightResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHighlightResult] (val x: Self) extends AnyVal {
      
      inline def setTop(value: ICompiledMode): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait IHighlightResultBase extends StObject {
    
    var language: String
    
    var relevance: Double
    
    var value: String
  }
  object IHighlightResultBase {
    
    inline def apply(language: String, relevance: Double, value: String): IHighlightResultBase = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHighlightResultBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHighlightResultBase] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMode
    extends StObject
       with IModeBase {
    
    var contains: js.UndefOr[js.Array[IMode]] = js.undefined
    
    var keywords: js.UndefOr[Any] = js.undefined
  }
  object IMode {
    
    inline def apply(): IMode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMode] (val x: Self) extends AnyVal {
      
      inline def setContains(value: js.Array[IMode]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setContainsVarargs(value: IMode*): Self = StObject.set(x, "contains", js.Array(value*))
      
      inline def setKeywords(value: Any): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    }
  }
  
  trait IModeBase extends StObject {
    
    var aliases: js.UndefOr[js.Array[String]] = js.undefined
    
    var begin: js.UndefOr[String | js.RegExp] = js.undefined
    
    var beginKeyword: js.UndefOr[String] = js.undefined
    
    var case_insensitive: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var end: js.UndefOr[String | js.RegExp] = js.undefined
    
    var endsWithParent: js.UndefOr[Boolean] = js.undefined
    
    var excludeBegin: js.UndefOr[Boolean] = js.undefined
    
    var excludeEnd: js.UndefOr[Boolean] = js.undefined
    
    var illegal: js.UndefOr[String] = js.undefined
    
    var lexems: js.UndefOr[String] = js.undefined
    
    var relevance: js.UndefOr[Double] = js.undefined
    
    var returnBegin: js.UndefOr[Boolean] = js.undefined
    
    var returnEnd: js.UndefOr[Boolean] = js.undefined
    
    var starts: js.UndefOr[String] = js.undefined
    
    var subLanguage: js.UndefOr[String] = js.undefined
    
    var subLanguageMode: js.UndefOr[String] = js.undefined
    
    var variants: js.UndefOr[js.Array[IMode]] = js.undefined
  }
  object IModeBase {
    
    inline def apply(): IModeBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModeBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModeBase] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setBegin(value: String | js.RegExp): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginKeyword(value: String): Self = StObject.set(x, "beginKeyword", value.asInstanceOf[js.Any])
      
      inline def setBeginKeywordUndefined: Self = StObject.set(x, "beginKeyword", js.undefined)
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
      
      inline def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnd(value: String | js.RegExp): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndsWithParent(value: Boolean): Self = StObject.set(x, "endsWithParent", value.asInstanceOf[js.Any])
      
      inline def setEndsWithParentUndefined: Self = StObject.set(x, "endsWithParent", js.undefined)
      
      inline def setExcludeBegin(value: Boolean): Self = StObject.set(x, "excludeBegin", value.asInstanceOf[js.Any])
      
      inline def setExcludeBeginUndefined: Self = StObject.set(x, "excludeBegin", js.undefined)
      
      inline def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
      
      inline def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
      
      inline def setIllegal(value: String): Self = StObject.set(x, "illegal", value.asInstanceOf[js.Any])
      
      inline def setIllegalUndefined: Self = StObject.set(x, "illegal", js.undefined)
      
      inline def setLexems(value: String): Self = StObject.set(x, "lexems", value.asInstanceOf[js.Any])
      
      inline def setLexemsUndefined: Self = StObject.set(x, "lexems", js.undefined)
      
      inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
      
      inline def setReturnBegin(value: Boolean): Self = StObject.set(x, "returnBegin", value.asInstanceOf[js.Any])
      
      inline def setReturnBeginUndefined: Self = StObject.set(x, "returnBegin", js.undefined)
      
      inline def setReturnEnd(value: Boolean): Self = StObject.set(x, "returnEnd", value.asInstanceOf[js.Any])
      
      inline def setReturnEndUndefined: Self = StObject.set(x, "returnEnd", js.undefined)
      
      inline def setStarts(value: String): Self = StObject.set(x, "starts", value.asInstanceOf[js.Any])
      
      inline def setStartsUndefined: Self = StObject.set(x, "starts", js.undefined)
      
      inline def setSubLanguage(value: String): Self = StObject.set(x, "subLanguage", value.asInstanceOf[js.Any])
      
      inline def setSubLanguageMode(value: String): Self = StObject.set(x, "subLanguageMode", value.asInstanceOf[js.Any])
      
      inline def setSubLanguageModeUndefined: Self = StObject.set(x, "subLanguageMode", js.undefined)
      
      inline def setSubLanguageUndefined: Self = StObject.set(x, "subLanguage", js.undefined)
      
      inline def setVariants(value: js.Array[IMode]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setVariantsVarargs(value: IMode*): Self = StObject.set(x, "variants", js.Array(value*))
    }
  }
  
  trait IOptions extends StObject {
    
    var classPrefix: js.UndefOr[String] = js.undefined
    
    var languages: js.UndefOr[js.Array[String]] = js.undefined
    
    var tabReplace: js.UndefOr[String] = js.undefined
    
    var useBR: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      inline def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      inline def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
      
      inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
      
      inline def setTabReplace(value: String): Self = StObject.set(x, "tabReplace", value.asInstanceOf[js.Any])
      
      inline def setTabReplaceUndefined: Self = StObject.set(x, "tabReplace", js.undefined)
      
      inline def setUseBR(value: Boolean): Self = StObject.set(x, "useBR", value.asInstanceOf[js.Any])
      
      inline def setUseBRUndefined: Self = StObject.set(x, "useBR", js.undefined)
    }
  }
  
  // tslint:disable-next-line:no-empty-interface
  trait Node extends StObject
}
