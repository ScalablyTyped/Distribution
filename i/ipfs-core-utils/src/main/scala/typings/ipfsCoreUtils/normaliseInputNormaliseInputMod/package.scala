package typings.ipfsCoreUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object normaliseInputNormaliseInputMod {
  
  type HRTime = js.Tuple2[scala.Double, scala.Double]
  
  type Mode = scala.Double
  
  type Source = (typings.std.Iterable[
    java.lang.String | typings.std.Blob | typings.std.AsyncIterable[typings.std.Uint8Array] | typings.std.ArrayBufferView | typings.std.ArrayBuffer | typings.std.Iterable[typings.std.Uint8Array] | typings.std.ReadableStream[typings.std.Uint8Array] | typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.FileInput
  ]) | (typings.std.AsyncIterable[
    java.lang.String | typings.std.Blob | typings.std.AsyncIterable[typings.std.Uint8Array] | typings.std.ArrayBufferView | typings.std.ArrayBuffer | typings.std.Iterable[typings.std.Uint8Array] | typings.std.ReadableStream[typings.std.Uint8Array] | typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.FileInput
  ]) | (typings.std.ReadableStream[
    java.lang.String | typings.std.Blob | typings.std.AsyncIterable[typings.std.Uint8Array] | typings.std.ArrayBufferView | typings.std.ArrayBuffer | typings.std.Iterable[typings.std.Uint8Array] | typings.std.ReadableStream[typings.std.Uint8Array] | typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.FileInput
  ])
  
  type ToContent = java.lang.String | typings.std.Blob | typings.std.AsyncIterable[typings.std.Uint8Array] | typings.std.ArrayBufferView | typings.std.ArrayBuffer | typings.std.Iterable[typings.std.Uint8Array] | typings.std.ReadableStream[typings.std.Uint8Array]
  
  type ToFile = java.lang.String | typings.std.Blob | typings.std.AsyncIterable[typings.std.Uint8Array] | typings.std.ArrayBufferView | typings.std.ArrayBuffer | typings.std.Iterable[typings.std.Uint8Array] | typings.std.ReadableStream[typings.std.Uint8Array] | typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.FileInput
  
  type UnixTime = typings.ipfsCoreUtils.formatMtimeMod.MTime | typings.std.Date | (js.Tuple2[scala.Double, scala.Double])
}
