package typings.keysym.keysymMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var keysym: Double
  var names: js.Array[String]
  var status: String
  var unicode: Double
}

object Record {
  @scala.inline
  def apply(keysym: Double, names: js.Array[String], status: String, unicode: Double): Record = {
    val __obj = js.Dynamic.literal(keysym = keysym, names = names, status = status, unicode = unicode)
  
    __obj.asInstanceOf[Record]
  }
}

