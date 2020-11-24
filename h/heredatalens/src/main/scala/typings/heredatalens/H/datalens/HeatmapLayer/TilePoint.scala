package typings.heredatalens.H.datalens.HeatmapLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the input data format for heat map rendering.
  * For heat map rendering, each row of data must be represented as a point within the map tile.
  */
@js.native
trait TilePoint extends js.Object {
  
  /** Number of contributors to the value at the point (eg number of rows in a bucket) */
  var count: Double = js.native
  
  /** Reference to source data row */
  var data: js.UndefOr[Row] = js.native
  
  /** Value at the point (eg aggregated bucket value) */
  var value: Double = js.native
  
  /** Row relative to tile */
  var x: Double = js.native
  
  /** Column relative to tile */
  var y: Double = js.native
}
object TilePoint {
  
  @scala.inline
  def apply(count: Double, value: Double, x: Double, y: Double): TilePoint = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TilePoint]
  }
  
  @scala.inline
  implicit class TilePointOps[Self <: TilePoint] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Row): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
