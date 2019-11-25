package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SpeedSettings[TElement] extends js.Object

object _SpeedSettings {
  @scala.inline
  def Anon_Duration[TElement](duration: Duration): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
  @scala.inline
  def Anon_Easing[TElement](easing: String): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
  @scala.inline
  def Anon_Complete[TElement](complete: TElement => Unit): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
  
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
}

