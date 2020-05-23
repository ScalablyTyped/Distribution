package typings.ipp.mod

import typings.node.Buffer
import typings.node.urlMod.UrlWithStringQuery
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipp", "request")
@js.native
object request extends js.Object {
  def apply(
    opts: String,
    buffer: Buffer,
    cb: js.Function2[/* error */ Error | Null, /* response */ ParsedBuffer, Unit]
  ): Unit = js.native
  def apply(
    opts: UrlWithStringQuery,
    buffer: Buffer,
    cb: js.Function2[/* error */ Error | Null, /* response */ ParsedBuffer, Unit]
  ): Unit = js.native
}

