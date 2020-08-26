package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.anon.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/distance/ciede2000", JSImport.Namespace)
@js.native
object ciede2000Mod extends js.Object {
  @js.native
  class CIEDE2000 () extends AbstractDistanceCalculator {
    def calculateRawInLab(Lab1: A, Lab2: A): Double = js.native
  }
  
  /* static members */
  @js.native
  object CIEDE2000 extends js.Object {
    val _deg180InRad: js.Any = js.native
    val _deg25InRad: js.Any = js.native
    val _deg275InRad: js.Any = js.native
    val _deg30InRad: js.Any = js.native
    val _deg360InRad: js.Any = js.native
    val _deg63InRad: js.Any = js.native
    val _deg6InRad: js.Any = js.native
    /**
      * Weight in distance: 0.25
      * Max DeltaE: 100
      * Max DeltaA: 255
      */
    val _kA: js.Any = js.native
    val _pow25to7: js.Any = js.native
    /* private */ def _calculateRT(ahp: js.Any, aCp: js.Any): js.Any = js.native
    /* private */ def _calculateT(ahp: js.Any): js.Any = js.native
    /* private */ def _calculate_ahp(C1pC2p: js.Any, h_bar: js.Any, h1p: js.Any, h2p: js.Any): js.Any = js.native
    /* private */ def _calculate_dHp(C1pC2p: js.Any, h_bar: js.Any, h2p: js.Any, h1p: js.Any): js.Any = js.native
    /* private */ def _calculatehp(b: js.Any, ap: js.Any): js.Any = js.native
  }
  
}

