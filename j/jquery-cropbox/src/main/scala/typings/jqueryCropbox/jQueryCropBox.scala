package typings.jqueryCropbox

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jQueryCropBox {
  
  @js.native
  sealed trait ShowControls extends StObject
  @JSGlobal("jQueryCropBox.ShowControls")
  @js.native
  object ShowControls extends StObject {
    
    @js.native
    sealed trait always
      extends StObject
         with ShowControls
    
    @js.native
    sealed trait auto
      extends StObject
         with ShowControls
    
    @js.native
    sealed trait hover
      extends StObject
         with ShowControls
    
    @js.native
    sealed trait never
      extends StObject
         with ShowControls
  }
  
  trait Cropbox extends StObject {
    
    /**
      * Simulate image dragging, starting from (startX,startY) and moving a delta of (dx,dy). Need to call update to reflect the changes.
      */
    def drag(options: CropboxDragOptions): Unit
    
    /**
      * Generate a Blob with the cropped image (requires HTML5 compliant browser).
      */
    def getBlob(): Any
    
    /**
      * Generate a URL for the cropped image on the client (requires HTML5 compliant browser).
      */
    def getDataURL(): String
    
    /**
      * Attach an event handler function for one event on the Crop Box
      */
    def on(event: String, callback: EventCallback): Unit
    
    /**
      * Remove the cropbox functionality from the image.
      */
    def remove(): Unit
    
    /**
      * Set crop window.
      */
    def setCrop(options: CropboxSetCropOptions): Unit
    
    /**
      * Update the cropped result (must call after zoom and drag).
      */
    def update(): Unit
    
    /**
      * Set zoom leevl to a value between 0 and 1. Need to call update to reflect the changes.
      */
    def zoom(percent: Double): Unit
    
    /**
      * Increase image zoom level by one step
      */
    def zoomIn(): Unit
    
    /**
      * Decrease image zoom level by one step
      */
    def zoomOut(): Unit
  }
  object Cropbox {
    
    inline def apply(
      drag: CropboxDragOptions => Unit,
      getBlob: () => Any,
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
    implicit open class MutableBuilder[Self <: Cropbox] (val x: Self) extends AnyVal {
      
      inline def setDrag(value: CropboxDragOptions => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
      
      inline def setGetBlob(value: () => Any): Self = StObject.set(x, "getBlob", js.Any.fromFunction0(value))
      
      inline def setGetDataURL(value: () => String): Self = StObject.set(x, "getDataURL", js.Any.fromFunction0(value))
      
      inline def setOn(value: (String, EventCallback) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setSetCrop(value: CropboxSetCropOptions => Unit): Self = StObject.set(x, "setCrop", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      inline def setZoom(value: Double => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
      
      inline def setZoomIn(value: () => Unit): Self = StObject.set(x, "zoomIn", js.Any.fromFunction0(value))
      
      inline def setZoomOut(value: () => Unit): Self = StObject.set(x, "zoomOut", js.Any.fromFunction0(value))
    }
  }
  
  trait CropboxArea extends StObject {
    
    var cropH: Double
    
    var cropW: Double
    
    var cropX: Double
    
    var cropY: Double
  }
  object CropboxArea {
    
    inline def apply(cropH: Double, cropW: Double, cropX: Double, cropY: Double): CropboxArea = {
      val __obj = js.Dynamic.literal(cropH = cropH.asInstanceOf[js.Any], cropW = cropW.asInstanceOf[js.Any], cropX = cropX.asInstanceOf[js.Any], cropY = cropY.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropboxArea]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CropboxArea] (val x: Self) extends AnyVal {
      
      inline def setCropH(value: Double): Self = StObject.set(x, "cropH", value.asInstanceOf[js.Any])
      
      inline def setCropW(value: Double): Self = StObject.set(x, "cropW", value.asInstanceOf[js.Any])
      
      inline def setCropX(value: Double): Self = StObject.set(x, "cropX", value.asInstanceOf[js.Any])
      
      inline def setCropY(value: Double): Self = StObject.set(x, "cropY", value.asInstanceOf[js.Any])
    }
  }
  
  trait CropboxDragOptions extends StObject {
    
    var dx: Double
    
    var dy: Double
    
    var startX: Double
    
    var startY: Double
  }
  object CropboxDragOptions {
    
    inline def apply(dx: Double, dy: Double, startX: Double, startY: Double): CropboxDragOptions = {
      val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropboxDragOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CropboxDragOptions] (val x: Self) extends AnyVal {
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    }
  }
  
  trait CropboxOptions extends StObject {
    
    /**
      * If not null, this is the entire html block that should appear on hover over the image for instructions and/or buttons (could include the zoom in/out buttons for example). If null, the default html block is used which has the text "Click to drag" and the zoom in/out buttons. Use false to disable controls.
      */
    var controls: js.UndefOr[Any] = js.undefined
    
    /**
      * Height in pixels of the cropping window
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum zoom value. With the default of 1.0 users can't zoom beyond the maximum image resolution.
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the initial cropping area
      */
    var result: js.UndefOr[CropboxArea] = js.undefined
    
    /**
      * This flag is used to determine when to display the controls. Never, always and hover do exactly what you would expect (never show them, always show them, show them on hover). The auto flag is the same as the hover flag, except that on mobile devices it always shows the controls (since there is no hover event).
      */
    var showControls: js.UndefOr[ShowControls] = js.undefined
    
    /**
      * Width in pixels of the cropping window
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of incremental zoom steps. With the default of 10, you have to click the zoom-in button 9 times to reach 100%.
      */
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object CropboxOptions {
    
    inline def apply(): CropboxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropboxOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CropboxOptions] (val x: Self) extends AnyVal {
      
      inline def setControls(value: Any): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setResult(value: CropboxArea): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setShowControls(value: ShowControls): Self = StObject.set(x, "showControls", value.asInstanceOf[js.Any])
      
      inline def setShowControlsUndefined: Self = StObject.set(x, "showControls", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait CropboxSetCropOptions extends StObject {
    
    var cropH: Double
    
    var cropW: Double
    
    var cropX: Double
    
    var cropY: Double
  }
  object CropboxSetCropOptions {
    
    inline def apply(cropH: Double, cropW: Double, cropX: Double, cropY: Double): CropboxSetCropOptions = {
      val __obj = js.Dynamic.literal(cropH = cropH.asInstanceOf[js.Any], cropW = cropW.asInstanceOf[js.Any], cropX = cropX.asInstanceOf[js.Any], cropY = cropY.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropboxSetCropOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CropboxSetCropOptions] (val x: Self) extends AnyVal {
      
      inline def setCropH(value: Double): Self = StObject.set(x, "cropH", value.asInstanceOf[js.Any])
      
      inline def setCropW(value: Double): Self = StObject.set(x, "cropW", value.asInstanceOf[js.Any])
      
      inline def setCropX(value: Double): Self = StObject.set(x, "cropX", value.asInstanceOf[js.Any])
      
      inline def setCropY(value: Double): Self = StObject.set(x, "cropY", value.asInstanceOf[js.Any])
    }
  }
  
  type EventCallback = js.Function3[/* e */ Event, /* data */ Any, /* img */ Cropbox, Unit]
}
