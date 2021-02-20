package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manhattanMod {
  
  @JSImport("image-q/dist/distance/manhattan", "AbstractManhattan")
  @js.native
  abstract class AbstractManhattan () extends AbstractDistanceCalculator {
    
    var _kA: Double = js.native
    
    var _kB: Double = js.native
    
    var _kG: Double = js.native
    
    var _kR: Double = js.native
  }
  
  @JSImport("image-q/dist/distance/manhattan", "Manhattan")
  @js.native
  class Manhattan () extends AbstractManhattan
  
  @JSImport("image-q/dist/distance/manhattan", "ManhattanNommyde")
  @js.native
  class ManhattanNommyde () extends AbstractManhattan
  
  @JSImport("image-q/dist/distance/manhattan", "ManhattanSRGB")
  @js.native
  class ManhattanSRGB () extends AbstractManhattan
}
