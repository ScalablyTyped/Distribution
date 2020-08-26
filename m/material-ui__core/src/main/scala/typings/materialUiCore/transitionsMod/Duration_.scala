package typings.materialUiCore.transitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration_ extends js.Object {
  var complex: Double = js.native
  var enteringScreen: Double = js.native
  var leavingScreen: Double = js.native
  var short: Double = js.native
  var shorter: Double = js.native
  var shortest: Double = js.native
  var standard: Double = js.native
}

object Duration_ {
  @scala.inline
  def apply(
    complex: Double,
    enteringScreen: Double,
    leavingScreen: Double,
    short: Double,
    shorter: Double,
    shortest: Double,
    standard: Double
  ): Duration_ = {
    val __obj = js.Dynamic.literal(complex = complex.asInstanceOf[js.Any], enteringScreen = enteringScreen.asInstanceOf[js.Any], leavingScreen = leavingScreen.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], shorter = shorter.asInstanceOf[js.Any], shortest = shortest.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration_]
  }
  @scala.inline
  implicit class Duration_Ops[Self <: Duration_] (val x: Self) extends AnyVal {
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
    def setComplex(value: Double): Self = this.set("complex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnteringScreen(value: Double): Self = this.set("enteringScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeavingScreen(value: Double): Self = this.set("leavingScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: Double): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def setShorter(value: Double): Self = this.set("shorter", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortest(value: Double): Self = this.set("shortest", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandard(value: Double): Self = this.set("standard", value.asInstanceOf[js.Any])
  }
  
}

