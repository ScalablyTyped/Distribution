package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.paletteCommonMod.IPaletteQuantizer
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neuquantMod {
  
  @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant")
  @js.native
  class NeuQuant protected ()
    extends StObject
       with IPaletteQuantizer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
    
    /**
      * Move adjacent neurons by precomputed alpha*(1-((i-j)^2/[r]^2)) in radpower[|i-j|]
      */
    /* private */ def _alterNeighbour(rad: js.Any, i: js.Any, b: js.Any, g: js.Any, r: js.Any, al: js.Any): js.Any = js.native
    
    /**
      * Move neuron i towards biased (b,g,r) by factor alpha
      */
    /* private */ def _alterSingle(alpha: js.Any, i: js.Any, b: js.Any, g: js.Any, r: js.Any, a: js.Any): js.Any = js.native
    
    var _bias: js.Any = js.native
    
    /* private */ def _buildPalette(): js.Any = js.native
    
    /**
      * Search for biased BGR values
      * description:
      *    finds closest neuron (min dist) and updates freq
      *    finds best neuron (min dist-bias) and returns position
      *    for frequently chosen neurons, freq[i] is high and bias[i] is negative
      *    bias[i] = _gamma*((1/this._networkSize)-freq[i])
      *
      * Original distance equation:
      *        dist = abs(dR) + abs(dG) + abs(dB)
      */
    /* private */ def _contest(b: js.Any, g: js.Any, r: js.Any, a: js.Any): js.Any = js.native
    
    val _distance: js.Any = js.native
    
    var _freq: js.Any = js.native
    
    /* private */ def _init(): js.Any = js.native
    
    /**
      * Main Learning Loop
      */
    /* private */ def _learn(): js.Any = js.native
    
    var _network: js.Any = js.native
    
    val _networkSize: js.Any = js.native
    
    var _pointArray: js.Any = js.native
    
    var _radPower: js.Any = js.native
    
    /** sampling factor 1..30 */
    val _sampleFactor: js.Any = js.native
    
    /* CompleteClass */
    override def quantize(): Palette = js.native
    
    /* CompleteClass */
    override def sample(pointBuffer: PointContainer): Unit = js.native
  }
  /* static members */
  object NeuQuant {
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._alphaBiasShift")
    @js.native
    val _alphaBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._alphaRadBias")
    @js.native
    val _alphaRadBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._alphaRadBiasShift")
    @js.native
    val _alphaRadBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._beta")
    @js.native
    val _beta: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._betaGamma")
    @js.native
    val _betaGamma: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._betaShift")
    @js.native
    val _betaShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._gammaShift")
    @js.native
    val _gammaShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._initAlpha")
    @js.native
    val _initAlpha: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._initialBias")
    @js.native
    val _initialBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._initialBiasShift")
    @js.native
    val _initialBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._minpicturebytes")
    @js.native
    val _minpicturebytes: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._nCycles")
    @js.native
    val _nCycles: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._prime1")
    @js.native
    val _prime1: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._prime2")
    @js.native
    val _prime2: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._prime3")
    @js.native
    val _prime3: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._prime4")
    @js.native
    val _prime4: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._radBias")
    @js.native
    val _radBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._radBiasShift")
    @js.native
    val _radBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._radiusBias")
    @js.native
    val _radiusBias: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._radiusBiasShift")
    @js.native
    val _radiusBiasShift: js.Any = js.native
    
    @JSImport("image-q/dist/palette/neuquant/neuquant", "NeuQuant._radiusDecrease")
    @js.native
    val _radiusDecrease: js.Any = js.native
  }
}
