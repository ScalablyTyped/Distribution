package typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICell
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IOutput
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.MultilineString
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "nbformat")
@js.native
object nbformatNs extends js.Object {
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
}

