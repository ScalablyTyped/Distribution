package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Candlestick chart data, each containing the low, open, close, and high
  * values for a series.
  */
@js.native
trait SchemaCandlestickData extends js.Object {
  
  /**
    * The range data (vertical axis) for the close/final value for each candle.
    * This is the top of the candle body.  If greater than the open value the
    * candle will be filled.  Otherwise the candle will be hollow.
    */
  var closeSeries: js.UndefOr[SchemaCandlestickSeries] = js.native
  
  /**
    * The range data (vertical axis) for the high/maximum value for each
    * candle. This is the top of the candle&#39;s center line.
    */
  var highSeries: js.UndefOr[SchemaCandlestickSeries] = js.native
  
  /**
    * The range data (vertical axis) for the low/minimum value for each candle.
    * This is the bottom of the candle&#39;s center line.
    */
  var lowSeries: js.UndefOr[SchemaCandlestickSeries] = js.native
  
  /**
    * The range data (vertical axis) for the open/initial value for each
    * candle. This is the bottom of the candle body.  If less than the close
    * value the candle will be filled.  Otherwise the candle will be hollow.
    */
  var openSeries: js.UndefOr[SchemaCandlestickSeries] = js.native
}
object SchemaCandlestickData {
  
  @scala.inline
  def apply(): SchemaCandlestickData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCandlestickData]
  }
  
  @scala.inline
  implicit class SchemaCandlestickDataOps[Self <: SchemaCandlestickData] (val x: Self) extends AnyVal {
    
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
    def setCloseSeries(value: SchemaCandlestickSeries): Self = this.set("closeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseSeries: Self = this.set("closeSeries", js.undefined)
    
    @scala.inline
    def setHighSeries(value: SchemaCandlestickSeries): Self = this.set("highSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighSeries: Self = this.set("highSeries", js.undefined)
    
    @scala.inline
    def setLowSeries(value: SchemaCandlestickSeries): Self = this.set("lowSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowSeries: Self = this.set("lowSeries", js.undefined)
    
    @scala.inline
    def setOpenSeries(value: SchemaCandlestickSeries): Self = this.set("openSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenSeries: Self = this.set("openSeries", js.undefined)
  }
}
