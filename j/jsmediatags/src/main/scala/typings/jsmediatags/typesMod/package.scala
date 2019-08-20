package typings.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jsmediatags.build2MediaFileReaderMod.default
  import typings.std.Float32Array
  import typings.std.Float64Array
  import typings.std.Int16Array
  import typings.std.Int32Array
  import typings.std.Int8Array
  import typings.std.Uint16Array
  import typings.std.Uint32Array
  import typings.std.Uint8Array
  import typings.std.Uint8ClampedArray

  type Byte = Double
  type ByteArray = js.Array[Byte]
  type DataType = js.Array[Double] | TypedArray | String
  type FrameReaderSignature = js.Function5[
    /* offset */ Double, 
    /* length */ Double, 
    /* data */ default, 
    /* flags */ js.UndefOr[js.Any], 
    /* id3header */ js.UndefOr[TagHeader], 
    js.Any
  ]
  type TagFrames = StringDictionary[TagFrame]
  type Tags = ShortcutTags with TagFrames
  type TypedArray = Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array
}
