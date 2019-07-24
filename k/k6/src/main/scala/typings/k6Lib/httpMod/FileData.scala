package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", "FileData")
@js.native
abstract class FileData () extends js.Object {
  var __brand: scala.Nothing = js.native
  /** Content type to include in MIME message. */
  var content_type: js.UndefOr[java.lang.String] = js.native
  /** File data. */
  var data: java.lang.String | k6Lib.k6Mod.bytes = js.native
  /** Filename to include in MIME message. */
  var filename: js.UndefOr[java.lang.String] = js.native
}

