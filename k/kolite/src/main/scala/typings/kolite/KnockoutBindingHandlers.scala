package typings.kolite

import typings.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandlers extends js.Object {
  var activity: KoLiteActivityBindingHandler
  var command: KnockoutBindingHandler[_, _, _]
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(activity: KoLiteActivityBindingHandler, command: KnockoutBindingHandler[_, _, _]): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(activity = activity, command = command)
  
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

