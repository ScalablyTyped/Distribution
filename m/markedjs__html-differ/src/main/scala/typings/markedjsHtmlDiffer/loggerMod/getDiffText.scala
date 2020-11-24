package typings.markedjsHtmlDiffer.loggerMod

import typings.markedjsHtmlDiffer.mod.ChangeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@markedjs/html-differ/lib/logger", "getDiffText")
@js.native
object getDiffText extends js.Object {
  
  def apply(result: js.Array[ChangeObject]): String = js.native
  def apply(result: js.Array[ChangeObject], options: LoggerOptions): String = js.native
}
