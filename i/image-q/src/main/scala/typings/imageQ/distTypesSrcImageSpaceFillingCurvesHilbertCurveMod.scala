package typings.imageQ

import typings.imageQ.distTypesSrcImageImageQuantizerYieldValueMod.ImageQuantizerYieldValue
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcImageSpaceFillingCurvesHilbertCurveMod {
  
  @JSImport("image-q/dist/types/src/image/spaceFillingCurves/hilbertCurve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hilbertCurve(width: Double, height: Double, callback: js.Function2[/* x */ Double, /* y */ Double, Unit]): Generator[ImageQuantizerYieldValue, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hilbertCurve")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Generator[ImageQuantizerYieldValue, Unit, Unit]]
}
