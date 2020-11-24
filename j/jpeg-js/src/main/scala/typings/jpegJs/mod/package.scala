package typings.jpegJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BufferLike = typings.node.Buffer | typings.std.Uint8Array | typings.std.ArrayLike[scala.Double] | typings.std.Iterable[scala.Double] | typings.std.ArrayBuffer
  
  type BufferRet = typings.jpegJs.mod.RawImageData[typings.node.Buffer]
  
  type ImageData = typings.jpegJs.mod.BufferRet | typings.jpegJs.mod.UintArrRet
  
  type UintArrRet = typings.jpegJs.mod.RawImageData[typings.std.Uint8Array]
}
