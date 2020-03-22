package typings.jui.mod

import typings.jui.AnonDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UITooltip extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: AnonDelay): this.type = js.native
  /**
    * Changes the content of a tooltip
    *
    */
  def update(newTitle: String): Unit = js.native
}

