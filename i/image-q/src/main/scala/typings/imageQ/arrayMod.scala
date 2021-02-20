package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.commonMod.IImageDitherer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("image-q/dist/image/array", "ErrorDiffusionArray")
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
  sealed trait ErrorDiffusionArrayKernel extends StObject
  @JSImport("image-q/dist/image/array", "ErrorDiffusionArrayKernel")
  @js.native
  object ErrorDiffusionArrayKernel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorDiffusionArrayKernel with Double] = js.native
    
    @js.native
    sealed trait Atkinson extends ErrorDiffusionArrayKernel
    /* 3 */ val Atkinson: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Atkinson with Double = js.native
    
    @js.native
    sealed trait Burkes extends ErrorDiffusionArrayKernel
    /* 5 */ val Burkes: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Burkes with Double = js.native
    
    @js.native
    sealed trait FalseFloydSteinberg extends ErrorDiffusionArrayKernel
    /* 1 */ val FalseFloydSteinberg: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.FalseFloydSteinberg with Double = js.native
    
    @js.native
    sealed trait FloydSteinberg extends ErrorDiffusionArrayKernel
    /* 0 */ val FloydSteinberg: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.FloydSteinberg with Double = js.native
    
    @js.native
    sealed trait Jarvis extends ErrorDiffusionArrayKernel
    /* 4 */ val Jarvis: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Jarvis with Double = js.native
    
    @js.native
    sealed trait Sierra extends ErrorDiffusionArrayKernel
    /* 6 */ val Sierra: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Sierra with Double = js.native
    
    @js.native
    sealed trait SierraLite extends ErrorDiffusionArrayKernel
    /* 8 */ val SierraLite: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.SierraLite with Double = js.native
    
    @js.native
    sealed trait Stucki extends ErrorDiffusionArrayKernel
    /* 2 */ val Stucki: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Stucki with Double = js.native
    
    @js.native
    sealed trait TwoSierra extends ErrorDiffusionArrayKernel
    /* 7 */ val TwoSierra: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.TwoSierra with Double = js.native
  }
}
