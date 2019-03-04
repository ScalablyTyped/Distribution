package typings
package ircLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Idlength extends js.Object {
  var idlength: js.Array[java.lang.String]
  var length: scala.Double
  var limit: js.Array[java.lang.String]
  var modes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var types: java.lang.String
}

object Anon_Idlength {
  @scala.inline
  def apply(
    idlength: js.Array[java.lang.String],
    length: scala.Double,
    limit: js.Array[java.lang.String],
    modes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    types: java.lang.String
  ): Anon_Idlength = {
    val __obj = js.Dynamic.literal(idlength = idlength, length = length, limit = limit, modes = modes, types = types)
  
    __obj.asInstanceOf[Anon_Idlength]
  }
}

