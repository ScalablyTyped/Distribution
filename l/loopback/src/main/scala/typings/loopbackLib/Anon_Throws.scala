package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Throws extends js.Object {
  var throws: scala.Boolean
  var validate: scala.Boolean
}

object Anon_Throws {
  @scala.inline
  def apply(throws: scala.Boolean, validate: scala.Boolean): Anon_Throws = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("throws")(throws)
    __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Anon_Throws]
  }
}

