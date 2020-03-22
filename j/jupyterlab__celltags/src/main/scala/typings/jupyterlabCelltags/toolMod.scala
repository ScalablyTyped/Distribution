package typings.jupyterlabCelltags

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.Tool
import typings.jupyterlabNotebook.tokensMod.INotebookTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/celltags/lib/tool", JSImport.Namespace)
@js.native
object toolMod extends js.Object {
  @js.native
  class TagTool protected () extends Tool {
    /**
      * Construct a new tag Tool.
      *
      * @param tracker - The notebook tracker.
      */
    def this(tracker: INotebookTracker, app: JupyterFrontEnd[IShell]) = this()
    var header: js.Any = js.native
    var tagList: js.Any = js.native
    var tracker: INotebookTracker = js.native
    /**
      * Add a tag to the current active cell.
      *
      * @param name - The name of the tag.
      */
    def addTag(name: String): Unit = js.native
    /**
      * Check whether a tag is applied to the current active cell
      *
      * @param name - The name of the tag.
      *
      * @returns A boolean representing whether it is applied.
      */
    def checkApplied(name: String): Boolean = js.native
    /**
      * Add an AddWidget input box to the layout.
      */
    def createTagInput(): Unit = js.native
    /**
      * Update each tag widget to represent whether it is applied to the current
      * active cell.
      */
    def loadActiveTags(): Unit = js.native
    /**
      * Handle a change to the active cell.
      */
    /* protected */ def onActiveCellChanged(): Unit = js.native
    /**
      * Handle a change to active cell metadata.
      */
    /* protected */ def onActiveCellMetadataChanged(): Unit = js.native
    /**
      * Upon attach, add header if it doesn't already exist and listen for changes
      * from the notebook tracker.
      */
    /* protected */ def onAfterAttach(): Unit = js.native
    /**
      * Get all tags once available.
      */
    /* protected */ def onAfterShow(): Unit = js.native
    /**
      * Pull from cell metadata all the tags used in the notebook and update the
      * stored tag list.
      */
    def pullTags(): Unit = js.native
    /**
      * Pull the most recent list of tags and update the tag widgets - dispose if
      * the tag no longer exists, and create new widgets for new tags.
      */
    def refreshTags(): Unit = js.native
    /**
      * Remove a tag from the current active cell.
      *
      * @param name - The name of the tag.
      */
    def removeTag(name: String): Unit = js.native
    /**
      * Validate the 'tags' of cell metadata, ensuring it is a list of strings and
      * that each string doesn't include spaces.
      */
    def validateTags(cell: Cell, taglist: js.Array[String]): Unit = js.native
  }
  
}

