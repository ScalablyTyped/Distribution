package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointOptions extends js.Object {
  var anchor: js.UndefOr[AnchorSpec] = js.undefined
  var connectionType: js.UndefOr[String] = js.undefined
  var connectionsDetachable: js.UndefOr[Boolean] = js.undefined
  var connector: js.UndefOr[ConnectorSpec] = js.undefined
  var `connector-pointer-events`: js.UndefOr[String] = js.undefined
  var connectorClass: js.UndefOr[String] = js.undefined
  var connectorHoverClass: js.UndefOr[String] = js.undefined
  var connectorHoverStyle: js.UndefOr[PaintStyle] = js.undefined
  var connectorOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
  var connectorStyle: js.UndefOr[PaintStyle] = js.undefined
  var cssClass: js.UndefOr[String] = js.undefined
  //= 1?
  var dragOptions: js.UndefOr[DragOptions] = js.undefined
  var dragProxy: js.UndefOr[String | js.Array[String]] = js.undefined
  var dropOptions: js.UndefOr[DropOptions] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var endpoint: js.UndefOr[EndpointSpec] = js.undefined
  var hoverClass: js.UndefOr[String] = js.undefined
  var hoverPaintStyle: js.UndefOr[PaintStyle] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  //= true
  var isSource: js.UndefOr[Boolean] = js.undefined
  //= false
  var isTarget: js.UndefOr[Boolean] = js.undefined
  var maxConnections: Double
   // "Dot", etc.
  var overlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
  //= true
  var paintStyle: js.UndefOr[PaintStyle] = js.undefined
  //= false
  var parameters: js.UndefOr[js.Object] = js.undefined
  //= false
  var reattach: js.UndefOr[Boolean] = js.undefined
  var reattachConnections: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object EndpointOptions {
  @scala.inline
  def apply(
    maxConnections: Double,
    anchor: AnchorSpec = null,
    connectionType: String = null,
    connectionsDetachable: js.UndefOr[Boolean] = js.undefined,
    connector: ConnectorSpec = null,
    `connector-pointer-events`: String = null,
    connectorClass: String = null,
    connectorHoverClass: String = null,
    connectorHoverStyle: PaintStyle = null,
    connectorOverlays: js.Array[OverlaySpec] = null,
    connectorStyle: PaintStyle = null,
    cssClass: String = null,
    dragOptions: DragOptions = null,
    dragProxy: String | js.Array[String] = null,
    dropOptions: DropOptions = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    endpoint: EndpointSpec = null,
    hoverClass: String = null,
    hoverPaintStyle: PaintStyle = null,
    id: String = null,
    isSource: js.UndefOr[Boolean] = js.undefined,
    isTarget: js.UndefOr[Boolean] = js.undefined,
    overlays: js.Array[OverlaySpec] = null,
    paintStyle: PaintStyle = null,
    parameters: js.Object = null,
    reattach: js.UndefOr[Boolean] = js.undefined,
    reattachConnections: js.UndefOr[Boolean] = js.undefined,
    scope: String = null,
    `type`: String = null
  ): EndpointOptions = {
    val __obj = js.Dynamic.literal(maxConnections = maxConnections.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionsDetachable)) __obj.updateDynamic("connectionsDetachable")(connectionsDetachable.get.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (`connector-pointer-events` != null) __obj.updateDynamic("connector-pointer-events")(`connector-pointer-events`.asInstanceOf[js.Any])
    if (connectorClass != null) __obj.updateDynamic("connectorClass")(connectorClass.asInstanceOf[js.Any])
    if (connectorHoverClass != null) __obj.updateDynamic("connectorHoverClass")(connectorHoverClass.asInstanceOf[js.Any])
    if (connectorHoverStyle != null) __obj.updateDynamic("connectorHoverStyle")(connectorHoverStyle.asInstanceOf[js.Any])
    if (connectorOverlays != null) __obj.updateDynamic("connectorOverlays")(connectorOverlays.asInstanceOf[js.Any])
    if (connectorStyle != null) __obj.updateDynamic("connectorStyle")(connectorStyle.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dragOptions != null) __obj.updateDynamic("dragOptions")(dragOptions.asInstanceOf[js.Any])
    if (dragProxy != null) __obj.updateDynamic("dragProxy")(dragProxy.asInstanceOf[js.Any])
    if (dropOptions != null) __obj.updateDynamic("dropOptions")(dropOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (hoverPaintStyle != null) __obj.updateDynamic("hoverPaintStyle")(hoverPaintStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isSource)) __obj.updateDynamic("isSource")(isSource.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTarget)) __obj.updateDynamic("isTarget")(isTarget.get.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (paintStyle != null) __obj.updateDynamic("paintStyle")(paintStyle.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (!js.isUndefined(reattach)) __obj.updateDynamic("reattach")(reattach.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reattachConnections)) __obj.updateDynamic("reattachConnections")(reattachConnections.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointOptions]
  }
}

