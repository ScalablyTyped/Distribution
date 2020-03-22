package typings.isGeneratorFn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-generator-fn", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isGeneratorFn(value: unknown): value is GeneratorFunction;
  // export = isGeneratorFn;
  @JSName("default")
  var default_Original: AnonCall = js.native
  /**
  	Check if something is a generator function.
  	@example
  	```
  	import isGeneratorFn = require('is-generator-fn');
  	isGeneratorFn(function * () {});
  	//=> true
  	isGeneratorFn(function () {});
  	//=> false
  	```
  	*/
  def apply(value: js.Any): /* is std.GeneratorFunction */ Boolean = js.native
  /**
  	Check if something is a generator function.
  	@example
  	```
  	import isGeneratorFn = require('is-generator-fn');
  	isGeneratorFn(function * () {});
  	//=> true
  	isGeneratorFn(function () {});
  	//=> false
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isGeneratorFn(value: unknown): value is GeneratorFunction;
  // export = isGeneratorFn;
  def default(value: js.Any): /* is std.GeneratorFunction */ Boolean = js.native
}

