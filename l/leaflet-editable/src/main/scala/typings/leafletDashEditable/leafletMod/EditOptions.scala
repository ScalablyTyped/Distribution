package typings.leafletDashEditable.leafletMod

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.LayerGroup
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
    LayerGroup[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ILayer */ _
    ]
  ] = js.undefined
  /**
    * Default layer used to store drawn features (marker, polyline…).
    */
  var featuresLayer: js.UndefOr[
    LayerGroup[
      (typings.leaflet.leafletMod.Polyline[LineString | MultiLineString, _]) | typings.leaflet.leafletMod.Polygon[_] | typings.leaflet.leafletMod.Marker[_]
    ]
  ] = js.undefined
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
    editLayer: LayerGroup[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ILayer */ _
    ] = null,
    featuresLayer: LayerGroup[
      (typings.leaflet.leafletMod.Polyline[LineString | MultiLineString, _]) | typings.leaflet.leafletMod.Polygon[_] | typings.leaflet.leafletMod.Marker[_]
    ] = null,
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
    if (drawingCSSClass != null) __obj.updateDynamic("drawingCSSClass")(drawingCSSClass)
    if (editLayer != null) __obj.updateDynamic("editLayer")(editLayer)
    if (featuresLayer != null) __obj.updateDynamic("featuresLayer")(featuresLayer)
    if (lineGuideOptions != null) __obj.updateDynamic("lineGuideOptions")(lineGuideOptions)
    if (markerClass != null) __obj.updateDynamic("markerClass")(markerClass)
    if (markerEditorClass != null) __obj.updateDynamic("markerEditorClass")(markerEditorClass)
    if (middleMarkerClass != null) __obj.updateDynamic("middleMarkerClass")(middleMarkerClass)
    if (polygonClass != null) __obj.updateDynamic("polygonClass")(polygonClass)
    if (polygonEditorClass != null) __obj.updateDynamic("polygonEditorClass")(polygonEditorClass)
    if (polylineClass != null) __obj.updateDynamic("polylineClass")(polylineClass)
    if (polylineEditorClass != null) __obj.updateDynamic("polylineEditorClass")(polylineEditorClass)
    if (!js.isUndefined(skipMiddleMarkers)) __obj.updateDynamic("skipMiddleMarkers")(skipMiddleMarkers)
    if (vertexMarkerClass != null) __obj.updateDynamic("vertexMarkerClass")(vertexMarkerClass)
    __obj.asInstanceOf[EditOptions]
  }
}

