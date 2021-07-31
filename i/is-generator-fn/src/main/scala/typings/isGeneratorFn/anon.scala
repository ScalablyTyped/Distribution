package typings.isGeneratorFn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
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
}
