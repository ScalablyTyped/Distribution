package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wuQuantMod {
  
  @JSImport("image-q/dist/palette/wu/wuQuant", "WuColorCube")
  @js.native
  class WuColorCube () extends StObject {
    
    var alphaMaximum: Double = js.native
    
    var alphaMinimum: Double = js.native
    
    var blueMaximum: Double = js.native
    
    var blueMinimum: Double = js.native
    
    var greenMaximum: Double = js.native
    
    var greenMinimum: Double = js.native
    
    var redMaximum: Double = js.native
    
    var redMinimum: Double = js.native
    
    var volume: Double = js.native
  }
  
  @JSImport("image-q/dist/palette/wu/wuQuant", "WuQuant")
  @js.native
  class WuQuant protected () extends StObject {
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
    
    /* private */ def _addColor(color: js.Any): js.Any = js.native
    
    var _alphaMaxSideIndex: js.Any = js.native
    
    var _alphaSideSize: js.Any = js.native
    
    var _alphas: js.Any = js.native
    
    var _blues: js.Any = js.native
    
    /**
      * Converts the histogram to a series of _moments.
      */
    /* private */ def _calculateMoments(): js.Any = js.native
    
    /**
      * Calculates statistical variance for a given cube.
      */
    /* private */ def _calculateVariance(cube: js.Any): js.Any = js.native
    
    var _colors: js.Any = js.native
    
    var _cubes: js.Any = js.native
    
    /* private */ def _cut(first: js.Any, second: js.Any): js.Any = js.native
    
    val _distance: js.Any = js.native
    
    var _greens: js.Any = js.native
    
    /* private */ def _initialize(colors: js.Any): js.Any = js.native
    
    var _maxSideIndex: js.Any = js.native
    
    /**
      * Finds the optimal (maximal) position for the cut.
      */
    /* private */ def _maximize(
      cube: js.Any,
      direction: js.Any,
      first: js.Any,
      last: js.Any,
      wholeRed: js.Any,
      wholeGreen: js.Any,
      wholeBlue: js.Any,
      wholeAlpha: js.Any,
      wholeWeight: js.Any
    ): js.Any = js.native
    
    var _moments: js.Any = js.native
    
    var _momentsAlpha: js.Any = js.native
    
    var _momentsBlue: js.Any = js.native
    
    var _momentsGreen: js.Any = js.native
    
    var _momentsRed: js.Any = js.native
    
    var _pixels: js.Any = js.native
    
    /* private */ def _preparePalette(): js.Any = js.native
    
    var _reds: js.Any = js.native
    
    /* private */ def _setQuality(significantBitsPerChannel: js.Any): js.Any = js.native
    
    var _sideSize: js.Any = js.native
    
    var _significantBitsPerChannel: js.Any = js.native
    
    var _sums: js.Any = js.native
    
    var _table: js.Any = js.native
    
    var _weights: js.Any = js.native
    
    def quantize(): Palette = js.native
    
    def sample(image: PointContainer): Unit = js.native
  }
  /* static members */
  object WuQuant {
    
    /**
      * Splits the cube in a given color direction at its minimum.
      */
    @JSImport("image-q/dist/palette/wu/wuQuant", "WuQuant._bottom")
    @js.native
    def _bottom(cube: js.Any, direction: js.Any, moment: js.Any): js.Any = js.native
    
    /**
      * Splits the cube in given position][and color direction.
      */
    @JSImport("image-q/dist/palette/wu/wuQuant", "WuQuant._top")
    @js.native
    def _top(cube: js.Any, direction: js.Any, position: js.Any, moment: js.Any): js.Any = js.native
    
    /**
      * Computes the volume of the cube in a specific moment.
      */
    @JSImport("image-q/dist/palette/wu/wuQuant", "WuQuant._volume")
    @js.native
    def _volume(cube: js.Any, moment: js.Any): js.Any = js.native
    
    /**
      * Computes the volume of the cube in a specific moment.
      */
    @JSImport("image-q/dist/palette/wu/wuQuant", "WuQuant._volumeFloat")
    @js.native
    def _volumeFloat(cube: js.Any, moment: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/palette/wu/wuQuant", "WuQuant.alpha")
    @js.native
    val alpha: js.Any = js.native
    
    @JSImport("image-q/dist/palette/wu/wuQuant", "WuQuant.blue")
    @js.native
    val blue: js.Any = js.native
    
    @JSImport("image-q/dist/palette/wu/wuQuant", "WuQuant.green")
    @js.native
    val green: js.Any = js.native
    
    @JSImport("image-q/dist/palette/wu/wuQuant", "WuQuant.red")
    @js.native
    val red: js.Any = js.native
  }
}
