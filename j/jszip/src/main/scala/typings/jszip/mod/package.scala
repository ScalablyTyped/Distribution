package typings.jszip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // This private `_data` property on a JSZipObject uses this interface.
  // If/when it is made public this should be uncommented.
  // interface CompressedObject {
  //     compressedSize: number;
  //     uncompressedSize: number;
  //     crc32: number;
  //     compression: object;
  //     compressedContent: string|ArrayBuffer|Uint8Array|Buffer;
  // }
  type InputFileFormat = typings.std.Blob | java.lang.String | typings.std.ArrayBuffer | typings.node.NodeJS.ReadableStream | js.Array[scala.Double] | typings.std.Uint8Array
  type OnUpdateCallback = js.Function1[/* metadata */ typings.jszip.mod.Metadata, scala.Unit]
}
