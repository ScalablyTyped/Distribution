package typings.mapsjs.anon

import typings.mapsjs.mod.tile.renderer
import typings.mapsjs.mod.tile.requestor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptor extends StObject {
  
  var descriptor: js.UndefOr[js.Any] = js.undefined
  
  var enableTileFadeIn: js.UndefOr[Boolean] = js.undefined
  
  var maxConcurrentRequests: js.UndefOr[Double] = js.undefined
  
  var maxZoomLevel: js.UndefOr[Double] = js.undefined
  
  var minZoomLevel: js.UndefOr[Double] = js.undefined
  
  var notifyErrorAction: js.UndefOr[js.Function1[/* msg */ js.UndefOr[String], Unit]] = js.undefined
  
  var notifyLoadingQueueHasEmptiedAction: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var renderer: js.UndefOr[typings.mapsjs.mod.tile.renderer] = js.undefined
  
  var requestProcessor: js.UndefOr[js.Any] = js.undefined
  
  var requestor: js.UndefOr[typings.mapsjs.mod.tile.requestor] = js.undefined
  
  var retainInterlevelContent: js.UndefOr[Boolean] = js.undefined
  
  var tileBleedPix: js.UndefOr[Double] = js.undefined
  
  var useBackdrop: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Descriptor {
  
  inline def apply(): Descriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descriptor]
  }
  
  extension [Self <: Descriptor](x: Self) {
    
    inline def setDescriptor(value: js.Any): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    inline def setEnableTileFadeIn(value: Boolean): Self = StObject.set(x, "enableTileFadeIn", value.asInstanceOf[js.Any])
    
    inline def setEnableTileFadeInUndefined: Self = StObject.set(x, "enableTileFadeIn", js.undefined)
    
    inline def setMaxConcurrentRequests(value: Double): Self = StObject.set(x, "maxConcurrentRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentRequestsUndefined: Self = StObject.set(x, "maxConcurrentRequests", js.undefined)
    
    inline def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
    
    inline def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
    
    inline def setNotifyErrorAction(value: /* msg */ js.UndefOr[String] => Unit): Self = StObject.set(x, "notifyErrorAction", js.Any.fromFunction1(value))
    
    inline def setNotifyErrorActionUndefined: Self = StObject.set(x, "notifyErrorAction", js.undefined)
    
    inline def setNotifyLoadingQueueHasEmptiedAction(value: () => Unit): Self = StObject.set(x, "notifyLoadingQueueHasEmptiedAction", js.Any.fromFunction0(value))
    
    inline def setNotifyLoadingQueueHasEmptiedActionUndefined: Self = StObject.set(x, "notifyLoadingQueueHasEmptiedAction", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRenderer(value: renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setRequestProcessor(value: js.Any): Self = StObject.set(x, "requestProcessor", value.asInstanceOf[js.Any])
    
    inline def setRequestProcessorUndefined: Self = StObject.set(x, "requestProcessor", js.undefined)
    
    inline def setRequestor(value: requestor): Self = StObject.set(x, "requestor", value.asInstanceOf[js.Any])
    
    inline def setRequestorUndefined: Self = StObject.set(x, "requestor", js.undefined)
    
    inline def setRetainInterlevelContent(value: Boolean): Self = StObject.set(x, "retainInterlevelContent", value.asInstanceOf[js.Any])
    
    inline def setRetainInterlevelContentUndefined: Self = StObject.set(x, "retainInterlevelContent", js.undefined)
    
    inline def setTileBleedPix(value: Double): Self = StObject.set(x, "tileBleedPix", value.asInstanceOf[js.Any])
    
    inline def setTileBleedPixUndefined: Self = StObject.set(x, "tileBleedPix", js.undefined)
    
    inline def setUseBackdrop(value: Boolean): Self = StObject.set(x, "useBackdrop", value.asInstanceOf[js.Any])
    
    inline def setUseBackdropUndefined: Self = StObject.set(x, "useBackdrop", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
