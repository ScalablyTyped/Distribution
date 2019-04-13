package typings
package levenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leven", JSImport.Namespace)
@js.native
object levenMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function leven(left: string, right: string): number;
  // export = leven;
  @JSName("default")
  var default_Original: levenLib.Anon_Default = js.native
  /**
  	Measure the difference between two strings.
  	@example
  	```
  	import leven = require('leven');
  	leven('cat', 'cow');
  	//=> 2
  	```
  	*/
  def apply(left: java.lang.String, right: java.lang.String): scala.Double = js.native
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
  def default(left: java.lang.String, right: java.lang.String): scala.Double = js.native
}

