package typings
package luscaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var options: js.UndefOr[js.Object] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, options: js.Object = null): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Name]
  }
}

