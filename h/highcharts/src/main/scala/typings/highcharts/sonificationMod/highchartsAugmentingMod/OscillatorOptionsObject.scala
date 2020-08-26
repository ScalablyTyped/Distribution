package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OscillatorOptionsObject extends js.Object {
  /**
    * The waveform shape to use for oscillator instruments. Defaults to
    * `sine`.
    */
  var waveformShape: js.UndefOr[String] = js.native
}

object OscillatorOptionsObject {
  @scala.inline
  def apply(): OscillatorOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OscillatorOptionsObject]
  }
  @scala.inline
  implicit class OscillatorOptionsObjectOps[Self <: OscillatorOptionsObject] (val x: Self) extends AnyVal {
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
    def setWaveformShape(value: String): Self = this.set("waveformShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaveformShape: Self = this.set("waveformShape", js.undefined)
  }
  
}

