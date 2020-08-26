package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for an Earcon.
  */
@js.native
trait EarconOptionsObject extends js.Object {
  /**
    * The unique ID of the Earcon. Generated if not supplied.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The instruments and their options defining this earcon.
    */
  var instruments: js.Array[EarconInstrument] = js.native
  /**
    * Callback function to call when earcon has finished playing.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
  /**
    * Global panning of all instruments. Overrides all panning on
    * individual instruments. Can be a number between -1 and 1.
    */
  var pan: js.UndefOr[Double] = js.native
  /**
    * Master volume for all instruments. Volume settings on individual
    * instruments can still be used for relative volume between the
    * instruments. This setting does not affect volumes set by functions in
    * individual instruments. Can be a number between 0 and 1. Defaults to
    * 1.
    */
  var volume: js.UndefOr[Double] = js.native
}

object EarconOptionsObject {
  @scala.inline
  def apply(instruments: js.Array[EarconInstrument]): EarconOptionsObject = {
    val __obj = js.Dynamic.literal(instruments = instruments.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconOptionsObject]
  }
  @scala.inline
  implicit class EarconOptionsObjectOps[Self <: EarconOptionsObject] (val x: Self) extends AnyVal {
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
    def setInstrumentsVarargs(value: EarconInstrument*): Self = this.set("instruments", js.Array(value :_*))
    @scala.inline
    def setInstruments(value: js.Array[EarconInstrument]): Self = this.set("instruments", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnEnd(value: js.Function): Self = this.set("onEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setPan(value: Double): Self = this.set("pan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

