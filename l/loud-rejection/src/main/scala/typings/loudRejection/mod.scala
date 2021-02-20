package typings.loudRejection

import typings.loudRejection.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Make unhandled promise rejections fail loudly instead of the default [silent fail](https://gist.github.com/benjamingr/0237932cee84712951a2).
  	@param log - Custom logging function to print the rejected promise. Receives the error stack. Default: `console.error`.
  	@example
  	```
  	import loudRejection = require('loud-rejection');
  	import promiseFunction = require('promise-fn');
  	// Install the `unhandledRejection` listeners
  	loudRejection();
  	promiseFunction();
  	```
  	*/
  @JSImport("loud-rejection", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("loud-rejection", JSImport.Namespace)
  @js.native
  def apply(log: js.Function1[/* stack */ String, Unit]): Unit = js.native
  
  @JSImport("loud-rejection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Make unhandled promise rejections fail loudly instead of the default [silent fail](https://gist.github.com/benjamingr/0237932cee84712951a2).
  	@param log - Custom logging function to print the rejected promise. Receives the error stack. Default: `console.error`.
  	@example
  	```
  	import loudRejection = require('loud-rejection');
  	import promiseFunction = require('promise-fn');
  	// Install the `unhandledRejection` listeners
  	loudRejection();
  	promiseFunction();
  	```
  	*/
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function loudRejection(log?: (stack: string) => void): void;
  // export = loudRejection;
  @JSImport("loud-rejection", "default")
  @js.native
  def default(): Unit = js.native
  @JSImport("loud-rejection", "default")
  @js.native
  def default(log: js.Function1[/* stack */ String, Unit]): Unit = js.native
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function loudRejection(log?: (stack: string) => void): void;
  // export = loudRejection;
  @JSImport("loud-rejection", "default")
  @js.native
  def default_Fmod: Call = js.native
  
  @scala.inline
  def default_Fmod_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
