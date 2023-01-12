package typings.leac

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLexer(rules: Rules): Lexer = ^.asInstanceOf[js.Dynamic].applyDynamic("createLexer")(rules.asInstanceOf[js.Any]).asInstanceOf[Lexer]
  inline def createLexer(rules: Rules, options: Options): Lexer = (^.asInstanceOf[js.Dynamic].applyDynamic("createLexer")(rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Lexer]
  inline def createLexer(rules: Rules, state: String): Lexer = (^.asInstanceOf[js.Dynamic].applyDynamic("createLexer")(rules.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Lexer]
  inline def createLexer(rules: Rules, state: String, options: Options): Lexer = (^.asInstanceOf[js.Dynamic].applyDynamic("createLexer")(rules.asInstanceOf[js.Any], state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Lexer]
  inline def createLexer(rules: Rules, state: Unit, options: Options): Lexer = (^.asInstanceOf[js.Dynamic].applyDynamic("createLexer")(rules.asInstanceOf[js.Any], state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Lexer]
  
  type Lexer = js.Function2[/* str */ String, /* offset */ js.UndefOr[Double], LexerResult]
  
  trait LexerResult extends StObject {
    
    /**
      * True if whole input string was processed.
      *
      * Check this to see whether some input left untokenized.
      */
    var complete: Boolean
    
    /** Final offset. */
    var offset: Double
    
    /** Array of tokens. */
    var tokens: js.Array[Token]
  }
  object LexerResult {
    
    inline def apply(complete: Boolean, offset: Double, tokens: js.Array[Token]): LexerResult = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexerResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LexerResult] (val x: Self) extends AnyVal {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Enable line and column numbers computation.
      */
    var lineNumbers: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
    }
  }
  
  trait RegexRule
    extends StObject
       with Rule {
    
    /**
      * Regular expression to match.
      *
      * - Can't have the global flag.
      *
      * - All regular expressions are used as sticky,
      *   you don't have to specify the sticky flag.
      *
      * - Empty matches are considered as non-matches -
      *   no token will be emitted in that case.
      */
    var regex: js.RegExp
    
    /**
      * Replacement string can include patterns,
      * the same as [String.prototype.replace()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace#specifying_a_string_as_a_parameter).
      *
      * This will only affect the text property of an output token, not it's offset or length.
      *
      * Note: the regex has to be able to match the matched substring when taken out of context
      * in order for replace to work - boundary/neighborhood conditions may prevent this.
      */
    var replace: js.UndefOr[String] = js.undefined
  }
  object RegexRule {
    
    inline def apply(name: String, regex: js.RegExp): RegexRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexRule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegexRule] (val x: Self) extends AnyVal {
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
  
  trait Rule extends StObject {
    
    /**
      * Matched token won't be added to the output array if this set to `true`.
      *
      * (_Think twice before using this._)
      * */
    var discard: js.UndefOr[Boolean] = js.undefined
    
    /** The name of the rule, also the name of tokens produced by this rule. */
    var name: String
    
    /**
      * Stop after this match and return.
      *
      * If there is a parent parser - it will continue from this point.
      */
    var pop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Switch to another lexer function after this match,
      * concatenate it's results and continue from where it stopped.
      */
    var push: js.UndefOr[Lexer] = js.undefined
  }
  object Rule {
    
    inline def apply(name: String): Rule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      inline def setDiscard(value: Boolean): Self = StObject.set(x, "discard", value.asInstanceOf[js.Any])
      
      inline def setDiscardUndefined: Self = StObject.set(x, "discard", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPop(value: Boolean): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      inline def setPush(value: (/* str */ String, /* offset */ js.UndefOr[Double]) => LexerResult): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    }
  }
  
  type Rules = Array[Rule | StringRule | RegexRule]
  
  trait StringRule
    extends StObject
       with Rule {
    
    /**
      * Specify the exact string to match
      * if it is different from the name of the rule.
      */
    var str: String
  }
  object StringRule {
    
    inline def apply(name: String, str: String): StringRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringRule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringRule] (val x: Self) extends AnyVal {
      
      inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    }
  }
  
  trait Token extends StObject {
    
    /**
      * Column number within the line in the source string (1-based).
      *
      * _(Always zero if line numbers not enabled in the lexer options.)_
      */
    var column: Double
    
    /**
      * The length of the matched substring.
      *
      * _(Might be different from the text length in case replace value
      * was used in a RegexRule.)_
      */
    var len: Double
    
    /**
      * Line number in the source string (1-based).
      *
      * _(Always zero if not enabled in the lexer options.)_
      */
    var line: Double
    
    /** Name of the rule produced this token. */
    var name: String
    
    /** Start index of the match in the input string. */
    var offset: Double
    
    /** Name of the lexer containing the rule produced this token. */
    var state: String
    
    /** Text matched by the rule. _(Unless a replace value was used by a RegexRule.)_ */
    var text: String
  }
  object Token {
    
    inline def apply(
      column: Double,
      len: Double,
      line: Double,
      name: String,
      offset: Double,
      state: String,
      text: String
    ): Token = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
