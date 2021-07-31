package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIndexOptions extends StObject {
  
  var randomSampling: Boolean
  
  var randomSamplingFactor: Double
  
  var repair: Boolean
}
object CheckIndexOptions {
  
  @scala.inline
  def apply(randomSampling: Boolean, randomSamplingFactor: Double, repair: Boolean): CheckIndexOptions = {
    val __obj = js.Dynamic.literal(randomSampling = randomSampling.asInstanceOf[js.Any], randomSamplingFactor = randomSamplingFactor.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIndexOptions]
  }
  
  @scala.inline
  implicit class CheckIndexOptionsMutableBuilder[Self <: CheckIndexOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRandomSampling(value: Boolean): Self = StObject.set(x, "randomSampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomSamplingFactor(value: Double): Self = StObject.set(x, "randomSamplingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepair(value: Boolean): Self = StObject.set(x, "repair", value.asInstanceOf[js.Any])
  }
}
