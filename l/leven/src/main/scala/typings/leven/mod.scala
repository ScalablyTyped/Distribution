package typings.leven

import typings.leven.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leven", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  
  /**
  	Measure the difference between two strings.
  	@example
  	```
  	import leven = require('leven');
  	leven('cat', 'cow');
  	//=> 2
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function leven(left: string, right: string): number;
  // export = leven;
  def default(left: String, right: String): Double = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function leven(left: string, right: string): number;
  // export = leven;
  @JSName("default")
  var default_Original: Call = js.native
}
