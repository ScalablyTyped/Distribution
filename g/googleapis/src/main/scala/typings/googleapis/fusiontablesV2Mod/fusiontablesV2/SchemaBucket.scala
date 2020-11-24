package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the minimum and maximum values, the color, opacity, icon and
  * weight of a bucket within a StyleSetting.
  */
@js.native
trait SchemaBucket extends js.Object {
  
  /**
    * Color of line or the interior of a polygon in #RRGGBB format.
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Icon name used for a point.
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * Maximum value in the selected column for a row to be styled according to
    * the bucket color, opacity, icon, or weight.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Minimum value in the selected column for a row to be styled according to
    * the bucket color, opacity, icon, or weight.
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Opacity of the color: 0.0 (transparent) to 1.0 (opaque).
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Width of a line (in pixels).
    */
  var weight: js.UndefOr[Double] = js.native
}
object SchemaBucket {
  
  @scala.inline
  def apply(): SchemaBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucket]
  }
  
  @scala.inline
  implicit class SchemaBucketOps[Self <: SchemaBucket] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
