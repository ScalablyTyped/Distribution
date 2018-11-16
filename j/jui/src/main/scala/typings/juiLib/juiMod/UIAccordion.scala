package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIAccordion
  extends juiDashCoreLib.juiDashCoreMod.UIEvent {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_EventAutoFold): this.type = js.native
  /**
       * Gets the index of the currently enabled node
       *
       * @return Index
       */
  def activeIndex(): scala.Double = js.native
}

