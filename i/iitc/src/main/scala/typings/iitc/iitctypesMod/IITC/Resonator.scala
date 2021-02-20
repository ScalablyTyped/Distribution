package typings.iitc.iitctypesMod.IITC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resonator extends StObject {
  
  var energy: Double = js.native
  
  var level: Double = js.native
  
  var owner: String = js.native
}
object Resonator {
  
  @scala.inline
  def apply(energy: Double, level: Double, owner: String): Resonator = {
    val __obj = js.Dynamic.literal(energy = energy.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resonator]
  }
  
  @scala.inline
  implicit class ResonatorMutableBuilder[Self <: Resonator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
