package typings.atJupyterlabNotebook.atJupyterlabNotebookMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.IOptions
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorMessaging.atPhosphorMessagingMod.ConflatableMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookTools")
@js.native
class NotebookTools protected ()
  extends typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools {
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
    extends typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.ActiveCellTool
  
  /**
    * A cell metadata editor
    */
  @js.native
  class CellMetadataEditorTool protected ()
    extends typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.CellMetadataEditorTool {
    def this(options: typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  }
  
  /**
    * A cell tool that provides a selection for a given metadata key.
    */
  @js.native
  class KeySelector protected ()
    extends typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.KeySelector {
    /**
      * Construct a new KeySelector.
      */
    def this(options: typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.KeySelector.IOptions) = this()
  }
  
  /**
    * A raw metadata editor.
    */
  @js.native
  class MetadataEditorTool protected ()
    extends typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.MetadataEditorTool {
    /**
      * Construct a new raw metadata tool.
      */
    def this(options: typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  }
  
  /**
    * A notebook metadata editor
    */
  @js.native
  class NotebookMetadataEditorTool protected ()
    extends typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.NotebookMetadataEditorTool {
    def this(options: typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  }
  
  /**
    * The base notebook tool, meant to be subclassed.
    */
  @js.native
  class Tool ()
    extends typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.Tool
  
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
  def createNBConvertSelector(optionsMap: StringDictionary[JSONValue]): typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.KeySelector = js.native
  /**
    * Create a slideshow selector.
    */
  def createSlideShowSelector(): typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.KeySelector = js.native
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

