package typings.ionicReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dur extends StObject {
  
  var dur: js.UndefOr[Double] = js.native
  
  var playTo: js.UndefOr[
    typings.ionicReact.ionicReactNumbers.`0` | typings.ionicReact.ionicReactNumbers.`1`
  ] = js.native
  
  var step: Double = js.native
}
object Dur {
  
  @scala.inline
  def apply(step: Double): Dur = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dur]
  }
  
  @scala.inline
  implicit class DurMutableBuilder[Self <: Dur] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
    
    @scala.inline
    def setPlayTo(value: typings.ionicReact.ionicReactNumbers.`0` | typings.ionicReact.ionicReactNumbers.`1`): Self = StObject.set(x, "playTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayToUndefined: Self = StObject.set(x, "playTo", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
