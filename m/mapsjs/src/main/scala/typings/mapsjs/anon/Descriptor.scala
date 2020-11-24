package typings.mapsjs.anon

import typings.mapsjs.mod.tile.renderer
import typings.mapsjs.mod.tile.requestor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descriptor extends js.Object {
  
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
  implicit class DescriptorOps[Self <: Descriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescriptor(value: js.Any): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptor: Self = this.set("descriptor", js.undefined)
    
    @scala.inline
    def setEnableTileFadeIn(value: Boolean): Self = this.set("enableTileFadeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTileFadeIn: Self = this.set("enableTileFadeIn", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRequests(value: Double): Self = this.set("maxConcurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentRequests: Self = this.set("maxConcurrentRequests", js.undefined)
    
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = this.set("maxZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoomLevel: Self = this.set("maxZoomLevel", js.undefined)
    
    @scala.inline
    def setMinZoomLevel(value: Double): Self = this.set("minZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoomLevel: Self = this.set("minZoomLevel", js.undefined)
    
    @scala.inline
    def setNotifyErrorAction(value: /* msg */ js.UndefOr[String] => Unit): Self = this.set("notifyErrorAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyErrorAction: Self = this.set("notifyErrorAction", js.undefined)
    
    @scala.inline
    def setNotifyLoadingQueueHasEmptiedAction(value: () => Unit): Self = this.set("notifyLoadingQueueHasEmptiedAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyLoadingQueueHasEmptiedAction: Self = this.set("notifyLoadingQueueHasEmptiedAction", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRenderer(value: renderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setRequestProcessor(value: js.Any): Self = this.set("requestProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestProcessor: Self = this.set("requestProcessor", js.undefined)
    
    @scala.inline
    def setRequestor(value: requestor): Self = this.set("requestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestor: Self = this.set("requestor", js.undefined)
    
    @scala.inline
    def setRetainInterlevelContent(value: Boolean): Self = this.set("retainInterlevelContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainInterlevelContent: Self = this.set("retainInterlevelContent", js.undefined)
    
    @scala.inline
    def setTileBleedPix(value: Double): Self = this.set("tileBleedPix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileBleedPix: Self = this.set("tileBleedPix", js.undefined)
    
    @scala.inline
    def setUseBackdrop(value: Boolean): Self = this.set("useBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBackdrop: Self = this.set("useBackdrop", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
