package typings.hastUtilRaw

import typings.hastUtilRaw.libMod.Node
import typings.hastUtilRaw.libMod.P5Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Location extends StObject {
    
    var location: P5Location
  }
  object Location {
    
    inline def apply(location: P5Location): Location = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setLocation(value: P5Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stitch extends StObject {
    
    var stitch: Node
  }
  object Stitch {
    
    inline def apply(stitch: Node): Stitch = {
      val __obj = js.Dynamic.literal(stitch = stitch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stitch]
    }
    
    extension [Self <: Stitch](x: Self) {
      
      inline def setStitch(value: Node): Self = StObject.set(x, "stitch", value.asInstanceOf[js.Any])
    }
  }
}
