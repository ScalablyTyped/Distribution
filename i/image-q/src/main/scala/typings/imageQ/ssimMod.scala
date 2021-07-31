package typings.imageQ

import typings.imageQ.pointContainerMod.PointContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssimMod {
  
  @JSImport("image-q/dist/quality/ssim", "SSIM")
  @js.native
  class SSIM () extends StObject {
    
    /* private */ def _calculateAverageLuma(lumaValues: js.Any): js.Any = js.native
    
    /* private */ def _calculateLumaValuesForWindow(image: js.Any, x: js.Any, y: js.Any, width: js.Any, height: js.Any): js.Any = js.native
    
    /* private */ def _iterate(image1: js.Any, image2: js.Any, callback: js.Any): js.Any = js.native
    
    def compare(image1: PointContainer, image2: PointContainer): Double = js.native
  }
}
