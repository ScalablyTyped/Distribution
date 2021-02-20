package typings.isSvg

import typings.isSvg.anon.Call
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("is-svg", JSImport.Namespace)
  @js.native
  def apply(input: String): Boolean = js.native
  @JSImport("is-svg", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): Boolean = js.native
  
  @JSImport("is-svg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isSvg(input: string | Buffer): boolean;
  // export = isSvg;
  @JSImport("is-svg", "default")
  @js.native
  def default: Call = js.native
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
  @JSImport("is-svg", "default")
  @js.native
  def default(input: String): Boolean = js.native
  @JSImport("is-svg", "default")
  @js.native
  def default(input: Buffer): Boolean = js.native
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
