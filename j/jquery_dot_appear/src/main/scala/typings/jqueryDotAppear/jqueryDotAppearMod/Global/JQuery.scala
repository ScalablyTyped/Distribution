package typings.jqueryDotAppear.jqueryDotAppearMod.Global

import typings.jqueryDotAppear.jqueryDotAppearMod.Options
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Initialize appear plugin
    */
  def appear[T](callback: js.Function2[/* element */ HTMLElement, /* data */ T, Unit]): JQuery = js.native
  def appear[T](callback: js.Function2[/* element */ HTMLElement, /* data */ T, Unit], options: Options[T]): JQuery = js.native
}

