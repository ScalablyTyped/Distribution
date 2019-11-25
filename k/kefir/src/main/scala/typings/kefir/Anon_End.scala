package typings.kefir

import typings.kefir.kefirMod.Event
import typings.kefir.kefirStrings.end
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End
  extends Event[js.Any, js.Any] {
  var `type`: end
  var value: Unit
}

object Anon_End {
  @scala.inline
  def apply(`type`: end, value: Unit): Anon_End = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

