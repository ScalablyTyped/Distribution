package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECB extends js.Object {
  val Count: Double = js.native
  val DataCodewords: Double = js.native
  var count: Double = js.native
  var dataCodewords: Double = js.native
}

object ECB {
  @scala.inline
  def apply(Count: Double, DataCodewords: Double, count: Double, dataCodewords: Double): ECB = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DataCodewords = DataCodewords.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dataCodewords = dataCodewords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECB]
  }
  @scala.inline
  implicit class ECBOps[Self <: ECB] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataCodewords(value: Double): Self = this.set("DataCodewords", value.asInstanceOf[js.Any])
  }
  
}

