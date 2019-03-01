package typings
package jsendLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Strict extends js.Object {
  var strict: scala.Boolean
}

object Anon_Strict {
  @scala.inline
  def apply(strict: scala.Boolean): Anon_Strict = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_Strict]
  }
}

