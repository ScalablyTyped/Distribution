package typings.imageQ

import typings.imageQ.distTypesSrcDistanceDistanceCalculatorMod.AbstractDistanceCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcDistanceCie94Mod {
  
  /* note: abstract class */ @JSImport("image-q/dist/types/src/distance/cie94", "AbstractCIE94")
  @js.native
  open class AbstractCIE94 () extends AbstractDistanceCalculator {
    
    /* protected */ var _K1: Double = js.native
    
    /* protected */ var _K2: Double = js.native
    
    /* protected */ var _Kl: Double = js.native
    
    /**
      * Weight in distance: 0.25
      * Max DeltaE: 100
      * Max DeltaA: 255
      */
    /* protected */ var _kA: Double = js.native
  }
  
  @JSImport("image-q/dist/types/src/distance/cie94", "CIE94GraphicArts")
  @js.native
  open class CIE94GraphicArts () extends AbstractCIE94
  
  @JSImport("image-q/dist/types/src/distance/cie94", "CIE94Textiles")
  @js.native
  open class CIE94Textiles () extends AbstractCIE94
}
