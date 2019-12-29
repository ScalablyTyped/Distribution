package typings.int64DashBuffer

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("int64-buffer", JSImport.Namespace)
@js.native
object int64DashBufferMod extends js.Object {
  @js.native
  trait Int64 extends js.Object {
    def toArray(): js.Array[Double] = js.native
    def toArray(raw: Boolean): js.Array[Double] = js.native
    def toArrayBuffer(): ArrayBuffer = js.native
    def toArrayBuffer(raw: Boolean): ArrayBuffer = js.native
    def toBuffer(): Buffer = js.native
    def toBuffer(raw: Boolean): Buffer = js.native
    def toJSON(): Double = js.native
    def toNumber(): Double = js.native
    def toString(radix: Double): String = js.native
  }
  
  @js.native
  class Int64BE () extends Int64
  
  @js.native
  class Int64LE () extends Int64
  
  @js.native
  class Uint64BE () extends Int64
  
  @js.native
  class Uint64LE () extends Int64
  
  /* static members */
  @js.native
  object Int64BE extends js.Object {
    def isInt64BE(obj: js.Any): /* is int64-buffer.int64-buffer.Int64BE */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Int64LE extends js.Object {
    def isInt64LE(obj: js.Any): /* is int64-buffer.int64-buffer.Int64LE */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Uint64BE extends js.Object {
    def isUint64BE(obj: js.Any): /* is int64-buffer.int64-buffer.Uint64BE */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Uint64LE extends js.Object {
    def isUint64LE(obj: js.Any): /* is int64-buffer.int64-buffer.Uint64LE */ Boolean = js.native
  }
  
  type ArrayType = Uint8Array | ArrayBuffer | js.Array[Double]
}

