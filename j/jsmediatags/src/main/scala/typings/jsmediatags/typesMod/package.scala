package typings.jsmediatags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Byte = scala.Double
  
  type ByteArray = js.Array[typings.jsmediatags.typesMod.Byte]
  
  type DataType = js.Array[scala.Double] | typings.jsmediatags.typesMod.TypedArray | java.lang.String
  
  type FrameReaderSignature = js.Function5[
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* data */ typings.jsmediatags.mediaFileReaderMod.default, 
    /* flags */ js.UndefOr[js.Any], 
    /* id3header */ js.UndefOr[typings.jsmediatags.typesMod.TagHeader], 
    js.Any
  ]
  
  type TagFrames = org.scalablytyped.runtime.StringDictionary[typings.jsmediatags.typesMod.TagFrame]
  
  type Tags = typings.jsmediatags.typesMod.ShortcutTags with typings.jsmediatags.typesMod.TagFrames
  
  type TypedArray = typings.std.Int8Array | typings.std.Uint8Array | typings.std.Int16Array | typings.std.Uint16Array | typings.std.Int32Array | typings.std.Uint32Array | typings.std.Uint8ClampedArray | typings.std.Float32Array | typings.std.Float64Array
}
