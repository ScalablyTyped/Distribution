package typings.istextorbinary.istextorbinaryMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istextorbinary", "isText")
@js.native
object isText extends js.Object {
  def apply(
    filename: js.UndefOr[scala.Nothing],
    buffer: Buffer,
    next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]
  ): Unit = js.native
  def apply(
    filename: String,
    buffer: js.UndefOr[scala.Nothing],
    next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]
  ): Unit = js.native
  def apply(filename: String, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = js.native
}

