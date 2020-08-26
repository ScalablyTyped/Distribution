package typings.leafletRoutingMachine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait E extends js.Object {
  var E: String = js.native
  var Left: String = js.native
  var N: String = js.native
  var NE: String = js.native
  var NW: String = js.native
  var Right: String = js.native
  var S: String = js.native
  var SE: String = js.native
  var SW: String = js.native
  var SharpLeft: String = js.native
  var SharpRight: String = js.native
  var SlightLeft: String = js.native
  var SlightRight: String = js.native
  var Uturn: String = js.native
  var W: String = js.native
}

object E {
  @scala.inline
  def apply(
    E: String,
    Left: String,
    N: String,
    NE: String,
    NW: String,
    Right: String,
    S: String,
    SE: String,
    SW: String,
    SharpLeft: String,
    SharpRight: String,
    SlightLeft: String,
    SlightRight: String,
    Uturn: String,
    W: String
  ): E = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], N = N.asInstanceOf[js.Any], NE = NE.asInstanceOf[js.Any], NW = NW.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], SE = SE.asInstanceOf[js.Any], SW = SW.asInstanceOf[js.Any], SharpLeft = SharpLeft.asInstanceOf[js.Any], SharpRight = SharpRight.asInstanceOf[js.Any], SlightLeft = SlightLeft.asInstanceOf[js.Any], SlightRight = SlightRight.asInstanceOf[js.Any], Uturn = Uturn.asInstanceOf[js.Any], W = W.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
  @scala.inline
  implicit class EOps[Self <: E] (val x: Self) extends AnyVal {
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
    def setE(value: String): Self = this.set("E", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: String): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setN(value: String): Self = this.set("N", value.asInstanceOf[js.Any])
    @scala.inline
    def setNE(value: String): Self = this.set("NE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNW(value: String): Self = this.set("NW", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: String): Self = this.set("Right", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: String): Self = this.set("S", value.asInstanceOf[js.Any])
    @scala.inline
    def setSE(value: String): Self = this.set("SE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSW(value: String): Self = this.set("SW", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharpLeft(value: String): Self = this.set("SharpLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharpRight(value: String): Self = this.set("SharpRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlightLeft(value: String): Self = this.set("SlightLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlightRight(value: String): Self = this.set("SlightRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setUturn(value: String): Self = this.set("Uturn", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: String): Self = this.set("W", value.asInstanceOf[js.Any])
  }
  
}

