package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECB extends js.Object {
  val Count: Double
  val DataCodewords: Double
  var count: Double
  var dataCodewords: Double
}

object ECB {
  @scala.inline
  def apply(Count: Double, DataCodewords: Double, count: Double, dataCodewords: Double): ECB = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DataCodewords = DataCodewords.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dataCodewords = dataCodewords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECB]
  }
}

