package typings.leafletEditable.mod

import typings.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to L.Editable when instanciating.
  */
@js.native
trait EditOptions extends js.Object {
  
  /**
    * CSS class to be added to the map container while drawing.
    */
  var drawingCSSClass: js.UndefOr[String] = js.native
  
  /**
    * Layer used to store edit tools (vertex, line guide…).
    */
  var editLayer: js.UndefOr[
    LayerGroup_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ _
    ]
  ] = js.native
  
  /**
    * Default layer used to store drawn features (marker, polyline…).
    */
  var featuresLayer: js.UndefOr[LayerGroup_[Polyline | Polygon | Marker]] = js.native
  
  /**
    * Options to be passed to the line guides.
    */
  var lineGuideOptions: js.UndefOr[js.Object] = js.native
  
  /**
    * Class to be used when creating a new Marker.
    */
  var markerClass: js.UndefOr[js.Object] = js.native
  
  /**
    * Class to be used as Marker editor.
    */
  var markerEditorClass: js.UndefOr[js.Object] = js.native
  
  /**
    * Class to be used as middle vertex, pulled by the user to create a new point in the middle of a path.
    */
  var middleMarkerClass: js.UndefOr[js.Object] = js.native
  
  /**
    * Class to be used when creating a new Polygon.
    */
  var polygonClass: js.UndefOr[js.Object] = js.native
  
  /**
    * Class to be used as Polygon editor.
    */
  var polygonEditorClass: js.UndefOr[js.Object] = js.native
  
  /**
    * Class to be used when creating a new Polyline.
    */
  var polylineClass: js.UndefOr[js.Object] = js.native
  
  /**
    * Class to be used as Polyline editor.
    */
  var polylineEditorClass: js.UndefOr[js.Object] = js.native
  
  /**
    * Set this to true if you don't want middle markers.
    */
  var skipMiddleMarkers: js.UndefOr[Boolean] = js.native
  
  /**
    * Class to be used as vertex, for path editing.
    */
  var vertexMarkerClass: js.UndefOr[js.Object] = js.native
}
object EditOptions {
  
  @scala.inline
  def apply(): EditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditOptions]
  }
  
  @scala.inline
  implicit class EditOptionsOps[Self <: EditOptions] (val x: Self) extends AnyVal {
    
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
    def setDrawingCSSClass(value: String): Self = this.set("drawingCSSClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawingCSSClass: Self = this.set("drawingCSSClass", js.undefined)
    
    @scala.inline
    def setEditLayer(
      value: LayerGroup_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ _
        ]
    ): Self = this.set("editLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditLayer: Self = this.set("editLayer", js.undefined)
    
    @scala.inline
    def setFeaturesLayer(value: LayerGroup_[Polyline | Polygon | Marker]): Self = this.set("featuresLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeaturesLayer: Self = this.set("featuresLayer", js.undefined)
    
    @scala.inline
    def setLineGuideOptions(value: js.Object): Self = this.set("lineGuideOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineGuideOptions: Self = this.set("lineGuideOptions", js.undefined)
    
    @scala.inline
    def setMarkerClass(value: js.Object): Self = this.set("markerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerClass: Self = this.set("markerClass", js.undefined)
    
    @scala.inline
    def setMarkerEditorClass(value: js.Object): Self = this.set("markerEditorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerEditorClass: Self = this.set("markerEditorClass", js.undefined)
    
    @scala.inline
    def setMiddleMarkerClass(value: js.Object): Self = this.set("middleMarkerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleMarkerClass: Self = this.set("middleMarkerClass", js.undefined)
    
    @scala.inline
    def setPolygonClass(value: js.Object): Self = this.set("polygonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonClass: Self = this.set("polygonClass", js.undefined)
    
    @scala.inline
    def setPolygonEditorClass(value: js.Object): Self = this.set("polygonEditorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonEditorClass: Self = this.set("polygonEditorClass", js.undefined)
    
    @scala.inline
    def setPolylineClass(value: js.Object): Self = this.set("polylineClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylineClass: Self = this.set("polylineClass", js.undefined)
    
    @scala.inline
    def setPolylineEditorClass(value: js.Object): Self = this.set("polylineEditorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylineEditorClass: Self = this.set("polylineEditorClass", js.undefined)
    
    @scala.inline
    def setSkipMiddleMarkers(value: Boolean): Self = this.set("skipMiddleMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipMiddleMarkers: Self = this.set("skipMiddleMarkers", js.undefined)
    
    @scala.inline
    def setVertexMarkerClass(value: js.Object): Self = this.set("vertexMarkerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexMarkerClass: Self = this.set("vertexMarkerClass", js.undefined)
  }
}
