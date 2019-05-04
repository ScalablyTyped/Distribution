package typings
package atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "nbformat")
@js.native
object nbformatNs extends js.Object {
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
  def isCode(cell: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICell): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.ICodeCell */ scala.Boolean = js.native
  /**
    * Test whether an output is from display data.
    */
  def isDisplayData(output: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IDisplayData */ scala.Boolean = js.native
  /**
    * Test whether an output is from updated display data.
    */
  def isDisplayUpdate(output: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IDisplayUpdate */ scala.Boolean = js.native
  /**
    * Test whether an output is from a stream.
    */
  def isError(output: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IError */ scala.Boolean = js.native
  /**
    * Test whether an output is an execute result.
    */
  def isExecuteResult(output: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IExecuteResult */ scala.Boolean = js.native
  /**
    * Test whether a cell is a markdown cell.
    */
  def isMarkdown(cell: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICell): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IMarkdownCell */ scala.Boolean = js.native
  /**
    * Test whether a cell is a raw cell.
    */
  def isRaw(cell: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICell): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IRawCell */ scala.Boolean = js.native
  /**
    * Test whether an output is from a stream.
    */
  def isStream(output: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput): /* is @jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IStream */ scala.Boolean = js.native
  /**
    * Validate a mime type/value pair.
    *
    * @param type - The mimetype name.
    *
    * @param value - The value associated with the type.
    *
    * @returns Whether the type/value pair are valid.
    */
  def validateMimeValue(
    `type`: java.lang.String,
    value: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.MultilineString
  ): scala.Boolean = js.native
  def validateMimeValue(`type`: java.lang.String, value: atPhosphorCoreutilsLib.libJsonMod.JSONObject): scala.Boolean = js.native
}

