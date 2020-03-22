package typings.makeDir

import typings.node.AnonBufferBytesRead
import typings.node.AnonBufferDataViewBytesReadNumber
import typings.node.AnonBufferFloat32ArrayBytesReadNumber
import typings.node.AnonBufferFloat64ArrayBytesReadNumber
import typings.node.AnonBufferInt16ArrayBytesReadNumber
import typings.node.AnonBufferInt32ArrayBytesReadNumber
import typings.node.AnonBufferInt8ArrayBytesReadNumber
import typings.node.AnonBufferUint16Array
import typings.node.AnonBytesRead
import typings.node.AnonBytesReadNumber
import typings.node.NodeJS.ErrnoException
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofread extends js.Object {
  def apply(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Asynchronously reads data from the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[AnonBufferDataViewBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[AnonBufferDataViewBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[AnonBufferFloat32ArrayBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferFloat32ArrayBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[AnonBufferFloat64ArrayBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferFloat64ArrayBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[AnonBufferInt16ArrayBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt16ArrayBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[AnonBufferInt32ArrayBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt32ArrayBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[AnonBufferInt8ArrayBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt8ArrayBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[AnonBufferUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[AnonBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[AnonBytesRead] = js.native
  /**
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[AnonBytesRead] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[AnonBufferBytesRead] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[AnonBufferBytesRead] = js.native
}

