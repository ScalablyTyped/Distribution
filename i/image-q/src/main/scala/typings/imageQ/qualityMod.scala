package typings.imageQ

import typings.imageQ.pointContainerMod.PointContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qualityMod {
  
  @JSImport("image-q/dist/types/src/quality", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ssim(image1: PointContainer, image2: PointContainer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ssim")(image1.asInstanceOf[js.Any], image2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
