package typings.luminoDragdrop.mod

import typings.luminoCoreutils.mod.MimeData
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragEvent extends MouseEvent {
  /**
    * The drop action supported or taken by the drop target.
    *
    * #### Notes
    * At the start of each event, this value will be `'none'`. During a
    * `'lm-dragover'` event, the drop target must set this value to one
    * of the supported actions, or the drop event will not occur.
    *
    * When handling the drop event, the drop target should set this
    * to the action which was *actually* taken. This value will be
    * reported back to the drag initiator.
    */
  var dropAction: DropAction = js.native
  /**
    * The mime data associated with the event.
    *
    * #### Notes
    * This is mime data provided by the drag initiator. Drop targets
    * should use this data to determine if they can handle the drop.
    */
  val mimeData: MimeData = js.native
  /**
    * The drop action proposed by the drag initiator.
    *
    * #### Notes
    * This is the action which is *preferred* by the drag initiator. The
    * drop target is not required to perform this action, but should if
    * it all possible.
    */
  val proposedAction: DropAction = js.native
  /**
    * The source object of the drag, as provided by the drag initiator.
    *
    * #### Notes
    * For advanced applications, the drag initiator may wish to expose
    * a source object to the drop targets. That will be provided here
    * if given by the drag initiator, otherwise it will be `null`.
    */
  val source: js.Any = js.native
  /**
    * The drop actions supported by the drag initiator.
    *
    * #### Notes
    * If the `dropAction` is not set to one of the supported actions
    * during the `'lm-dragover'` event, the drop event will not occur.
    */
  val supportedActions: SupportedActions = js.native
}

