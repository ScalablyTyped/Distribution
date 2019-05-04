package typings
package atJupyterlabNotebookLib.atJupyterlabNotebookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "CellTools")
@js.native
object CellToolsNs extends js.Object {
  /**
    * A cell tool displaying the active cell contents.
    */
  @js.native
  /**
    * Construct a new active cell tool.
    */
  class ActiveCellTool ()
    extends atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.ActiveCellTool
  
  /**
    * A cell tool that provides a selection for a given metadata key.
    */
  @js.native
  class KeySelector protected ()
    extends atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.KeySelector {
    /**
      * Construct a new KeySelector.
      */
    def this(options: atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.KeySelectorNs.IOptions) = this()
  }
  
  /**
    * A raw metadata editor.
    */
  @js.native
  class MetadataEditorTool protected ()
    extends atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.MetadataEditorTool {
    /**
      * Construct a new raw metadata tool.
      */
    def this(options: atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.MetadataEditorToolNs.IOptions) = this()
  }
  
  /**
    * The base cell tool, meant to be subclassed.
    */
  @js.native
  class Tool ()
    extends atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.Tool
  
  /**
    * A singleton conflatable `'activecell-changed'` message.
    */
  val ActiveCellMessage: atPhosphorMessagingLib.atPhosphorMessagingMod.ConflatableMessage = js.native
  /**
    * A singleton conflatable `'selection-changed'` message.
    */
  val SelectionMessage: atPhosphorMessagingLib.atPhosphorMessagingMod.ConflatableMessage = js.native
  /**
    * Create an nbcovert selector.
    */
  def createNBConvertSelector(
    optionsMap: org.scalablytyped.runtime.StringDictionary[atPhosphorCoreutilsLib.libJsonMod.JSONValue]
  ): atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.KeySelector = js.native
  /**
    * Create a slideshow selector.
    */
  def createSlideShowSelector(): atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.KeySelector = js.native
  /**
    * The namespace for `KeySelector` static data.
    */
  @JSName("KeySelector")
  @js.native
  object KeySelectorNs extends js.Object
  
  /**
    * The namespace for `MetadataEditorTool` static data.
    */
  @JSName("MetadataEditorTool")
  @js.native
  object MetadataEditorToolNs extends js.Object
  
}

