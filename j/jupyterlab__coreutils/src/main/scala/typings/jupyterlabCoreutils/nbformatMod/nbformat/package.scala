package typings.jupyterlabCoreutils.nbformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nbformat {
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  type ExecutionCount = scala.Double | scala.Null
  /**
    * Media attachments (e.g. inline images).
    */
  type IAttachments = org.scalablytyped.runtime.StringDictionary[typings.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle]
  /**
    * A cell union type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabCoreutils.nbformatMod.nbformat.IRawCell
    - typings.jupyterlabCoreutils.nbformatMod.nbformat.IMarkdownCell
    - typings.jupyterlabCoreutils.nbformatMod.nbformat.ICodeCell
    - typings.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedCell
  */
  type ICell = typings.jupyterlabCoreutils.nbformatMod.nbformat._ICell | typings.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedCell
  /**
    * An output union type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedOutput
    - typings.jupyterlabCoreutils.nbformatMod.nbformat.IExecuteResult
    - typings.jupyterlabCoreutils.nbformatMod.nbformat.IDisplayData
    - typings.jupyterlabCoreutils.nbformatMod.nbformat.IStream
    - typings.jupyterlabCoreutils.nbformatMod.nbformat.IError
  */
  type IOutput = typings.jupyterlabCoreutils.nbformatMod.nbformat._IOutput | typings.jupyterlabCoreutils.nbformatMod.nbformat.IUnrecognizedOutput
  /**
    * An unrecognized cell.
    */
  type IUnrecognizedCell = typings.jupyterlabCoreutils.nbformatMod.nbformat.IBaseCell
  /**
    * Unrecognized output.
    */
  type IUnrecognizedOutput = typings.jupyterlabCoreutils.nbformatMod.nbformat.IBaseOutput
  /**
    * A multiline string.
    */
  type MultilineString = java.lang.String | js.Array[java.lang.String]
  /**
    * Cell output metadata.
    */
  type OutputMetadata = typings.phosphorCoreutils.jsonMod.JSONObject
}
