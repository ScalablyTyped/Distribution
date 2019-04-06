package typings
package isDashSvgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Check if a string or buffer is [SVG](https://en.wikipedia.org/wiki/Scalable_Vector_Graphics).
  	@param input - The data to check.
  	@returns Whether `input` is SVG or not.
  	@example
  	```
  	import isSvg = require('is-svg');
  	isSvg('<svg xmlns="http://www.w3.org/2000/svg"><path fill="#00CD9F"/></svg>');
  	//=> true
  	```
  	*/
  def apply(input: java.lang.String): scala.Boolean = js.native
  def apply(input: nodeLib.Buffer): scala.Boolean = js.native
}

