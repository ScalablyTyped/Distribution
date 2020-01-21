package typings.k6.httpMod

import typings.k6.mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", "file")
@js.native
object file extends js.Object {
  def apply(data: String): FileData = js.native
  def apply(data: String, filename: String): FileData = js.native
  def apply(data: String, filename: String, contentType: String): FileData = js.native
  def apply(data: bytes): FileData = js.native
  def apply(data: bytes, filename: String): FileData = js.native
  def apply(data: bytes, filename: String, contentType: String): FileData = js.native
}

