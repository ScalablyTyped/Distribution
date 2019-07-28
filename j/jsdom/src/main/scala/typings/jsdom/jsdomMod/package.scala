package typings.jsdom

import typings.jsdom.Anon_ContentType
import typings.jsdom.Anon_ContentTypeStorageQuota
import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsdomMod {
  type BinaryData = ArrayBuffer | DataView | Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
  type ConstructorOptions = Options with Anon_ContentTypeStorageQuota
  type FromFileOptions = Options with Anon_ContentType
  type FromUrlOptions = Options
}
