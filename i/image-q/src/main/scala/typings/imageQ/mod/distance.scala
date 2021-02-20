package typings.imageQ.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distance {
  
  @JSImport("image-q", "distance.AbstractDistanceCalculator")
  @js.native
  abstract class AbstractDistanceCalculator ()
    extends typings.imageQ.distanceMod.AbstractDistanceCalculator
  
  @JSImport("image-q", "distance.AbstractEuclidean")
  @js.native
  class AbstractEuclidean ()
    extends typings.imageQ.distanceMod.AbstractEuclidean
  
  @JSImport("image-q", "distance.AbstractManhattan")
  @js.native
  abstract class AbstractManhattan ()
    extends typings.imageQ.distanceMod.AbstractManhattan
  
  @JSImport("image-q", "distance.CIE94GraphicArts")
  @js.native
  class CIE94GraphicArts ()
    extends typings.imageQ.distanceMod.CIE94GraphicArts
  
  @JSImport("image-q", "distance.CIE94Textiles")
  @js.native
  class CIE94Textiles ()
    extends typings.imageQ.distanceMod.CIE94Textiles
  
  @JSImport("image-q", "distance.CIEDE2000")
  @js.native
  class CIEDE2000 ()
    extends typings.imageQ.distanceMod.CIEDE2000
  /* static members */
  object CIEDE2000 {
    
    @JSImport("image-q", "distance.CIEDE2000._calculateRT")
    @js.native
    def _calculateRT(ahp: js.Any, aCp: js.Any): js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._calculateT")
    @js.native
    def _calculateT(ahp: js.Any): js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._calculate_ahp")
    @js.native
    def _calculate_ahp(C1pC2p: js.Any, h_bar: js.Any, h1p: js.Any, h2p: js.Any): js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._calculate_dHp")
    @js.native
    def _calculate_dHp(C1pC2p: js.Any, h_bar: js.Any, h2p: js.Any, h1p: js.Any): js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._calculatehp")
    @js.native
    def _calculatehp(b: js.Any, ap: js.Any): js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg180InRad")
    @js.native
    val _deg180InRad: js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg25InRad")
    @js.native
    val _deg25InRad: js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg275InRad")
    @js.native
    val _deg275InRad: js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg30InRad")
    @js.native
    val _deg30InRad: js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg360InRad")
    @js.native
    val _deg360InRad: js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg63InRad")
    @js.native
    val _deg63InRad: js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._deg6InRad")
    @js.native
    val _deg6InRad: js.Any = js.native
    
    /**
      * Weight in distance: 0.25
      * Max DeltaE: 100
      * Max DeltaA: 255
      */
    @JSImport("image-q", "distance.CIEDE2000._kA")
    @js.native
    val _kA: js.Any = js.native
    
    @JSImport("image-q", "distance.CIEDE2000._pow25to7")
    @js.native
    val _pow25to7: js.Any = js.native
  }
  
  @JSImport("image-q", "distance.CMETRIC")
  @js.native
  class CMETRIC ()
    extends typings.imageQ.distanceMod.CMETRIC
  
  @JSImport("image-q", "distance.Euclidean")
  @js.native
  class Euclidean ()
    extends typings.imageQ.distanceMod.Euclidean
  
  @JSImport("image-q", "distance.EuclideanRgbQuantWOAlpha")
  @js.native
  class EuclideanRgbQuantWOAlpha ()
    extends typings.imageQ.distanceMod.EuclideanRgbQuantWOAlpha
  
  @JSImport("image-q", "distance.EuclideanRgbQuantWithAlpha")
  @js.native
  class EuclideanRgbQuantWithAlpha ()
    extends typings.imageQ.distanceMod.EuclideanRgbQuantWithAlpha
  
  @JSImport("image-q", "distance.Manhattan")
  @js.native
  class Manhattan ()
    extends typings.imageQ.distanceMod.Manhattan
  
  @JSImport("image-q", "distance.ManhattanNommyde")
  @js.native
  class ManhattanNommyde ()
    extends typings.imageQ.distanceMod.ManhattanNommyde
  
  @JSImport("image-q", "distance.ManhattanSRGB")
  @js.native
  class ManhattanSRGB ()
    extends typings.imageQ.distanceMod.ManhattanSRGB
  
  @JSImport("image-q", "distance.PNGQUANT")
  @js.native
  class PNGQUANT ()
    extends typings.imageQ.distanceMod.PNGQUANT
}
