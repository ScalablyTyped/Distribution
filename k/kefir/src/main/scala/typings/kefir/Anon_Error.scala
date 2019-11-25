package typings.kefir

import typings.kefir.kefirMod.Event
import typings.kefir.kefirStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error[E]
  extends Event[js.Any, E] {
  var `type`: error
  var value: E
}

object Anon_Error {
  @scala.inline
  def apply[E](`type`: error, value: E): Anon_Error[E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error[E]]
  }
}

