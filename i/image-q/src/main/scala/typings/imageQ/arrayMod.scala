package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.commonMod.IImageDitherer
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("image-q/dist/image/array", "ErrorDiffusionArray")
  @js.native
  class ErrorDiffusionArray protected ()
    extends StObject
       with IImageDitherer {
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
    var _calculateErrorLikeGIMP: js.Any = js.native
    
    var _distance: js.Any = js.native
    
    /* private */ def _fillErrorLine(errorLine: js.Any, width: js.Any): js.Any = js.native
    
    var _kernel: js.Any = js.native
    
    var _minColorDistance: js.Any = js.native
    
    var _serpentine: js.Any = js.native
    
    /* private */ def _setKernel(kernel: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def quantize(pointBuffer: PointContainer, palette: Palette): PointContainer = js.native
  }
  
  @js.native
  sealed trait ErrorDiffusionArrayKernel extends StObject
  @JSImport("image-q/dist/image/array", "ErrorDiffusionArrayKernel")
  @js.native
  object ErrorDiffusionArrayKernel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorDiffusionArrayKernel & Double] = js.native
    
    @js.native
    sealed trait Atkinson
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 3 */ val Atkinson: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Atkinson & Double = js.native
    
    @js.native
    sealed trait Burkes
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 5 */ val Burkes: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Burkes & Double = js.native
    
    @js.native
    sealed trait FalseFloydSteinberg
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 1 */ val FalseFloydSteinberg: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.FalseFloydSteinberg & Double = js.native
    
    @js.native
    sealed trait FloydSteinberg
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 0 */ val FloydSteinberg: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.FloydSteinberg & Double = js.native
    
    @js.native
    sealed trait Jarvis
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 4 */ val Jarvis: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Jarvis & Double = js.native
    
    @js.native
    sealed trait Sierra
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 6 */ val Sierra: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Sierra & Double = js.native
    
    @js.native
    sealed trait SierraLite
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 8 */ val SierraLite: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.SierraLite & Double = js.native
    
    @js.native
    sealed trait Stucki
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 2 */ val Stucki: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Stucki & Double = js.native
    
    @js.native
    sealed trait TwoSierra
      extends StObject
         with ErrorDiffusionArrayKernel
    /* 7 */ val TwoSierra: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.TwoSierra & Double = js.native
  }
}
