package typings.mapsjs.anon

import typings.mapsjs.mod.tile.renderer
import typings.mapsjs.mod.tile.requestor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descriptor extends StObject {
  
  var descriptor: js.UndefOr[js.Any] = js.native
  
  var enableTileFadeIn: js.UndefOr[Boolean] = js.native
  
  var maxConcurrentRequests: js.UndefOr[Double] = js.native
  
  var maxZoomLevel: js.UndefOr[Double] = js.native
  
  var minZoomLevel: js.UndefOr[Double] = js.native
  
  var notifyErrorAction: js.UndefOr[js.Function1[/* msg */ js.UndefOr[String], Unit]] = js.native
  
  var notifyLoadingQueueHasEmptiedAction: js.UndefOr[js.Function0[Unit]] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var renderer: js.UndefOr[typings.mapsjs.mod.tile.renderer] = js.native
  
  var requestProcessor: js.UndefOr[js.Any] = js.native
  
  var requestor: js.UndefOr[typings.mapsjs.mod.tile.requestor] = js.native
  
  var retainInterlevelContent: js.UndefOr[Boolean] = js.native
  
  var tileBleedPix: js.UndefOr[Double] = js.native
  
  var useBackdrop: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object Descriptor {
  
  @scala.inline
  def apply(): Descriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descriptor]
  }
  
  @scala.inline
  implicit class DescriptorMutableBuilder[Self <: Descriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptor(value: js.Any): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    @scala.inline
    def setEnableTileFadeIn(value: Boolean): Self = StObject.set(x, "enableTileFadeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTileFadeInUndefined: Self = StObject.set(x, "enableTileFadeIn", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRequests(value: Double): Self = StObject.set(x, "maxConcurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentRequestsUndefined: Self = StObject.set(x, "maxConcurrentRequests", js.undefined)
    
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
    
    @scala.inline
    def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
    
    @scala.inline
    def setNotifyErrorAction(value: /* msg */ js.UndefOr[String] => Unit): Self = StObject.set(x, "notifyErrorAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyErrorActionUndefined: Self = StObject.set(x, "notifyErrorAction", js.undefined)
    
    @scala.inline
    def setNotifyLoadingQueueHasEmptiedAction(value: () => Unit): Self = StObject.set(x, "notifyLoadingQueueHasEmptiedAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotifyLoadingQueueHasEmptiedActionUndefined: Self = StObject.set(x, "notifyLoadingQueueHasEmptiedAction", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRenderer(value: renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setRequestProcessor(value: js.Any): Self = StObject.set(x, "requestProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestProcessorUndefined: Self = StObject.set(x, "requestProcessor", js.undefined)
    
    @scala.inline
    def setRequestor(value: requestor): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestorUndefined: Self = StObject.set(x, "requestor", js.undefined)
    
    @scala.inline
    def setRetainInterlevelContent(value: Boolean): Self = StObject.set(x, "retainInterlevelContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainInterlevelContentUndefined: Self = StObject.set(x, "retainInterlevelContent", js.undefined)
    
    @scala.inline
    def setTileBleedPix(value: Double): Self = StObject.set(x, "tileBleedPix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileBleedPixUndefined: Self = StObject.set(x, "tileBleedPix", js.undefined)
    
    @scala.inline
    def setUseBackdrop(value: Boolean): Self = StObject.set(x, "useBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBackdropUndefined: Self = StObject.set(x, "useBackdrop", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
