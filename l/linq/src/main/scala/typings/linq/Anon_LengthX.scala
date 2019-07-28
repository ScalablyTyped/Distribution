package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthX[TOther] extends /* x */ NumberDictionary[TOther] {
  var length: Double
}

object Anon_LengthX {
  @scala.inline
  def apply[TOther](length: Double, NumberDictionary: /* x */ NumberDictionary[TOther] = null): Anon_LengthX[TOther] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_LengthX[TOther]]
  }
}

