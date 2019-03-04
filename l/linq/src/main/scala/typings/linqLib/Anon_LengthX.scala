package typings
package linqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthX[TOther]
  extends /* x */ org.scalablytyped.runtime.NumberDictionary[TOther] {
  var length: scala.Double
}

object Anon_LengthX {
  @scala.inline
  def apply[TOther](
    length: scala.Double,
    NumberDictionary: /* x */ org.scalablytyped.runtime.NumberDictionary[TOther] = null
  ): Anon_LengthX[TOther] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_LengthX[TOther]]
  }
}

