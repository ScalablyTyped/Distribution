package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAilmentRegistry extends js.Object {
  var ailments: js.Array[IAilment]
  def get(id: String): js.UndefOr[IAilment]
  def register(ailment: IAilment): Unit
}

object IAilmentRegistry {
  @scala.inline
  def apply(ailments: js.Array[IAilment], get: String => js.UndefOr[IAilment], register: IAilment => Unit): IAilmentRegistry = {
    val __obj = js.Dynamic.literal(ailments = ailments.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[IAilmentRegistry]
  }
}

