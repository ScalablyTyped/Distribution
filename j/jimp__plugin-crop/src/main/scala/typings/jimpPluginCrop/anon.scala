package typings.jimpPluginCrop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CropOnlyFrames extends StObject {
    
    var cropOnlyFrames: js.UndefOr[Boolean] = js.undefined
    
    var cropSymmetric: js.UndefOr[Boolean] = js.undefined
    
    var ignoreSides: js.UndefOr[East] = js.undefined
    
    var leaveBorder: js.UndefOr[Double] = js.undefined
    
    var tolerance: js.UndefOr[Double] = js.undefined
  }
  object CropOnlyFrames {
    
    inline def apply(): CropOnlyFrames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropOnlyFrames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CropOnlyFrames] (val x: Self) extends AnyVal {
      
      inline def setCropOnlyFrames(value: Boolean): Self = StObject.set(x, "cropOnlyFrames", value.asInstanceOf[js.Any])
      
      inline def setCropOnlyFramesUndefined: Self = StObject.set(x, "cropOnlyFrames", js.undefined)
      
      inline def setCropSymmetric(value: Boolean): Self = StObject.set(x, "cropSymmetric", value.asInstanceOf[js.Any])
      
      inline def setCropSymmetricUndefined: Self = StObject.set(x, "cropSymmetric", js.undefined)
      
      inline def setIgnoreSides(value: East): Self = StObject.set(x, "ignoreSides", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSidesUndefined: Self = StObject.set(x, "ignoreSides", js.undefined)
      
      inline def setLeaveBorder(value: Double): Self = StObject.set(x, "leaveBorder", value.asInstanceOf[js.Any])
      
      inline def setLeaveBorderUndefined: Self = StObject.set(x, "leaveBorder", js.undefined)
      
      inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  trait East extends StObject {
    
    var east: Boolean
    
    var north: Boolean
    
    var south: Boolean
    
    var west: Boolean
  }
  object East {
    
    inline def apply(east: Boolean, north: Boolean, south: Boolean, west: Boolean): East = {
      val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
      __obj.asInstanceOf[East]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: East] (val x: Self) extends AnyVal {
      
      inline def setEast(value: Boolean): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
      
      inline def setNorth(value: Boolean): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
      
      inline def setSouth(value: Boolean): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
      
      inline def setWest(value: Boolean): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
    }
  }
}
