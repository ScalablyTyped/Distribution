package typings.jpegAutorotate

import typings.jpegAutorotate.mod.RotateDimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Buffer extends StObject {
    
    var buffer: typings.node.bufferMod.global.Buffer
    
    var dimensions: RotateDimensions
    
    var orientation: Double
    
    var quality: Double
  }
  object Buffer {
    
    inline def apply(
      buffer: typings.node.bufferMod.global.Buffer,
      dimensions: RotateDimensions,
      orientation: Double,
      quality: Double
    ): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    extension [Self <: Buffer](x: Self) {
      
      inline def setBuffer(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setDimensions(value: RotateDimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    }
  }
}
