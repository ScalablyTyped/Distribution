package typings.jupyterlabNotebook.mod

import typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.IOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoMessaging.mod.ConflatableMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookTools")
@js.native
class NotebookTools protected ()
  extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools {
  /**
    * Construct a new NotebookTools object.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/notebook", "NotebookTools")
@js.native
object NotebookTools extends js.Object {
  /**
    * A cell tool displaying the active cell contents.
    */
  @js.native
  /**
    * Construct a new active cell tool.
    */
  class ActiveCellTool ()
    extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.ActiveCellTool
  
  /**
    * A cell metadata editor
    */
  @js.native
  class CellMetadataEditorTool protected ()
    extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.CellMetadataEditorTool {
    def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  }
  
  /**
    * A cell tool that provides a selection for a given metadata key.
    */
  @js.native
  class KeySelector protected ()
    extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector {
    /**
      * Construct a new KeySelector.
      */
    def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector.IOptions) = this()
  }
  
  /**
    * A raw metadata editor.
    */
  @js.native
  class MetadataEditorTool protected ()
    extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool {
    /**
      * Construct a new raw metadata tool.
      */
    def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  }
  
  /**
    * A notebook metadata editor
    */
  @js.native
  class NotebookMetadataEditorTool protected ()
    extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.NotebookMetadataEditorTool {
    def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  }
  
  /**
    * The base notebook tool, meant to be subclassed.
    */
  @js.native
  class Tool ()
    extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.Tool
  
  /**
    * A singleton conflatable `'activecell-changed'` message.
    */
  val ActiveCellMessage: ConflatableMessage = js.native
  /**
    * A singleton conflatable `'activenotebookpanel-changed'` message.
    */
  val ActiveNotebookPanelMessage: ConflatableMessage = js.native
  /**
    * A singleton conflatable `'selection-changed'` message.
    */
  val SelectionMessage: ConflatableMessage = js.native
  /**
    * Create an nbconvert selector.
    */
  def createNBConvertSelector(optionsMap: ReadonlyPartialJSONObject): typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector = js.native
  /**
    * Create a slideshow selector.
    */
  def createSlideShowSelector(): typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector = js.native
  /**
    * The namespace for `KeySelector` static data.
    */
  @js.native
  object KeySelector extends js.Object
  
  /**
    * The namespace for `MetadataEditorTool` static data.
    */
  @js.native
  object MetadataEditorTool extends js.Object
  
}

