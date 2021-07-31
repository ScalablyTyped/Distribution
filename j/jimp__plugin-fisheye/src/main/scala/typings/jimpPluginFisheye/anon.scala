package typings.jimpPluginFisheye

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait R extends StObject {
    
    var r: Double
  }
  object R {
    
    @scala.inline
    def apply(r: Double): R = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    @scala.inline
    implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
