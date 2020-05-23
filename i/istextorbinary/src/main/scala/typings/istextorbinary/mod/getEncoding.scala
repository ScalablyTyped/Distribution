package typings.istextorbinary.mod

import typings.istextorbinary.istextorbinaryStrings.binary
import typings.istextorbinary.istextorbinaryStrings.utf8
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istextorbinary", "getEncoding")
@js.native
object getEncoding extends js.Object {
  def apply(
    buffer: Buffer,
    opts: js.UndefOr[Options],
    next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]
  ): Unit = js.native
}

