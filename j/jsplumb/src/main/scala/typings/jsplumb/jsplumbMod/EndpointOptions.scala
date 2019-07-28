package typings.jsplumb.jsplumbMod

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
    val __obj = js.Dynamic.literal(id = id, maxConnections = maxConnections, parameters = parameters, reattachConnections = reattachConnections, scope = scope)
    __obj.updateDynamic("type")(`type`)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType)
    if (!js.isUndefined(connectionsDetachable)) __obj.updateDynamic("connectionsDetachable")(connectionsDetachable)
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (`connector-pointer-events` != null) __obj.updateDynamic("connector-pointer-events")(`connector-pointer-events`)
    if (connectorClass != null) __obj.updateDynamic("connectorClass")(connectorClass)
    if (connectorHoverClass != null) __obj.updateDynamic("connectorHoverClass")(connectorHoverClass)
    if (connectorHoverStyle != null) __obj.updateDynamic("connectorHoverStyle")(connectorHoverStyle)
    if (connectorOverlays != null) __obj.updateDynamic("connectorOverlays")(connectorOverlays)
    if (connectorStyle != null) __obj.updateDynamic("connectorStyle")(connectorStyle)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dragOptions != null) __obj.updateDynamic("dragOptions")(dragOptions)
    if (dragProxy != null) __obj.updateDynamic("dragProxy")(dragProxy.asInstanceOf[js.Any])
    if (dropOptions != null) __obj.updateDynamic("dropOptions")(dropOptions)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass)
    if (hoverPaintStyle != null) __obj.updateDynamic("hoverPaintStyle")(hoverPaintStyle)
    if (!js.isUndefined(isSource)) __obj.updateDynamic("isSource")(isSource)
    if (!js.isUndefined(isTarget)) __obj.updateDynamic("isTarget")(isTarget)
    if (paintStyle != null) __obj.updateDynamic("paintStyle")(paintStyle)
    if (!js.isUndefined(reattach)) __obj.updateDynamic("reattach")(reattach)
    __obj.asInstanceOf[EndpointOptions]
  }
}

