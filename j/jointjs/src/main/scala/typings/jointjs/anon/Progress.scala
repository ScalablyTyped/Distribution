package typings.jointjs.anon

import typings.jointjs.mod.dia.Paper
import typings.jointjs.mod.dia.Paper.ProgressCallback
import typings.jointjs.mod.dia.Paper.UpdateStats
import typings.jointjs.mod.dia.Paper.ViewportCallback
import typings.jointjs.mod.mvc.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var progress: js.UndefOr[ProgressCallback] = js.undefined
  
  var viewport: js.UndefOr[ViewportCallback] = js.undefined
}
object Progress {
  
  inline def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setProgress(
      value: (/* done */ Boolean, /* processed */ Double, /* total */ Double, /* stats */ UpdateStats, /* paper */ Paper) => scala.Unit
    ): Self = StObject.set(x, "progress", js.Any.fromFunction5(value))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setViewport(value: (/* view */ View[js.Any], /* isMounted */ Boolean, /* paper */ Paper) => Boolean): Self = StObject.set(x, "viewport", js.Any.fromFunction3(value))
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
