package typings.isScoped

import typings.isScoped.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-scoped", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isScoped(input: string): boolean;
  // export = isScoped;
  @JSName("default")
  var default_Original: Call = js.native
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
  def apply(input: String): Boolean = js.native
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
  def default(input: String): Boolean = js.native
}

