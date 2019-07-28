package typings.irc

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Idlength extends js.Object {
  var idlength: js.Array[String]
  var length: Double
  var limit: js.Array[String]
  var modes: StringDictionary[String]
  var types: String
}

object Anon_Idlength {
  @scala.inline
  def apply(
    idlength: js.Array[String],
    length: Double,
    limit: js.Array[String],
    modes: StringDictionary[String],
    types: String
  ): Anon_Idlength = {
    val __obj = js.Dynamic.literal(idlength = idlength, length = length, limit = limit, modes = modes, types = types)
  
    __obj.asInstanceOf[Anon_Idlength]
  }
}

