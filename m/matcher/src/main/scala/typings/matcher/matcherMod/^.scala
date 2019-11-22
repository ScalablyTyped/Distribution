package typings.matcher.matcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matcher", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Simple [wildcard](https://en.wikipedia.org/wiki/Wildcard_character) matching.
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
  def apply(inputs: js.Array[String], patterns: js.Array[String]): js.Array[String] = js.native
  def apply(inputs: js.Array[String], patterns: js.Array[String], options: Options): js.Array[String] = js.native
  /**
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
  def isMatch(input: String, pattern: String): Boolean = js.native
  def isMatch(input: String, pattern: String, options: Options): Boolean = js.native
  def isMatch(input: String, pattern: js.Array[String]): Boolean = js.native
  def isMatch(input: String, pattern: js.Array[String], options: Options): Boolean = js.native
  def isMatch(input: js.Array[String], pattern: String): Boolean = js.native
  def isMatch(input: js.Array[String], pattern: String, options: Options): Boolean = js.native
  def isMatch(input: js.Array[String], pattern: js.Array[String]): Boolean = js.native
  def isMatch(input: js.Array[String], pattern: js.Array[String], options: Options): Boolean = js.native
}

