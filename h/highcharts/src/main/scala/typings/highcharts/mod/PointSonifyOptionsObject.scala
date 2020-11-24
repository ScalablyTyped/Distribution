package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for sonifying a point.
  */
@js.native
trait PointSonifyOptionsObject extends js.Object {
  
  /**
    * Optionally provide the minimum/maximum values for the points. If this
    * is not supplied, it is calculated from the points in the chart on
    * demand. This option is supplied in the following format, as a map of
    * point data properties to objects with min/max values: (see online
    * documentation for example)
    */
  var dataExtremes: js.UndefOr[js.Object] = js.native
  
  /**
    * The instrument definitions for this point.
    */
  var instruments: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject] = js.native
  
  /**
    * Callback called when the sonification has finished.
    */
  var onEnd: js.UndefOr[js.Function] = js.native
}
object PointSonifyOptionsObject {
  
  @scala.inline
  def apply(
    instruments: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject]
  ): PointSonifyOptionsObject = {
    val __obj = js.Dynamic.literal(instruments = instruments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointSonifyOptionsObject]
  }
  
  @scala.inline
  implicit class PointSonifyOptionsObjectOps[Self <: PointSonifyOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setInstrumentsVarargs(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject*): Self = this.set("instruments", js.Array(value :_*))
    
    @scala.inline
    def setInstruments(value: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.PointInstrumentObject]): Self = this.set("instruments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExtremes(value: js.Object): Self = this.set("dataExtremes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataExtremes: Self = this.set("dataExtremes", js.undefined)
    
    @scala.inline
    def setOnEnd(value: js.Function): Self = this.set("onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
  }
}
