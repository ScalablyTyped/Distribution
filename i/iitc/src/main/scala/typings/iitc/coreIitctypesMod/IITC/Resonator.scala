package typings.iitc.coreIitctypesMod.IITC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resonator extends StObject {
  
  var energy: Double
  
  var level: Double
  
  var owner: String
}
object Resonator {
  
  inline def apply(energy: Double, level: Double, owner: String): Resonator = {
    val __obj = js.Dynamic.literal(energy = energy.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resonator]
  }
  
  extension [Self <: Resonator](x: Self) {
    
    inline def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
