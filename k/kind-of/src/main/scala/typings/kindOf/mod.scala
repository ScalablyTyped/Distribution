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
import typings.kindOf.kindOfStrings.undefined
import typings.kindOf.kindOfStrings.weakmap
import typings.kindOf.kindOfStrings.weakset
import typings.node.bufferMod.global.Buffer
import typings.std.Map
import typings.std.Set
import typings.std.WeakMap
import typings.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(thing: String): string = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[string]
  inline def apply(thing: js.Array[Any]): array = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[array]
  inline def apply(thing: js.Date): date = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[date]
  inline def apply(thing: js.Error): error = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[error]
  inline def apply(thing: js.Function1[/* repeated */ Any, Any]): function | generatorfunction = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[function | generatorfunction]
  inline def apply(thing: js.Iterator[Any]): generator | stringiterator | arrayiterator | mapiterator | setiterator = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[generator | stringiterator | arrayiterator | mapiterator | setiterator]
  inline def apply(thing: js.Promise[Any]): promise = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[promise]
  inline def apply(thing: js.RegExp): regexp = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[regexp]
  inline def apply(thing: js.Symbol): symbol = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[symbol]
  inline def apply(thing: js.typedarray.Float32Array): float32array = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[float32array]
  inline def apply(thing: js.typedarray.Float64Array): float64array = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[float64array]
  inline def apply(thing: js.typedarray.Int16Array): int16array = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[int16array]
  inline def apply(thing: js.typedarray.Int32Array): int32array = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[int32array]
  inline def apply(thing: js.typedarray.Int8Array): int8array = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[int8array]
  inline def apply(thing: js.typedarray.Uint16Array): uint16array = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[uint16array]
  inline def apply(thing: js.typedarray.Uint32Array): uint32array = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[uint32array]
  inline def apply(thing: js.typedarray.Uint8Array): uint8array = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[uint8array]
  inline def apply(thing: js.typedarray.Uint8ClampedArray): uint8clampedarray = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[uint8clampedarray]
  inline def apply(thing: Any): String = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(thing: Boolean): boolean = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[boolean]
  inline def apply(thing: Double): number = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[number]
  inline def apply(thing: Null): `null` = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[`null`]
  inline def apply(thing: Unit): undefined = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[undefined]
  inline def apply(thing: Buffer): buffer = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[buffer]
  inline def apply(thing: Map[Any, Any]): map = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[map]
  inline def apply(thing: Set[Any]): set = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[set]
  inline def apply(thing: WeakMap[Any, Any]): weakmap = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[weakmap]
  inline def apply(thing: WeakSet[Any]): weakset = ^.asInstanceOf[js.Dynamic].apply(thing.asInstanceOf[js.Any]).asInstanceOf[weakset]
  
  @JSImport("kind-of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
