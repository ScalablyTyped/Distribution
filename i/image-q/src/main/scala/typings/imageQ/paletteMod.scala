package typings.imageQ

import typings.imageQ.distanceCalculatorMod.AbstractDistanceCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paletteMod {
  
  @JSImport("image-q/dist/types/src/palette", "AbstractPaletteQuantizer")
  @js.native
  abstract class AbstractPaletteQuantizer ()
    extends typings.imageQ.paletteQuantizerMod.AbstractPaletteQuantizer
  
  @JSImport("image-q/dist/types/src/palette", "ColorHistogram")
  @js.native
  open class ColorHistogram protected ()
    extends typings.imageQ.colorHistogramMod.ColorHistogram {
    def this(method: Double, colors: Double) = this()
  }
  /* static members */
  object ColorHistogram {
    
    @JSImport("image-q/dist/types/src/palette", "ColorHistogram")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "ColorHistogram._boxPixels")
    @js.native
    def _boxPixels: Any = js.native
    inline def _boxPixels_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_boxPixels")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q/dist/types/src/palette", "ColorHistogram._boxSize")
    @js.native
    def _boxSize: Any = js.native
    inline def _boxSize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_boxSize")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q/dist/types/src/palette", "ColorHistogram._hueGroups")
    @js.native
    def _hueGroups: Any = js.native
    inline def _hueGroups_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_hueGroups")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("image-q/dist/types/src/palette", "NeuQuant")
  @js.native
  open class NeuQuant protected ()
    extends typings.imageQ.neuquantMod.NeuQuant {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
  }
  /* static members */
  object NeuQuant {
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._alphaBiasShift")
    @js.native
    val _alphaBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._alphaRadBias")
    @js.native
    val _alphaRadBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._alphaRadBiasShift")
    @js.native
    val _alphaRadBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._beta")
    @js.native
    val _beta: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._betaGamma")
    @js.native
    val _betaGamma: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._betaShift")
    @js.native
    val _betaShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._gammaShift")
    @js.native
    val _gammaShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._initAlpha")
    @js.native
    val _initAlpha: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._initialBias")
    @js.native
    val _initialBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._initialBiasShift")
    @js.native
    val _initialBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._minpicturebytes")
    @js.native
    val _minpicturebytes: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._nCycles")
    @js.native
    val _nCycles: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._prime1")
    @js.native
    val _prime1: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._prime2")
    @js.native
    val _prime2: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._prime3")
    @js.native
    val _prime3: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._prime4")
    @js.native
    val _prime4: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._radBias")
    @js.native
    val _radBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._radBiasShift")
    @js.native
    val _radBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._radiusBias")
    @js.native
    val _radiusBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._radiusBiasShift")
    @js.native
    val _radiusBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuant._radiusDecrease")
    @js.native
    val _radiusDecrease: Any = js.native
  }
  
  @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat")
  @js.native
  open class NeuQuantFloat protected ()
    extends typings.imageQ.neuquantFloatMod.NeuQuantFloat {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
  }
  /* static members */
  object NeuQuantFloat {
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._alphaBiasShift")
    @js.native
    val _alphaBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._alphaRadBias")
    @js.native
    val _alphaRadBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._alphaRadBiasShift")
    @js.native
    val _alphaRadBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._beta")
    @js.native
    val _beta: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._betaGamma")
    @js.native
    val _betaGamma: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._betaShift")
    @js.native
    val _betaShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._gammaShift")
    @js.native
    val _gammaShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._initAlpha")
    @js.native
    val _initAlpha: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._initialBias")
    @js.native
    val _initialBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._initialBiasShift")
    @js.native
    val _initialBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._minpicturebytes")
    @js.native
    val _minpicturebytes: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._nCycles")
    @js.native
    val _nCycles: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._prime1")
    @js.native
    val _prime1: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._prime2")
    @js.native
    val _prime2: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._prime3")
    @js.native
    val _prime3: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._prime4")
    @js.native
    val _prime4: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._radBias")
    @js.native
    val _radBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._radBiasShift")
    @js.native
    val _radBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._radiusBias")
    @js.native
    val _radiusBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._radiusBiasShift")
    @js.native
    val _radiusBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "NeuQuantFloat._radiusDecrease")
    @js.native
    val _radiusDecrease: Any = js.native
  }
  
  @JSImport("image-q/dist/types/src/palette", "RGBQuant")
  @js.native
  open class RGBQuant protected ()
    extends typings.imageQ.rgbquantMod.RGBQuant {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double, method: Double) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Unit, method: Double) = this()
  }
  
  @JSImport("image-q/dist/types/src/palette", "WuColorCube")
  @js.native
  open class WuColorCube ()
    extends typings.imageQ.wuQuantMod.WuColorCube
  
  @JSImport("image-q/dist/types/src/palette", "WuQuant")
  @js.native
  open class WuQuant protected ()
    extends typings.imageQ.wuQuantMod.WuQuant {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      colors: Double,
      significantBitsPerChannel: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      colors: Unit,
      significantBitsPerChannel: Double
    ) = this()
  }
  /* static members */
  object WuQuant {
    
    @JSImport("image-q/dist/types/src/palette", "WuQuant")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "WuQuant._alpha")
    @js.native
    val _alpha: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "WuQuant._blue")
    @js.native
    val _blue: Any = js.native
    
    /**
      * Splits the cube in a given color direction at its minimum.
      */
    @JSImport("image-q/dist/types/src/palette", "WuQuant._bottom")
    @js.native
    def _bottom: Any = js.native
    inline def _bottom_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bottom")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q/dist/types/src/palette", "WuQuant._green")
    @js.native
    val _green: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette", "WuQuant._red")
    @js.native
    val _red: Any = js.native
    
    /**
      * Splits the cube in given position][and color direction.
      */
    @JSImport("image-q/dist/types/src/palette", "WuQuant._top")
    @js.native
    def _top: Any = js.native
    inline def _top_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_top")(x.asInstanceOf[js.Any])
    
    /**
      * Computes the volume of the cube in a specific moment.
      */
    @JSImport("image-q/dist/types/src/palette", "WuQuant._volume")
    @js.native
    def _volume: Any = js.native
    
    /**
      * Computes the volume of the cube in a specific moment.
      */
    @JSImport("image-q/dist/types/src/palette", "WuQuant._volumeFloat")
    @js.native
    def _volumeFloat: Any = js.native
    inline def _volumeFloat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_volumeFloat")(x.asInstanceOf[js.Any])
    
    inline def _volume_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_volume")(x.asInstanceOf[js.Any])
  }
}
