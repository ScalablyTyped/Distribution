package typings.jointjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.Paper
import typings.jointjs.mod.dia.Paper.BeforeRenderCallback
import typings.jointjs.mod.dia.Paper.ProgressCallback
import typings.jointjs.mod.dia.Paper.UpdateStats
import typings.jointjs.mod.dia.Paper.ViewportCallback
import typings.jointjs.mod.mvc.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Before extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.native
  
  var before: js.UndefOr[BeforeRenderCallback] = js.native
  
  var mountBatchSize: js.UndefOr[Double] = js.native
  
  var progress: js.UndefOr[ProgressCallback] = js.native
  
  var unmountBatchSize: js.UndefOr[Double] = js.native
  
  var viewport: js.UndefOr[ViewportCallback] = js.native
}
object Before {
  
  @scala.inline
  def apply(): Before = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Before]
  }
  
  @scala.inline
  implicit class BeforeMutableBuilder[Self <: Before] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setBefore(value: (/* opt */ StringDictionary[js.Any], /* paper */ Paper) => scala.Unit): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setMountBatchSize(value: Double): Self = StObject.set(x, "mountBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountBatchSizeUndefined: Self = StObject.set(x, "mountBatchSize", js.undefined)
    
    @scala.inline
    def setProgress(
      value: (/* done */ Boolean, /* processed */ Double, /* total */ Double, /* stats */ UpdateStats, /* paper */ Paper) => scala.Unit
    ): Self = StObject.set(x, "progress", js.Any.fromFunction5(value))
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setUnmountBatchSize(value: Double): Self = StObject.set(x, "unmountBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmountBatchSizeUndefined: Self = StObject.set(x, "unmountBatchSize", js.undefined)
    
    @scala.inline
    def setViewport(value: (/* view */ View[js.Any], /* isMounted */ Boolean, /* paper */ Paper) => Boolean): Self = StObject.set(x, "viewport", js.Any.fromFunction3(value))
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
