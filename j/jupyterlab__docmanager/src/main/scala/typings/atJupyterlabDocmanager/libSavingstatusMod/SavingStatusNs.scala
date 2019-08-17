package typings.atJupyterlabDocmanager.libSavingstatusMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomModel
import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.SaveState
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/savingstatus", "SavingStatus")
@js.native
object SavingStatusNs extends js.Object {
  /**
    * Options for creating a new SaveStatus item
    */
  trait IOptions extends js.Object {
    /**
      * The application document manager.
      */
    var docManager: IDocumentManager
  }
  
  /**
    * A VDomModel for the SavingStatus item.
    */
  @js.native
  class Model protected () extends VDomModel {
    /**
      * Create a new SavingStatus model.
      */
    def this(docManager: IDocumentManager) = this()
    var _docManager: js.Any = js.native
    /**
      * React to a saving status change from the current document widget.
      */
    var _onStatusChange: js.Any = js.native
    var _status: js.Any = js.native
    var _widget: js.Any = js.native
    /**
      * The current status of the model.
      */
    val status: SaveState | Null = js.native
    /**
      * The current widget for the model. Any widget can be assigned,
      * but it only has any effect if the widget is an IDocument widget
      * known to the application document manager.
      */
    var widget: Widget | Null = js.native
  }
  
}

