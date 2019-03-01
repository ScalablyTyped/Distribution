package typings
package jsoneditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.Array[java.lang.String]
  var startFrom: scala.Double
}

object Anon_Options {
  @scala.inline
  def apply(options: js.Array[java.lang.String], startFrom: scala.Double): Anon_Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("startFrom")(startFrom)
    __obj.asInstanceOf[Anon_Options]
  }
}

