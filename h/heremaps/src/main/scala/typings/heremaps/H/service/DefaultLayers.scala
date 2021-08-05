package typings.heremaps.H.service

import typings.heremaps.anon.Normal
import typings.heremaps.anon.Satellite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This property specifies collection of pre-configured HERE layers
  */
trait DefaultLayers extends StObject {
  
  var raster: Satellite
  
  var vector: Normal
}
object DefaultLayers {
  
  inline def apply(raster: Satellite, vector: Normal): DefaultLayers = {
    val __obj = js.Dynamic.literal(raster = raster.asInstanceOf[js.Any], vector = vector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLayers]
  }
  
  extension [Self <: DefaultLayers](x: Self) {
    
    inline def setRaster(value: Satellite): Self = StObject.set(x, "raster", value.asInstanceOf[js.Any])
    
    inline def setVector(value: Normal): Self = StObject.set(x, "vector", value.asInstanceOf[js.Any])
  }
}
