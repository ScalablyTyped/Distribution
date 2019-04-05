package typings
package isDashErrorDashConstructorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
  def apply(value: js.Any): /* is std.ErrorConstructor */ scala.Boolean = js.native
}

