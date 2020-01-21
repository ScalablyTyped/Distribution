package typings.jui.mod

import typings.jui.AnonAutoFold
import typings.juiCore.mod.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIAccordion extends UIEvent {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: AnonAutoFold): this.type = js.native
  /**
    * Gets the index of the currently enabled node
    *
    * @return Index
    */
  def activeIndex(): Double = js.native
}

