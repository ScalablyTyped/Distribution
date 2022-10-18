package typings.imageQ

import typings.imageQ.distTypesSrcDistanceDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.distTypesSrcPalettePaletteQuantizerMod.AbstractPaletteQuantizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcPaletteWuWuQuantMod {
  
  @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuColorCube")
  @js.native
  open class WuColorCube () extends StObject {
    
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
  
  @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuQuant")
  @js.native
  open class WuQuant protected () extends AbstractPaletteQuantizer {
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
    
    /* private */ var _addColor: Any = js.native
    
    /* private */ var _alphaMaxSideIndex: Any = js.native
    
    /* private */ var _alphaSideSize: Any = js.native
    
    /* private */ var _alphas: Any = js.native
    
    /* private */ var _blues: Any = js.native
    
    /**
      * Converts the histogram to a series of _moments.
      */
    /* private */ var _calculateMoments: Any = js.native
    
    /**
      * Calculates statistical variance for a given cube.
      */
    /* private */ var _calculateVariance: Any = js.native
    
    /* private */ var _colors: Any = js.native
    
    /* private */ var _cubes: Any = js.native
    
    /* private */ var _cut: Any = js.native
    
    /* private */ val _distance: Any = js.native
    
    /* private */ var _greens: Any = js.native
    
    /* private */ var _initialize: Any = js.native
    
    /* private */ var _maxSideIndex: Any = js.native
    
    /**
      * Finds the optimal (maximal) position for the cut.
      */
    /* private */ var _maximize: Any = js.native
    
    /* private */ var _moments: Any = js.native
    
    /* private */ var _momentsAlpha: Any = js.native
    
    /* private */ var _momentsBlue: Any = js.native
    
    /* private */ var _momentsGreen: Any = js.native
    
    /* private */ var _momentsRed: Any = js.native
    
    /* private */ var _pixels: Any = js.native
    
    /* private */ var _preparePalette: Any = js.native
    
    /* private */ var _reds: Any = js.native
    
    /* private */ var _setQuality: Any = js.native
    
    /* private */ var _sideSize: Any = js.native
    
    /* private */ var _significantBitsPerChannel: Any = js.native
    
    /* private */ var _sums: Any = js.native
    
    /* private */ var _table: Any = js.native
    
    /* private */ var _weights: Any = js.native
  }
  /* static members */
  object WuQuant {
    
    @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuQuant")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuQuant._alpha")
    @js.native
    val _alpha: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuQuant._blue")
    @js.native
    val _blue: Any = js.native
    
    /**
      * Splits the cube in a given color direction at its minimum.
      */
    @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuQuant._bottom")
    @js.native
    def _bottom: Any = js.native
    inline def _bottom_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bottom")(x.asInstanceOf[js.Any])
    
    @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuQuant._green")
    @js.native
    val _green: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuQuant._red")
    @js.native
    val _red: Any = js.native
    
    /**
      * Splits the cube in given position][and color direction.
      */
    @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuQuant._top")
    @js.native
    def _top: Any = js.native
    inline def _top_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_top")(x.asInstanceOf[js.Any])
    
    /**
      * Computes the volume of the cube in a specific moment.
      */
    @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuQuant._volume")
    @js.native
    def _volume: Any = js.native
    
    /**
      * Computes the volume of the cube in a specific moment.
      */
    @JSImport("image-q/dist/types/src/palette/wu/wuQuant", "WuQuant._volumeFloat")
    @js.native
    def _volumeFloat: Any = js.native
    inline def _volumeFloat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_volumeFloat")(x.asInstanceOf[js.Any])
    
    inline def _volume_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_volume")(x.asInstanceOf[js.Any])
  }
}
