package typings.isSymbol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Is this an ES6 Symbol value?
    *
    * @example
    * import assert = require('node:assert');
    * import isSymbol = require('is-symbol');
    *
    * assert(!isSymbol(function () {}));
    * assert(!isSymbol(null));
    * assert(!isSymbol(function* () { yield 42; return Infinity; });
    *
    * assert(isSymbol(Symbol.iterator));
    * assert(isSymbol(Symbol('foo')));
    * assert(isSymbol(Symbol.for('foo')));
    * assert(isSymbol(Object(Symbol('foo'))));
    */
  inline def apply(value: Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]
  
  @JSImport("is-symbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
