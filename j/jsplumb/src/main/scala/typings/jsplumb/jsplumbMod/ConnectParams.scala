package typings.jsplumb.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectParams extends js.Object {
  var anchor: js.UndefOr[AnchorSpec] = js.undefined
  var anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.undefined
  var connector: js.UndefOr[ConnectorSpec] = js.undefined
  var deleteEndpointsOnDetach: js.UndefOr[Boolean] = js.undefined
  var detachable: js.UndefOr[Boolean] = js.undefined
  var endpoint: js.UndefOr[EndpointSpec] = js.undefined
  var label: js.UndefOr[String] = js.undefined
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
    deleteEndpointsOnDetach: js.UndefOr[Boolean] = js.undefined,
    detachable: js.UndefOr[Boolean] = js.undefined,
    endpoint: EndpointSpec = null,
    label: String = null,
    overlays: js.Array[OverlaySpec] = null,
    source: ElementRef | Endpoint = null,
    target: ElementRef | Endpoint = null,
    uuids: js.Tuple2[UUID, UUID] = null
  ): ConnectParams = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (anchors != null) __obj.updateDynamic("anchors")(anchors.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteEndpointsOnDetach)) __obj.updateDynamic("deleteEndpointsOnDetach")(deleteEndpointsOnDetach.asInstanceOf[js.Any])
    if (!js.isUndefined(detachable)) __obj.updateDynamic("detachable")(detachable.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (uuids != null) __obj.updateDynamic("uuids")(uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectParams]
  }
}

