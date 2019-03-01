package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete[TElement]
  extends jqueryLib.JQueryNs._SpeedSettings[TElement] {
  /**
    * A function to call once the animation is complete.
    */
  def complete(`this`: TElement): scala.Unit
}

object Anon_Complete {
  @scala.inline
  def apply[TElement](complete: js.Function1[TElement, scala.Unit]): Anon_Complete[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.asInstanceOf[Anon_Complete[TElement]]
  }
}

