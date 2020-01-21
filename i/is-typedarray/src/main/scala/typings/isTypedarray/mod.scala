package typings.isTypedarray

import typings.node.Buffer
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

@JSImport("is-typedarray", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(candidate: js.Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = js.native
  def loose(candidate: js.Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = js.native
  def strict(candidate: js.Any): /* is is-typedarray.is-typedarray.TypedArray */ Boolean = js.native
  type TypedArray = Int8Array | Int16Array | Int32Array | Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Float32Array | Float64Array | Buffer
}

