package typings.jointjs.anon

import typings.jointjs.mod.dia.Paper
import typings.jointjs.mod.dia.Paper.ViewportCallback
import typings.jointjs.mod.mvc.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MountBatchSize extends StObject {
  
  var mountBatchSize: js.UndefOr[Double] = js.native
  
  var unmountBatchSize: js.UndefOr[Double] = js.native
  
  var viewport: js.UndefOr[ViewportCallback] = js.native
}
object MountBatchSize {
  
  @scala.inline
  def apply(): MountBatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountBatchSize]
  }
  
  @scala.inline
  implicit class MountBatchSizeMutableBuilder[Self <: MountBatchSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMountBatchSize(value: Double): Self = StObject.set(x, "mountBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountBatchSizeUndefined: Self = StObject.set(x, "mountBatchSize", js.undefined)
    
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
