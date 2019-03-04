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
    get: js.Function1[java.lang.String, js.UndefOr[IAilment]],
    register: js.Function1[IAilment, scala.Unit]
  ): IAilmentRegistry = {
    val __obj = js.Dynamic.literal(ailments = ailments, get = get, register = register)
  
    __obj.asInstanceOf[IAilmentRegistry]
  }
}

