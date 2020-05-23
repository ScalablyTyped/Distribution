package typings.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length[TOther] extends /* x */ NumberDictionary[TOther] {
  var length: Double
}

object Length {
  @scala.inline
  def apply[TOther](length: Double, NumberDictionary: /* x */ NumberDictionary[TOther] = null): Length[TOther] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Length[TOther]]
  }
}

