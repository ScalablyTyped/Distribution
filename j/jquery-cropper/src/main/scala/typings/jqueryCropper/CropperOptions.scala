package typings.jqueryCropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropperOptions extends js.Object {
  
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
  implicit class CropperOptionsOps[Self <: CropperOptions] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoCrop(value: Boolean): Self = this.set("autoCrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCrop: Self = this.set("autoCrop", js.undefined)
    
    @scala.inline
    def setAutoCropArea(value: Double): Self = this.set("autoCropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCropArea: Self = this.set("autoCropArea", js.undefined)
    
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setCheckCrossOrigin(value: Boolean): Self = this.set("checkCrossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckCrossOrigin: Self = this.set("checkCrossOrigin", js.undefined)
    
    @scala.inline
    def setCheckOrientation(value: String): Self = this.set("checkOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckOrientation: Self = this.set("checkOrientation", js.undefined)
    
    @scala.inline
    def setCrop(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("crop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    
    @scala.inline
    def setCropBoxMovable(value: Double): Self = this.set("cropBoxMovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropBoxMovable: Self = this.set("cropBoxMovable", js.undefined)
    
    @scala.inline
    def setCropBoxResizable(value: Double): Self = this.set("cropBoxResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropBoxResizable: Self = this.set("cropBoxResizable", js.undefined)
    
    @scala.inline
    def setCropend(value: () => _): Self = this.set("cropend", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCropend: Self = this.set("cropend", js.undefined)
    
    @scala.inline
    def setCropmove(value: () => _): Self = this.set("cropmove", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCropmove: Self = this.set("cropmove", js.undefined)
    
    @scala.inline
    def setCropstart(value: () => _): Self = this.set("cropstart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCropstart: Self = this.set("cropstart", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDragMode(value: String): Self = this.set("dragMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragMode: Self = this.set("dragMode", js.undefined)
    
    @scala.inline
    def setGuides(value: Boolean): Self = this.set("guides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuides: Self = this.set("guides", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setInitialAspectRatio(value: Double): Self = this.set("initialAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialAspectRatio: Self = this.set("initialAspectRatio", js.undefined)
    
    @scala.inline
    def setMinCanvasHeight(value: Double): Self = this.set("minCanvasHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCanvasHeight: Self = this.set("minCanvasHeight", js.undefined)
    
    @scala.inline
    def setMinCanvasWidth(value: Double): Self = this.set("minCanvasWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCanvasWidth: Self = this.set("minCanvasWidth", js.undefined)
    
    @scala.inline
    def setMinContainerHeight(value: Double): Self = this.set("minContainerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinContainerHeight: Self = this.set("minContainerHeight", js.undefined)
    
    @scala.inline
    def setMinContainerWidth(value: Double): Self = this.set("minContainerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinContainerWidth: Self = this.set("minContainerWidth", js.undefined)
    
    @scala.inline
    def setMinCropBoxHeight(value: Double): Self = this.set("minCropBoxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCropBoxHeight: Self = this.set("minCropBoxHeight", js.undefined)
    
    @scala.inline
    def setMinCropBoxWidth(value: Double): Self = this.set("minCropBoxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCropBoxWidth: Self = this.set("minCropBoxWidth", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setMovable(value: Boolean): Self = this.set("movable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovable: Self = this.set("movable", js.undefined)
    
    @scala.inline
    def setPreview(value: js.Any): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setReady(value: () => _): Self = this.set("ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setRestore(value: Boolean): Self = this.set("restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    
    @scala.inline
    def setRotatable(value: Boolean): Self = this.set("rotatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotatable: Self = this.set("rotatable", js.undefined)
    
    @scala.inline
    def setScalable(value: Boolean): Self = this.set("scalable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalable: Self = this.set("scalable", js.undefined)
    
    @scala.inline
    def setToggleDragModeOnDblclick(value: Double): Self = this.set("toggleDragModeOnDblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleDragModeOnDblclick: Self = this.set("toggleDragModeOnDblclick", js.undefined)
    
    @scala.inline
    def setViewMode(value: Double): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
    
    @scala.inline
    def setWheelZoomRatio(value: Double): Self = this.set("wheelZoomRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelZoomRatio: Self = this.set("wheelZoomRatio", js.undefined)
    
    @scala.inline
    def setZoom(value: () => _): Self = this.set("zoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomOnTouch(value: Boolean): Self = this.set("zoomOnTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOnTouch: Self = this.set("zoomOnTouch", js.undefined)
    
    @scala.inline
    def setZoomOnWheel(value: Boolean): Self = this.set("zoomOnWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOnWheel: Self = this.set("zoomOnWheel", js.undefined)
    
    @scala.inline
    def setZoomable(value: Boolean): Self = this.set("zoomable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomable: Self = this.set("zoomable", js.undefined)
  }
}
