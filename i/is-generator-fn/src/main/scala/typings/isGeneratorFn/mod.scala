package typings.isGeneratorFn

import typings.isGeneratorFn.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("is-generator-fn", JSImport.Namespace)
  @js.native
  def apply(value: js.Any): /* is std.GeneratorFunction */ Boolean = js.native
  
  @JSImport("is-generator-fn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isGeneratorFn(value: unknown): value is GeneratorFunction;
  // export = isGeneratorFn;
  @JSImport("is-generator-fn", "default")
  @js.native
  def default: Call = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isGeneratorFn(value: unknown): value is GeneratorFunction;
  // export = isGeneratorFn;
  @JSImport("is-generator-fn", "default")
  @js.native
  def default(value: js.Any): /* is std.GeneratorFunction */ Boolean = js.native
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
