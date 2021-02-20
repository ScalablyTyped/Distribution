package typings.jsdom

import typings.std.BigInt64ArrayConstructor
import typings.std.BigIntConstructor
import typings.std.BigUint64ArrayConstructor
import typings.std.SharedArrayBufferConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line: no-declare-current-package no-single-declare-module
// tslint:disable-next-line: no-single-declare-module
// tslint:disable-next-line: no-single-declare-module
object mod {
  
  @js.native
  trait DOMWindow extends StObject {
    
    var Atomics: typings.std.Atomics = js.native
    
    def BigInt(): js.BigInt = js.native
    def BigInt(value: js.Any): js.BigInt = js.native
    
    var BigInt64Array: BigInt64ArrayConstructor = js.native
    
    @JSName("BigInt")
    var BigInt_Original: BigIntConstructor = js.native
    
    var BigUint64Array: BigUint64ArrayConstructor = js.native
    
    var External: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof External */ js.Any = js.native
    
    var InputEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputEvent */ js.Any = js.native
    
    var ShadowRoot: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShadowRoot */ js.Any = js.native
    
    var SharedArrayBuffer: SharedArrayBufferConstructor = js.native
    
    var WebAssembly: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebAssembly */ js.Any = js.native
  }
}
