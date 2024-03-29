package typings.imageQ

import typings.imageQ.distTypesSrcDistanceDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcImageMod {
  
  /* note: abstract class */ @JSImport("image-q/dist/types/src/image", "AbstractImageQuantizer")
  @js.native
  open class AbstractImageQuantizer ()
    extends typings.imageQ.distTypesSrcImageImageQuantizerMod.AbstractImageQuantizer
  
  @JSImport("image-q/dist/types/src/image", "ErrorDiffusionArray")
  @js.native
  open class ErrorDiffusionArray protected ()
    extends typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArray {
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
  }
  
  @JSImport("image-q/dist/types/src/image", "ErrorDiffusionArrayKernel")
  @js.native
  object ErrorDiffusionArrayKernel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel & Double] = js.native
    
    /* 3 */ val Atkinson: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Atkinson & Double = js.native
    
    /* 5 */ val Burkes: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Burkes & Double = js.native
    
    /* 1 */ val FalseFloydSteinberg: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.FalseFloydSteinberg & Double = js.native
    
    /* 0 */ val FloydSteinberg: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.FloydSteinberg & Double = js.native
    
    /* 4 */ val Jarvis: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Jarvis & Double = js.native
    
    /* 6 */ val Sierra: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Sierra & Double = js.native
    
    /* 8 */ val SierraLite: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.SierraLite & Double = js.native
    
    /* 2 */ val Stucki: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.Stucki & Double = js.native
    
    /* 7 */ val TwoSierra: typings.imageQ.distTypesSrcImageArrayMod.ErrorDiffusionArrayKernel.TwoSierra & Double = js.native
  }
  
  @JSImport("image-q/dist/types/src/image", "ErrorDiffusionRiemersma")
  @js.native
  open class ErrorDiffusionRiemersma protected ()
    extends typings.imageQ.distTypesSrcImageRiemersmaMod.ErrorDiffusionRiemersma {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, errorQueueSize: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: Double,
      errorPropagation: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: Unit,
      errorPropagation: Double
    ) = this()
  }
  /* static members */
  object ErrorDiffusionRiemersma {
    
    @JSImport("image-q/dist/types/src/image", "ErrorDiffusionRiemersma")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("image-q/dist/types/src/image", "ErrorDiffusionRiemersma._createWeights")
    @js.native
    def _createWeights: Any = js.native
    inline def _createWeights_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_createWeights")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("image-q/dist/types/src/image", "NearestColor")
  @js.native
  open class NearestColor protected ()
    extends typings.imageQ.distTypesSrcImageNearestColorMod.NearestColor {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
  }
}
