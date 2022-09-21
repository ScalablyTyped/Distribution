package typings.mapnik

import typings.mapnik.mapnikStrings.DEFAULT
import typings.mapnik.mapnikStrings.FILTERED
import typings.mapnik.mapnikStrings.FIXED
import typings.mapnik.mapnikStrings.HUFFMAN_ONLY
import typings.mapnik.mapnikStrings.RLE
import typings.mapnik.mapnikStrings.jpeg
import typings.mapnik.mapnikStrings.png
import typings.mapnik.mapnikStrings.tiff
import typings.mapnik.mapnikStrings.webp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Areathreshold extends StObject {
    
    var area_threshold: js.UndefOr[Double] = js.undefined
    
    var fill_type: js.UndefOr[Double] = js.undefined
    
    var multi_polygon_union: js.UndefOr[Boolean] = js.undefined
    
    var process_all_rings: js.UndefOr[Boolean] = js.undefined
    
    var simplify_distance: js.UndefOr[Double] = js.undefined
    
    var strictly_simple: js.UndefOr[Boolean] = js.undefined
  }
  object Areathreshold {
    
    inline def apply(): Areathreshold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Areathreshold]
    }
    
    extension [Self <: Areathreshold](x: Self) {
      
      inline def setArea_threshold(value: Double): Self = StObject.set(x, "area_threshold", value.asInstanceOf[js.Any])
      
      inline def setArea_thresholdUndefined: Self = StObject.set(x, "area_threshold", js.undefined)
      
      inline def setFill_type(value: Double): Self = StObject.set(x, "fill_type", value.asInstanceOf[js.Any])
      
      inline def setFill_typeUndefined: Self = StObject.set(x, "fill_type", js.undefined)
      
      inline def setMulti_polygon_union(value: Boolean): Self = StObject.set(x, "multi_polygon_union", value.asInstanceOf[js.Any])
      
      inline def setMulti_polygon_unionUndefined: Self = StObject.set(x, "multi_polygon_union", js.undefined)
      
      inline def setProcess_all_rings(value: Boolean): Self = StObject.set(x, "process_all_rings", value.asInstanceOf[js.Any])
      
      inline def setProcess_all_ringsUndefined: Self = StObject.set(x, "process_all_rings", js.undefined)
      
      inline def setSimplify_distance(value: Double): Self = StObject.set(x, "simplify_distance", value.asInstanceOf[js.Any])
      
      inline def setSimplify_distanceUndefined: Self = StObject.set(x, "simplify_distance", js.undefined)
      
      inline def setStrictly_simple(value: Boolean): Self = StObject.set(x, "strictly_simple", value.asInstanceOf[js.Any])
      
      inline def setStrictly_simpleUndefined: Self = StObject.set(x, "strictly_simple", js.undefined)
    }
  }
  
  trait Callback extends StObject {
    
    var area_threshold: js.UndefOr[Double] = js.undefined
    
    var callback: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    var fill_type: js.UndefOr[Double] = js.undefined
    
    var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.undefined
    
    var max_extent: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
    
    var multi_polygon_union: js.UndefOr[Boolean] = js.undefined
    
    var offset_x: js.UndefOr[Double] = js.undefined
    
    var offset_y: js.UndefOr[Double] = js.undefined
    
    var process_all_rings: js.UndefOr[Boolean] = js.undefined
    
    var reencode: js.UndefOr[Boolean] = js.undefined
    
    var scale_denominator: js.UndefOr[Double] = js.undefined
    
    var scale_factor: js.UndefOr[Double] = js.undefined
    
    var scaling_method: js.UndefOr[String] = js.undefined
    
    var simplify_distance: js.UndefOr[Double] = js.undefined
    
    var strictly_simple: js.UndefOr[Boolean] = js.undefined
    
    var threading_mode: js.UndefOr[String] = js.undefined
  }
  object Callback {
    
    inline def apply(): Callback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setArea_threshold(value: Double): Self = StObject.set(x, "area_threshold", value.asInstanceOf[js.Any])
      
      inline def setArea_thresholdUndefined: Self = StObject.set(x, "area_threshold", js.undefined)
      
      inline def setCallback(value: /* err */ js.Error => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFill_type(value: Double): Self = StObject.set(x, "fill_type", value.asInstanceOf[js.Any])
      
      inline def setFill_typeUndefined: Self = StObject.set(x, "fill_type", js.undefined)
      
      inline def setImage_format(value: webp | jpeg | png | tiff): Self = StObject.set(x, "image_format", value.asInstanceOf[js.Any])
      
      inline def setImage_formatUndefined: Self = StObject.set(x, "image_format", js.undefined)
      
      inline def setMax_extent(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "max_extent", value.asInstanceOf[js.Any])
      
      inline def setMax_extentUndefined: Self = StObject.set(x, "max_extent", js.undefined)
      
      inline def setMulti_polygon_union(value: Boolean): Self = StObject.set(x, "multi_polygon_union", value.asInstanceOf[js.Any])
      
      inline def setMulti_polygon_unionUndefined: Self = StObject.set(x, "multi_polygon_union", js.undefined)
      
      inline def setOffset_x(value: Double): Self = StObject.set(x, "offset_x", value.asInstanceOf[js.Any])
      
      inline def setOffset_xUndefined: Self = StObject.set(x, "offset_x", js.undefined)
      
      inline def setOffset_y(value: Double): Self = StObject.set(x, "offset_y", value.asInstanceOf[js.Any])
      
      inline def setOffset_yUndefined: Self = StObject.set(x, "offset_y", js.undefined)
      
      inline def setProcess_all_rings(value: Boolean): Self = StObject.set(x, "process_all_rings", value.asInstanceOf[js.Any])
      
      inline def setProcess_all_ringsUndefined: Self = StObject.set(x, "process_all_rings", js.undefined)
      
      inline def setReencode(value: Boolean): Self = StObject.set(x, "reencode", value.asInstanceOf[js.Any])
      
      inline def setReencodeUndefined: Self = StObject.set(x, "reencode", js.undefined)
      
      inline def setScale_denominator(value: Double): Self = StObject.set(x, "scale_denominator", value.asInstanceOf[js.Any])
      
      inline def setScale_denominatorUndefined: Self = StObject.set(x, "scale_denominator", js.undefined)
      
      inline def setScale_factor(value: Double): Self = StObject.set(x, "scale_factor", value.asInstanceOf[js.Any])
      
      inline def setScale_factorUndefined: Self = StObject.set(x, "scale_factor", js.undefined)
      
      inline def setScaling_method(value: String): Self = StObject.set(x, "scaling_method", value.asInstanceOf[js.Any])
      
      inline def setScaling_methodUndefined: Self = StObject.set(x, "scaling_method", js.undefined)
      
      inline def setSimplify_distance(value: Double): Self = StObject.set(x, "simplify_distance", value.asInstanceOf[js.Any])
      
      inline def setSimplify_distanceUndefined: Self = StObject.set(x, "simplify_distance", js.undefined)
      
      inline def setStrictly_simple(value: Boolean): Self = StObject.set(x, "strictly_simple", value.asInstanceOf[js.Any])
      
      inline def setStrictly_simpleUndefined: Self = StObject.set(x, "strictly_simple", js.undefined)
      
      inline def setThreading_mode(value: String): Self = StObject.set(x, "threading_mode", value.asInstanceOf[js.Any])
      
      inline def setThreading_modeUndefined: Self = StObject.set(x, "threading_mode", js.undefined)
    }
  }
  
  trait Compression extends StObject {
    
    var compression: js.UndefOr[Double] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var strategy: js.UndefOr[FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT] = js.undefined
  }
  object Compression {
    
    inline def apply(): Compression = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compression]
    }
    
    extension [Self <: Compression](x: Self) {
      
      inline def setCompression(value: Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setStrategy(value: FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  trait Filltype extends StObject {
    
    var area_threshold: js.UndefOr[Double] = js.undefined
    
    var fill_type: js.UndefOr[Double] = js.undefined
    
    var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.undefined
    
    var max_extent: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
    
    var multi_polygon_union: js.UndefOr[Boolean] = js.undefined
    
    var offset_x: js.UndefOr[Double] = js.undefined
    
    var offset_y: js.UndefOr[Double] = js.undefined
    
    var process_all_rings: js.UndefOr[Boolean] = js.undefined
    
    var reencode: js.UndefOr[Boolean] = js.undefined
    
    var scale_denominator: js.UndefOr[Double] = js.undefined
    
    var scale_factor: js.UndefOr[Double] = js.undefined
    
    var scaling_method: js.UndefOr[String] = js.undefined
    
    var simplify_distance: js.UndefOr[Double] = js.undefined
    
    var strictly_simple: js.UndefOr[Boolean] = js.undefined
    
    var threading_mode: js.UndefOr[String] = js.undefined
  }
  object Filltype {
    
    inline def apply(): Filltype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filltype]
    }
    
    extension [Self <: Filltype](x: Self) {
      
      inline def setArea_threshold(value: Double): Self = StObject.set(x, "area_threshold", value.asInstanceOf[js.Any])
      
      inline def setArea_thresholdUndefined: Self = StObject.set(x, "area_threshold", js.undefined)
      
      inline def setFill_type(value: Double): Self = StObject.set(x, "fill_type", value.asInstanceOf[js.Any])
      
      inline def setFill_typeUndefined: Self = StObject.set(x, "fill_type", js.undefined)
      
      inline def setImage_format(value: webp | jpeg | png | tiff): Self = StObject.set(x, "image_format", value.asInstanceOf[js.Any])
      
      inline def setImage_formatUndefined: Self = StObject.set(x, "image_format", js.undefined)
      
      inline def setMax_extent(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "max_extent", value.asInstanceOf[js.Any])
      
      inline def setMax_extentUndefined: Self = StObject.set(x, "max_extent", js.undefined)
      
      inline def setMulti_polygon_union(value: Boolean): Self = StObject.set(x, "multi_polygon_union", value.asInstanceOf[js.Any])
      
      inline def setMulti_polygon_unionUndefined: Self = StObject.set(x, "multi_polygon_union", js.undefined)
      
      inline def setOffset_x(value: Double): Self = StObject.set(x, "offset_x", value.asInstanceOf[js.Any])
      
      inline def setOffset_xUndefined: Self = StObject.set(x, "offset_x", js.undefined)
      
      inline def setOffset_y(value: Double): Self = StObject.set(x, "offset_y", value.asInstanceOf[js.Any])
      
      inline def setOffset_yUndefined: Self = StObject.set(x, "offset_y", js.undefined)
      
      inline def setProcess_all_rings(value: Boolean): Self = StObject.set(x, "process_all_rings", value.asInstanceOf[js.Any])
      
      inline def setProcess_all_ringsUndefined: Self = StObject.set(x, "process_all_rings", js.undefined)
      
      inline def setReencode(value: Boolean): Self = StObject.set(x, "reencode", value.asInstanceOf[js.Any])
      
      inline def setReencodeUndefined: Self = StObject.set(x, "reencode", js.undefined)
      
      inline def setScale_denominator(value: Double): Self = StObject.set(x, "scale_denominator", value.asInstanceOf[js.Any])
      
      inline def setScale_denominatorUndefined: Self = StObject.set(x, "scale_denominator", js.undefined)
      
      inline def setScale_factor(value: Double): Self = StObject.set(x, "scale_factor", value.asInstanceOf[js.Any])
      
      inline def setScale_factorUndefined: Self = StObject.set(x, "scale_factor", js.undefined)
      
      inline def setScaling_method(value: String): Self = StObject.set(x, "scaling_method", value.asInstanceOf[js.Any])
      
      inline def setScaling_methodUndefined: Self = StObject.set(x, "scaling_method", js.undefined)
      
      inline def setSimplify_distance(value: Double): Self = StObject.set(x, "simplify_distance", value.asInstanceOf[js.Any])
      
      inline def setSimplify_distanceUndefined: Self = StObject.set(x, "simplify_distance", js.undefined)
      
      inline def setStrictly_simple(value: Boolean): Self = StObject.set(x, "strictly_simple", value.asInstanceOf[js.Any])
      
      inline def setStrictly_simpleUndefined: Self = StObject.set(x, "strictly_simple", js.undefined)
      
      inline def setThreading_mode(value: String): Self = StObject.set(x, "threading_mode", value.asInstanceOf[js.Any])
      
      inline def setThreading_modeUndefined: Self = StObject.set(x, "threading_mode", js.undefined)
    }
  }
  
  trait Imageformat extends StObject {
    
    var image_format: js.UndefOr[String] = js.undefined
    
    var image_scaling: js.UndefOr[String] = js.undefined
  }
  object Imageformat {
    
    inline def apply(): Imageformat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Imageformat]
    }
    
    extension [Self <: Imageformat](x: Self) {
      
      inline def setImage_format(value: String): Self = StObject.set(x, "image_format", value.asInstanceOf[js.Any])
      
      inline def setImage_formatUndefined: Self = StObject.set(x, "image_format", js.undefined)
      
      inline def setImage_scaling(value: String): Self = StObject.set(x, "image_scaling", value.asInstanceOf[js.Any])
      
      inline def setImage_scalingUndefined: Self = StObject.set(x, "image_scaling", js.undefined)
    }
  }
  
  trait Imagescaling extends StObject {
    
    var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.undefined
    
    var image_scaling: js.UndefOr[String] = js.undefined
  }
  object Imagescaling {
    
    inline def apply(): Imagescaling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Imagescaling]
    }
    
    extension [Self <: Imagescaling](x: Self) {
      
      inline def setImage_format(value: webp | jpeg | png | tiff): Self = StObject.set(x, "image_format", value.asInstanceOf[js.Any])
      
      inline def setImage_formatUndefined: Self = StObject.set(x, "image_format", js.undefined)
      
      inline def setImage_scaling(value: String): Self = StObject.set(x, "image_scaling", value.asInstanceOf[js.Any])
      
      inline def setImage_scalingUndefined: Self = StObject.set(x, "image_scaling", js.undefined)
    }
  }
  
  trait Layer extends StObject {
    
    var layer: js.UndefOr[String] = js.undefined
    
    var tolerance: js.UndefOr[Double] = js.undefined
  }
  object Layer {
    
    inline def apply(): Layer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layer]
    }
    
    extension [Self <: Layer](x: Self) {
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  trait Upgrade extends StObject {
    
    var upgrade: js.UndefOr[Boolean] = js.undefined
    
    var validate: js.UndefOr[Boolean] = js.undefined
  }
  object Upgrade {
    
    inline def apply(): Upgrade = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Upgrade]
    }
    
    extension [Self <: Upgrade](x: Self) {
      
      inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
