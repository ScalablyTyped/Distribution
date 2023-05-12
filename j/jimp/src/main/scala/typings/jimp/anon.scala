package typings.jimp

import typings.jimp.mod.IntersectedPluginDecoders
import typings.jimp.mod.IntersectedPluginEncoders
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decoders] (val x: Self) extends AnyVal {
      
      inline def setDecoders(value: IntersectedPluginDecoders): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      inline def setEncoders(value: IntersectedPluginEncoders): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
    }
  }
}
