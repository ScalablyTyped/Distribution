package typings
package keysymLib.keysymMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var keysym: scala.Double
  var names: js.Array[java.lang.String]
  var status: java.lang.String
  var unicode: scala.Double
}

object Record {
  @scala.inline
  def apply(
    keysym: scala.Double,
    names: js.Array[java.lang.String],
    status: java.lang.String,
    unicode: scala.Double
  ): Record = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keysym")(keysym)
    __obj.updateDynamic("names")(names)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("unicode")(unicode)
    __obj.asInstanceOf[Record]
  }
}

