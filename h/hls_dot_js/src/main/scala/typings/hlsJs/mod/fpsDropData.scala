package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fpsDropData extends js.Object {
  var currentDecoded: Double = js.native
  var currentDropped: Double = js.native
  var totalDroppedFragmes: Double = js.native
}

object fpsDropData {
  @scala.inline
  def apply(currentDecoded: Double, currentDropped: Double, totalDroppedFragmes: Double): fpsDropData = {
    val __obj = js.Dynamic.literal(currentDecoded = currentDecoded.asInstanceOf[js.Any], currentDropped = currentDropped.asInstanceOf[js.Any], totalDroppedFragmes = totalDroppedFragmes.asInstanceOf[js.Any])
    __obj.asInstanceOf[fpsDropData]
  }
  @scala.inline
  implicit class fpsDropDataOps[Self <: fpsDropData] (val x: Self) extends AnyVal {
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
    def setCurrentDecoded(value: Double): Self = this.set("currentDecoded", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentDropped(value: Double): Self = this.set("currentDropped", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalDroppedFragmes(value: Double): Self = this.set("totalDroppedFragmes", value.asInstanceOf[js.Any])
  }
  
}

