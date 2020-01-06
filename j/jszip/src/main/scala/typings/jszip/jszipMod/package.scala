package typings.jszip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jszipMod {
  import typings.node.NodeJS.ReadableStream
  import typings.std.ArrayBuffer
  import typings.std.Blob
  import typings.std.Uint8Array

  type InputFileFormat = ArrayBuffer | ReadableStream | String | Blob | js.Array[Double] | Uint8Array
  type OnUpdateCallback = js.Function1[/* metadata */ Metadata, Unit]
}
