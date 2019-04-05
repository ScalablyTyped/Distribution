package typings
package isDashErrorDashConstructorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultValue extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isErrorConstructor(value: unknown): value is ErrorConstructor;
  // export = isErrorConstructor;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isErrorConstructor(value: unknown): value is ErrorConstructor;
  // export = isErrorConstructor;
  def default(value: js.Any): /* is std.ErrorConstructor */ scala.Boolean = js.native
}

