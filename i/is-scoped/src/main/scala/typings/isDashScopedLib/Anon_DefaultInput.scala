package typings
package isDashScopedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultInput extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isScoped(input: string): boolean;
  // export = isScoped;
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Check if a string is a [scoped npm package name](https://docs.npmjs.com/misc/scope).
  	@example
  	```
  	import isScoped = require('is-scoped');
  	isScoped('@sindresorhus/df');
  	//=> true
  	isScoped('cat-names');
  	//=> false
  	```
  	*/
  def apply(input: java.lang.String): scala.Boolean = js.native
  /**
  	Check if a string is a [scoped npm package name](https://docs.npmjs.com/misc/scope).
  	@example
  	```
  	import isScoped = require('is-scoped');
  	isScoped('@sindresorhus/df');
  	//=> true
  	isScoped('cat-names');
  	//=> false
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isScoped(input: string): boolean;
  // export = isScoped;
  def default(input: java.lang.String): scala.Boolean = js.native
}

