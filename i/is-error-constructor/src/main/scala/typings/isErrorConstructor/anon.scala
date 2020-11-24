package typings.isErrorConstructor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
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
}
