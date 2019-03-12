package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAilmentRegistry extends js.Object {
  var ailments: js.Array[IAilment]
  def get(id: java.lang.String): js.UndefOr[IAilment]
  def register(ailment: IAilment): scala.Unit
}

object IAilmentRegistry {
  @scala.inline
  def apply(
    ailments: js.Array[IAilment],
    get: java.lang.String => js.UndefOr[IAilment],
    register: IAilment => scala.Unit
  ): IAilmentRegistry = {
    val __obj = js.Dynamic.literal(ailments = ailments, get = js.Any.fromFunction1(get), register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[IAilmentRegistry]
  }
}

