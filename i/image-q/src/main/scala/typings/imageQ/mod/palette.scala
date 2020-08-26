package typings.imageQ.mod

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q", "palette")
@js.native
object palette extends js.Object {
  @js.native
  class ColorHistogram protected ()
    extends typings.imageQ.paletteMod.ColorHistogram {
    def this(method: Double, colors: Double) = this()
  }
  
  @js.native
  class NeuQuant protected ()
    extends typings.imageQ.paletteMod.NeuQuant {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
  }
  
  @js.native
  class NeuQuantFloat protected ()
    extends typings.imageQ.paletteMod.NeuQuantFloat {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
  }
  
  @js.native
  class RGBQuant protected ()
    extends typings.imageQ.paletteMod.RGBQuant {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      colors: js.UndefOr[scala.Nothing],
      method: Double
    ) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double, method: Double) = this()
  }
  
  @js.native
  class WuColorCube ()
    extends typings.imageQ.wuQuantMod.WuColorCube
  
  @js.native
  class WuQuant protected ()
    extends typings.imageQ.paletteMod.WuQuant {
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
  @js.native
  object ColorHistogram extends js.Object {
    var _boxPixels: js.Any = js.native
    var _boxSize: js.Any = js.native
    var _hueGroups: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object NeuQuant extends js.Object {
    val _alphaBiasShift: js.Any = js.native
    val _alphaRadBias: js.Any = js.native
    val _alphaRadBiasShift: js.Any = js.native
    val _beta: js.Any = js.native
    val _betaGamma: js.Any = js.native
    val _betaShift: js.Any = js.native
    val _gammaShift: js.Any = js.native
    val _initAlpha: js.Any = js.native
    val _initialBias: js.Any = js.native
    val _initialBiasShift: js.Any = js.native
    val _minpicturebytes: js.Any = js.native
    val _nCycles: js.Any = js.native
    val _prime1: js.Any = js.native
    val _prime2: js.Any = js.native
    val _prime3: js.Any = js.native
    val _prime4: js.Any = js.native
    val _radBias: js.Any = js.native
    val _radBiasShift: js.Any = js.native
    val _radiusBias: js.Any = js.native
    val _radiusBiasShift: js.Any = js.native
    val _radiusDecrease: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object NeuQuantFloat extends js.Object {
    val _alphaBiasShift: js.Any = js.native
    val _alphaRadBias: js.Any = js.native
    val _alphaRadBiasShift: js.Any = js.native
    val _beta: js.Any = js.native
    val _betaGamma: js.Any = js.native
    val _betaShift: js.Any = js.native
    val _gammaShift: js.Any = js.native
    val _initAlpha: js.Any = js.native
    val _initialBias: js.Any = js.native
    val _initialBiasShift: js.Any = js.native
    val _minpicturebytes: js.Any = js.native
    val _nCycles: js.Any = js.native
    val _prime1: js.Any = js.native
    val _prime2: js.Any = js.native
    val _prime3: js.Any = js.native
    val _prime4: js.Any = js.native
    val _radBias: js.Any = js.native
    val _radBiasShift: js.Any = js.native
    val _radiusBias: js.Any = js.native
    val _radiusBiasShift: js.Any = js.native
    val _radiusDecrease: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object WuQuant extends js.Object {
    val alpha: js.Any = js.native
    val blue: js.Any = js.native
    val green: js.Any = js.native
    val red: js.Any = js.native
    /**
      * Splits the cube in a given color direction at its minimum.
      */
    /* private */ def _bottom(cube: js.Any, direction: js.Any, moment: js.Any): js.Any = js.native
    /**
      * Splits the cube in given position][and color direction.
      */
    /* private */ def _top(cube: js.Any, direction: js.Any, position: js.Any, moment: js.Any): js.Any = js.native
    /**
      * Computes the volume of the cube in a specific moment.
      */
    /* private */ def _volume(cube: js.Any, moment: js.Any): js.Any = js.native
    /**
      * Computes the volume of the cube in a specific moment.
      */
    /* private */ def _volumeFloat(cube: js.Any, moment: js.Any): js.Any = js.native
  }
  
}

