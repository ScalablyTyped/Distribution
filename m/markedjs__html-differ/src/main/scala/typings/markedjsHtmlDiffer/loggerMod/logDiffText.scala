package typings.markedjsHtmlDiffer.loggerMod

import typings.markedjsHtmlDiffer.mod.ChangeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@markedjs/html-differ/lib/logger", "logDiffText")
@js.native
object logDiffText extends js.Object {
  def apply(result: js.Array[ChangeObject]): String = js.native
  def apply(result: js.Array[ChangeObject], options: LoggerOptions): String = js.native
}

