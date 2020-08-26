package typings.luminoDragdrop.mod.Drag

import typings.luminoCoreutils.mod.MimeData
import typings.luminoDragdrop.mod.DropAction
import typings.luminoDragdrop.mod.SupportedActions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a `Drag` object.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * An optional drag image which follows the mouse cursor.
    *
    * #### Notes
    * The drag image can be any DOM element. It is not limited to
    * image or canvas elements as with the native drag-drop APIs.
    *
    * If provided, this will be positioned at the mouse cursor on each
    * mouse move event. A CSS transform can be used to offset the node
    * from its specified position.
    *
    * The drag image will automatically have the `lm-mod-drag-image`
    * class name added.
    *
    * The default value is `null`.
    */
  var dragImage: js.UndefOr[HTMLElement] = js.native
  /**
    * The populated mime data for the drag operation.
    */
  var mimeData: MimeData = js.native
  /**
    * The optional proposed drop action for the drag operation.
    *
    * #### Notes
    * This can be provided as a hint to the drop targets as to which
    * drop action is preferred.
    *
    * The default value is `'copy'`.
    */
  var proposedAction: js.UndefOr[DropAction] = js.native
  /**
    * An optional object which indicates the source of the drag.
    *
    * #### Notes
    * For advanced applications, the drag initiator may wish to expose
    * a source object to the drop targets. That object can be specified
    * here and will be carried along with the drag events.
    *
    * The default value is `null`.
    */
  var source: js.UndefOr[js.Any] = js.native
  /**
    * The drop actions supported by the drag initiator.
    *
    * #### Notes
    * A drop target must indicate that it intends to perform one of the
    * supported actions in order to receive a drop event. However, it is
    * not required to *actually* perform that action when handling the
    * drop event. Therefore, the initiator must be prepared to handle
    * any drop action performed by a drop target.
    *
    * The default value is `'all'`.
    */
  var supportedActions: js.UndefOr[SupportedActions] = js.native
}

object IOptions {
  @scala.inline
  def apply(mimeData: MimeData): IOptions = {
    val __obj = js.Dynamic.literal(mimeData = mimeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setMimeData(value: MimeData): Self = this.set("mimeData", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragImage(value: HTMLElement): Self = this.set("dragImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragImage: Self = this.set("dragImage", js.undefined)
    @scala.inline
    def setProposedAction(value: DropAction): Self = this.set("proposedAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposedAction: Self = this.set("proposedAction", js.undefined)
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSupportedActions(value: SupportedActions): Self = this.set("supportedActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedActions: Self = this.set("supportedActions", js.undefined)
  }
  
}

