package typings.matcher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Simple [wildcard](https://en.wikipedia.org/wiki/Wildcard_character) matching.
  	It matches even across newlines. For example, `foo*r` will match `foo\nbar`.
  	@param inputs - Strings to match.
  	@param patterns - Use `*` to match zero or more characters. A pattern starting with `!` will be negated.
  	@returns The `inputs` filtered based on the `patterns`.
  	@example
  	```
  	import matcher = require('matcher');
  	matcher(['foo', 'bar', 'moo'], ['*oo', '!foo']);
  	//=> ['moo']
  	matcher(['foo', 'bar', 'moo'], ['!*oo']);
  	//=> ['bar']
  	```
  	*/
  @JSImport("matcher", JSImport.Namespace)
  @js.native
  def apply(inputs: js.Array[String], patterns: js.Array[String]): js.Array[String] = js.native
  @JSImport("matcher", JSImport.Namespace)
  @js.native
  def apply(inputs: js.Array[String], patterns: js.Array[String], options: Options): js.Array[String] = js.native
  
  /**
  	It matches even across newlines. For example, `foo*r` will match `foo\nbar`.
  	@param input - String or array of strings to match.
  	@param pattern - String or array of string patterns. Use `*` to match zero or more characters. A pattern starting with `!` will be negated.
  	@returns Whether any given `input` matches every given `pattern`.
  	@example
  	```
  	import matcher = require('matcher');
  	matcher.isMatch('unicorn', 'uni*');
  	//=> true
  	matcher.isMatch('unicorn', '*corn');
  	//=> true
  	matcher.isMatch('unicorn', 'un*rn');
  	//=> true
  	matcher.isMatch('rainbow', '!unicorn');
  	//=> true
  	matcher.isMatch('foo bar baz', 'foo b* b*');
  	//=> true
  	matcher.isMatch('unicorn', 'uni\\*');
  	//=> false
  	matcher.isMatch('UNICORN', 'UNI*', {caseSensitive: true});
  	//=> true
  	matcher.isMatch('UNICORN', 'unicorn', {caseSensitive: true});
  	//=> false
  	matcher.isMatch(['foo', 'bar'], 'f*');
  	//=> true
  	matcher.isMatch(['foo', 'bar'], ['a*', 'b*']);
  	//=> true
  	matcher.isMatch('unicorn', ['tri*', 'UNI*'], {caseSensitive: true});
  	//=> false
  	```
  	*/
  @JSImport("matcher", "isMatch")
  @js.native
  def isMatch(input: String, pattern: String): Boolean = js.native
  @JSImport("matcher", "isMatch")
  @js.native
  def isMatch(input: String, pattern: String, options: Options): Boolean = js.native
  @JSImport("matcher", "isMatch")
  @js.native
  def isMatch(input: String, pattern: js.Array[String]): Boolean = js.native
  @JSImport("matcher", "isMatch")
  @js.native
  def isMatch(input: String, pattern: js.Array[String], options: Options): Boolean = js.native
  @JSImport("matcher", "isMatch")
  @js.native
  def isMatch(input: js.Array[String], pattern: String): Boolean = js.native
  @JSImport("matcher", "isMatch")
  @js.native
  def isMatch(input: js.Array[String], pattern: String, options: Options): Boolean = js.native
  @JSImport("matcher", "isMatch")
  @js.native
  def isMatch(input: js.Array[String], pattern: js.Array[String]): Boolean = js.native
  @JSImport("matcher", "isMatch")
  @js.native
  def isMatch(input: js.Array[String], pattern: js.Array[String], options: Options): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Treat uppercase and lowercase characters as being the same.
    		Ensure you use this correctly. For example, files and directories should be matched case-insensitively, while most often, object keys should be matched case-sensitively.
    		@default false
    		*/
    val caseSensitive: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    }
  }
}
