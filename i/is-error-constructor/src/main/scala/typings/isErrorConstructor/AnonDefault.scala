package typings.isErrorConstructor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefault extends js.Object {
  /**
  	Check if a value is an error constructor.
  	@example
  	```
  	import isErrorConstructor = require('is-error-constructor');
  	isErrorConstructor(Error);
  	//=> true
  	isErrorConstructor(RangeError);
  	//=> true
  	function FakeError() {}
  	isErrorConstructor(FakeError);
  	//=> false
  	class UnicornError extends Error {}
  	isErrorConstructor(UnicornError);
  	//=> true
  	```
  	*/
  def apply(value: js.Any): /* is std.ErrorConstructor */ Boolean = js.native
}

