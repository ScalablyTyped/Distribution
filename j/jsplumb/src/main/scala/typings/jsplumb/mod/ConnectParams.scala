package typings.jsplumb.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectParams extends js.Object {
  var anchor: js.UndefOr[AnchorSpec] = js.native
  var anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.native
  var connector: js.UndefOr[ConnectorSpec] = js.native
  var cssClass: js.UndefOr[String] = js.native
  var deleteEndpointsOnDetach: js.UndefOr[Boolean] = js.native
  var detachable: js.UndefOr[Boolean] = js.native
  var endpoint: js.UndefOr[EndpointSpec] = js.native
  var label: js.UndefOr[String] = js.native
  var overlays: js.UndefOr[js.Array[OverlaySpec]] = js.native
  var parameters: js.UndefOr[Record[String, _]] = js.native
  var source: js.UndefOr[ElementRef | Endpoint] = js.native
  var target: js.UndefOr[ElementRef | Endpoint] = js.native
  var uuids: js.UndefOr[js.Tuple2[UUID, UUID]] = js.native
}

object ConnectParams {
  @scala.inline
  def apply(): ConnectParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectParams]
  }
  @scala.inline
  implicit class ConnectParamsOps[Self <: ConnectParams] (val x: Self) extends AnyVal {
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
    def setAnchorVarargs(value: (AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec)*): Self = this.set("anchor", js.Array(value :_*))
    @scala.inline
    def setAnchor(value: AnchorSpec): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setAnchors(value: js.Tuple2[AnchorSpec, AnchorSpec]): Self = this.set("anchors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchors: Self = this.set("anchors", js.undefined)
    @scala.inline
    def setConnector(value: ConnectorSpec): Self = this.set("connector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDeleteEndpointsOnDetach(value: Boolean): Self = this.set("deleteEndpointsOnDetach", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteEndpointsOnDetach: Self = this.set("deleteEndpointsOnDetach", js.undefined)
    @scala.inline
    def setDetachable(value: Boolean): Self = this.set("detachable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetachable: Self = this.set("detachable", js.undefined)
    @scala.inline
    def setEndpoint(value: EndpointSpec): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOverlaysVarargs(value: OverlaySpec*): Self = this.set("overlays", js.Array(value :_*))
    @scala.inline
    def setOverlays(value: js.Array[OverlaySpec]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlays: Self = this.set("overlays", js.undefined)
    @scala.inline
    def setParameters(value: Record[String, _]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setSource(value: ElementRef | Endpoint): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTarget(value: ElementRef | Endpoint): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setUuids(value: js.Tuple2[UUID, UUID]): Self = this.set("uuids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuids: Self = this.set("uuids", js.undefined)
  }
  
}

