package typings.jestMatcherUtils

import org.scalablytyped.runtime.Shortcut
import typings.chalk.mod.Chalk
import typings.chalk.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-matcher-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    class Instance ()
      extends StObject
         with Chalk {
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
    class Instance ()
      extends StObject
         with Chalk {
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
    class Instance ()
      extends StObject
         with Chalk {
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
    class Instance ()
      extends StObject
         with Chalk {
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
    class Instance ()
      extends StObject
         with Chalk {
      def this(options: Options) = this()
    }
    
    type _To = Chalk
    
    /* This means you don't have to write `^`, but can instead just say `RECEIVED_COLOR.foo` */
    override def _to: Chalk = ^
  }
  
  @JSImport("jest-matcher-utils", "SUGGEST_TO_CONTAIN_EQUAL")
  @js.native
  val SUGGEST_TO_CONTAIN_EQUAL: String = js.native
  
  @scala.inline
  def diff(a: js.Any, b: js.Any): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  @scala.inline
  def diff(a: js.Any, b: js.Any, options: typings.jestDiff.typesMod.DiffOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @scala.inline
  def ensureActualIsNumber(actual: js.Any, matcherName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureActualIsNumber")(actual.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ensureActualIsNumber(actual: js.Any, matcherName: String, options: MatcherHintOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureActualIsNumber")(actual.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ensureExpectedIsNonNegativeInteger(expected: js.Any, matcherName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExpectedIsNonNegativeInteger")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ensureExpectedIsNonNegativeInteger(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExpectedIsNonNegativeInteger")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ensureExpectedIsNumber(expected: js.Any, matcherName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExpectedIsNumber")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ensureExpectedIsNumber(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExpectedIsNumber")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ensureNoExpected(expected: js.Any, matcherName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureNoExpected")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ensureNoExpected(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureNoExpected")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureNumbers")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureNumbers")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getLabelPrinter(strings: String*): PrintLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("getLabelPrinter")(strings.asInstanceOf[js.Any]).asInstanceOf[PrintLabel]
  
  @scala.inline
  def highlightTrailingWhitespace(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightTrailingWhitespace")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def matcherErrorMessage(hint: String, generic: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherErrorMessage")(hint.asInstanceOf[js.Any], generic.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def matcherErrorMessage(hint: String, generic: String, specific: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherErrorMessage")(hint.asInstanceOf[js.Any], generic.asInstanceOf[js.Any], specific.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def matcherHint(matcherName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def matcherHint(matcherName: String, received: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def matcherHint(matcherName: String, received: String, expected: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def matcherHint(matcherName: String, received: String, expected: String, options: MatcherHintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def matcherHint(matcherName: String, received: String, expected: Unit, options: MatcherHintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def matcherHint(matcherName: String, received: Unit, expected: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def matcherHint(matcherName: String, received: Unit, expected: String, options: MatcherHintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def matcherHint(matcherName: String, received: Unit, expected: Unit, options: MatcherHintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pluralize(word: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printDiffOrStringify(expected: js.Any, received: js.Any, expectedLabel: String, receivedLabel: String, expand: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printDiffOrStringify")(expected.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expectedLabel.asInstanceOf[js.Any], receivedLabel.asInstanceOf[js.Any], expand.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printExpected(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printExpected")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def printReceived(`object`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printReceived")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def printWithType(name: String, value: js.Any, print: js.Function1[/* value */ js.Any, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printWithType")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], print.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def stringify(`object`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(`object`: js.Any, maxDepth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type DiffOptions = typings.jestDiff.typesMod.DiffOptions
  
  type MatcherHintColor = js.Function1[/* arg */ String, String]
  
  trait MatcherHintOptions extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var expectedColor: js.UndefOr[MatcherHintColor] = js.undefined
    
    var isDirectExpectCall: js.UndefOr[Boolean] = js.undefined
    
    var isNot: js.UndefOr[Boolean] = js.undefined
    
    var promise: js.UndefOr[String] = js.undefined
    
    var receivedColor: js.UndefOr[MatcherHintColor] = js.undefined
    
    var secondArgument: js.UndefOr[String] = js.undefined
    
    var secondArgumentColor: js.UndefOr[MatcherHintColor] = js.undefined
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
