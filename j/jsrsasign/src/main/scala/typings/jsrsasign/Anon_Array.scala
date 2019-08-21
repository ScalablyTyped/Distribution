package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var array: js.Array[String]
  var hashalg: String
}

object Anon_Array {
  @scala.inline
  def apply(array: js.Array[String], hashalg: String): Anon_Array = {
    val __obj = js.Dynamic.literal(array = array, hashalg = hashalg)
  
    __obj.asInstanceOf[Anon_Array]
  }
}

