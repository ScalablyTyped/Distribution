package typings.jsdom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jsdom.anon.Instantiable
import typings.jsdom.anon.InstantiableExternal
import typings.jsdom.anon.InstantiableShadowRoot
import typings.std.BigInt64ArrayConstructor
import typings.std.BigIntConstructor
import typings.std.BigUint64ArrayConstructor
import typings.std.SharedArrayBufferConstructor
import typings.std.global.External_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line: no-declare-current-package no-single-declare-module
// tslint:disable-next-line: no-single-declare-module
// tslint:disable-next-line: no-single-declare-module
@JSImport("jsdom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  trait DOMWindow extends js.Object {
    
    var Atomics: typings.std.Atomics = js.native
    
    def BigInt(): js.BigInt = js.native
    def BigInt(value: js.Any): js.BigInt = js.native
    
    var BigInt64Array: BigInt64ArrayConstructor with Instantiable0[typings.std.global.BigInt64Array] = js.native
    
    @JSName("BigInt")
    var BigInt_Original: BigIntConstructor = js.native
    
    var BigUint64Array: BigUint64ArrayConstructor with Instantiable0[typings.std.global.BigUint64Array] = js.native
    
    var External: InstantiableExternal with Instantiable0[External_] = js.native
    
    var InputEvent: Instantiable with (Instantiable1[/* type */ String, typings.std.global.InputEvent]) = js.native
    
    var ShadowRoot: InstantiableShadowRoot with Instantiable0[typings.std.global.ShadowRoot] = js.native
    
    var SharedArrayBuffer: SharedArrayBufferConstructor with (Instantiable1[/* byteLength */ Double, typings.std.global.SharedArrayBuffer]) = js.native
    
    var WebAssembly: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebAssembly */ js.Any = js.native
  }
}
