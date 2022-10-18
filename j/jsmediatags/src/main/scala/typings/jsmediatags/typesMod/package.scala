package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsmediatags.build2MediaFileReaderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Byte = Double

type ByteArray = js.Array[Byte]

type DataType = js.Array[Double] | TypedArray | String

type FrameReaderSignature = js.Function5[
/* offset */ Double, 
/* length */ Double, 
/* data */ default, 
/* flags */ js.UndefOr[Any], 
/* id3header */ js.UndefOr[TagHeader], 
Any]

type TagFrames = StringDictionary[TagFrame]

type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array
