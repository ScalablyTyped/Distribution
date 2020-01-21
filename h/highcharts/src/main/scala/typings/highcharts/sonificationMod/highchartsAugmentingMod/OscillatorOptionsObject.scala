package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OscillatorOptionsObject extends js.Object {
  /**
    * The waveform shape to use for oscillator instruments. Defaults to
    * `sine`.
    */
  var waveformShape: js.UndefOr[String] = js.undefined
}

object OscillatorOptionsObject {
  @scala.inline
  def apply(waveformShape: String = null): OscillatorOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (waveformShape != null) __obj.updateDynamic("waveformShape")(waveformShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[OscillatorOptionsObject]
  }
}

