package typings.jupyterlabNbformat.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabNbformat.mod.^
import typings.luminoCoreutils.typesJsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def MAJOR_VERSION: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MAJOR_VERSION").asInstanceOf[Double]

inline def MINOR_VERSION: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MINOR_VERSION").asInstanceOf[Double]

inline def isCode(cell: ICell): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCell */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCode")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCell */ Boolean]

inline def isDisplayData(output: IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayData */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayData")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayData */ Boolean]

inline def isDisplayUpdate(output: IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayUpdate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayUpdate")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayUpdate */ Boolean]

inline def isError(output: IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IError */ Boolean]

inline def isExecuteResult(output: IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IExecuteResult */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteResult")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IExecuteResult */ Boolean]

inline def isMarkdown(cell: ICell): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IMarkdownCell */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMarkdown")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IMarkdownCell */ Boolean]

inline def isRaw(cell: ICell): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IRawCell */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRaw")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IRawCell */ Boolean]

inline def isStream(output: IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IStream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStream")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IStream */ Boolean]

inline def validateMimeValue(`type`: String, value: MultilineString): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateMimeValue")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def validateMimeValue(`type`: String, value: PartialJSONObject): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateMimeValue")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.code
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.markdown
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.raw
  - java.lang.String
*/
type CellType = _CellType | String

type ExecutionCount = Double | Null

type IAttachments = StringDictionary[js.UndefOr[IMimeBundle]]

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabNbformat.mod.IRawCell
  - typings.jupyterlabNbformat.mod.IMarkdownCell
  - typings.jupyterlabNbformat.mod.ICodeCell
  - typings.jupyterlabNbformat.mod.IUnrecognizedCell
*/
type ICell = _ICell | IUnrecognizedCell

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabNbformat.mod.IUnrecognizedOutput
  - typings.jupyterlabNbformat.mod.IExecuteResult
  - typings.jupyterlabNbformat.mod.IDisplayData
  - typings.jupyterlabNbformat.mod.IStream
  - typings.jupyterlabNbformat.mod.IError
*/
type IOutput = _IOutput | IUnrecognizedOutput

type IUnrecognizedCell = IBaseCell

type IUnrecognizedOutput = IBaseOutput

type MultilineString = String | js.Array[String]

type OutputMetadata = PartialJSONObject
