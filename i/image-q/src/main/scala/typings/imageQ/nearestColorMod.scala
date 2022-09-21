package typings.imageQ

import typings.imageQ.distanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.imageQuantizerMod.AbstractImageQuantizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nearestColorMod {
  
  @JSImport("image-q/dist/types/src/image/nearestColor", "NearestColor")
  @js.native
  open class NearestColor protected () extends AbstractImageQuantizer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    
    /* private */ var _distance: Any = js.native
  }
}
