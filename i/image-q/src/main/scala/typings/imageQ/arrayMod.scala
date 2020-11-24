package typings.imageQ

import org.scalablytyped.runtime.TopLevel
import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.commonMod.IImageDitherer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-q/dist/image/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  
  @js.native
  class ErrorDiffusionArray protected () extends IImageDitherer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator, kernel: ErrorDiffusionArrayKernel) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: js.UndefOr[scala.Nothing],
      minimumColorDistanceToDither: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: js.UndefOr[scala.Nothing],
      minimumColorDistanceToDither: js.UndefOr[scala.Nothing],
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: js.UndefOr[scala.Nothing],
      minimumColorDistanceToDither: Double,
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: js.UndefOr[scala.Nothing],
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: Double,
      calculateErrorLikeGIMP: Boolean
    ) = this()
    
    /** true = GIMP, false = XNVIEW */
    var _calculateErrorLikeGIMP: js.Any = js.native
    
    var _distance: js.Any = js.native
    
    /* private */ def _fillErrorLine(errorLine: js.Any, width: js.Any): js.Any = js.native
    
    var _kernel: js.Any = js.native
    
    var _minColorDistance: js.Any = js.native
    
    var _serpentine: js.Any = js.native
    
    /* private */ def _setKernel(kernel: js.Any): js.Any = js.native
  }
  
  @js.native
  sealed trait ErrorDiffusionArrayKernel extends js.Object
  @js.native
  object ErrorDiffusionArrayKernel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorDiffusionArrayKernel with Double] = js.native
    
    @js.native
    sealed trait Atkinson extends ErrorDiffusionArrayKernel
    /* 3 */ @js.native
    object Atkinson extends TopLevel[Atkinson with Double]
    
    @js.native
    sealed trait Burkes extends ErrorDiffusionArrayKernel
    /* 5 */ @js.native
    object Burkes extends TopLevel[Burkes with Double]
    
    @js.native
    sealed trait FalseFloydSteinberg extends ErrorDiffusionArrayKernel
    /* 1 */ @js.native
    object FalseFloydSteinberg extends TopLevel[FalseFloydSteinberg with Double]
    
    @js.native
    sealed trait FloydSteinberg extends ErrorDiffusionArrayKernel
    /* 0 */ @js.native
    object FloydSteinberg extends TopLevel[FloydSteinberg with Double]
    
    @js.native
    sealed trait Jarvis extends ErrorDiffusionArrayKernel
    /* 4 */ @js.native
    object Jarvis extends TopLevel[Jarvis with Double]
    
    @js.native
    sealed trait Sierra extends ErrorDiffusionArrayKernel
    /* 6 */ @js.native
    object Sierra extends TopLevel[Sierra with Double]
    
    @js.native
    sealed trait SierraLite extends ErrorDiffusionArrayKernel
    /* 8 */ @js.native
    object SierraLite extends TopLevel[SierraLite with Double]
    
    @js.native
    sealed trait Stucki extends ErrorDiffusionArrayKernel
    /* 2 */ @js.native
    object Stucki extends TopLevel[Stucki with Double]
    
    @js.native
    sealed trait TwoSierra extends ErrorDiffusionArrayKernel
    /* 7 */ @js.native
    object TwoSierra extends TopLevel[TwoSierra with Double]
  }
}
