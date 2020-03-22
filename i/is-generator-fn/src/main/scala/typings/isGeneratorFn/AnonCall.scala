package typings.isGeneratorFn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
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
}

