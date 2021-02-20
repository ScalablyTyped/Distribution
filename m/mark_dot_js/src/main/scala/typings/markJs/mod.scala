package typings.markJs

import org.scalablytyped.runtime.StringDictionary
import typings.markJs.markJsStrings.disabled
import typings.markJs.markJsStrings.enabled
import typings.markJs.markJsStrings.withSpaces
import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mark.js", JSImport.Namespace)
  @js.native
  class ^ protected () extends Mark {
    def this(context: String) = this()
    def this(context: js.Array[HTMLElement]) = this()
    def this(context: HTMLElement) = this()
    def this(context: NodeList) = this()
  }
  
  @js.native
  trait Mark extends StObject {
    
    /**
      * highlight custom search terms.
      * @param keyword The keyword to be marked. Can also be an array with multiple keywords.
      * Note that keywords will be escaped. If you need to mark unescaped keywords (e.g. containing a pattern),
      * have a look at the `markRegExp()`
      * @param options Optional options
      */
    def mark(keyword: String): Unit = js.native
    def mark(keyword: String, options: MarkOptions): Unit = js.native
    def mark(keyword: js.Array[String]): Unit = js.native
    def mark(keyword: js.Array[String], options: MarkOptions): Unit = js.native
    
    /**
      * A method to mark ranges with a start position and length. They will be applied
      * to text nodes in the specified context.
      * @param ranges An array of objects with a start and length property.
      * Note that the start positions must be specified including whitespace characters.
      * @param options Optional options
      */
    def markRanges(ranges: js.Array[Range]): Unit = js.native
    def markRanges(ranges: js.Array[Range], options: MarkRangesOptions): Unit = js.native
    
    /**
      * highlight custom regular expressions.
      * @param regexp The regular expression to be marked. Example: /Lor[^]?m/gmi.
      * Note that groups will be ignored and mark.js will always find all matches, regardless of the g flag.
      * @param options Optional options
      */
    def markRegExp(regexp: RegExp): Unit = js.native
    def markRegExp(regexp: RegExp, options: MarkRegExpOptions): Unit = js.native
    
    /**
      * A method to remove highlights created by mark.js.
      * @param options Optional options
      */
    def unmark(): Unit = js.native
    def unmark(options: MarkOptions): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.markJs.markJsStrings.partially
    - typings.markJs.markJsStrings.complementary
    - typings.markJs.markJsStrings.exactly
  */
  trait MarkAccuracy extends StObject
  object MarkAccuracy {
    
    @scala.inline
    def complementary: typings.markJs.markJsStrings.complementary = "complementary".asInstanceOf[typings.markJs.markJsStrings.complementary]
    
    @scala.inline
    def exactly: typings.markJs.markJsStrings.exactly = "exactly".asInstanceOf[typings.markJs.markJsStrings.exactly]
    
    @scala.inline
    def partially: typings.markJs.markJsStrings.partially = "partially".asInstanceOf[typings.markJs.markJsStrings.partially]
  }
  
  @js.native
  trait MarkAccuracyObject extends StObject {
    
    var limiters: js.UndefOr[js.Array[String]] = js.native
    
    var value: MarkAccuracy = js.native
  }
  object MarkAccuracyObject {
    
    @scala.inline
    def apply(value: MarkAccuracy): MarkAccuracyObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkAccuracyObject]
    }
    
    @scala.inline
    implicit class MarkAccuracyObjectMutableBuilder[Self <: MarkAccuracyObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimiters(value: js.Array[String]): Self = StObject.set(x, "limiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitersUndefined: Self = StObject.set(x, "limiters", js.undefined)
      
      @scala.inline
      def setLimitersVarargs(value: String*): Self = StObject.set(x, "limiters", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: MarkAccuracy): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MarkOptions extends StObject {
    
    var accuracy: js.UndefOr[MarkAccuracy | MarkAccuracyObject] = js.native
    
    var acrossElements: js.UndefOr[Boolean] = js.native
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var diacritics: js.UndefOr[Boolean] = js.native
    
    var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.native
    
    var each: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
    
    var element: js.UndefOr[String] = js.native
    
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    var filter: js.UndefOr[
        js.Function4[
          /* textNode */ Element, 
          /* term */ String, 
          /* marksSoFar */ Double, 
          /* marksTotal */ Double, 
          Boolean
        ]
      ] = js.native
    
    var iframes: js.UndefOr[Boolean] = js.native
    
    var iframesTimeout: js.UndefOr[Double] = js.native
    
    var ignoreJoiners: js.UndefOr[Boolean] = js.native
    
    var ignorePunctuation: js.UndefOr[js.Array[String]] = js.native
    
    var log: js.UndefOr[js.Object] = js.native
    
    var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.native
    
    var separateWordSearch: js.UndefOr[Boolean] = js.native
    
    var synonyms: js.UndefOr[StringDictionary[String]] = js.native
    
    var wildcards: js.UndefOr[disabled | enabled | withSpaces] = js.native
  }
  object MarkOptions {
    
    @scala.inline
    def apply(): MarkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkOptions]
    }
    
    @scala.inline
    implicit class MarkOptionsMutableBuilder[Self <: MarkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccuracy(value: MarkAccuracy | MarkAccuracyObject): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
      
      @scala.inline
      def setAcrossElements(value: Boolean): Self = StObject.set(x, "acrossElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcrossElementsUndefined: Self = StObject.set(x, "acrossElements", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDiacritics(value: Boolean): Self = StObject.set(x, "diacritics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiacriticsUndefined: Self = StObject.set(x, "diacritics", js.undefined)
      
      @scala.inline
      def setDone(value: /* marksTotal */ Double => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setEach(value: /* element */ Element => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFilter(
        value: (/* textNode */ Element, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIframes(value: Boolean): Self = StObject.set(x, "iframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframesTimeout(value: Double): Self = StObject.set(x, "iframesTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframesTimeoutUndefined: Self = StObject.set(x, "iframesTimeout", js.undefined)
      
      @scala.inline
      def setIframesUndefined: Self = StObject.set(x, "iframes", js.undefined)
      
      @scala.inline
      def setIgnoreJoiners(value: Boolean): Self = StObject.set(x, "ignoreJoiners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreJoinersUndefined: Self = StObject.set(x, "ignoreJoiners", js.undefined)
      
      @scala.inline
      def setIgnorePunctuation(value: js.Array[String]): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
      
      @scala.inline
      def setIgnorePunctuationVarargs(value: String*): Self = StObject.set(x, "ignorePunctuation", js.Array(value :_*))
      
      @scala.inline
      def setLog(value: js.Object): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setNoMatch(value: /* term */ String => Unit): Self = StObject.set(x, "noMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
      
      @scala.inline
      def setSeparateWordSearch(value: Boolean): Self = StObject.set(x, "separateWordSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparateWordSearchUndefined: Self = StObject.set(x, "separateWordSearch", js.undefined)
      
      @scala.inline
      def setSynonyms(value: StringDictionary[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
      
      @scala.inline
      def setWildcards(value: disabled | enabled | withSpaces): Self = StObject.set(x, "wildcards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWildcardsUndefined: Self = StObject.set(x, "wildcards", js.undefined)
    }
  }
  
  @js.native
  trait MarkRangesOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.native
    
    var each: js.UndefOr[js.Function2[/* element */ Element, /* range */ Range, Unit]] = js.native
    
    var element: js.UndefOr[String] = js.native
    
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    var filter: js.UndefOr[
        js.Function4[
          /* textNode */ Element, 
          /* term */ String, 
          /* marksSoFar */ Double, 
          /* marksTotal */ Double, 
          Boolean
        ]
      ] = js.native
    
    var iframes: js.UndefOr[Boolean] = js.native
    
    var iframesTimeout: js.UndefOr[Double] = js.native
    
    var log: js.UndefOr[js.Object] = js.native
    
    var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.native
  }
  object MarkRangesOptions {
    
    @scala.inline
    def apply(): MarkRangesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkRangesOptions]
    }
    
    @scala.inline
    implicit class MarkRangesOptionsMutableBuilder[Self <: MarkRangesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDone(value: /* marksTotal */ Double => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setEach(value: (/* element */ Element, /* range */ Range) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFilter(
        value: (/* textNode */ Element, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIframes(value: Boolean): Self = StObject.set(x, "iframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframesTimeout(value: Double): Self = StObject.set(x, "iframesTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframesTimeoutUndefined: Self = StObject.set(x, "iframesTimeout", js.undefined)
      
      @scala.inline
      def setIframesUndefined: Self = StObject.set(x, "iframes", js.undefined)
      
      @scala.inline
      def setLog(value: js.Object): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setNoMatch(value: /* term */ String => Unit): Self = StObject.set(x, "noMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    }
  }
  
  @js.native
  trait MarkRegExpOptions extends StObject {
    
    var acrossElements: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.native
    
    var each: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
    
    var element: js.UndefOr[String] = js.native
    
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    var filter: js.UndefOr[
        js.Function4[
          /* textNode */ Element, 
          /* term */ String, 
          /* marksSoFar */ Double, 
          /* marksTotal */ Double, 
          Boolean
        ]
      ] = js.native
    
    var iframes: js.UndefOr[Boolean] = js.native
    
    var iframesTimeout: js.UndefOr[Double] = js.native
    
    var ignoreGroups: js.UndefOr[Double] = js.native
    
    var log: js.UndefOr[js.Object] = js.native
    
    var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.native
  }
  object MarkRegExpOptions {
    
    @scala.inline
    def apply(): MarkRegExpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkRegExpOptions]
    }
    
    @scala.inline
    implicit class MarkRegExpOptionsMutableBuilder[Self <: MarkRegExpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcrossElements(value: Boolean): Self = StObject.set(x, "acrossElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcrossElementsUndefined: Self = StObject.set(x, "acrossElements", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDone(value: /* marksTotal */ Double => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setEach(value: /* element */ Element => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFilter(
        value: (/* textNode */ Element, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIframes(value: Boolean): Self = StObject.set(x, "iframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframesTimeout(value: Double): Self = StObject.set(x, "iframesTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframesTimeoutUndefined: Self = StObject.set(x, "iframesTimeout", js.undefined)
      
      @scala.inline
      def setIframesUndefined: Self = StObject.set(x, "iframes", js.undefined)
      
      @scala.inline
      def setIgnoreGroups(value: Double): Self = StObject.set(x, "ignoreGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreGroupsUndefined: Self = StObject.set(x, "ignoreGroups", js.undefined)
      
      @scala.inline
      def setLog(value: js.Object): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setNoMatch(value: /* term */ String => Unit): Self = StObject.set(x, "noMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    }
  }
  
  @js.native
  trait Range extends StObject {
    
    var length: Double = js.native
    
    var start: Double = js.native
  }
  object Range {
    
    @scala.inline
    def apply(length: Double, start: Double): Range = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarkOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.native
    
    var element: js.UndefOr[String] = js.native
    
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    var iframes: js.UndefOr[Boolean] = js.native
    
    var iframesTimeout: js.UndefOr[Double] = js.native
    
    var log: js.UndefOr[js.Object] = js.native
  }
  object UnmarkOptions {
    
    @scala.inline
    def apply(): UnmarkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarkOptions]
    }
    
    @scala.inline
    implicit class UnmarkOptionsMutableBuilder[Self <: UnmarkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDone(value: /* marksTotal */ Double => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setIframes(value: Boolean): Self = StObject.set(x, "iframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframesTimeout(value: Double): Self = StObject.set(x, "iframesTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframesTimeoutUndefined: Self = StObject.set(x, "iframesTimeout", js.undefined)
      
      @scala.inline
      def setIframesUndefined: Self = StObject.set(x, "iframes", js.undefined)
      
      @scala.inline
      def setLog(value: js.Object): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    }
  }
  
  /* augment JQuery */
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def mark(term: String): Unit = js.native
      def mark(term: String, options: MarkOptions): Unit = js.native
      def mark(term: js.Array[String]): Unit = js.native
      def mark(term: js.Array[String], options: MarkOptions): Unit = js.native
      
      def unmark(): Unit = js.native
      def unmark(options: UnmarkOptions): Unit = js.native
    }
    
    @js.native
    trait JQueryStatic extends StObject {
      
      def mark(term: String): Unit = js.native
      def mark(term: String, options: MarkOptions): Unit = js.native
      def mark(term: js.Array[String]): Unit = js.native
      def mark(term: js.Array[String], options: MarkOptions): Unit = js.native
      
      def unmark(): Unit = js.native
      def unmark(options: UnmarkOptions): Unit = js.native
    }
  }
}
