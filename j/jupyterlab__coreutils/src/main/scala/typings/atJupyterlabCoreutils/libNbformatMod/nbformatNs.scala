package typings.atJupyterlabCoreutils.libNbformatMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.auto
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.code
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.display_data
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.error
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.execute_result
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.markdown
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.raw
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stream
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.update_display_data
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ExecutionCount
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IAttachments
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IBaseCell
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IBaseCellJupyterMetadata
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IBaseCellMetadata
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IBaseOutput
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICell
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICellMetadata
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICodeCellJupyterMetadata
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICodeCellMetadata
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IKernelspecMetadata
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ILanguageInfoMetadata
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IMimeBundle
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.INotebookMetadata
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IOutput
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IRawCellMetadata
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IUnrecognizedCell
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IUnrecognizedOutput
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.MultilineString
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.OutputMetadata
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.StreamType
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs._ICell
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs._IOutput
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/nbformat", "nbformat")
@js.native
object nbformatNs extends js.Object {
  /**
    * A type which describes the type of cell.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.code
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.markdown
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.raw
  */
  trait CellType extends js.Object
  
  /**
    * The base cell interface.
    */
  trait IBaseCell extends JSONObject {
    /**
      * String identifying the type of cell.
      */
    var cell_type: String
    /**
      * Cell-level metadata.
      */
    var metadata: Partial[ICellMetadata]
    /**
      * Contents of the cell, represented as an array of lines.
      */
    var source: MultilineString
  }
  
  /**
    * The Jupyter metadata namespace.
    */
  trait IBaseCellJupyterMetadata extends JSONObject {
    /**
      * Whether the source is hidden.
      */
    var source_hidden: Boolean
  }
  
  /**
    * Cell-level metadata.
    */
  trait IBaseCellMetadata
    extends JSONObject
       with ICellMetadata {
    /**
      * The Jupyter metadata namespace
      */
    var jupyter: Partial[IBaseCellJupyterMetadata]
    /**
      * The cell's name. If present, must be a non-empty string.
      */
    var name: String
    /**
      * The cell's tags. Tags must be unique, and must not contain commas.
      */
    var tags: js.Array[String]
    /**
      * Whether the cell is trusted.
      *
      * #### Notes
      * This is not strictly part of the nbformat spec, but it is added by
      * the contents manager.
      *
      * See https://jupyter-notebook.readthedocs.io/en/latest/security.html.
      */
    var trusted: Boolean
  }
  
  /**
    * The base output type.
    */
  trait IBaseOutput extends JSONObject {
    /**
      * Type of cell output.
      */
    var output_type: String
  }
  
  /**
    * A union metadata type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IBaseCellMetadata
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IRawCellMetadata
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICodeCellMetadata
  */
  trait ICellMetadata extends js.Object
  
  /**
    * A code cell.
    */
  trait ICodeCell
    extends IBaseCell
       with _ICell {
    /**
      * String identifying the type of cell.
      */
    @JSName("cell_type")
    var cell_type_ICodeCell: code
    /**
      * The code cell's prompt number. Will be null if the cell has not been run.
      */
    var execution_count: ExecutionCount
    /**
      * Cell-level metadata.
      */
    @JSName("metadata")
    var metadata_ICodeCell: Partial[ICodeCellMetadata]
    /**
      * Execution, display, or stream outputs.
      */
    var outputs: js.Array[IOutput]
  }
  
  /**
    * The Jupyter metadata namespace for code cells.
    */
  trait ICodeCellJupyterMetadata extends IBaseCellJupyterMetadata {
    /**
      * Whether the outputs are hidden. See https://github.com/jupyter/nbformat/issues/137.
      */
    var outputs_hidden: Boolean
  }
  
  /**
    * Metadata for a code cell.
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICellMetadata because Already inherited */ trait ICodeCellMetadata extends IBaseCellMetadata {
    /**
      * Whether the cell is collapsed/expanded.
      */
    var collapsed: Boolean
    /**
      * The Jupyter metadata namespace
      */
    @JSName("jupyter")
    var jupyter_ICodeCellMetadata: Partial[ICodeCellJupyterMetadata]
    /**
      * Whether the cell's output is scrolled, unscrolled, or autoscrolled.
      */
    var scrolled: Boolean | auto
  }
  
  /**
    * Data displayed as a result of code cell execution.
    */
  trait IDisplayData
    extends IBaseOutput
       with _IOutput {
    /**
      * A mime-type keyed dictionary of data.
      */
    var data: IMimeBundle
    /**
      * Cell output metadata.
      */
    var metadata: OutputMetadata
    /**
      * Type of cell output.
      */
    @JSName("output_type")
    var output_type_IDisplayData: display_data
  }
  
  /**
    * Data displayed as an update to existing display data.
    */
  trait IDisplayUpdate extends IBaseOutput {
    /**
      * A mime-type keyed dictionary of data.
      */
    var data: IMimeBundle
    /**
      * Cell output metadata.
      */
    var metadata: OutputMetadata
    /**
      * Type of cell output.
      */
    @JSName("output_type")
    var output_type_IDisplayUpdate: update_display_data
  }
  
  /**
    * Output of an error that occurred during code cell execution.
    */
  trait IError
    extends IBaseOutput
       with _IOutput {
    /**
      * The name of the error.
      */
    var ename: String
    /**
      * The value, or message, of the error.
      */
    var evalue: String
    /**
      * Type of cell output.
      */
    @JSName("output_type")
    var output_type_IError: error
    /**
      * The error's traceback.
      */
    var traceback: js.Array[String]
  }
  
  /**
    * Result of executing a code cell.
    */
  trait IExecuteResult
    extends IBaseOutput
       with _IOutput {
    /**
      * A mime-type keyed dictionary of data.
      */
    var data: IMimeBundle
    /**
      * A result's prompt number.
      */
    var execution_count: ExecutionCount
    /**
      * Cell output metadata.
      */
    var metadata: OutputMetadata
    /**
      * Type of cell output.
      */
    @JSName("output_type")
    var output_type_IExecuteResult: execute_result
  }
  
  /**
    * The kernelspec metadata.
    */
  trait IKernelspecMetadata extends JSONObject {
    var display_name: String
    var name: String
  }
  
  /**
    * The language info metatda
    */
  trait ILanguageInfoMetadata extends JSONObject {
    var codemirror_mode: js.UndefOr[String | JSONObject] = js.undefined
    var file_extension: js.UndefOr[String] = js.undefined
    var mimetype: js.UndefOr[String] = js.undefined
    var name: String
    var pygments_lexer: js.UndefOr[String] = js.undefined
  }
  
  /**
    * A markdown cell.
    */
  trait IMarkdownCell
    extends IBaseCell
       with _ICell {
    /**
      * Cell attachments.
      */
    var attachments: js.UndefOr[IAttachments] = js.undefined
    /**
      * String identifying the type of cell.
      */
    @JSName("cell_type")
    var cell_type_IMarkdownCell: markdown
  }
  
  /**
    * A mime-type keyed dictionary of data.
    */
  trait IMimeBundle extends JSONObject
  
  /**
    * The notebook content.
    */
  trait INotebookContent extends JSONObject {
    var cells: js.Array[ICell]
    var metadata: INotebookMetadata
    var nbformat: Double
    var nbformat_minor: Double
  }
  
  /**
    * The default metadata for the notebook.
    */
  trait INotebookMetadata extends JSONObject {
    var kernelspec: js.UndefOr[IKernelspecMetadata] = js.undefined
    var language_info: js.UndefOr[ILanguageInfoMetadata] = js.undefined
    var orig_nbformat: Double
  }
  
  /**
    * A raw cell.
    */
  trait IRawCell
    extends IBaseCell
       with _ICell {
    /**
      * Cell attachments.
      */
    var attachments: js.UndefOr[IAttachments] = js.undefined
    /**
      * String identifying the type of cell.
      */
    @JSName("cell_type")
    var cell_type_IRawCell: raw
    /**
      * Cell-level metadata.
      */
    @JSName("metadata")
    var metadata_IRawCell: Partial[IRawCellMetadata]
  }
  
  /**
    * Metadata for the raw cell.
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICellMetadata because Already inherited */ trait IRawCellMetadata extends IBaseCellMetadata {
    /**
      * Raw cell metadata format for nbconvert.
      */
    var format: String
  }
  
  /**
    * Stream output from a code cell.
    */
  trait IStream
    extends IBaseOutput
       with _IOutput {
    /**
      * The name of the stream.
      */
    var name: StreamType
    /**
      * Type of cell output.
      */
    @JSName("output_type")
    var output_type_IStream: stream
    /**
      * The stream's text output.
      */
    var text: MultilineString
  }
  
  /**
    * The valid output types.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.execute_result
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.display_data
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stream
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.error
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.update_display_data
  */
  trait OutputType extends js.Object
  
  /**
    * An alias for a stream type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stdout
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stderr
  */
  trait StreamType extends js.Object
  
  trait _ICell extends js.Object
  
  trait _IOutput extends js.Object
  
  /**
    * The major version of the notebook format.
    */
  val MAJOR_VERSION: Double = js.native
  /**
    * The minor version of the notebook format.
    */
  val MINOR_VERSION: Double = js.native
  /**
    * Test whether a cell is a code cell.
    */
  def isCode(cell: ICell): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.ICodeCell */ Boolean = js.native
  /**
    * Test whether an output is from display data.
    */
  def isDisplayData(output: IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IDisplayData */ Boolean = js.native
  /**
    * Test whether an output is from updated display data.
    */
  def isDisplayUpdate(output: IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IDisplayUpdate */ Boolean = js.native
  /**
    * Test whether an output is an error.
    */
  def isError(output: IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IError */ Boolean = js.native
  /**
    * Test whether an output is an execute result.
    */
  def isExecuteResult(output: IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IExecuteResult */ Boolean = js.native
  /**
    * Test whether a cell is a markdown cell.
    */
  def isMarkdown(cell: ICell): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IMarkdownCell */ Boolean = js.native
  /**
    * Test whether a cell is a raw cell.
    */
  def isRaw(cell: ICell): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IRawCell */ Boolean = js.native
  /**
    * Test whether an output is from a stream.
    */
  def isStream(output: IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IStream */ Boolean = js.native
  /**
    * Validate a mime type/value pair.
    *
    * @param type - The mimetype name.
    *
    * @param value - The value associated with the type.
    *
    * @returns Whether the type/value pair are valid.
    */
  def validateMimeValue(`type`: String, value: MultilineString): Boolean = js.native
  def validateMimeValue(`type`: String, value: JSONObject): Boolean = js.native
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  type ExecutionCount = Double | Null
  /**
    * Media attachments (e.g. inline images).
    */
  type IAttachments = StringDictionary[IMimeBundle]
  /**
    * A cell union type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IRawCell
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IMarkdownCell
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICodeCell
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IUnrecognizedCell
  */
  type ICell = _ICell | IUnrecognizedCell
  /**
    * An output union type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IUnrecognizedOutput
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IExecuteResult
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IDisplayData
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IStream
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IError
  */
  type IOutput = _IOutput | IUnrecognizedOutput
  /**
    * An unrecognized cell.
    */
  type IUnrecognizedCell = IBaseCell
  /**
    * Unrecognized output.
    */
  type IUnrecognizedOutput = IBaseOutput
  /**
    * A multiline string.
    */
  type MultilineString = String | js.Array[String]
  /**
    * Cell output metadata.
    */
  type OutputMetadata = JSONObject
}

