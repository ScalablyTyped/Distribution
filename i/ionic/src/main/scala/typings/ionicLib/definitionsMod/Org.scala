package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Org extends js.Object {
  var name: java.lang.String
}

object Org {
  @scala.inline
  def apply(name: java.lang.String): Org = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Org]
  }
}

