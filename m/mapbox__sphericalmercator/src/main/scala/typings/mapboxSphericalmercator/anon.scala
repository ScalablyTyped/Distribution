package typings.mapboxSphericalmercator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Antimeridian extends StObject {
    
    var antimeridian: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Antimeridian {
    
    inline def apply(): Antimeridian = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Antimeridian]
    }
    
    extension [Self <: Antimeridian](x: Self) {
      
      inline def setAntimeridian(value: Boolean): Self = StObject.set(x, "antimeridian", value.asInstanceOf[js.Any])
      
      inline def setAntimeridianUndefined: Self = StObject.set(x, "antimeridian", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
