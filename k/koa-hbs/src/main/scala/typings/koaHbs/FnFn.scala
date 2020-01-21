package typings.koaHbs

import typings.handlebars.Handlebars.HelperDeclareSpec
import typings.handlebars.Handlebars.HelperDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnFn extends js.Object {
  def apply(name: String, fn: HelperDelegate): Unit = js.native
  def apply(name: HelperDeclareSpec): Unit = js.native
}

