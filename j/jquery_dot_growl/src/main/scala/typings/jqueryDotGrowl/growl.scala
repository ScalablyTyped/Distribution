package typings.jqueryDotGrowl

import typings.jqueryDotGrowl.growlNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait growl extends js.Object {
  def apply(options: Options): Unit = js.native
  def error(options: Options): Unit = js.native
  def notice(options: Options): Unit = js.native
  def warning(options: Options): Unit = js.native
}

