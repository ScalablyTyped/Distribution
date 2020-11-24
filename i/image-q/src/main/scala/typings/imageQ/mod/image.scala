package typings.imageQ.mod

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.arrayMod.ErrorDiffusionArrayKernel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-q", "image")
@js.native
object image extends js.Object {
  
  @js.native
  class ErrorDiffusionArray protected ()
    extends typings.imageQ.imageMod.ErrorDiffusionArray {
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
  }
  
  @js.native
  object ErrorDiffusionArrayKernel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.imageQ.arrayMod.ErrorDiffusionArrayKernel with Double] = js.native
    
    /* 3 */ val Atkinson: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Atkinson with Double = js.native
    
    /* 5 */ val Burkes: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Burkes with Double = js.native
    
    /* 1 */ val FalseFloydSteinberg: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.FalseFloydSteinberg with Double = js.native
    
    /* 0 */ val FloydSteinberg: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.FloydSteinberg with Double = js.native
    
    /* 4 */ val Jarvis: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Jarvis with Double = js.native
    
    /* 6 */ val Sierra: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Sierra with Double = js.native
    
    /* 8 */ val SierraLite: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.SierraLite with Double = js.native
    
    /* 2 */ val Stucki: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.Stucki with Double = js.native
    
    /* 7 */ val TwoSierra: typings.imageQ.arrayMod.ErrorDiffusionArrayKernel.TwoSierra with Double = js.native
  }
  
  @js.native
  class ErrorDiffusionRiemersma protected ()
    extends typings.imageQ.imageMod.ErrorDiffusionRiemersma {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, errorQueueSize: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: js.UndefOr[scala.Nothing],
      errorPropagation: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: Double,
      errorPropagation: Double
    ) = this()
  }
  
  @js.native
  class NearestColor protected ()
    extends typings.imageQ.imageMod.NearestColor {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
  }
}
