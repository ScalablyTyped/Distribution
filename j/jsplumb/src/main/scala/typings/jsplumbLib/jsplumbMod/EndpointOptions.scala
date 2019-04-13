package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointOptions extends js.Object {
  var anchor: js.UndefOr[AnchorSpec] = js.undefined
  var connectionType: js.UndefOr[java.lang.String] = js.undefined
  var connectionsDetachable: js.UndefOr[scala.Boolean] = js.undefined
  var connector: js.UndefOr[ConnectorSpec] = js.undefined
  var `connector-pointer-events`: js.UndefOr[java.lang.String] = js.undefined
  var connectorClass: js.UndefOr[java.lang.String] = js.undefined
  var connectorHoverClass: js.UndefOr[java.lang.String] = js.undefined
  var connectorHoverStyle: js.UndefOr[PaintStyle] = js.undefined
  var connectorOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
  var connectorStyle: js.UndefOr[PaintStyle] = js.undefined
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  //= 1?
  var dragOptions: js.UndefOr[DragOptions] = js.undefined
  var dragProxy: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var dropOptions: js.UndefOr[DropOptions] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var endpoint: js.UndefOr[Endpoint] = js.undefined
  var hoverClass: js.UndefOr[java.lang.String] = js.undefined
  var hoverPaintStyle: js.UndefOr[PaintStyle] = js.undefined
  var id: java.lang.String
  //= true
  var isSource: js.UndefOr[scala.Boolean] = js.undefined
  //= false
  var isTarget: js.UndefOr[scala.Boolean] = js.undefined
  var maxConnections: scala.Double
  //= true
  var paintStyle: js.UndefOr[PaintStyle] = js.undefined
  //= false
  var parameters: js.Object
  //= false
  var reattach: js.UndefOr[scala.Boolean] = js.undefined
  var reattachConnections: scala.Boolean
  var scope: java.lang.String
  var `type`: java.lang.String
}

object EndpointOptions {
  @scala.inline
  def apply(
    id: java.lang.String,
    maxConnections: scala.Double,
    parameters: js.Object,
    reattachConnections: scala.Boolean,
    scope: java.lang.String,
    `type`: java.lang.String,
    anchor: AnchorSpec = null,
    connectionType: java.lang.String = null,
    connectionsDetachable: js.UndefOr[scala.Boolean] = js.undefined,
    connector: ConnectorSpec = null,
    `connector-pointer-events`: java.lang.String = null,
    connectorClass: java.lang.String = null,
    connectorHoverClass: java.lang.String = null,
    connectorHoverStyle: PaintStyle = null,
    connectorOverlays: js.Array[OverlaySpec] = null,
    connectorStyle: PaintStyle = null,
    cssClass: java.lang.String = null,
    dragOptions: DragOptions = null,
    dragProxy: java.lang.String | js.Array[java.lang.String] = null,
    dropOptions: DropOptions = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    endpoint: Endpoint = null,
    hoverClass: java.lang.String = null,
    hoverPaintStyle: PaintStyle = null,
    isSource: js.UndefOr[scala.Boolean] = js.undefined,
    isTarget: js.UndefOr[scala.Boolean] = js.undefined,
    paintStyle: PaintStyle = null,
    reattach: js.UndefOr[scala.Boolean] = js.undefined
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

