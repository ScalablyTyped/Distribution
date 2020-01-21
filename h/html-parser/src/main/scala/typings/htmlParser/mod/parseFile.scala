package typings.htmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html-parser", "parseFile")
@js.native
object parseFile extends js.Object {
  def apply(
    fileName: String,
    encoding: js.UndefOr[scala.Nothing],
    callbacks: CallbacksOption,
    callback: Callback
  ): Unit = js.native
  def apply(fileName: String, encoding: String, callbacks: CallbacksOption, callback: Callback): Unit = js.native
}

