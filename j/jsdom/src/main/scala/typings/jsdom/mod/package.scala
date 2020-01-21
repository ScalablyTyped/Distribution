package typings.jsdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BinaryData = typings.std.ArrayBuffer | typings.std.DataView | typings.std.Int8Array | typings.std.Uint8Array | typings.std.Uint8ClampedArray | typings.std.Int16Array | typings.std.Uint16Array | typings.std.Int32Array | typings.std.Uint32Array | typings.std.Float32Array | typings.std.Float64Array
  type ConstructorOptions = typings.jsdom.mod.Options with typings.jsdom.AnonContentTypeStorageQuota
  type FromFileOptions = typings.jsdom.mod.Options with typings.jsdom.AnonContentType
  type FromUrlOptions = typings.jsdom.mod.Options
}
