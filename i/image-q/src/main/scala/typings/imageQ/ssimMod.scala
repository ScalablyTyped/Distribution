package typings.imageQ

import typings.imageQ.pointContainerMod.PointContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-q/dist/quality/ssim", JSImport.Namespace)
@js.native
object ssimMod extends js.Object {
  
  @js.native
  class SSIM () extends js.Object {
    
    /* private */ def _calculateAverageLuma(lumaValues: js.Any): js.Any = js.native
    
    /* private */ def _calculateLumaValuesForWindow(image: js.Any, x: js.Any, y: js.Any, width: js.Any, height: js.Any): js.Any = js.native
    
    /* private */ def _iterate(image1: js.Any, image2: js.Any, callback: js.Any): js.Any = js.native
    
    def compare(image1: PointContainer, image2: PointContainer): Double = js.native
  }
}
