package typings.atJupyterlabCoreutils.libNbformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nbformat {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atPhosphorCoreutils.libJsonMod.JSONObject

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
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IRawCell
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IMarkdownCell
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ICodeCell
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IUnrecognizedCell
  */
  type ICell = _ICell | IUnrecognizedCell
  /**
    * An output union type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IUnrecognizedOutput
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IExecuteResult
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IDisplayData
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IStream
    - typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IError
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
