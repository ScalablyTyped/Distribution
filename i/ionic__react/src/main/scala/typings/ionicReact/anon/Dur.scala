package typings.ionicReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dur extends StObject {
  
  var dur: js.UndefOr[Double] = js.undefined
  
  var playTo: js.UndefOr[
    typings.ionicReact.ionicReactNumbers.`0` | typings.ionicReact.ionicReactNumbers.`1`
  ] = js.undefined
  
  var step: Double
}
object Dur {
  
  inline def apply(step: Double): Dur = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dur]
  }
  
  extension [Self <: Dur](x: Self) {
    
    inline def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    inline def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
    
    inline def setPlayTo(value: typings.ionicReact.ionicReactNumbers.`0` | typings.ionicReact.ionicReactNumbers.`1`): Self = StObject.set(x, "playTo", value.asInstanceOf[js.Any])
    
    inline def setPlayToUndefined: Self = StObject.set(x, "playTo", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
