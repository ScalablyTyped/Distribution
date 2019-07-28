package typings.jsoneditoronline

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONFormatter")
@js.native
class JSONFormatter protected () extends js.Object {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, options: JSONFormatterOptions) = this()
  def this(container: HTMLElement, options: JSONFormatterOptions, json: js.Any) = this()
  def get(): js.Object = js.native
  def getText(): String = js.native
  def onError(err: String): Unit = js.native
  def set(json: js.Object): Unit = js.native
  def setText(jsonString: String): Unit = js.native
}

