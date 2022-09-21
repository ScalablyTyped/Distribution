package typings.jimpCompact

import typings.jimpCompact.mod.IntersectedPluginDecoders
import typings.jimpCompact.mod.IntersectedPluginEncoders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Decoders extends StObject {
    
    var decoders: IntersectedPluginDecoders
    
    var encoders: IntersectedPluginEncoders
  }
  object Decoders {
    
    inline def apply(decoders: IntersectedPluginDecoders, encoders: IntersectedPluginEncoders): Decoders = {
      val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decoders]
    }
    
    extension [Self <: Decoders](x: Self) {
      
      inline def setDecoders(value: IntersectedPluginDecoders): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      inline def setEncoders(value: IntersectedPluginEncoders): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
    }
  }
}
