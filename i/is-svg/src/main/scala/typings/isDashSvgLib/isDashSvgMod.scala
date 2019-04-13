package typings
package isDashSvgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-svg", JSImport.Namespace)
@js.native
object isDashSvgMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isSvg(input: string | Buffer): boolean;
  // export = isSvg;
  @JSName("default")
  var default_Original: isDashSvgLib.Anon_Default = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isSvg(input: string | Buffer): boolean;
  // export = isSvg;
  def default(input: java.lang.String): scala.Boolean = js.native
  def default(input: nodeLib.Buffer): scala.Boolean = js.native
}

