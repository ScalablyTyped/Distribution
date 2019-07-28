package typings.jszip

import typings.node.NodeJSNs.ReadableStream
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jszipMod {
  type InputFileFormat = String | Uint8Array | js.Array[Double] | ReadableStream | ArrayBuffer | Blob
  type OnUpdateCallback = js.Function1[/* metadata */ Metadata, Unit]
}
