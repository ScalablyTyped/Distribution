package typings.leven

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
    	Measure the difference between two strings.
    	@example
    	```
    	import leven = require('leven');
    	leven('cat', 'cow');
    	//=> 2
    	```
    	*/
    def apply(left: String, right: String): Double = js.native
  }
}
