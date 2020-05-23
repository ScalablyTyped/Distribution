package typings.leven

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Call extends js.Object {
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

