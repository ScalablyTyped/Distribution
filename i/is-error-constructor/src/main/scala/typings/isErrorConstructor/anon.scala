package typings.isErrorConstructor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
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
