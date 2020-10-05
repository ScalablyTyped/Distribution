package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SpeedSettings[TElement] extends js.Object

object _SpeedSettings {
  @scala.inline
  def Duration[TElement](duration: typings.jquery.JQuery.Duration): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
  @scala.inline
  def Easing[TElement](easing: String): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
  @scala.inline
  def Complete[TElement](complete: () => Unit): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
}

