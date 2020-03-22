package typings.jupyterlabNbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExecutionCount = scala.Double | scala.Null
  type IAttachments = org.scalablytyped.runtime.StringDictionary[js.UndefOr[typings.jupyterlabNbformat.mod.IMimeBundle]]
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabNbformat.mod.IRawCell
    - typings.jupyterlabNbformat.mod.IMarkdownCell
    - typings.jupyterlabNbformat.mod.ICodeCell
    - typings.jupyterlabNbformat.mod.IUnrecognizedCell
  */
  type ICell = typings.jupyterlabNbformat.mod._ICell | typings.jupyterlabNbformat.mod.IUnrecognizedCell
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabNbformat.mod.IUnrecognizedOutput
    - typings.jupyterlabNbformat.mod.IExecuteResult
    - typings.jupyterlabNbformat.mod.IDisplayData
    - typings.jupyterlabNbformat.mod.IStream
    - typings.jupyterlabNbformat.mod.IError
  */
  type IOutput = typings.jupyterlabNbformat.mod._IOutput | typings.jupyterlabNbformat.mod.IUnrecognizedOutput
  type IUnrecognizedCell = typings.jupyterlabNbformat.mod.IBaseCell
  type IUnrecognizedOutput = typings.jupyterlabNbformat.mod.IBaseOutput
  type MultilineString = java.lang.String | js.Array[java.lang.String]
  type OutputMetadata = typings.luminoCoreutils.jsonMod.PartialJSONObject
}
