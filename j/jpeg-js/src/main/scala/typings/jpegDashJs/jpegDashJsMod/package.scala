package typings.jpegDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jpegDashJsMod {
  import typings.node.Buffer
  import typings.std.ArrayBuffer
  import typings.std.ArrayLike
  import typings.std.Iterable
  import typings.std.Uint8Array

  type BufferLike = Buffer | Uint8Array | ArrayLike[Double] | Iterable[Double] | ArrayBuffer
  type BufferRet = RawImageData[Buffer]
  type ImageData = BufferRet | UintArrRet
  type UintArrRet = RawImageData[Uint8Array]
}
