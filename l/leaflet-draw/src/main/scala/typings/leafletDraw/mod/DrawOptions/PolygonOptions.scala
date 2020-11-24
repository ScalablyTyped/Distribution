package typings.leafletDraw.mod.DrawOptions

import typings.leafletDraw.mod.PrecisionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonOptions extends PolylineOptions {
  
  /**
    * Defines the precision for each type of unit (e.g. {km: 2, ft: 0}
    *
    * @default {}
    */
  var precision: js.UndefOr[PrecisionOptions] = js.native
  
  /**
    * Show the area of the drawn polygon in m², ha or km².
    * The area is only approximate and become less accurate the larger the polygon is.
    *
    * @default false
    */
  var showArea: js.UndefOr[Boolean] = js.native
}
object PolygonOptions {
  
  @scala.inline
  def apply(): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonOptions]
  }
  
  @scala.inline
  implicit class PolygonOptionsOps[Self <: PolygonOptions] (val x: Self) extends AnyVal {
    
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
    def setPrecision(value: PrecisionOptions): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setShowArea(value: Boolean): Self = this.set("showArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowArea: Self = this.set("showArea", js.undefined)
  }
}
