package typings.jqueryCropper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropperOptions extends StObject {
  
  var aspectRatio: js.UndefOr[Double] = js.native
  
  var autoCrop: js.UndefOr[Boolean] = js.native
  
  var autoCropArea: js.UndefOr[Double] = js.native
  
  var background: js.UndefOr[Boolean] = js.native
  
  var center: js.UndefOr[Boolean] = js.native
  
  var checkCrossOrigin: js.UndefOr[Boolean] = js.native
  
  var checkOrientation: js.UndefOr[String] = js.native
  
  var crop: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  
  var cropBoxMovable: js.UndefOr[Double] = js.native
  
  var cropBoxResizable: js.UndefOr[Double] = js.native
  
  var cropend: js.UndefOr[js.Function0[_]] = js.native
  
  var cropmove: js.UndefOr[js.Function0[_]] = js.native
  
  var cropstart: js.UndefOr[js.Function0[_]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dragMode: js.UndefOr[String] = js.native
  
  var guides: js.UndefOr[Boolean] = js.native
  
  var highlight: js.UndefOr[Boolean] = js.native
  
  var initialAspectRatio: js.UndefOr[Double] = js.native
  
  var minCanvasHeight: js.UndefOr[Double] = js.native
  
  var minCanvasWidth: js.UndefOr[Double] = js.native
  
  var minContainerHeight: js.UndefOr[Double] = js.native
  
  var minContainerWidth: js.UndefOr[Double] = js.native
  
  var minCropBoxHeight: js.UndefOr[Double] = js.native
  
  var minCropBoxWidth: js.UndefOr[Double] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  var movable: js.UndefOr[Boolean] = js.native
  
  var preview: js.UndefOr[js.Any] = js.native
  
  var ready: js.UndefOr[js.Function0[_]] = js.native
  
  var responsive: js.UndefOr[Boolean] = js.native
  
  var restore: js.UndefOr[Boolean] = js.native
  
  var rotatable: js.UndefOr[Boolean] = js.native
  
  var scalable: js.UndefOr[Boolean] = js.native
  
  var toggleDragModeOnDblclick: js.UndefOr[Double] = js.native
  
  var viewMode: js.UndefOr[Double] = js.native
  
  var wheelZoomRatio: js.UndefOr[Double] = js.native
  
  var zoom: js.UndefOr[js.Function0[_]] = js.native
  
  var zoomOnTouch: js.UndefOr[Boolean] = js.native
  
  var zoomOnWheel: js.UndefOr[Boolean] = js.native
  
  var zoomable: js.UndefOr[Boolean] = js.native
}
object CropperOptions {
  
  @scala.inline
  def apply(): CropperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropperOptions]
  }
  
  @scala.inline
  implicit class CropperOptionsMutableBuilder[Self <: CropperOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoCrop(value: Boolean): Self = StObject.set(x, "autoCrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCropArea(value: Double): Self = StObject.set(x, "autoCropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCropAreaUndefined: Self = StObject.set(x, "autoCropArea", js.undefined)
    
    @scala.inline
    def setAutoCropUndefined: Self = StObject.set(x, "autoCrop", js.undefined)
    
    @scala.inline
    def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCheckCrossOrigin(value: Boolean): Self = StObject.set(x, "checkCrossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckCrossOriginUndefined: Self = StObject.set(x, "checkCrossOrigin", js.undefined)
    
    @scala.inline
    def setCheckOrientation(value: String): Self = StObject.set(x, "checkOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckOrientationUndefined: Self = StObject.set(x, "checkOrientation", js.undefined)
    
    @scala.inline
    def setCrop(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "crop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCropBoxMovable(value: Double): Self = StObject.set(x, "cropBoxMovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropBoxMovableUndefined: Self = StObject.set(x, "cropBoxMovable", js.undefined)
    
    @scala.inline
    def setCropBoxResizable(value: Double): Self = StObject.set(x, "cropBoxResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropBoxResizableUndefined: Self = StObject.set(x, "cropBoxResizable", js.undefined)
    
    @scala.inline
    def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    @scala.inline
    def setCropend(value: () => _): Self = StObject.set(x, "cropend", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCropendUndefined: Self = StObject.set(x, "cropend", js.undefined)
    
    @scala.inline
    def setCropmove(value: () => _): Self = StObject.set(x, "cropmove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCropmoveUndefined: Self = StObject.set(x, "cropmove", js.undefined)
    
    @scala.inline
    def setCropstart(value: () => _): Self = StObject.set(x, "cropstart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCropstartUndefined: Self = StObject.set(x, "cropstart", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDragMode(value: String): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragModeUndefined: Self = StObject.set(x, "dragMode", js.undefined)
    
    @scala.inline
    def setGuides(value: Boolean): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidesUndefined: Self = StObject.set(x, "guides", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setInitialAspectRatio(value: Double): Self = StObject.set(x, "initialAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialAspectRatioUndefined: Self = StObject.set(x, "initialAspectRatio", js.undefined)
    
    @scala.inline
    def setMinCanvasHeight(value: Double): Self = StObject.set(x, "minCanvasHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCanvasHeightUndefined: Self = StObject.set(x, "minCanvasHeight", js.undefined)
    
    @scala.inline
    def setMinCanvasWidth(value: Double): Self = StObject.set(x, "minCanvasWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCanvasWidthUndefined: Self = StObject.set(x, "minCanvasWidth", js.undefined)
    
    @scala.inline
    def setMinContainerHeight(value: Double): Self = StObject.set(x, "minContainerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinContainerHeightUndefined: Self = StObject.set(x, "minContainerHeight", js.undefined)
    
    @scala.inline
    def setMinContainerWidth(value: Double): Self = StObject.set(x, "minContainerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinContainerWidthUndefined: Self = StObject.set(x, "minContainerWidth", js.undefined)
    
    @scala.inline
    def setMinCropBoxHeight(value: Double): Self = StObject.set(x, "minCropBoxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCropBoxHeightUndefined: Self = StObject.set(x, "minCropBoxHeight", js.undefined)
    
    @scala.inline
    def setMinCropBoxWidth(value: Double): Self = StObject.set(x, "minCropBoxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCropBoxWidthUndefined: Self = StObject.set(x, "minCropBoxWidth", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setMovable(value: Boolean): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovableUndefined: Self = StObject.set(x, "movable", js.undefined)
    
    @scala.inline
    def setPreview(value: js.Any): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setReady(value: () => _): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    @scala.inline
    def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
    
    @scala.inline
    def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableUndefined: Self = StObject.set(x, "scalable", js.undefined)
    
    @scala.inline
    def setToggleDragModeOnDblclick(value: Double): Self = StObject.set(x, "toggleDragModeOnDblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleDragModeOnDblclickUndefined: Self = StObject.set(x, "toggleDragModeOnDblclick", js.undefined)
    
    @scala.inline
    def setViewMode(value: Double): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    
    @scala.inline
    def setWheelZoomRatio(value: Double): Self = StObject.set(x, "wheelZoomRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelZoomRatioUndefined: Self = StObject.set(x, "wheelZoomRatio", js.undefined)
    
    @scala.inline
    def setZoom(value: () => _): Self = StObject.set(x, "zoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZoomOnTouch(value: Boolean): Self = StObject.set(x, "zoomOnTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOnTouchUndefined: Self = StObject.set(x, "zoomOnTouch", js.undefined)
    
    @scala.inline
    def setZoomOnWheel(value: Boolean): Self = StObject.set(x, "zoomOnWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOnWheelUndefined: Self = StObject.set(x, "zoomOnWheel", js.undefined)
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    @scala.inline
    def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
  }
}
