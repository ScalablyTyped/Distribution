package typings.jsdom

import typings.std.Atomics
import typings.std.BigInt64ArrayConstructor
import typings.std.BigIntConstructor
import typings.std.BigUint64ArrayConstructor
import typings.std.SharedArrayBufferConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line: no-declare-current-package no-single-declare-module
// tslint:disable-next-line: no-single-declare-module
// tslint:disable-next-line: no-single-declare-module
object mod {
  
  trait DOMWindow extends StObject {
    
    var Atomics: typings.std.Atomics
    
    def BigInt(): js.BigInt
    def BigInt(value: js.Any): js.BigInt
    
    var BigInt64Array: BigInt64ArrayConstructor
    
    @JSName("BigInt")
    var BigInt_Original: BigIntConstructor
    
    var BigUint64Array: BigUint64ArrayConstructor
    
    var External: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof External */ js.Any
    
    var InputEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputEvent */ js.Any
    
    var ShadowRoot: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShadowRoot */ js.Any
    
    var SharedArrayBuffer: SharedArrayBufferConstructor
    
    var WebAssembly: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebAssembly */ js.Any
  }
  object DOMWindow {
    
    @scala.inline
    def apply(
      Atomics: Atomics,
      BigInt: BigIntConstructor,
      BigInt64Array: BigInt64ArrayConstructor,
      BigUint64Array: BigUint64ArrayConstructor,
      External: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof External */ js.Any,
      InputEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputEvent */ js.Any,
      ShadowRoot: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShadowRoot */ js.Any,
      SharedArrayBuffer: SharedArrayBufferConstructor,
      WebAssembly: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebAssembly */ js.Any
    ): DOMWindow = {
      val __obj = js.Dynamic.literal(Atomics = Atomics.asInstanceOf[js.Any], BigInt = BigInt.asInstanceOf[js.Any], BigInt64Array = BigInt64Array.asInstanceOf[js.Any], BigUint64Array = BigUint64Array.asInstanceOf[js.Any], External = External.asInstanceOf[js.Any], InputEvent = InputEvent.asInstanceOf[js.Any], ShadowRoot = ShadowRoot.asInstanceOf[js.Any], SharedArrayBuffer = SharedArrayBuffer.asInstanceOf[js.Any], WebAssembly = WebAssembly.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMWindow]
    }
    
    @scala.inline
    implicit class DOMWindowMutableBuilder[Self <: DOMWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtomics(value: Atomics): Self = StObject.set(x, "Atomics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigInt(value: BigIntConstructor): Self = StObject.set(x, "BigInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigInt64Array(value: BigInt64ArrayConstructor): Self = StObject.set(x, "BigInt64Array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigUint64Array(value: BigUint64ArrayConstructor): Self = StObject.set(x, "BigUint64Array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof External */ js.Any): Self = StObject.set(x, "External", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputEvent(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputEvent */ js.Any): Self = StObject.set(x, "InputEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowRoot(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShadowRoot */ js.Any): Self = StObject.set(x, "ShadowRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedArrayBuffer(value: SharedArrayBufferConstructor): Self = StObject.set(x, "SharedArrayBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAssembly(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebAssembly */ js.Any): Self = StObject.set(x, "WebAssembly", value.asInstanceOf[js.Any])
    }
  }
}
