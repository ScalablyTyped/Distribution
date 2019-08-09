package typings.jpegDashJs

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jpegDashJsMod {
  type BufferLike = Buffer | Uint8Array | ArrayLike[Double] | Iterable[Double] | ArrayBuffer
  type BufferRet = RawImageData[Buffer]
  type ImageData = BufferRet | UintArrRet
  type UintArrRet = RawImageData[Uint8Array]
}
