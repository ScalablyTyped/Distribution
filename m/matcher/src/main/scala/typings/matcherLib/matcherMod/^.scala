package typings
package matcherLib.matcherMod

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
  def apply(inputs: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def apply(inputs: js.Array[java.lang.String], patterns: js.Array[java.lang.String], options: Options): js.Array[java.lang.String] = js.native
  /**
  	@param input - String to match.
  	@param pattern - Use `*` to match zero or more characters. A pattern starting with `!` will be negated.
  	@returns Whether the `input` matches the `pattern`.
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
  	```
  	*/
  def isMatch(input: java.lang.String, pattern: java.lang.String): scala.Boolean = js.native
  def isMatch(input: java.lang.String, pattern: java.lang.String, options: Options): scala.Boolean = js.native
}

