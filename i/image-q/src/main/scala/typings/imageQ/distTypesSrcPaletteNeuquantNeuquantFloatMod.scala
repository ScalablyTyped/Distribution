package typings.imageQ

import typings.imageQ.distTypesSrcDistanceDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.distTypesSrcPalettePaletteQuantizerMod.AbstractPaletteQuantizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcPaletteNeuquantNeuquantFloatMod {
  
  @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat")
  @js.native
  open class NeuQuantFloat protected () extends AbstractPaletteQuantizer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
    
    /**
      * Move adjacent neurons by precomputed alpha*(1-((i-j)^2/[r]^2)) in radpower[|i-j|]
      */
    /* private */ var _alterNeighbour: Any = js.native
    
    /**
      * Move neuron i towards biased (b,g,r) by factor alpha
      */
    /* private */ var _alterSingle: Any = js.native
    
    /* private */ var _bias: Any = js.native
    
    /* private */ var _buildPalette: Any = js.native
    
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
    /* private */ var _contest: Any = js.native
    
    /* private */ val _distance: Any = js.native
    
    /* private */ var _freq: Any = js.native
    
    /* private */ var _init: Any = js.native
    
    /**
      * Main Learning Loop
      */
    /* private */ var _learn: Any = js.native
    
    /* private */ var _network: Any = js.native
    
    /* private */ val _networkSize: Any = js.native
    
    /* private */ var _pointArray: Any = js.native
    
    /* private */ var _radPower: Any = js.native
    
    /** sampling factor 1..30 */
    /* private */ val _sampleFactor: Any = js.native
  }
  /* static members */
  object NeuQuantFloat {
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._alphaBiasShift")
    @js.native
    val _alphaBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._alphaRadBias")
    @js.native
    val _alphaRadBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._alphaRadBiasShift")
    @js.native
    val _alphaRadBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._beta")
    @js.native
    val _beta: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._betaGamma")
    @js.native
    val _betaGamma: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._betaShift")
    @js.native
    val _betaShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._gammaShift")
    @js.native
    val _gammaShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._initAlpha")
    @js.native
    val _initAlpha: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._initialBias")
    @js.native
    val _initialBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._initialBiasShift")
    @js.native
    val _initialBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._minpicturebytes")
    @js.native
    val _minpicturebytes: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._nCycles")
    @js.native
    val _nCycles: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._prime1")
    @js.native
    val _prime1: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._prime2")
    @js.native
    val _prime2: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._prime3")
    @js.native
    val _prime3: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._prime4")
    @js.native
    val _prime4: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._radBias")
    @js.native
    val _radBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._radBiasShift")
    @js.native
    val _radBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._radiusBias")
    @js.native
    val _radiusBias: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._radiusBiasShift")
    @js.native
    val _radiusBiasShift: Any = js.native
    
    @JSImport("image-q/dist/types/src/palette/neuquant/neuquantFloat", "NeuQuantFloat._radiusDecrease")
    @js.native
    val _radiusDecrease: Any = js.native
  }
}
