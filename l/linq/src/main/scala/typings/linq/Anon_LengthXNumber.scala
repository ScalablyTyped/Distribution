package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthXNumber[TCollection] extends /* x */ NumberDictionary[TCollection] {
  var length: Double
}

object Anon_LengthXNumber {
  @scala.inline
  def apply[TCollection](length: Double, NumberDictionary: /* x */ NumberDictionary[TCollection] = null): Anon_LengthXNumber[TCollection] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_LengthXNumber[TCollection]]
  }
}

