package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectParams extends js.Object {
  var anchor: js.UndefOr[AnchorSpec] = js.undefined
  var anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.undefined
  var connector: js.UndefOr[ConnectorSpec] = js.undefined
  var deleteEndpointsOnDetach: js.UndefOr[scala.Boolean] = js.undefined
  var detachable: js.UndefOr[scala.Boolean] = js.undefined
  var endpoint: js.UndefOr[EndpointSpec] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var overlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
  var source: js.UndefOr[ElementRef | Endpoint] = js.undefined
  var target: js.UndefOr[ElementRef | Endpoint] = js.undefined
  var uuids: js.UndefOr[js.Tuple2[UUID, UUID]] = js.undefined
}

object ConnectParams {
  @scala.inline
  def apply(
    anchor: AnchorSpec = null,
    anchors: js.Tuple2[AnchorSpec, AnchorSpec] = null,
    connector: ConnectorSpec = null,
    deleteEndpointsOnDetach: js.UndefOr[scala.Boolean] = js.undefined,
    detachable: js.UndefOr[scala.Boolean] = js.undefined,
    endpoint: EndpointSpec = null,
    label: java.lang.String = null,
    overlays: js.Array[OverlaySpec] = null,
    source: ElementRef | Endpoint = null,
    target: ElementRef | Endpoint = null,
    uuids: js.Tuple2[UUID, UUID] = null
  ): ConnectParams = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (anchors != null) __obj.updateDynamic("anchors")(anchors)
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteEndpointsOnDetach)) __obj.updateDynamic("deleteEndpointsOnDetach")(deleteEndpointsOnDetach)
    if (!js.isUndefined(detachable)) __obj.updateDynamic("detachable")(detachable)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (overlays != null) __obj.updateDynamic("overlays")(overlays)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (uuids != null) __obj.updateDynamic("uuids")(uuids)
    __obj.asInstanceOf[ConnectParams]
  }
}

