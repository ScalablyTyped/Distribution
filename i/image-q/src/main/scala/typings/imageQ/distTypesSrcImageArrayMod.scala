package typings.imageQ

import typings.imageQ.distTypesSrcDistanceDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.distTypesSrcImageImageQuantizerMod.AbstractImageQuantizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcImageArrayMod {
  
  @JSImport("image-q/dist/types/src/image/array", "ErrorDiffusionArray")
  @js.native
  open class ErrorDiffusionArray protected () extends AbstractImageQuantizer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator, kernel: ErrorDiffusionArrayKernel) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean
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
      serpentine: Unit,
      minimumColorDistanceToDither: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: Double,
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: Unit,
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Unit,
      minimumColorDistanceToDither: Double,
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Unit,
      minimumColorDistanceToDither: Unit,
      calculateErrorLikeGIMP: Boolean
    ) = this()
    
    /** true = GIMP, false = XNVIEW */
    /* private */ var _calculateErrorLikeGIMP: Any = js.native
    
    /* private */ var _distance: Any = js.native
    
    /* private */ var _fillErrorLine: Any = js.native
    
    /* private */ var _kernel: Any = js.native
    
    /* private */ var _minColorDistance: Any = js.native
    
    /* private */ var _serpentine: Any = js.native
    
    /* private */ var _setKernel: Any = js.native
  }
  
  @js.native
  sealed trait ErrorDiffusionArrayKernel extends StObject
  @JSImport("image-q/dist/types/src/image/array", "ErrorDiffusionArrayKernel")
  @js.native
  object ErrorDiffusionArrayKernel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorDiffusionArrayKernel & Double] = js.native
    
    @js.native
    sealed trait Atkinson
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 3 */ val Atkinson: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Atkinson & Double = js.native
    
    @js.native
    sealed trait Burkes
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 5 */ val Burkes: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Burkes & Double = js.native
    
    @js.native
    sealed trait FalseFloydSteinberg
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 1 */ val FalseFloydSteinberg: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.FalseFloydSteinberg & Double = js.native
    
    @js.native
    sealed trait FloydSteinberg
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 0 */ val FloydSteinberg: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.FloydSteinberg & Double = js.native
    
    @js.native
    sealed trait Jarvis
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 4 */ val Jarvis: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Jarvis & Double = js.native
    
    @js.native
    sealed trait Sierra
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 6 */ val Sierra: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Sierra & Double = js.native
    
    @js.native
    sealed trait SierraLite
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 8 */ val SierraLite: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.SierraLite & Double = js.native
    
    @js.native
    sealed trait Stucki
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 2 */ val Stucki: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Stucki & Double = js.native
    
    @js.native
    sealed trait TwoSierra
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 7 */ val TwoSierra: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.TwoSierra & Double = js.native
  }
}
