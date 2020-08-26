package typings.leafletPolylinedecorator.mod

import typings.leafletPolylinedecorator.mod.Symbol.ArrowHead_
import typings.leafletPolylinedecorator.mod.Symbol.Dash_
import typings.leafletPolylinedecorator.mod.Symbol.Marker_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern extends js.Object {
  var endOffset: js.UndefOr[Double | String] = js.native
  var offset: js.UndefOr[Double | String] = js.native
  var repeat: Double | String = js.native
  var symbol: Dash_ | ArrowHead_ | Marker_ = js.native
}

object Pattern {
  @scala.inline
  def apply(repeat: Double | String, symbol: Dash_ | ArrowHead_ | Marker_): Pattern = {
    val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  implicit class PatternOps[Self <: Pattern] (val x: Self) extends AnyVal {
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
    def setRepeat(value: Double | String): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: Dash_ | ArrowHead_ | Marker_): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndOffset(value: Double | String): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOffset: Self = this.set("endOffset", js.undefined)
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

