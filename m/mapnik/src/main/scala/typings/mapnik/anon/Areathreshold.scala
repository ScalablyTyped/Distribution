package typings.mapnik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Areathreshold extends js.Object {
  
  var area_threshold: js.UndefOr[Double] = js.native
  
  var fill_type: js.UndefOr[Double] = js.native
  
  var multi_polygon_union: js.UndefOr[Boolean] = js.native
  
  var process_all_rings: js.UndefOr[Boolean] = js.native
  
  var simplify_distance: js.UndefOr[Double] = js.native
  
  var strictly_simple: js.UndefOr[Boolean] = js.native
}
object Areathreshold {
  
  @scala.inline
  def apply(): Areathreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Areathreshold]
  }
  
  @scala.inline
  implicit class AreathresholdOps[Self <: Areathreshold] (val x: Self) extends AnyVal {
    
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
    def setArea_threshold(value: Double): Self = this.set("area_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea_threshold: Self = this.set("area_threshold", js.undefined)
    
    @scala.inline
    def setFill_type(value: Double): Self = this.set("fill_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill_type: Self = this.set("fill_type", js.undefined)
    
    @scala.inline
    def setMulti_polygon_union(value: Boolean): Self = this.set("multi_polygon_union", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti_polygon_union: Self = this.set("multi_polygon_union", js.undefined)
    
    @scala.inline
    def setProcess_all_rings(value: Boolean): Self = this.set("process_all_rings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcess_all_rings: Self = this.set("process_all_rings", js.undefined)
    
    @scala.inline
    def setSimplify_distance(value: Double): Self = this.set("simplify_distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimplify_distance: Self = this.set("simplify_distance", js.undefined)
    
    @scala.inline
    def setStrictly_simple(value: Boolean): Self = this.set("strictly_simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictly_simple: Self = this.set("strictly_simple", js.undefined)
  }
}
