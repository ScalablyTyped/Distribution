package typings.markitup

import typings.markitup.MarkItUp.Options
import typings.markitup.MarkItUp.Static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("markItUp")
  var markItUp_Original: Static = js.native
  def markItUp(): JQuery = js.native
  def markItUp(settings: Options): JQuery = js.native
}

