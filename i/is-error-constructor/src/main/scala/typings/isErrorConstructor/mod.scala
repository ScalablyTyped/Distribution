package typings.isErrorConstructor

import typings.isErrorConstructor.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Check if a value is an error constructor.
  	@example
  	```
  	import isErrorConstructor = require('is-error-constructor');
  	isErrorConstructor(Error);
  	//=> true
  	isErrorConstructor(RangeError);
  	//=> true
  	function FakeError() {}
  	isErrorConstructor(FakeError);
  	//=> false
  	class UnicornError extends Error {}
  	isErrorConstructor(UnicornError);
  	//=> true
  	```
  	*/
  inline def apply(value: js.Any): /* is std.ErrorConstructor */ Boolean = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.ErrorConstructor */ Boolean]
  
  @JSImport("is-error-constructor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isErrorConstructor(value: unknown): value is ErrorConstructor;
  // export = isErrorConstructor;
  @JSImport("is-error-constructor", "default")
  @js.native
  def default: Call = js.native
  /**
  	Check if a value is an error constructor.
  	@example
  	```
  	import isErrorConstructor = require('is-error-constructor');
  	isErrorConstructor(Error);
  	//=> true
  	isErrorConstructor(RangeError);
  	//=> true
  	function FakeError() {}
  	isErrorConstructor(FakeError);
  	//=> false
  	class UnicornError extends Error {}
  	isErrorConstructor(UnicornError);
  	//=> true
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isErrorConstructor(value: unknown): value is ErrorConstructor;
  // export = isErrorConstructor;
  inline def default(value: js.Any): /* is std.ErrorConstructor */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.ErrorConstructor */ Boolean]
  inline def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
