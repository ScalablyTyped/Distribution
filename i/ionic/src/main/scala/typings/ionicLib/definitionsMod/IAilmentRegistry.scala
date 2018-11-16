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

