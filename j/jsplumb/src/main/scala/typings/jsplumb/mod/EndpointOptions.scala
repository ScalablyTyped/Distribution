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
  var endpoint: js.UndefOr[Endpoint] = js.undefined
  var hoverClass: js.UndefOr[String] = js.undefined
  var hoverPaintStyle: js.UndefOr[PaintStyle] = js.undefined
  var id: String
  //= true
  var isSource: js.UndefOr[Boolean] = js.undefined
  //= false
  var isTarget: js.UndefOr[Boolean] = js.undefined
  var maxConnections: Double
  //= true
  var paintStyle: js.UndefOr[PaintStyle] = js.undefined
  //= false
  var parameters: js.Object
  //= false
  var reattach: js.UndefOr[Boolean] = js.undefined
  var reattachConnections: Boolean
  var scope: String
  var `type`: String
}

object EndpointOptions {
  @scala.inline
  def apply(
    id: String,
    maxConnections: Double,
    parameters: js.Object,
    reattachConnections: Boolean,
    scope: String,
    `type`: String,
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
    endpoint: Endpoint = null,
    hoverClass: String = null,
    hoverPaintStyle: PaintStyle = null,
    isSource: js.UndefOr[Boolean] = js.undefined,
    isTarget: js.UndefOr[Boolean] = js.undefined,
    paintStyle: PaintStyle = null,
    reattach: js.UndefOr[Boolean] = js.undefined
  ): EndpointOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], maxConnections = maxConnections.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], reattachConnections = reattachConnections.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionsDetachable)) __obj.updateDynamic("connectionsDetachable")(connectionsDetachable.asInstanceOf[js.Any])
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
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (hoverPaintStyle != null) __obj.updateDynamic("hoverPaintStyle")(hoverPaintStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(isSource)) __obj.updateDynamic("isSource")(isSource.asInstanceOf[js.Any])
    if (!js.isUndefined(isTarget)) __obj.updateDynamic("isTarget")(isTarget.asInstanceOf[js.Any])
    if (paintStyle != null) __obj.updateDynamic("paintStyle")(paintStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(reattach)) __obj.updateDynamic("reattach")(reattach.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointOptions]
  }
}

