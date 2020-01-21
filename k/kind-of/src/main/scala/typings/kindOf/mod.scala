package typings.kindOf

import typings.kindOf.kindOfStrings.`null`
import typings.kindOf.kindOfStrings.array
import typings.kindOf.kindOfStrings.arrayiterator
import typings.kindOf.kindOfStrings.boolean
import typings.kindOf.kindOfStrings.buffer
import typings.kindOf.kindOfStrings.date
import typings.kindOf.kindOfStrings.error
import typings.kindOf.kindOfStrings.float32array
import typings.kindOf.kindOfStrings.float64array
import typings.kindOf.kindOfStrings.function
import typings.kindOf.kindOfStrings.generator
import typings.kindOf.kindOfStrings.generatorfunction
import typings.kindOf.kindOfStrings.int16array
import typings.kindOf.kindOfStrings.int32array
import typings.kindOf.kindOfStrings.int8array
import typings.kindOf.kindOfStrings.map
import typings.kindOf.kindOfStrings.mapiterator
import typings.kindOf.kindOfStrings.number
import typings.kindOf.kindOfStrings.promise
import typings.kindOf.kindOfStrings.regexp
import typings.kindOf.kindOfStrings.set
import typings.kindOf.kindOfStrings.setiterator
import typings.kindOf.kindOfStrings.string
import typings.kindOf.kindOfStrings.stringiterator
import typings.kindOf.kindOfStrings.symbol
import typings.kindOf.kindOfStrings.uint16array
import typings.kindOf.kindOfStrings.uint32array
import typings.kindOf.kindOfStrings.uint8array
import typings.kindOf.kindOfStrings.uint8clampedarray
import typings.kindOf.kindOfStrings.weakmap
import typings.kindOf.kindOfStrings.weakset
import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Iterator
import typings.std.Map
import typings.std.RegExp
import typings.std.Set
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import typings.std.WeakMap
import typings.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kind-of", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): `null` = js.native
  def apply(thing: String): string = js.native
  def apply(thing: js.Any): String = js.native
  def apply(thing: js.Array[_]): array = js.native
  def apply(thing: js.Function1[/* repeated */ js.Any, _]): function | generatorfunction = js.native
  def apply(thing: js.Promise[_]): promise = js.native
  def apply(thing: js.Symbol): symbol = js.native
  def apply(thing: Boolean): boolean = js.native
  def apply(thing: Double): number = js.native
  def apply(thing: Buffer): buffer = js.native
  def apply(thing: Date): date = js.native
  def apply(thing: Error): error = js.native
  def apply(thing: Float32Array): float32array = js.native
  def apply(thing: Float64Array): float64array = js.native
  def apply(thing: Int16Array): int16array = js.native
  def apply(thing: Int32Array): int32array = js.native
  def apply(thing: Int8Array): int8array = js.native
  def apply(thing: Iterator[_, _, js.UndefOr[scala.Nothing]]): generator | stringiterator | arrayiterator | mapiterator | setiterator = js.native
  def apply(thing: Map[_, _]): map = js.native
  def apply(thing: RegExp): regexp = js.native
  def apply(thing: Set[_]): set = js.native
  def apply(thing: Uint16Array): uint16array = js.native
  def apply(thing: Uint32Array): uint32array = js.native
  def apply(thing: Uint8Array): uint8array = js.native
  def apply(thing: Uint8ClampedArray): uint8clampedarray = js.native
  def apply(thing: WeakMap[_, _]): weakmap = js.native
  def apply(thing: WeakSet[_]): weakset = js.native
}

