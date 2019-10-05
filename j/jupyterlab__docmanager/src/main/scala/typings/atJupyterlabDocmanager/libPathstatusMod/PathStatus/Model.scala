package typings.atJupyterlabDocmanager.libPathstatusMod.PathStatus

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomModel
import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VDomModel for rendering the PathStatus status item.
  */
@JSImport("@jupyterlab/docmanager/lib/pathstatus", "PathStatus.Model")
@js.native
class Model protected () extends VDomModel {
  /**
    * Construct a new model.
    *
    * @param docManager: the application document manager. Used to check
    *   whether the current widget is a document.
    */
  def this(docManager: IDocumentManager) = this()
  var _docManager: js.Any = js.native
  /**
    * Get the current state of the model.
    */
  var _getAllState: js.Any = js.native
  var _name: js.Any = js.native
  /**
    * React to a path change for the current document.
    */
  var _onPathChange: js.Any = js.native
  /**
    * React to a title change for the current widget.
    */
  var _onTitleChange: js.Any = js.native
  var _path: js.Any = js.native
  /**
    * Trigger a state change to rerender.
    */
  var _triggerChange: js.Any = js.native
  var _widget: js.Any = js.native
  /**
    * The name of the current activity.
    */
  val name: String = js.native
  /**
    * The current path for the application.
    */
  val path: String = js.native
  /**
    * The current widget for the application.
    */
  var widget: Widget | Null = js.native
}

