package typings.isSvg

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-svg", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isSvg(input: string | Buffer): boolean;
  // export = isSvg;
  @JSName("default")
  var default_Original: AnonCall = js.native
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
  def apply(input: String): Boolean = js.native
  def apply(input: Buffer): Boolean = js.native
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
  def default(input: String): Boolean = js.native
  def default(input: Buffer): Boolean = js.native
}

