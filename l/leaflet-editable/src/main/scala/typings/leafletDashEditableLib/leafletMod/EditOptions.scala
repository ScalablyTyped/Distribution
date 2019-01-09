package typings
package leafletDashEditableLib.leafletMod

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
  var drawingCSSClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Layer used to store edit tools (vertex, line guide…).
    */
  var editLayer: js.UndefOr[
    leafletLib.leafletMod.LayerGroup[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ILayer */ _
    ]
  ] = js.undefined
  /**
    * Default layer used to store drawn features (marker, polyline…).
    */
  var featuresLayer: js.UndefOr[
    leafletLib.leafletMod.LayerGroup[
      (leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _]) | leafletLib.leafletMod.Polygon[_] | leafletLib.leafletMod.Marker[_]
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
  var skipMiddleMarkers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class to be used as vertex, for path editing.
    */
  var vertexMarkerClass: js.UndefOr[js.Object] = js.undefined
}

