package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ciede2000Mod {
  
  @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000")
  @js.native
  class CIEDE2000 () extends AbstractDistanceCalculator {
    
    def calculateRawInLab(Lab1: A, Lab2: A): Double = js.native
  }
  /* static members */
  object CIEDE2000 {
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._calculateRT")
    @js.native
    def _calculateRT(ahp: js.Any, aCp: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._calculateT")
    @js.native
    def _calculateT(ahp: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._calculate_ahp")
    @js.native
    def _calculate_ahp(C1pC2p: js.Any, h_bar: js.Any, h1p: js.Any, h2p: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._calculate_dHp")
    @js.native
    def _calculate_dHp(C1pC2p: js.Any, h_bar: js.Any, h2p: js.Any, h1p: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._calculatehp")
    @js.native
    def _calculatehp(b: js.Any, ap: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._deg180InRad")
    @js.native
    val _deg180InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._deg25InRad")
    @js.native
    val _deg25InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._deg275InRad")
    @js.native
    val _deg275InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._deg30InRad")
    @js.native
    val _deg30InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._deg360InRad")
    @js.native
    val _deg360InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._deg63InRad")
    @js.native
    val _deg63InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._deg6InRad")
    @js.native
    val _deg6InRad: js.Any = js.native
    
    /**
      * Weight in distance: 0.25
      * Max DeltaE: 100
      * Max DeltaA: 255
      */
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._kA")
    @js.native
    val _kA: js.Any = js.native
    
    @JSImport("image-q/dist/distance/ciede2000", "CIEDE2000._pow25to7")
    @js.native
    val _pow25to7: js.Any = js.native
  }
}
