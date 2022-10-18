package typings.hamtSharding

import typings.hamtSharding.distSrcConsumableBufferMod.ConsumableBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConsumableHashMod {
  
  @JSImport("hamt-sharding/dist/src/consumable-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hamt-sharding/dist/src/consumable-hash", "InfiniteHash")
  @js.native
  open class InfiniteHash protected () extends StObject {
    def this(
      value: js.typedarray.Uint8Array,
      hashFn: js.Function1[/* value */ js.typedarray.Uint8Array, js.Promise[js.typedarray.Uint8Array]]
    ) = this()
    
    var _availableBits: Double = js.native
    
    var _buffers: js.Array[ConsumableBuffer] = js.native
    
    var _currentBufferIndex: Double = js.native
    
    var _depth: Double = js.native
    
    def _hashFn(value: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def _produceMoreBits(): js.Promise[Unit] = js.native
    
    var _value: js.typedarray.Uint8Array = js.native
    
    def take(bits: Double): js.Promise[Double] = js.native
    
    def untake(bits: Double): Unit = js.native
  }
  
  inline def wrapHash(hashFn: js.Function1[/* value */ js.typedarray.Uint8Array, js.Promise[js.typedarray.Uint8Array]]): js.Function1[/* value */ InfiniteHash | js.typedarray.Uint8Array, InfiniteHash] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapHash")(hashFn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ InfiniteHash | js.typedarray.Uint8Array, InfiniteHash]]
}
