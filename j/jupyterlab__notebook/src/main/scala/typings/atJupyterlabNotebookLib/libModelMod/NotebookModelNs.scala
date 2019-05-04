package typings
package atJupyterlabNotebookLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/model", "NotebookModel")
@js.native
object NotebookModelNs extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory protected () extends js.Object {
    /**
      * Create a new cell model factory.
      */
    def this(options: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.ContentFactoryNs.IOptions) = this()
    /**
      * The factory for code cell content.
      */
    val codeCellContentFactory: atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IContentFactory = js.native
    /**
      * The IModelDB in which to put the notebook data.
      */
    val modelDB: js.UndefOr[atJupyterlabObservablesLib.libModeldbMod.IModelDB] = js.native
    /**
      * Clone the content factory with a new IModelDB.
      */
    def clone(modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB): ContentFactory = js.native
    /**
      * Create a new code cell.
      *
      * @param source - The data to use for the original source data.
      *
      * @returns A new code cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      *   If the contentFactory is not provided, the instance
      *   `codeCellContentFactory` will be used.
      */
    def createCodeCell(options: atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IOptions): atJupyterlabCellsLib.libModelMod.ICodeCellModel = js.native
    /**
      * Create a new markdown cell.
      *
      * @param source - The data to use for the original source data.
      *
      * @returns A new markdown cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createMarkdownCell(options: atJupyterlabCellsLib.libModelMod.CellModelNs.IOptions): atJupyterlabCellsLib.libModelMod.IMarkdownCellModel = js.native
    /**
      * Create a new raw cell.
      *
      * @param source - The data to use for the original source data.
      *
      * @returns A new raw cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createRawCell(options: atJupyterlabCellsLib.libModelMod.CellModelNs.IOptions): atJupyterlabCellsLib.libModelMod.IRawCellModel = js.native
  }
  
  /**
    * A factory for creating notebook model content.
    */
  trait IContentFactory extends js.Object {
    /**
      * The factory for output area models.
      */
    val codeCellContentFactory: atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IContentFactory
    /**
      * The IModelDB in which to put data for the notebook model.
      */
    var modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB
    /**
      * Clone the content factory with a new IModelDB.
      */
    def clone(modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB): IContentFactory
    /**
      * Create a new code cell.
      *
      * @param options - The options used to create the cell.
      *
      * @returns A new code cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createCodeCell(options: atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IOptions): atJupyterlabCellsLib.libModelMod.ICodeCellModel
    /**
      * Create a new markdown cell.
      *
      * @param options - The options used to create the cell.
      *
      * @returns A new markdown cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createMarkdownCell(options: atJupyterlabCellsLib.libModelMod.CellModelNs.IOptions): atJupyterlabCellsLib.libModelMod.IMarkdownCellModel
    /**
      * Create a new raw cell.
      *
      * @param options - The options used to create the cell.
      *
      * @returns A new raw cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createRawCell(options: atJupyterlabCellsLib.libModelMod.CellModelNs.IOptions): atJupyterlabCellsLib.libModelMod.IRawCellModel
  }
  
  /**
    * An options object for initializing a notebook model.
    */
  trait IOptions extends js.Object {
    /**
      * A factory for creating cell models.
      *
      * The default is a shared factory instance.
      */
    var contentFactory: js.UndefOr[IContentFactory] = js.undefined
    /**
      * The language preference for the model.
      */
    var languagePreference: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A modelDB for storing notebook data.
      */
    var modelDB: js.UndefOr[atJupyterlabObservablesLib.libModeldbMod.IModelDB] = js.undefined
  }
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: ContentFactory = js.native
  /**
    * A namespace for the notebook model content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object {
    /**
      * The options used to initialize a `ContentFactory`.
      */
    trait IOptions extends js.Object {
      /**
        * The factory for code cell model content.
        */
      var codeCellContentFactory: js.UndefOr[atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IContentFactory] = js.undefined
      /**
        * The modelDB in which to place new content.
        */
      var modelDB: js.UndefOr[atJupyterlabObservablesLib.libModeldbMod.IModelDB] = js.undefined
    }
    
  }
  
}

