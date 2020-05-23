package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for an Earcon.
  */
trait EarconOptionsObject extends js.Object {
  /**
    * The unique ID of the Earcon. Generated if not supplied.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The instruments and their options defining this earcon.
    */
  var instruments: js.Array[EarconInstrument]
  /**
    * Callback function to call when earcon has finished playing.
    */
  var onEnd: js.UndefOr[js.Function] = js.undefined
  /**
    * Global panning of all instruments. Overrides all panning on
    * individual instruments. Can be a number between -1 and 1.
    */
  var pan: js.UndefOr[Double] = js.undefined
  /**
    * Master volume for all instruments. Volume settings on individual
    * instruments can still be used for relative volume between the
    * instruments. This setting does not affect volumes set by functions in
    * individual instruments. Can be a number between 0 and 1. Defaults to
    * 1.
    */
  var volume: js.UndefOr[Double] = js.undefined
}

object EarconOptionsObject {
  @scala.inline
  def apply(
    instruments: js.Array[EarconInstrument],
    id: String = null,
    onEnd: js.Function = null,
    pan: js.UndefOr[Double] = js.undefined,
    volume: js.UndefOr[Double] = js.undefined
  ): EarconOptionsObject = {
    val __obj = js.Dynamic.literal(instruments = instruments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(pan)) __obj.updateDynamic("pan")(pan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconOptionsObject]
  }
}

