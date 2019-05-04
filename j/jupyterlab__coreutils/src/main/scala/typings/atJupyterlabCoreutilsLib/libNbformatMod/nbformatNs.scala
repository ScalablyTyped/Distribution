package typings
package atJupyterlabCoreutilsLib.libNbformatMod

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
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.code
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.markdown
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.raw
  */
  trait CellType extends js.Object
  
  /**
    * The base cell interface.
    */
  trait IBaseCell
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    /**
      * String identifying the type of cell.
      */
    var cell_type: java.lang.String
    /**
      * Cell-level metadata.
      */
    var metadata: stdLib.Partial[ICellMetadata]
    /**
      * Contents of the cell, represented as an array of lines.
      */
    var source: MultilineString
  }
  
  /**
    * Cell-level metadata.
    */
  trait IBaseCellMetadata
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject
       with ICellMetadata {
    /**
      * The cell's name. If present, must be a non-empty string.
      */
    var name: java.lang.String
    /**
      * The cell's tags. Tags must be unique, and must not contain commas.
      */
    var tags: js.Array[java.lang.String]
    /**
      * Whether the cell is trusted.
      *
      * #### Notes
      * This is not strictly part of the nbformat spec, but it is added by
      * the contents manager.
      *
      * See https://jupyter-notebook.readthedocs.io/en/latest/security.html.
      */
    var trusted: scala.Boolean
  }
  
  /**
    * The base output type.
    */
  trait IBaseOutput
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    /**
      * Type of cell output.
      */
    var output_type: java.lang.String
  }
  
  /**
    * A union metadata type.
    */
  /* Rewritten from type alias, can be one of: 
    - IBaseCellMetadata
    - IRawCellMetadata
    - ICodeCellMetadata
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
    var cell_type_ICodeCell: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.code
    /**
      * The code cell's prompt number. Will be null if the cell has not been run.
      */
    var execution_count: ExecutionCount
    /**
      * Cell-level metadata.
      */
    @JSName("metadata")
    var metadata_ICodeCell: stdLib.Partial[ICodeCellMetadata]
    /**
      * Execution, display, or stream outputs.
      */
    var outputs: js.Array[IOutput]
  }
  
  /**
    * Metadata for a code cell.
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICellMetadata because Already inherited */ trait ICodeCellMetadata extends IBaseCellMetadata {
    /**
      * Whether the cell is collapsed/expanded.
      */
    var collapsed: scala.Boolean
    /**
      * Whether the cell's output is scrolled, unscrolled, or autoscrolled.
      */
    var scrolled: scala.Boolean | atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.auto
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
    var output_type_IDisplayData: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.display_data
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
    var output_type_IDisplayUpdate: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.update_display_data
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
    var ename: java.lang.String
    /**
      * The value, or message, of the error.
      */
    var evalue: java.lang.String
    /**
      * Type of cell output.
      */
    @JSName("output_type")
    var output_type_IError: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.error
    /**
      * The error's traceback.
      */
    var traceback: js.Array[java.lang.String]
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
    var output_type_IExecuteResult: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.execute_result
  }
  
  /**
    * The kernelspec metadata.
    */
  trait IKernelspecMetadata
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var display_name: java.lang.String
    var name: java.lang.String
  }
  
  /**
    * The language info metatda
    */
  trait ILanguageInfoMetadata
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var codemirror_mode: js.UndefOr[java.lang.String | atPhosphorCoreutilsLib.libJsonMod.JSONObject] = js.undefined
    var file_extension: js.UndefOr[java.lang.String] = js.undefined
    var mimetype: js.UndefOr[java.lang.String] = js.undefined
    var name: java.lang.String
    var pygments_lexer: js.UndefOr[java.lang.String] = js.undefined
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
    var cell_type_IMarkdownCell: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.markdown
  }
  
  /**
    * A mime-type keyed dictionary of data.
    */
  trait IMimeBundle
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject
  
  /**
    * The notebook content.
    */
  trait INotebookContent
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var cells: js.Array[ICell]
    var metadata: INotebookMetadata
    var nbformat: scala.Double
    var nbformat_minor: scala.Double
  }
  
  /**
    * The default metadata for the notebook.
    */
  trait INotebookMetadata
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    var kernelspec: js.UndefOr[IKernelspecMetadata] = js.undefined
    var language_info: js.UndefOr[ILanguageInfoMetadata] = js.undefined
    var orig_nbformat: scala.Double
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
    var cell_type_IRawCell: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.raw
    /**
      * Cell-level metadata.
      */
    @JSName("metadata")
    var metadata_IRawCell: stdLib.Partial[IRawCellMetadata]
  }
  
  /**
    * Metadata for the raw cell.
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICellMetadata because Already inherited */ trait IRawCellMetadata extends IBaseCellMetadata {
    /**
      * Raw cell metadata format for nbconvert.
      */
    var format: java.lang.String
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
    var output_type_IStream: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.stream
    /**
      * The stream's text output.
      */
    var text: MultilineString
  }
  
  /**
    * The valid output types.
    */
  /* Rewritten from type alias, can be one of: 
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.execute_result
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.display_data
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.stream
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.error
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.update_display_data
  */
  trait OutputType extends js.Object
  
  /**
    * An alias for a stream type.
    */
  /* Rewritten from type alias, can be one of: 
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.stdout
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.stderr
  */
  trait StreamType extends js.Object
  
  trait _ICell extends js.Object
  
  trait _IOutput extends js.Object
  
  /**
    * The major version of the notebook format.
    */
  val MAJOR_VERSION: scala.Double = js.native
  /**
    * The minor version of the notebook format.
    */
  val MINOR_VERSION: scala.Double = js.native
  /**
    * Test whether a cell is a code cell.
    */
  def isCode(cell: ICell): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.ICodeCell */ scala.Boolean = js.native
  /**
    * Test whether an output is from display data.
    */
  def isDisplayData(output: IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IDisplayData */ scala.Boolean = js.native
  /**
    * Test whether an output is from updated display data.
    */
  def isDisplayUpdate(output: IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IDisplayUpdate */ scala.Boolean = js.native
  /**
    * Test whether an output is from a stream.
    */
  def isError(output: IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IError */ scala.Boolean = js.native
  /**
    * Test whether an output is an execute result.
    */
  def isExecuteResult(output: IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IExecuteResult */ scala.Boolean = js.native
  /**
    * Test whether a cell is a markdown cell.
    */
  def isMarkdown(cell: ICell): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IMarkdownCell */ scala.Boolean = js.native
  /**
    * Test whether a cell is a raw cell.
    */
  def isRaw(cell: ICell): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IRawCell */ scala.Boolean = js.native
  /**
    * Test whether an output is from a stream.
    */
  def isStream(output: IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IStream */ scala.Boolean = js.native
  /**
    * Validate a mime type/value pair.
    *
    * @param type - The mimetype name.
    *
    * @param value - The value associated with the type.
    *
    * @returns Whether the type/value pair are valid.
    */
  def validateMimeValue(`type`: java.lang.String, value: MultilineString): scala.Boolean = js.native
  def validateMimeValue(`type`: java.lang.String, value: atPhosphorCoreutilsLib.libJsonMod.JSONObject): scala.Boolean = js.native
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  type ExecutionCount = scala.Double | scala.Null
  /**
    * Media attachments (e.g. inline images).
    */
  type IAttachments = org.scalablytyped.runtime.StringDictionary[IMimeBundle]
  /**
    * A cell union type.
    */
  /* Rewritten from type alias, can be one of: 
    - IRawCell
    - IMarkdownCell
    - ICodeCell
    - IUnrecognizedCell
  */
  type ICell = _ICell | IUnrecognizedCell
  /**
    * An output union type.
    */
  /* Rewritten from type alias, can be one of: 
    - IUnrecognizedOutput
    - IExecuteResult
    - IDisplayData
    - IStream
    - IError
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
  type MultilineString = java.lang.String | js.Array[java.lang.String]
  /**
    * Cell output metadata.
    */
  type OutputMetadata = atPhosphorCoreutilsLib.libJsonMod.JSONObject
}

