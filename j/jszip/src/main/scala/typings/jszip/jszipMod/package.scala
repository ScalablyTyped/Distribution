package typings.jszip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jszipMod {
  import typings.node.NodeJSNs.ReadableStream
  import typings.std.ArrayBuffer
  import typings.std.Blob
  import typings.std.Uint8Array

  type InputFileFormat = String | Uint8Array | js.Array[Double] | ReadableStream | ArrayBuffer | Blob
  type OnUpdateCallback = js.Function1[/* metadata */ Metadata, Unit]
}
