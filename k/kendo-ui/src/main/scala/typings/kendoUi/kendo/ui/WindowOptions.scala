package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOptions extends js.Object {
  var actions: js.UndefOr[js.Any] = js.native
  var activate: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.native
  var animation: js.UndefOr[Boolean | WindowAnimation] = js.native
  var appendTo: js.UndefOr[js.Any | String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var close: js.UndefOr[js.Function1[/* e */ WindowCloseEvent, Unit]] = js.native
  var content: js.UndefOr[String | WindowContent] = js.native
  var deactivate: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.native
  var dragend: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.native
  var draggable: js.UndefOr[Boolean | WindowDraggable] = js.native
  var dragstart: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* e */ WindowErrorEvent, Unit]] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var iframe: js.UndefOr[Boolean] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var maximize: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var minimize: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.native
  var modal: js.UndefOr[Boolean | WindowModal] = js.native
  var name: js.UndefOr[String] = js.native
  var open: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.native
  var pinned: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[WindowPosition] = js.native
  var refresh: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.native
  var scrollable: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var title: js.UndefOr[String | Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object WindowOptions {
  @scala.inline
  def apply(): WindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOptions]
  }
  @scala.inline
  implicit class WindowOptionsOps[Self <: WindowOptions] (val x: Self) extends AnyVal {
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
    def setActions(value: js.Any): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setActivate(value: /* e */ WindowEvent => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    @scala.inline
    def setAnimation(value: Boolean | WindowAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAppendTo(value: js.Any | String): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setClose(value: /* e */ WindowCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setContent(value: String | WindowContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDeactivate(value: /* e */ WindowEvent => Unit): Self = this.set("deactivate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeactivate: Self = this.set("deactivate", js.undefined)
    @scala.inline
    def setDragend(value: /* e */ WindowEvent => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean | WindowDraggable): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDragstart(value: /* e */ WindowEvent => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    @scala.inline
    def setError(value: /* e */ WindowErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIframe(value: Boolean): Self = this.set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMaximize(value: /* e */ WindowEvent => Unit): Self = this.set("maximize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMaximize: Self = this.set("maximize", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMinimize(value: /* e */ WindowEvent => Unit): Self = this.set("minimize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    @scala.inline
    def setModal(value: Boolean | WindowModal): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ WindowEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setPosition(value: WindowPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRefresh(value: /* e */ WindowEvent => Unit): Self = this.set("refresh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setResize(value: /* e */ WindowEvent => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTitle(value: String | Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

