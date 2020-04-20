package typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools

import typings.jupyterlabNotebook.tokensMod.INotebookTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a NotebookTools object.
  */
trait IOptions extends js.Object {
  /**
    * The notebook tracker used by the notebook tools.
    */
  var tracker: INotebookTracker
}

object IOptions {
  @scala.inline
  def apply(tracker: INotebookTracker): IOptions = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

