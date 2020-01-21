package typings.leafletEditable.mod

import typings.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to L.Editable when instanciating.
  */
trait EditOptions extends js.Object {
  /**
    * CSS class to be added to the map container while drawing.
    */
  var drawingCSSClass: js.UndefOr[String] = js.undefined
  /**
    * Layer used to store edit tools (vertex, line guide…).
    */
  var editLayer: js.UndefOr[
    LayerGroup_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ _
    ]
  ] = js.undefined
  /**
    * Default layer used to store drawn features (marker, polyline…).
    */
  var featuresLayer: js.UndefOr[LayerGroup_[Polyline | Polygon | Marker]] = js.undefined
  /**
    * Options to be passed to the line guides.
    */
  var lineGuideOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * Class to be used when creating a new Marker.
    */
  var markerClass: js.UndefOr[js.Object] = js.undefined
  /**
    * Class to be used as Marker editor.
    */
  var markerEditorClass: js.UndefOr[js.Object] = js.undefined
  /**
    * Class to be used as middle vertex, pulled by the user to create a new point in the middle of a path.
    */
  var middleMarkerClass: js.UndefOr[js.Object] = js.undefined
  /**
    * Class to be used when creating a new Polygon.
    */
  var polygonClass: js.UndefOr[js.Object] = js.undefined
  /**
    * Class to be used as Polygon editor.
    */
  var polygonEditorClass: js.UndefOr[js.Object] = js.undefined
  /**
    * Class to be used when creating a new Polyline.
    */
  var polylineClass: js.UndefOr[js.Object] = js.undefined
  /**
    * Class to be used as Polyline editor.
    */
  var polylineEditorClass: js.UndefOr[js.Object] = js.undefined
  /**
    * Set this to true if you don't want middle markers.
    */
  var skipMiddleMarkers: js.UndefOr[Boolean] = js.undefined
  /**
    * Class to be used as vertex, for path editing.
    */
  var vertexMarkerClass: js.UndefOr[js.Object] = js.undefined
}

object EditOptions {
  @scala.inline
  def apply(
    drawingCSSClass: String = null,
    editLayer: LayerGroup_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ _
    ] = null,
    featuresLayer: LayerGroup_[Polyline | Polygon | Marker] = null,
    lineGuideOptions: js.Object = null,
    markerClass: js.Object = null,
    markerEditorClass: js.Object = null,
    middleMarkerClass: js.Object = null,
    polygonClass: js.Object = null,
    polygonEditorClass: js.Object = null,
    polylineClass: js.Object = null,
    polylineEditorClass: js.Object = null,
    skipMiddleMarkers: js.UndefOr[Boolean] = js.undefined,
    vertexMarkerClass: js.Object = null
  ): EditOptions = {
    val __obj = js.Dynamic.literal()
    if (drawingCSSClass != null) __obj.updateDynamic("drawingCSSClass")(drawingCSSClass.asInstanceOf[js.Any])
    if (editLayer != null) __obj.updateDynamic("editLayer")(editLayer.asInstanceOf[js.Any])
    if (featuresLayer != null) __obj.updateDynamic("featuresLayer")(featuresLayer.asInstanceOf[js.Any])
    if (lineGuideOptions != null) __obj.updateDynamic("lineGuideOptions")(lineGuideOptions.asInstanceOf[js.Any])
    if (markerClass != null) __obj.updateDynamic("markerClass")(markerClass.asInstanceOf[js.Any])
    if (markerEditorClass != null) __obj.updateDynamic("markerEditorClass")(markerEditorClass.asInstanceOf[js.Any])
    if (middleMarkerClass != null) __obj.updateDynamic("middleMarkerClass")(middleMarkerClass.asInstanceOf[js.Any])
    if (polygonClass != null) __obj.updateDynamic("polygonClass")(polygonClass.asInstanceOf[js.Any])
    if (polygonEditorClass != null) __obj.updateDynamic("polygonEditorClass")(polygonEditorClass.asInstanceOf[js.Any])
    if (polylineClass != null) __obj.updateDynamic("polylineClass")(polylineClass.asInstanceOf[js.Any])
    if (polylineEditorClass != null) __obj.updateDynamic("polylineEditorClass")(polylineEditorClass.asInstanceOf[js.Any])
    if (!js.isUndefined(skipMiddleMarkers)) __obj.updateDynamic("skipMiddleMarkers")(skipMiddleMarkers.asInstanceOf[js.Any])
    if (vertexMarkerClass != null) __obj.updateDynamic("vertexMarkerClass")(vertexMarkerClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOptions]
  }
}

