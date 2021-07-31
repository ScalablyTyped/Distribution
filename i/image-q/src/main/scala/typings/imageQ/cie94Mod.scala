package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cie94Mod {
  
  @JSImport("image-q/dist/distance/cie94", "AbstractCIE94")
  @js.native
  abstract class AbstractCIE94 () extends AbstractDistanceCalculator {
    
    var _K1: Double = js.native
    
    var _K2: Double = js.native
    
    var _Kl: Double = js.native
    
    /**
      * Weight in distance: 0.25
      * Max DeltaE: 100
      * Max DeltaA: 255
      */
    var _kA: Double = js.native
  }
  
  @JSImport("image-q/dist/distance/cie94", "CIE94GraphicArts")
  @js.native
  class CIE94GraphicArts () extends AbstractCIE94
  
  @JSImport("image-q/dist/distance/cie94", "CIE94Textiles")
  @js.native
  class CIE94Textiles () extends AbstractCIE94
}
