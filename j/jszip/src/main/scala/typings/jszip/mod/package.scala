package typings.jszip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InputFileFormat = typings.std.Blob | java.lang.String | typings.std.ArrayBuffer | typings.node.NodeJS.ReadableStream | js.Array[scala.Double] | typings.std.Uint8Array
  type OnUpdateCallback = js.Function1[/* metadata */ typings.jszip.mod.Metadata, scala.Unit]
}
