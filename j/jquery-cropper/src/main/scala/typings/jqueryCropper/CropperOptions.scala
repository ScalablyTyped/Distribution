package typings.jqueryCropper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CropperOptions extends StObject {
  
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  var autoCrop: js.UndefOr[Boolean] = js.undefined
  
  var autoCropArea: js.UndefOr[Double] = js.undefined
  
  var background: js.UndefOr[Boolean] = js.undefined
  
  var center: js.UndefOr[Boolean] = js.undefined
  
  var checkCrossOrigin: js.UndefOr[Boolean] = js.undefined
  
  var checkOrientation: js.UndefOr[String] = js.undefined
  
  var crop: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], Unit]] = js.undefined
  
  var cropBoxMovable: js.UndefOr[Double] = js.undefined
  
  var cropBoxResizable: js.UndefOr[Double] = js.undefined
  
  var cropend: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var cropmove: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var cropstart: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var dragMode: js.UndefOr[String] = js.undefined
  
  var guides: js.UndefOr[Boolean] = js.undefined
  
  var highlight: js.UndefOr[Boolean] = js.undefined
  
  var initialAspectRatio: js.UndefOr[Double] = js.undefined
  
  var minCanvasHeight: js.UndefOr[Double] = js.undefined
  
  var minCanvasWidth: js.UndefOr[Double] = js.undefined
  
  var minContainerHeight: js.UndefOr[Double] = js.undefined
  
  var minContainerWidth: js.UndefOr[Double] = js.undefined
  
  var minCropBoxHeight: js.UndefOr[Double] = js.undefined
  
  var minCropBoxWidth: js.UndefOr[Double] = js.undefined
  
  var modal: js.UndefOr[Boolean] = js.undefined
  
  var movable: js.UndefOr[Boolean] = js.undefined
  
  var preview: js.UndefOr[Any] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var restore: js.UndefOr[Boolean] = js.undefined
  
  var rotatable: js.UndefOr[Boolean] = js.undefined
  
  var scalable: js.UndefOr[Boolean] = js.undefined
  
  var toggleDragModeOnDblclick: js.UndefOr[Double] = js.undefined
  
  var viewMode: js.UndefOr[Double] = js.undefined
  
  var wheelZoomRatio: js.UndefOr[Double] = js.undefined
  
  var zoom: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var zoomOnTouch: js.UndefOr[Boolean] = js.undefined
  
  var zoomOnWheel: js.UndefOr[Boolean] = js.undefined
  
  var zoomable: js.UndefOr[Boolean] = js.undefined
}
object CropperOptions {
  
  inline def apply(): CropperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropperOptions]
  }
  
  extension [Self <: CropperOptions](x: Self) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setAutoCrop(value: Boolean): Self = StObject.set(x, "autoCrop", value.asInstanceOf[js.Any])
    
    inline def setAutoCropArea(value: Double): Self = StObject.set(x, "autoCropArea", value.asInstanceOf[js.Any])
    
    inline def setAutoCropAreaUndefined: Self = StObject.set(x, "autoCropArea", js.undefined)
    
    inline def setAutoCropUndefined: Self = StObject.set(x, "autoCrop", js.undefined)
    
    inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCheckCrossOrigin(value: Boolean): Self = StObject.set(x, "checkCrossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCheckCrossOriginUndefined: Self = StObject.set(x, "checkCrossOrigin", js.undefined)
    
    inline def setCheckOrientation(value: String): Self = StObject.set(x, "checkOrientation", value.asInstanceOf[js.Any])
    
    inline def setCheckOrientationUndefined: Self = StObject.set(x, "checkOrientation", js.undefined)
    
    inline def setCrop(value: /* data */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "crop", js.Any.fromFunction1(value))
    
    inline def setCropBoxMovable(value: Double): Self = StObject.set(x, "cropBoxMovable", value.asInstanceOf[js.Any])
    
    inline def setCropBoxMovableUndefined: Self = StObject.set(x, "cropBoxMovable", js.undefined)
    
    inline def setCropBoxResizable(value: Double): Self = StObject.set(x, "cropBoxResizable", value.asInstanceOf[js.Any])
    
    inline def setCropBoxResizableUndefined: Self = StObject.set(x, "cropBoxResizable", js.undefined)
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setCropend(value: () => Any): Self = StObject.set(x, "cropend", js.Any.fromFunction0(value))
    
    inline def setCropendUndefined: Self = StObject.set(x, "cropend", js.undefined)
    
    inline def setCropmove(value: () => Any): Self = StObject.set(x, "cropmove", js.Any.fromFunction0(value))
    
    inline def setCropmoveUndefined: Self = StObject.set(x, "cropmove", js.undefined)
    
    inline def setCropstart(value: () => Any): Self = StObject.set(x, "cropstart", js.Any.fromFunction0(value))
    
    inline def setCropstartUndefined: Self = StObject.set(x, "cropstart", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDragMode(value: String): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
    
    inline def setDragModeUndefined: Self = StObject.set(x, "dragMode", js.undefined)
    
    inline def setGuides(value: Boolean): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
    
    inline def setGuidesUndefined: Self = StObject.set(x, "guides", js.undefined)
    
    inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setInitialAspectRatio(value: Double): Self = StObject.set(x, "initialAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setInitialAspectRatioUndefined: Self = StObject.set(x, "initialAspectRatio", js.undefined)
    
    inline def setMinCanvasHeight(value: Double): Self = StObject.set(x, "minCanvasHeight", value.asInstanceOf[js.Any])
    
    inline def setMinCanvasHeightUndefined: Self = StObject.set(x, "minCanvasHeight", js.undefined)
    
    inline def setMinCanvasWidth(value: Double): Self = StObject.set(x, "minCanvasWidth", value.asInstanceOf[js.Any])
    
    inline def setMinCanvasWidthUndefined: Self = StObject.set(x, "minCanvasWidth", js.undefined)
    
    inline def setMinContainerHeight(value: Double): Self = StObject.set(x, "minContainerHeight", value.asInstanceOf[js.Any])
    
    inline def setMinContainerHeightUndefined: Self = StObject.set(x, "minContainerHeight", js.undefined)
    
    inline def setMinContainerWidth(value: Double): Self = StObject.set(x, "minContainerWidth", value.asInstanceOf[js.Any])
    
    inline def setMinContainerWidthUndefined: Self = StObject.set(x, "minContainerWidth", js.undefined)
    
    inline def setMinCropBoxHeight(value: Double): Self = StObject.set(x, "minCropBoxHeight", value.asInstanceOf[js.Any])
    
    inline def setMinCropBoxHeightUndefined: Self = StObject.set(x, "minCropBoxHeight", js.undefined)
    
    inline def setMinCropBoxWidth(value: Double): Self = StObject.set(x, "minCropBoxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinCropBoxWidthUndefined: Self = StObject.set(x, "minCropBoxWidth", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setMovable(value: Boolean): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
    
    inline def setMovableUndefined: Self = StObject.set(x, "movable", js.undefined)
    
    inline def setPreview(value: Any): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setReady(value: () => Any): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
    
    inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    inline def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
    
    inline def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
    
    inline def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
    
    inline def setScalableUndefined: Self = StObject.set(x, "scalable", js.undefined)
    
    inline def setToggleDragModeOnDblclick(value: Double): Self = StObject.set(x, "toggleDragModeOnDblclick", value.asInstanceOf[js.Any])
    
    inline def setToggleDragModeOnDblclickUndefined: Self = StObject.set(x, "toggleDragModeOnDblclick", js.undefined)
    
    inline def setViewMode(value: Double): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    
    inline def setWheelZoomRatio(value: Double): Self = StObject.set(x, "wheelZoomRatio", value.asInstanceOf[js.Any])
    
    inline def setWheelZoomRatioUndefined: Self = StObject.set(x, "wheelZoomRatio", js.undefined)
    
    inline def setZoom(value: () => Any): Self = StObject.set(x, "zoom", js.Any.fromFunction0(value))
    
    inline def setZoomOnTouch(value: Boolean): Self = StObject.set(x, "zoomOnTouch", value.asInstanceOf[js.Any])
    
    inline def setZoomOnTouchUndefined: Self = StObject.set(x, "zoomOnTouch", js.undefined)
    
    inline def setZoomOnWheel(value: Boolean): Self = StObject.set(x, "zoomOnWheel", value.asInstanceOf[js.Any])
    
    inline def setZoomOnWheelUndefined: Self = StObject.set(x, "zoomOnWheel", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    inline def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
    
    inline def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
  }
}
