package typings.jqueryGrowl

import typings.jqueryGrowl.growl.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("growl")
  var growl_Original: growl = js.native
  def growl(options: Options): Unit = js.native
}

