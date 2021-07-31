package typings.jointjs.anon

import typings.jointjs.mod.dia.Paper
import typings.jointjs.mod.dia.Paper.ViewportCallback
import typings.jointjs.mod.mvc.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var viewport: js.UndefOr[ViewportCallback] = js.undefined
}
object Viewport {
  
  @scala.inline
  def apply(): Viewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport]
  }
  
  @scala.inline
  implicit class ViewportMutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setViewport(value: (/* view */ View[js.Any], /* isMounted */ Boolean, /* paper */ Paper) => Boolean): Self = StObject.set(x, "viewport", js.Any.fromFunction3(value))
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
