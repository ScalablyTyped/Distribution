package typings.jestMatcherUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-matcher-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-matcher-utils", "BOLD_WEIGHT")
  @js.native
  val BOLD_WEIGHT: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
  
  @JSImport("jest-matcher-utils", "DIM_COLOR")
  @js.native
  val DIM_COLOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
  
  @JSImport("jest-matcher-utils", "EXPECTED_COLOR")
  @js.native
  val EXPECTED_COLOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
  
  @JSImport("jest-matcher-utils", "INVERTED_COLOR")
  @js.native
  val INVERTED_COLOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
  
  @JSImport("jest-matcher-utils", "RECEIVED_COLOR")
  @js.native
  val RECEIVED_COLOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
  
  @JSImport("jest-matcher-utils", "SUGGEST_TO_CONTAIN_EQUAL")
  @js.native
  val SUGGEST_TO_CONTAIN_EQUAL: String = js.native
  
  inline def diff(a: Any, b: Any): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def diff(a: Any, b: Any, options: DiffOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def ensureActualIsNumber(actual: Any, matcherName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureActualIsNumber")(actual.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureActualIsNumber(actual: Any, matcherName: String, options: MatcherHintOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureActualIsNumber")(actual.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureExpectedIsNonNegativeInteger(expected: Any, matcherName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExpectedIsNonNegativeInteger")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureExpectedIsNonNegativeInteger(expected: Any, matcherName: String, options: MatcherHintOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExpectedIsNonNegativeInteger")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureExpectedIsNumber(expected: Any, matcherName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExpectedIsNumber")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureExpectedIsNumber(expected: Any, matcherName: String, options: MatcherHintOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExpectedIsNumber")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureNoExpected(expected: Any, matcherName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureNoExpected")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureNoExpected(expected: Any, matcherName: String, options: MatcherHintOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureNoExpected")(expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureNumbers(actual: Any, expected: Any, matcherName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureNumbers")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureNumbers(actual: Any, expected: Any, matcherName: String, options: MatcherHintOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureNumbers")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], matcherName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getLabelPrinter(strings: String*): PrintLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("getLabelPrinter")(strings.asInstanceOf[Seq[js.Any]]*).asInstanceOf[PrintLabel]
  
  inline def highlightTrailingWhitespace(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightTrailingWhitespace")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def matcherErrorMessage(hint: String, generic: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherErrorMessage")(hint.asInstanceOf[js.Any], generic.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def matcherErrorMessage(hint: String, generic: String, specific: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherErrorMessage")(hint.asInstanceOf[js.Any], generic.asInstanceOf[js.Any], specific.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def matcherHint(matcherName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def matcherHint(matcherName: String, received: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def matcherHint(matcherName: String, received: String, expected: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def matcherHint(matcherName: String, received: String, expected: String, options: MatcherHintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def matcherHint(matcherName: String, received: String, expected: Unit, options: MatcherHintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def matcherHint(matcherName: String, received: Unit, expected: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def matcherHint(matcherName: String, received: Unit, expected: String, options: MatcherHintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def matcherHint(matcherName: String, received: Unit, expected: Unit, options: MatcherHintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matcherHint")(matcherName.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pluralize(word: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printDiffOrStringify(expected: Any, received: Any, expectedLabel: String, receivedLabel: String, expand: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printDiffOrStringify")(expected.asInstanceOf[js.Any], received.asInstanceOf[js.Any], expectedLabel.asInstanceOf[js.Any], receivedLabel.asInstanceOf[js.Any], expand.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printExpected(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printExpected")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def printReceived(`object`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printReceived")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def printWithType[T](name: String, value: T, print: js.Function1[/* value */ T, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printWithType")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], print.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringify(`object`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(`object`: Any, maxDepth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(`object`: Any, maxDepth: Double, maxWidth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(`object`: Any, maxDepth: Unit, maxWidth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type DiffOptions = typings.jestDiff.mod.DiffOptions
  
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
    
    inline def apply(): MatcherHintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatcherHintOptions]
    }
    
    extension [Self <: MatcherHintOptions](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setExpectedColor(value: /* arg */ String => String): Self = StObject.set(x, "expectedColor", js.Any.fromFunction1(value))
      
      inline def setExpectedColorUndefined: Self = StObject.set(x, "expectedColor", js.undefined)
      
      inline def setIsDirectExpectCall(value: Boolean): Self = StObject.set(x, "isDirectExpectCall", value.asInstanceOf[js.Any])
      
      inline def setIsDirectExpectCallUndefined: Self = StObject.set(x, "isDirectExpectCall", js.undefined)
      
      inline def setIsNot(value: Boolean): Self = StObject.set(x, "isNot", value.asInstanceOf[js.Any])
      
      inline def setIsNotUndefined: Self = StObject.set(x, "isNot", js.undefined)
      
      inline def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setReceivedColor(value: /* arg */ String => String): Self = StObject.set(x, "receivedColor", js.Any.fromFunction1(value))
      
      inline def setReceivedColorUndefined: Self = StObject.set(x, "receivedColor", js.undefined)
      
      inline def setSecondArgument(value: String): Self = StObject.set(x, "secondArgument", value.asInstanceOf[js.Any])
      
      inline def setSecondArgumentColor(value: /* arg */ String => String): Self = StObject.set(x, "secondArgumentColor", js.Any.fromFunction1(value))
      
      inline def setSecondArgumentColorUndefined: Self = StObject.set(x, "secondArgumentColor", js.undefined)
      
      inline def setSecondArgumentUndefined: Self = StObject.set(x, "secondArgument", js.undefined)
    }
  }
  
  type PrintLabel = js.Function1[/* string */ String, String]
}
