package typings.markJs

import org.scalablytyped.runtime.StringDictionary
import typings.markJs.markJsStrings.disabled
import typings.markJs.markJsStrings.enabled
import typings.markJs.markJsStrings.withSpaces
import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mark.js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Mark {
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
    def markRegExp(regexp: js.RegExp): Unit = js.native
    def markRegExp(regexp: js.RegExp, options: MarkRegExpOptions): Unit = js.native
    
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
    
    inline def complementary: typings.markJs.markJsStrings.complementary = "complementary".asInstanceOf[typings.markJs.markJsStrings.complementary]
    
    inline def exactly: typings.markJs.markJsStrings.exactly = "exactly".asInstanceOf[typings.markJs.markJsStrings.exactly]
    
    inline def partially: typings.markJs.markJsStrings.partially = "partially".asInstanceOf[typings.markJs.markJsStrings.partially]
  }
  
  trait MarkAccuracyObject extends StObject {
    
    var limiters: js.UndefOr[js.Array[String]] = js.undefined
    
    var value: MarkAccuracy
  }
  object MarkAccuracyObject {
    
    inline def apply(value: MarkAccuracy): MarkAccuracyObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkAccuracyObject]
    }
    
    extension [Self <: MarkAccuracyObject](x: Self) {
      
      inline def setLimiters(value: js.Array[String]): Self = StObject.set(x, "limiters", value.asInstanceOf[js.Any])
      
      inline def setLimitersUndefined: Self = StObject.set(x, "limiters", js.undefined)
      
      inline def setLimitersVarargs(value: String*): Self = StObject.set(x, "limiters", js.Array(value*))
      
      inline def setValue(value: MarkAccuracy): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkOptions extends StObject {
    
    var accuracy: js.UndefOr[MarkAccuracy | MarkAccuracyObject] = js.undefined
    
    var acrossElements: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var diacritics: js.UndefOr[Boolean] = js.undefined
    
    var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.undefined
    
    var each: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[
        js.Function4[
          /* textNode */ Text, 
          /* term */ String, 
          /* marksSoFar */ Double, 
          /* marksTotal */ Double, 
          Boolean
        ]
      ] = js.undefined
    
    var iframes: js.UndefOr[Boolean] = js.undefined
    
    var iframesTimeout: js.UndefOr[Double] = js.undefined
    
    var ignoreJoiners: js.UndefOr[Boolean] = js.undefined
    
    var ignorePunctuation: js.UndefOr[js.Array[String]] = js.undefined
    
    var log: js.UndefOr[js.Object] = js.undefined
    
    var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.undefined
    
    var separateWordSearch: js.UndefOr[Boolean] = js.undefined
    
    var synonyms: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var wildcards: js.UndefOr[disabled | enabled | withSpaces] = js.undefined
  }
  object MarkOptions {
    
    inline def apply(): MarkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkOptions]
    }
    
    extension [Self <: MarkOptions](x: Self) {
      
      inline def setAccuracy(value: MarkAccuracy | MarkAccuracyObject): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
      
      inline def setAcrossElements(value: Boolean): Self = StObject.set(x, "acrossElements", value.asInstanceOf[js.Any])
      
      inline def setAcrossElementsUndefined: Self = StObject.set(x, "acrossElements", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDiacritics(value: Boolean): Self = StObject.set(x, "diacritics", value.asInstanceOf[js.Any])
      
      inline def setDiacriticsUndefined: Self = StObject.set(x, "diacritics", js.undefined)
      
      inline def setDone(value: /* marksTotal */ Double => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEach(value: /* element */ Element => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFilter(
        value: (/* textNode */ Text, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIframes(value: Boolean): Self = StObject.set(x, "iframes", value.asInstanceOf[js.Any])
      
      inline def setIframesTimeout(value: Double): Self = StObject.set(x, "iframesTimeout", value.asInstanceOf[js.Any])
      
      inline def setIframesTimeoutUndefined: Self = StObject.set(x, "iframesTimeout", js.undefined)
      
      inline def setIframesUndefined: Self = StObject.set(x, "iframes", js.undefined)
      
      inline def setIgnoreJoiners(value: Boolean): Self = StObject.set(x, "ignoreJoiners", value.asInstanceOf[js.Any])
      
      inline def setIgnoreJoinersUndefined: Self = StObject.set(x, "ignoreJoiners", js.undefined)
      
      inline def setIgnorePunctuation(value: js.Array[String]): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
      
      inline def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
      
      inline def setIgnorePunctuationVarargs(value: String*): Self = StObject.set(x, "ignorePunctuation", js.Array(value*))
      
      inline def setLog(value: js.Object): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setNoMatch(value: /* term */ String => Unit): Self = StObject.set(x, "noMatch", js.Any.fromFunction1(value))
      
      inline def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
      
      inline def setSeparateWordSearch(value: Boolean): Self = StObject.set(x, "separateWordSearch", value.asInstanceOf[js.Any])
      
      inline def setSeparateWordSearchUndefined: Self = StObject.set(x, "separateWordSearch", js.undefined)
      
      inline def setSynonyms(value: StringDictionary[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
      
      inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
      
      inline def setWildcards(value: disabled | enabled | withSpaces): Self = StObject.set(x, "wildcards", value.asInstanceOf[js.Any])
      
      inline def setWildcardsUndefined: Self = StObject.set(x, "wildcards", js.undefined)
    }
  }
  
  trait MarkRangesOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.undefined
    
    var each: js.UndefOr[js.Function2[/* element */ Element, /* range */ Range, Unit]] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[
        js.Function4[
          /* textNode */ Text, 
          /* term */ String, 
          /* marksSoFar */ Double, 
          /* marksTotal */ Double, 
          Boolean
        ]
      ] = js.undefined
    
    var iframes: js.UndefOr[Boolean] = js.undefined
    
    var iframesTimeout: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[js.Object] = js.undefined
    
    var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.undefined
  }
  object MarkRangesOptions {
    
    inline def apply(): MarkRangesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkRangesOptions]
    }
    
    extension [Self <: MarkRangesOptions](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDone(value: /* marksTotal */ Double => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEach(value: (/* element */ Element, /* range */ Range) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
      
      inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFilter(
        value: (/* textNode */ Text, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIframes(value: Boolean): Self = StObject.set(x, "iframes", value.asInstanceOf[js.Any])
      
      inline def setIframesTimeout(value: Double): Self = StObject.set(x, "iframesTimeout", value.asInstanceOf[js.Any])
      
      inline def setIframesTimeoutUndefined: Self = StObject.set(x, "iframesTimeout", js.undefined)
      
      inline def setIframesUndefined: Self = StObject.set(x, "iframes", js.undefined)
      
      inline def setLog(value: js.Object): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setNoMatch(value: /* term */ String => Unit): Self = StObject.set(x, "noMatch", js.Any.fromFunction1(value))
      
      inline def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    }
  }
  
  trait MarkRegExpOptions extends StObject {
    
    var acrossElements: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.undefined
    
    var each: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[
        js.Function4[
          /* textNode */ Text, 
          /* term */ String, 
          /* marksSoFar */ Double, 
          /* marksTotal */ Double, 
          Boolean
        ]
      ] = js.undefined
    
    var iframes: js.UndefOr[Boolean] = js.undefined
    
    var iframesTimeout: js.UndefOr[Double] = js.undefined
    
    var ignoreGroups: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[js.Object] = js.undefined
    
    var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.undefined
  }
  object MarkRegExpOptions {
    
    inline def apply(): MarkRegExpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkRegExpOptions]
    }
    
    extension [Self <: MarkRegExpOptions](x: Self) {
      
      inline def setAcrossElements(value: Boolean): Self = StObject.set(x, "acrossElements", value.asInstanceOf[js.Any])
      
      inline def setAcrossElementsUndefined: Self = StObject.set(x, "acrossElements", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDone(value: /* marksTotal */ Double => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEach(value: /* element */ Element => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFilter(
        value: (/* textNode */ Text, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIframes(value: Boolean): Self = StObject.set(x, "iframes", value.asInstanceOf[js.Any])
      
      inline def setIframesTimeout(value: Double): Self = StObject.set(x, "iframesTimeout", value.asInstanceOf[js.Any])
      
      inline def setIframesTimeoutUndefined: Self = StObject.set(x, "iframesTimeout", js.undefined)
      
      inline def setIframesUndefined: Self = StObject.set(x, "iframes", js.undefined)
      
      inline def setIgnoreGroups(value: Double): Self = StObject.set(x, "ignoreGroups", value.asInstanceOf[js.Any])
      
      inline def setIgnoreGroupsUndefined: Self = StObject.set(x, "ignoreGroups", js.undefined)
      
      inline def setLog(value: js.Object): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setNoMatch(value: /* term */ String => Unit): Self = StObject.set(x, "noMatch", js.Any.fromFunction1(value))
      
      inline def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    var length: Double
    
    var start: Double
  }
  object Range {
    
    inline def apply(length: Double, start: Double): Range = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarkOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var iframes: js.UndefOr[Boolean] = js.undefined
    
    var iframesTimeout: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[js.Object] = js.undefined
  }
  object UnmarkOptions {
    
    inline def apply(): UnmarkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarkOptions]
    }
    
    extension [Self <: UnmarkOptions](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDone(value: /* marksTotal */ Double => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setIframes(value: Boolean): Self = StObject.set(x, "iframes", value.asInstanceOf[js.Any])
      
      inline def setIframesTimeout(value: Double): Self = StObject.set(x, "iframesTimeout", value.asInstanceOf[js.Any])
      
      inline def setIframesTimeoutUndefined: Self = StObject.set(x, "iframesTimeout", js.undefined)
      
      inline def setIframesUndefined: Self = StObject.set(x, "iframes", js.undefined)
      
      inline def setLog(value: js.Object): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
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
