package typings.isSvg

import typings.isSvg.anon.Call
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(input: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def apply(input: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  @scala.inline
  def default(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default(input: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
