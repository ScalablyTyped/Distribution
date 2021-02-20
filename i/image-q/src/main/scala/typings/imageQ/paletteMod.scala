package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paletteMod {
  
  @JSImport("image-q/dist/palette", "ColorHistogram")
  @js.native
  class ColorHistogram protected ()
    extends typings.imageQ.colorHistogramMod.ColorHistogram {
    def this(method: Double, colors: Double) = this()
  }
  /* static members */
  object ColorHistogram {
    
    @JSImport("image-q/dist/palette", "ColorHistogram")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("image-q/dist/palette", "ColorHistogram._boxPixels")
    @js.native
    def _boxPixels: js.Any = js.native
    @scala.inline
    def _boxPixels_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_boxPixels")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q/dist/palette", "ColorHistogram._boxSize")
    @js.native
    def _boxSize: js.Any = js.native
    @scala.inline
    def _boxSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_boxSize")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q/dist/palette", "ColorHistogram._hueGroups")
    @js.native
    def _hueGroups: js.Any = js.native
    @scala.inline
    def _hueGroups_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_hueGroups")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("image-q/dist/palette", "NeuQuant")
  @js.native
  class NeuQuant protected ()
    extends typings.imageQ.neuquantMod.NeuQuant {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
  }
  /* static members */
  object NeuQuant {
    
    @JSImport("image-q/dist/palette", "NeuQuant._alphaBiasShift")
    @js.native
    val _alphaBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._alphaRadBias")
    @js.native
    val _alphaRadBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._alphaRadBiasShift")
    @js.native
    val _alphaRadBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._beta")
    @js.native
    val _beta: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._betaGamma")
    @js.native
    val _betaGamma: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._betaShift")
    @js.native
    val _betaShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._gammaShift")
    @js.native
    val _gammaShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._initAlpha")
    @js.native
    val _initAlpha: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._initialBias")
    @js.native
    val _initialBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._initialBiasShift")
    @js.native
    val _initialBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._minpicturebytes")
    @js.native
    val _minpicturebytes: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._nCycles")
    @js.native
    val _nCycles: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._prime1")
    @js.native
    val _prime1: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._prime2")
    @js.native
    val _prime2: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._prime3")
    @js.native
    val _prime3: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._prime4")
    @js.native
    val _prime4: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._radBias")
    @js.native
    val _radBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._radBiasShift")
    @js.native
    val _radBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._radiusBias")
    @js.native
    val _radiusBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._radiusBiasShift")
    @js.native
    val _radiusBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuant._radiusDecrease")
    @js.native
    val _radiusDecrease: js.Any = js.native
  }
  
  @JSImport("image-q/dist/palette", "NeuQuantFloat")
  @js.native
  class NeuQuantFloat protected ()
    extends typings.imageQ.neuquantFloatMod.NeuQuantFloat {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
  }
  /* static members */
  object NeuQuantFloat {
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._alphaBiasShift")
    @js.native
    val _alphaBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._alphaRadBias")
    @js.native
    val _alphaRadBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._alphaRadBiasShift")
    @js.native
    val _alphaRadBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._beta")
    @js.native
    val _beta: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._betaGamma")
    @js.native
    val _betaGamma: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._betaShift")
    @js.native
    val _betaShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._gammaShift")
    @js.native
    val _gammaShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._initAlpha")
    @js.native
    val _initAlpha: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._initialBias")
    @js.native
    val _initialBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._initialBiasShift")
    @js.native
    val _initialBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._minpicturebytes")
    @js.native
    val _minpicturebytes: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._nCycles")
    @js.native
    val _nCycles: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._prime1")
    @js.native
    val _prime1: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._prime2")
    @js.native
    val _prime2: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._prime3")
    @js.native
    val _prime3: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._prime4")
    @js.native
    val _prime4: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._radBias")
    @js.native
    val _radBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._radBiasShift")
    @js.native
    val _radBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._radiusBias")
    @js.native
    val _radiusBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._radiusBiasShift")
    @js.native
    val _radiusBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "NeuQuantFloat._radiusDecrease")
    @js.native
    val _radiusDecrease: js.Any = js.native
  }
  
  @JSImport("image-q/dist/palette", "RGBQuant")
  @js.native
  class RGBQuant protected ()
    extends typings.imageQ.rgbquantMod.RGBQuant {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      colors: js.UndefOr[scala.Nothing],
      method: Double
    ) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double, method: Double) = this()
  }
  
  @JSImport("image-q/dist/palette", "WuColorCube")
  @js.native
  class WuColorCube ()
    extends typings.imageQ.wuQuantMod.WuColorCube
  
  @JSImport("image-q/dist/palette", "WuQuant")
  @js.native
  class WuQuant protected ()
    extends typings.imageQ.wuQuantMod.WuQuant {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      colors: js.UndefOr[scala.Nothing],
      significantBitsPerChannel: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      colors: Double,
      significantBitsPerChannel: Double
    ) = this()
  }
  /* static members */
  object WuQuant {
    
    /**
      * Splits the cube in a given color direction at its minimum.
      */
    @JSImport("image-q/dist/palette", "WuQuant._bottom")
    @js.native
    def _bottom(cube: js.Any, direction: js.Any, moment: js.Any): js.Any = js.native
    
    /**
      * Splits the cube in given position][and color direction.
      */
    @JSImport("image-q/dist/palette", "WuQuant._top")
    @js.native
    def _top(cube: js.Any, direction: js.Any, position: js.Any, moment: js.Any): js.Any = js.native
    
    /**
      * Computes the volume of the cube in a specific moment.
      */
    @JSImport("image-q/dist/palette", "WuQuant._volume")
    @js.native
    def _volume(cube: js.Any, moment: js.Any): js.Any = js.native
    
    /**
      * Computes the volume of the cube in a specific moment.
      */
    @JSImport("image-q/dist/palette", "WuQuant._volumeFloat")
    @js.native
    def _volumeFloat(cube: js.Any, moment: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/palette", "WuQuant.alpha")
    @js.native
    val alpha: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "WuQuant.blue")
    @js.native
    val blue: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "WuQuant.green")
    @js.native
    val green: js.Any = js.native
    
    @JSImport("image-q/dist/palette", "WuQuant.red")
    @js.native
    val red: js.Any = js.native
  }
}
