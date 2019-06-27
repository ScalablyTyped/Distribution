package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", "FileData")
@js.native
abstract class FileData () extends js.Object {
  var __brand: scala.Nothing = js.native
  var content_type: js.UndefOr[java.lang.String] = js.native
  var data: java.lang.String | k6Lib.k6Mod.bytes = js.native
  var filename: js.UndefOr[java.lang.String] = js.native
}

