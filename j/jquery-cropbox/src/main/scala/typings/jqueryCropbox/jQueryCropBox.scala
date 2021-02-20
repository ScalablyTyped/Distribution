package typings.jqueryCropbox

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jQueryCropBox {
  
  @js.native
  sealed trait ShowControls extends StObject
  @JSGlobal("jQueryCropBox.ShowControls")
  @js.native
  object ShowControls extends StObject {
    
    @js.native
    sealed trait always extends ShowControls
    
    @js.native
    sealed trait auto extends ShowControls
    
    @js.native
    sealed trait hover extends ShowControls
    
    @js.native
    sealed trait never extends ShowControls
  }
  
  @js.native
  trait Cropbox extends StObject {
    
    /**
      * Simulate image dragging, starting from (startX,startY) and moving a delta of (dx,dy). Need to call update to reflect the changes.
      */
    def drag(options: CropboxDragOptions): Unit = js.native
    
    /**
      * Generate a Blob with the cropped image (requires HTML5 compliant browser).
      */
    def getBlob(): js.Any = js.native
    
    /**
      * Generate a URL for the cropped image on the client (requires HTML5 compliant browser).
      */
    def getDataURL(): String = js.native
    
    /**
      * Attach an event handler function for one event on the Crop Box
      */
    def on(event: String, callback: EventCallback): Unit = js.native
    
    /**
      * Remove the cropbox functionality from the image.
      */
    def remove(): Unit = js.native
    
    /**
      * Set crop window.
      */
    def setCrop(options: CropboxSetCropOptions): Unit = js.native
    
    /**
      * Update the cropped result (must call after zoom and drag).
      */
    def update(): Unit = js.native
    
    /**
      * Set zoom leevl to a value between 0 and 1. Need to call update to reflect the changes.
      */
    def zoom(percent: Double): Unit = js.native
    
    /**
      * Increase image zoom level by one step
      */
    def zoomIn(): Unit = js.native
    
    /**
      * Decrease image zoom level by one step
      */
    def zoomOut(): Unit = js.native
  }
  object Cropbox {
    
    @scala.inline
    def apply(
      drag: CropboxDragOptions => Unit,
      getBlob: () => js.Any,
      getDataURL: () => String,
      on: (String, EventCallback) => Unit,
      remove: () => Unit,
      setCrop: CropboxSetCropOptions => Unit,
      update: () => Unit,
      zoom: Double => Unit,
      zoomIn: () => Unit,
      zoomOut: () => Unit
    ): Cropbox = {
      val __obj = js.Dynamic.literal(drag = js.Any.fromFunction1(drag), getBlob = js.Any.fromFunction0(getBlob), getDataURL = js.Any.fromFunction0(getDataURL), on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove), setCrop = js.Any.fromFunction1(setCrop), update = js.Any.fromFunction0(update), zoom = js.Any.fromFunction1(zoom), zoomIn = js.Any.fromFunction0(zoomIn), zoomOut = js.Any.fromFunction0(zoomOut))
      __obj.asInstanceOf[Cropbox]
    }
    
    @scala.inline
    implicit class CropboxMutableBuilder[Self <: Cropbox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrag(value: CropboxDragOptions => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBlob(value: () => js.Any): Self = StObject.set(x, "getBlob", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDataURL(value: () => String): Self = StObject.set(x, "getDataURL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOn(value: (String, EventCallback) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetCrop(value: CropboxSetCropOptions => Unit): Self = StObject.set(x, "setCrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZoom(value: Double => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomIn(value: () => Unit): Self = StObject.set(x, "zoomIn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZoomOut(value: () => Unit): Self = StObject.set(x, "zoomOut", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CropboxArea extends StObject {
    
    var cropH: Double = js.native
    
    var cropW: Double = js.native
    
    var cropX: Double = js.native
    
    var cropY: Double = js.native
  }
  object CropboxArea {
    
    @scala.inline
    def apply(cropH: Double, cropW: Double, cropX: Double, cropY: Double): CropboxArea = {
      val __obj = js.Dynamic.literal(cropH = cropH.asInstanceOf[js.Any], cropW = cropW.asInstanceOf[js.Any], cropX = cropX.asInstanceOf[js.Any], cropY = cropY.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropboxArea]
    }
    
    @scala.inline
    implicit class CropboxAreaMutableBuilder[Self <: CropboxArea] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCropH(value: Double): Self = StObject.set(x, "cropH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropW(value: Double): Self = StObject.set(x, "cropW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropX(value: Double): Self = StObject.set(x, "cropX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropY(value: Double): Self = StObject.set(x, "cropY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CropboxDragOptions extends StObject {
    
    var dx: Double = js.native
    
    var dy: Double = js.native
    
    var startX: Double = js.native
    
    var startY: Double = js.native
  }
  object CropboxDragOptions {
    
    @scala.inline
    def apply(dx: Double, dy: Double, startX: Double, startY: Double): CropboxDragOptions = {
      val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropboxDragOptions]
    }
    
    @scala.inline
    implicit class CropboxDragOptionsMutableBuilder[Self <: CropboxDragOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CropboxOptions extends StObject {
    
    /**
      * If not null, this is the entire html block that should appear on hover over the image for instructions and/or buttons (could include the zoom in/out buttons for example). If null, the default html block is used which has the text "Click to drag" and the zoom in/out buttons. Use false to disable controls.
      */
    var controls: js.UndefOr[js.Any] = js.native
    
    /**
      * Height in pixels of the cropping window
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Maximum zoom value. With the default of 1.0 users can't zoom beyond the maximum image resolution.
      */
    var maxZoom: js.UndefOr[Double] = js.native
    
    /**
      * Set the initial cropping area
      */
    var result: js.UndefOr[CropboxArea] = js.native
    
    /**
      * This flag is used to determine when to display the controls. Never, always and hover do exactly what you would expect (never show them, always show them, show them on hover). The auto flag is the same as the hover flag, except that on mobile devices it always shows the controls (since there is no hover event).
      */
    var showControls: js.UndefOr[ShowControls] = js.native
    
    /**
      * Width in pixels of the cropping window
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * Number of incremental zoom steps. With the default of 10, you have to click the zoom-in button 9 times to reach 100%.
      */
    var zoom: js.UndefOr[Double] = js.native
  }
  object CropboxOptions {
    
    @scala.inline
    def apply(): CropboxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropboxOptions]
    }
    
    @scala.inline
    implicit class CropboxOptionsMutableBuilder[Self <: CropboxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControls(value: js.Any): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setResult(value: CropboxArea): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setShowControls(value: ShowControls): Self = StObject.set(x, "showControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowControlsUndefined: Self = StObject.set(x, "showControls", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  @js.native
  trait CropboxSetCropOptions extends StObject {
    
    var cropH: Double = js.native
    
    var cropW: Double = js.native
    
    var cropX: Double = js.native
    
    var cropY: Double = js.native
  }
  object CropboxSetCropOptions {
    
    @scala.inline
    def apply(cropH: Double, cropW: Double, cropX: Double, cropY: Double): CropboxSetCropOptions = {
      val __obj = js.Dynamic.literal(cropH = cropH.asInstanceOf[js.Any], cropW = cropW.asInstanceOf[js.Any], cropX = cropX.asInstanceOf[js.Any], cropY = cropY.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropboxSetCropOptions]
    }
    
    @scala.inline
    implicit class CropboxSetCropOptionsMutableBuilder[Self <: CropboxSetCropOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCropH(value: Double): Self = StObject.set(x, "cropH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropW(value: Double): Self = StObject.set(x, "cropW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropX(value: Double): Self = StObject.set(x, "cropX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropY(value: Double): Self = StObject.set(x, "cropY", value.asInstanceOf[js.Any])
    }
  }
  
  type EventCallback = js.Function3[/* e */ Event, /* data */ js.Any, /* img */ Cropbox, Unit]
}
