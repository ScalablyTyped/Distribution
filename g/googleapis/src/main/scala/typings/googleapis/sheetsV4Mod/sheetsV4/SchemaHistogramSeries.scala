package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A histogram series containing the series color and data.
  */
@js.native
trait SchemaHistogramSeries extends js.Object {
  
  /**
    * The color of the column representing this series in each bucket. This
    * field is optional.
    */
  var barColor: js.UndefOr[SchemaColor] = js.native
  
  /**
    * The data for this histogram series.
    */
  var data: js.UndefOr[SchemaChartData] = js.native
}
object SchemaHistogramSeries {
  
  @scala.inline
  def apply(): SchemaHistogramSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramSeries]
  }
  
  @scala.inline
  implicit class SchemaHistogramSeriesOps[Self <: SchemaHistogramSeries] (val x: Self) extends AnyVal {
    
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
    def setBarColor(value: SchemaColor): Self = this.set("barColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarColor: Self = this.set("barColor", js.undefined)
    
    @scala.inline
    def setData(value: SchemaChartData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
