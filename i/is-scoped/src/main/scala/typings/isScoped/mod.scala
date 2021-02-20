package typings.isScoped

import typings.isScoped.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Check if a string is a [scoped npm package name](https://docs.npmjs.com/misc/scope).
  	@example
  	```
  	import isScoped = require('is-scoped');
  	isScoped('@sindresorhus/df');
  	//=> true
  	isScoped('cat-names');
  	//=> false
  	```
  	*/
  @JSImport("is-scoped", JSImport.Namespace)
  @js.native
  def apply(input: String): Boolean = js.native
  
  @JSImport("is-scoped", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isScoped(input: string): boolean;
  // export = isScoped;
  @JSImport("is-scoped", "default")
  @js.native
  def default: Call = js.native
  /**
  	Check if a string is a [scoped npm package name](https://docs.npmjs.com/misc/scope).
  	@example
  	```
  	import isScoped = require('is-scoped');
  	isScoped('@sindresorhus/df');
  	//=> true
  	isScoped('cat-names');
  	//=> false
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isScoped(input: string): boolean;
  // export = isScoped;
  @JSImport("is-scoped", "default")
  @js.native
  def default(input: String): Boolean = js.native
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
