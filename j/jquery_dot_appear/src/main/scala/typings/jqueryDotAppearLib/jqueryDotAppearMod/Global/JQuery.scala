package typings
package jqueryDotAppearLib.jqueryDotAppearMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Initialize appear plugin
    */
  def appear[T](callback: js.Function2[/* element */ stdLib.HTMLElement, /* data */ T, scala.Unit]): JQuery = js.native
  def appear[T](
    callback: js.Function2[/* element */ stdLib.HTMLElement, /* data */ T, scala.Unit],
    options: jqueryDotAppearLib.jqueryDotAppearMod.Options[T]
  ): JQuery = js.native
}

