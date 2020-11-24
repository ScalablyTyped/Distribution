package typings.mapnik.anon

import typings.mapnik.mapnikStrings.jpeg
import typings.mapnik.mapnikStrings.png
import typings.mapnik.mapnikStrings.tiff
import typings.mapnik.mapnikStrings.webp
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends js.Object {
  
  var area_threshold: js.UndefOr[Double] = js.native
  
  var callback: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  
  var fill_type: js.UndefOr[Double] = js.native
  
  var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.native
  
  var max_extent: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
  
  var multi_polygon_union: js.UndefOr[Boolean] = js.native
  
  var offset_x: js.UndefOr[Double] = js.native
  
  var offset_y: js.UndefOr[Double] = js.native
  
  var process_all_rings: js.UndefOr[Boolean] = js.native
  
  var reencode: js.UndefOr[Boolean] = js.native
  
  var scale_denominator: js.UndefOr[Double] = js.native
  
  var scale_factor: js.UndefOr[Double] = js.native
  
  var scaling_method: js.UndefOr[String] = js.native
  
  var simplify_distance: js.UndefOr[Double] = js.native
  
  var strictly_simple: js.UndefOr[Boolean] = js.native
  
  var threading_mode: js.UndefOr[String] = js.native
}
object Callback {
  
  @scala.inline
  def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: /* err */ Error => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setFill_type(value: Double): Self = this.set("fill_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill_type: Self = this.set("fill_type", js.undefined)
    
    @scala.inline
    def setImage_format(value: webp | jpeg | png | tiff): Self = this.set("image_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_format: Self = this.set("image_format", js.undefined)
    
    @scala.inline
    def setMax_extent(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("max_extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_extent: Self = this.set("max_extent", js.undefined)
    
    @scala.inline
    def setMulti_polygon_union(value: Boolean): Self = this.set("multi_polygon_union", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti_polygon_union: Self = this.set("multi_polygon_union", js.undefined)
    
    @scala.inline
    def setOffset_x(value: Double): Self = this.set("offset_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset_x: Self = this.set("offset_x", js.undefined)
    
    @scala.inline
    def setOffset_y(value: Double): Self = this.set("offset_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset_y: Self = this.set("offset_y", js.undefined)
    
    @scala.inline
    def setProcess_all_rings(value: Boolean): Self = this.set("process_all_rings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcess_all_rings: Self = this.set("process_all_rings", js.undefined)
    
    @scala.inline
    def setReencode(value: Boolean): Self = this.set("reencode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReencode: Self = this.set("reencode", js.undefined)
    
    @scala.inline
    def setScale_denominator(value: Double): Self = this.set("scale_denominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale_denominator: Self = this.set("scale_denominator", js.undefined)
    
    @scala.inline
    def setScale_factor(value: Double): Self = this.set("scale_factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale_factor: Self = this.set("scale_factor", js.undefined)
    
    @scala.inline
    def setScaling_method(value: String): Self = this.set("scaling_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaling_method: Self = this.set("scaling_method", js.undefined)
    
    @scala.inline
    def setSimplify_distance(value: Double): Self = this.set("simplify_distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimplify_distance: Self = this.set("simplify_distance", js.undefined)
    
    @scala.inline
    def setStrictly_simple(value: Boolean): Self = this.set("strictly_simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictly_simple: Self = this.set("strictly_simple", js.undefined)
    
    @scala.inline
    def setThreading_mode(value: String): Self = this.set("threading_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreading_mode: Self = this.set("threading_mode", js.undefined)
  }
}
