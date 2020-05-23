package typings.makeDir.anon

import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import typings.node.anon.BufferBytesWritten
import typings.node.anon.BufferDataView
import typings.node.anon.BufferFloat32Array
import typings.node.anon.BufferFloat64Array
import typings.node.anon.BufferInt16Array
import typings.node.anon.BufferInt32Array
import typings.node.anon.BufferInt8Array
import typings.node.anon.BufferUint16Array
import typings.node.anon.BufferUint32Array
import typings.node.anon.BufferUint8Array
import typings.node.anon.BufferUint8ClampedArray
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
trait Typeofwrite extends js.Object {
  def apply(
    fd: Double,
    buffer: DataView,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Float64Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: js.UndefOr[Double | Null],
    length: js.UndefOr[Double | Null],
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* buffer */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    string: String,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    string: String,
    position: js.UndefOr[Double | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    string: String,
    position: js.UndefOr[Double | Null],
    encoding: js.UndefOr[BufferEncoding | Null],
    callback: js.Function3[ErrnoException | Null, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  def __promisify__(fd: Double): js.Promise[BufferUint8Array] = js.native
  def __promisify__(fd: Double, buffer: DataView): js.Promise[BufferDataView] = js.native
  def __promisify__(fd: Double, buffer: DataView, offset: Double): js.Promise[BufferDataView] = js.native
  def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[BufferDataView] = js.native
  def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataView] = js.native
  def __promisify__(fd: Double, buffer: Float32Array): js.Promise[BufferFloat32Array] = js.native
  def __promisify__(fd: Double, buffer: Float32Array, offset: Double): js.Promise[BufferFloat32Array] = js.native
  def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32Array] = js.native
  def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32Array] = js.native
  def __promisify__(fd: Double, buffer: Float64Array): js.Promise[BufferFloat64Array] = js.native
  def __promisify__(fd: Double, buffer: Float64Array, offset: Double): js.Promise[BufferFloat64Array] = js.native
  def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64Array] = js.native
  def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64Array] = js.native
  def __promisify__(fd: Double, buffer: Int16Array): js.Promise[BufferInt16Array] = js.native
  def __promisify__(fd: Double, buffer: Int16Array, offset: Double): js.Promise[BufferInt16Array] = js.native
  def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[BufferInt16Array] = js.native
  def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16Array] = js.native
  def __promisify__(fd: Double, buffer: Int32Array): js.Promise[BufferInt32Array] = js.native
  def __promisify__(fd: Double, buffer: Int32Array, offset: Double): js.Promise[BufferInt32Array] = js.native
  def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[BufferInt32Array] = js.native
  def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32Array] = js.native
  def __promisify__(fd: Double, buffer: Int8Array): js.Promise[BufferInt8Array] = js.native
  def __promisify__(fd: Double, buffer: Int8Array, offset: Double): js.Promise[BufferInt8Array] = js.native
  def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[BufferInt8Array] = js.native
  def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array): js.Promise[BufferUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array, offset: Double): js.Promise[BufferUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[BufferUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array): js.Promise[BufferUint32Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array, offset: Double): js.Promise[BufferUint32Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[BufferUint32Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint32Array] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array): js.Promise[BufferUint8Array] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array, offset: Double): js.Promise[BufferUint8Array] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[BufferUint8Array] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint8Array] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray): js.Promise[BufferUint8ClampedArray] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double): js.Promise[BufferUint8ClampedArray] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[BufferUint8ClampedArray] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[BufferUint8ClampedArray] = js.native
  /**
    * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param string A string to write.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  def __promisify__(fd: Double, string: String): js.Promise[BufferBytesWritten] = js.native
  def __promisify__(fd: Double, string: String, position: Double): js.Promise[BufferBytesWritten] = js.native
  def __promisify__(fd: Double, string: String, position: Double, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
  def __promisify__(fd: Double, string: String, position: Null, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
}

