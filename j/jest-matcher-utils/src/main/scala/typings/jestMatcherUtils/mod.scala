package typings.jestMatcherUtils

import org.scalablytyped.runtime.Shortcut
import typings.chalk.mod.Chalk
import typings.chalk.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object BOLD_WEIGHT extends Shortcut {
    
    @JSImport("jest-matcher-utils", "BOLD_WEIGHT")
    @js.native
    val ^ : Chalk = js.native
    
    /**
    		Return a new Chalk instance.
    		*/
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("jest-matcher-utils", "BOLD_WEIGHT.Instance")
    @js.native
    class Instance () extends Chalk {
      def this(options: Options) = this()
    }
    
    type _To = Chalk
    
    /* This means you don't have to write `^`, but can instead just say `BOLD_WEIGHT.foo` */
    override def _to: Chalk = ^
  }
  
  object DIM_COLOR extends Shortcut {
    
    @JSImport("jest-matcher-utils", "DIM_COLOR")
    @js.native
    val ^ : Chalk = js.native
    
    /**
    		Return a new Chalk instance.
    		*/
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("jest-matcher-utils", "DIM_COLOR.Instance")
    @js.native
    class Instance () extends Chalk {
      def this(options: Options) = this()
    }
    
    type _To = Chalk
    
    /* This means you don't have to write `^`, but can instead just say `DIM_COLOR.foo` */
    override def _to: Chalk = ^
  }
  
  object EXPECTED_COLOR extends Shortcut {
    
    @JSImport("jest-matcher-utils", "EXPECTED_COLOR")
    @js.native
    val ^ : Chalk = js.native
    
    /**
    		Return a new Chalk instance.
    		*/
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("jest-matcher-utils", "EXPECTED_COLOR.Instance")
    @js.native
    class Instance () extends Chalk {
      def this(options: Options) = this()
    }
    
    type _To = Chalk
    
    /* This means you don't have to write `^`, but can instead just say `EXPECTED_COLOR.foo` */
    override def _to: Chalk = ^
  }
  
  object INVERTED_COLOR extends Shortcut {
    
    @JSImport("jest-matcher-utils", "INVERTED_COLOR")
    @js.native
    val ^ : Chalk = js.native
    
    /**
    		Return a new Chalk instance.
    		*/
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("jest-matcher-utils", "INVERTED_COLOR.Instance")
    @js.native
    class Instance () extends Chalk {
      def this(options: Options) = this()
    }
    
    type _To = Chalk
    
    /* This means you don't have to write `^`, but can instead just say `INVERTED_COLOR.foo` */
    override def _to: Chalk = ^
  }
  
  object RECEIVED_COLOR extends Shortcut {
    
    @JSImport("jest-matcher-utils", "RECEIVED_COLOR")
    @js.native
    val ^ : Chalk = js.native
    
    /**
    		Return a new Chalk instance.
    		*/
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("jest-matcher-utils", "RECEIVED_COLOR.Instance")
    @js.native
    class Instance () extends Chalk {
      def this(options: Options) = this()
    }
    
    type _To = Chalk
    
    /* This means you don't have to write `^`, but can instead just say `RECEIVED_COLOR.foo` */
    override def _to: Chalk = ^
  }
  
  @JSImport("jest-matcher-utils", "SUGGEST_TO_CONTAIN_EQUAL")
  @js.native
  val SUGGEST_TO_CONTAIN_EQUAL: String = js.native
  
  @JSImport("jest-matcher-utils", "diff")
  @js.native
  def diff(a: js.Any, b: js.Any): String | Null = js.native
  @JSImport("jest-matcher-utils", "diff")
  @js.native
  def diff(a: js.Any, b: js.Any, options: typings.jestDiff.typesMod.DiffOptions): String | Null = js.native
  
  @JSImport("jest-matcher-utils", "ensureActualIsNumber")
  @js.native
  def ensureActualIsNumber(actual: js.Any, matcherName: String): Unit = js.native
  @JSImport("jest-matcher-utils", "ensureActualIsNumber")
  @js.native
  def ensureActualIsNumber(actual: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  
  @JSImport("jest-matcher-utils", "ensureExpectedIsNonNegativeInteger")
  @js.native
  def ensureExpectedIsNonNegativeInteger(expected: js.Any, matcherName: String): Unit = js.native
  @JSImport("jest-matcher-utils", "ensureExpectedIsNonNegativeInteger")
  @js.native
  def ensureExpectedIsNonNegativeInteger(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  
  @JSImport("jest-matcher-utils", "ensureExpectedIsNumber")
  @js.native
  def ensureExpectedIsNumber(expected: js.Any, matcherName: String): Unit = js.native
  @JSImport("jest-matcher-utils", "ensureExpectedIsNumber")
  @js.native
  def ensureExpectedIsNumber(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  
  @JSImport("jest-matcher-utils", "ensureNoExpected")
  @js.native
  def ensureNoExpected(expected: js.Any, matcherName: String): Unit = js.native
  @JSImport("jest-matcher-utils", "ensureNoExpected")
  @js.native
  def ensureNoExpected(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  
  @JSImport("jest-matcher-utils", "ensureNumbers")
  @js.native
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String): Unit = js.native
  @JSImport("jest-matcher-utils", "ensureNumbers")
  @js.native
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  
  @JSImport("jest-matcher-utils", "getLabelPrinter")
  @js.native
  def getLabelPrinter(strings: String*): PrintLabel = js.native
  
  @JSImport("jest-matcher-utils", "highlightTrailingWhitespace")
  @js.native
  def highlightTrailingWhitespace(text: String): String = js.native
  
  @JSImport("jest-matcher-utils", "matcherErrorMessage")
  @js.native
  def matcherErrorMessage(hint: String, generic: String): String = js.native
  @JSImport("jest-matcher-utils", "matcherErrorMessage")
  @js.native
  def matcherErrorMessage(hint: String, generic: String, specific: String): String = js.native
  
  @JSImport("jest-matcher-utils", "matcherHint")
  @js.native
  def matcherHint(matcherName: String): String = js.native
  @JSImport("jest-matcher-utils", "matcherHint")
  @js.native
  def matcherHint(
    matcherName: String,
    received: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    options: MatcherHintOptions
  ): String = js.native
  @JSImport("jest-matcher-utils", "matcherHint")
  @js.native
  def matcherHint(matcherName: String, received: js.UndefOr[scala.Nothing], expected: String): String = js.native
  @JSImport("jest-matcher-utils", "matcherHint")
  @js.native
  def matcherHint(
    matcherName: String,
    received: js.UndefOr[scala.Nothing],
    expected: String,
    options: MatcherHintOptions
  ): String = js.native
  @JSImport("jest-matcher-utils", "matcherHint")
  @js.native
  def matcherHint(matcherName: String, received: String): String = js.native
  @JSImport("jest-matcher-utils", "matcherHint")
  @js.native
  def matcherHint(
    matcherName: String,
    received: String,
    expected: js.UndefOr[scala.Nothing],
    options: MatcherHintOptions
  ): String = js.native
  @JSImport("jest-matcher-utils", "matcherHint")
  @js.native
  def matcherHint(matcherName: String, received: String, expected: String): String = js.native
  @JSImport("jest-matcher-utils", "matcherHint")
  @js.native
  def matcherHint(matcherName: String, received: String, expected: String, options: MatcherHintOptions): String = js.native
  
  @JSImport("jest-matcher-utils", "pluralize")
  @js.native
  def pluralize(word: String, count: Double): String = js.native
  
  @JSImport("jest-matcher-utils", "printDiffOrStringify")
  @js.native
  def printDiffOrStringify(expected: js.Any, received: js.Any, expectedLabel: String, receivedLabel: String, expand: Boolean): String = js.native
  
  @JSImport("jest-matcher-utils", "printExpected")
  @js.native
  def printExpected(value: js.Any): String = js.native
  
  @JSImport("jest-matcher-utils", "printReceived")
  @js.native
  def printReceived(`object`: js.Any): String = js.native
  
  @JSImport("jest-matcher-utils", "printWithType")
  @js.native
  def printWithType(name: String, value: js.Any, print: js.Function1[/* value */ js.Any, String]): String = js.native
  
  @JSImport("jest-matcher-utils", "stringify")
  @js.native
  def stringify(`object`: js.Any): String = js.native
  @JSImport("jest-matcher-utils", "stringify")
  @js.native
  def stringify(`object`: js.Any, maxDepth: Double): String = js.native
  
  type DiffOptions = typings.jestDiff.typesMod.DiffOptions
  
  type MatcherHintColor = js.Function1[/* arg */ String, String]
  
  @js.native
  trait MatcherHintOptions extends StObject {
    
    var comment: js.UndefOr[String] = js.native
    
    var expectedColor: js.UndefOr[MatcherHintColor] = js.native
    
    var isDirectExpectCall: js.UndefOr[Boolean] = js.native
    
    var isNot: js.UndefOr[Boolean] = js.native
    
    var promise: js.UndefOr[String] = js.native
    
    var receivedColor: js.UndefOr[MatcherHintColor] = js.native
    
    var secondArgument: js.UndefOr[String] = js.native
    
    var secondArgumentColor: js.UndefOr[MatcherHintColor] = js.native
  }
  object MatcherHintOptions {
    
    @scala.inline
    def apply(): MatcherHintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatcherHintOptions]
    }
    
    @scala.inline
    implicit class MatcherHintOptionsMutableBuilder[Self <: MatcherHintOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setExpectedColor(value: /* arg */ String => String): Self = StObject.set(x, "expectedColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpectedColorUndefined: Self = StObject.set(x, "expectedColor", js.undefined)
      
      @scala.inline
      def setIsDirectExpectCall(value: Boolean): Self = StObject.set(x, "isDirectExpectCall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDirectExpectCallUndefined: Self = StObject.set(x, "isDirectExpectCall", js.undefined)
      
      @scala.inline
      def setIsNot(value: Boolean): Self = StObject.set(x, "isNot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNotUndefined: Self = StObject.set(x, "isNot", js.undefined)
      
      @scala.inline
      def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      @scala.inline
      def setReceivedColor(value: /* arg */ String => String): Self = StObject.set(x, "receivedColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReceivedColorUndefined: Self = StObject.set(x, "receivedColor", js.undefined)
      
      @scala.inline
      def setSecondArgument(value: String): Self = StObject.set(x, "secondArgument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondArgumentColor(value: /* arg */ String => String): Self = StObject.set(x, "secondArgumentColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSecondArgumentColorUndefined: Self = StObject.set(x, "secondArgumentColor", js.undefined)
      
      @scala.inline
      def setSecondArgumentUndefined: Self = StObject.set(x, "secondArgument", js.undefined)
    }
  }
  
  type PrintLabel = js.Function1[/* string */ String, String]
}
